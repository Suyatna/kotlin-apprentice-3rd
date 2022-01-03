/*

Challenge 3.
Create an anonymous object that implements the following interface.

 */

interface ThresholdChecker {
    val lower: Int
    val upper: Int

    /**
     * returns true if value is higher than the upper threshold
     * and false otherwise
     */
    fun isLit(value: Int): Boolean

    /**
     * returns true if value is less than the lower threshold
     * and return false otherwise
     */
    fun tooQuiet(value: Int): Boolean
}