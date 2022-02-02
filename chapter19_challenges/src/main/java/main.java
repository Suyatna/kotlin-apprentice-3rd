class JavaApplication {
    public static void main(String[] args) {
        User user = new User();

        int expirationMonth = 6;
        int validExpirationYear = 2030;
        int invalidExpirationYear = 1989;
        String cvv = "123";

        String goodCardNumber = "1234567890123456";

        // a card with a good expiration date and no cvv
        CreditCard goodExpNoCVV = new CreditCard(goodCardNumber, expirationMonth, validExpirationYear);
        UserExtensions.attemptToAddCard(user, goodExpNoCVV);

        // a card with a good expiration date and a cvv
        CreditCard goodExpWithCVV = new CreditCard("0987654321098765", expirationMonth, validExpirationYear, cvv);
        UserExtensions.attemptToAddCard(user, goodExpWithCVV);

        // a card with a bad expiration date and a cvv
        CreditCard badExpWithCVV = new CreditCard("9876543210987654", expirationMonth, invalidExpirationYear, cvv);
        UserExtensions.attemptToAddCard(user, badExpWithCVV);

        System.out.println("The user has " + user.getCreditCards().size() + " credit cards");
    }
}