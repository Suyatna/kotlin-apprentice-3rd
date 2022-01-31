class JavaApplication {
    public static void main(String[] args) {
        User user = new User();
        user.setFirstName("Testy");
        user.setLastName("McTester son");

        Address address = new Address(
                "345 None Exiting Avenue NW",
                null,
                "Washington",
                "DC",
                "20016",
                AddressType.Shipping
        );

        UserExtensions.addOrUpdateAddress(user, address);
        LabelPrinter.printLabelFor(user);
    }
}
