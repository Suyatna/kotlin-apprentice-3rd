import java.util.ArrayList;
import java.util.List;

public class User {
    // 4
    private List<CreditCard> creditCards = new ArrayList<>();

    public List<CreditCard> getCreditCards() {
        return creditCards;
    }

    public void setCreditCards(List<CreditCard> creditCards) {
        this.creditCards = creditCards;
    }
}
