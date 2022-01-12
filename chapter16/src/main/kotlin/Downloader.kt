import java.lang.Error
import java.util.*
import kotlin.concurrent.timerTask
import kotlin.system.exitProcess

enum class DownloadState {
    Starting,
    InProgress,
    Error,
    Success
}

class Downloader {

    private val maxData = 100
    private var downloadState: DownloadState? = null
    private var fakeData: MutableList<Int> = mutableListOf()

    fun downloadData(fromUrl: String,
                     progress: (state: DownloadState?) -> Unit,
                     completion: (error: Error?, data: List<Int>?) -> Unit
    ) {
        // rest of method unchanged
        println("\"Downloading\" from URL: $fromUrl")
        postProgress(progress)
        downloadState = DownloadState.Starting
        keepAddingData(completion)
    }

    private fun keepAddingData(completion: (error: Error?, data: List<Int>?) -> Unit) {
        addMoreData { error ->
            when (downloadState) {
                DownloadState.Error -> completion(error, null)
                DownloadState.Success -> completion(null, fakeData.toList())
                else -> keepAddingData(completion)
            }
        }
    }

    private fun addMoreData(completion: (error: Error?) -> Unit) {
        Timer().schedule(timerTask {
            val error = randomlyThrowError()
            if (error != null) {
                downloadState = DownloadState.Error
                completion(error)
            } else {
                downloadState = DownloadState.InProgress
                for (i in 0..20) {
                    fakeData.add(i)
                    if (fakeData.size == maxData) {
                        downloadState = DownloadState.Success
                        break
                    }
                }
                completion(null)
            }
        }, 500)
    }

    private fun randomlyThrowError(): Error? {
        val randomNumber: Int = (0..10).random()
        return if (randomNumber == 8) {
            Error("Your download was eaten by a shark.")
        } else {
            null
        }
    }

    private fun postProgress(
        progress: (state: DownloadState?) -> Unit
    ) {
        progress(downloadState)

        when (downloadState) {
            DownloadState.Error -> exitProcess(1)
            DownloadState.Success -> exitProcess(0)
            else -> Timer().schedule(timerTask { postProgress(progress) }, 200)
        }
    }

    // Via https://stackoverflow.com/a/45687695/681493
    private fun ClosedRange<Int>.random() =
        Random().nextInt(endInclusive - start) + start
}