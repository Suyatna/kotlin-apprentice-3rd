import java.util.HashMap;

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

        Address.JSONKeys keys = Address.JSONKeys.INSTANCE;

        HashMap<String, Object> addressJSON = new HashMap<>();
        addressJSON.put(keys.streetLine1, address.streetLine1);
        addressJSON.put(keys.streetLine2, address.streetLine2);
        addressJSON.put(keys.city, address.city);
        addressJSON.put(keys.stateOrProvince, address.stateOrProvince);
        addressJSON.put(keys.postalCode, address.postalCode);
        addressJSON.put(keys.country, address.country);
        addressJSON.put(keys.addressType, address.addressType);

        System.out.println("Address JSON:\n" + addressJSON);

        System.out.println("Sample first line of address: " + Address.sampleFirstLine);

        Address canadian = Address.canadianSample(AddressType.Shipping);
        System.out.println(canadian);
    }
}
