import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String firstName;
    private String lastName;

    public String allAddress() {
        StringBuilder builder = new StringBuilder();
        for (Address address : addresses) {
            builder.append(
                    address.getAddressType().name() + " address:\n"
            );
            builder.append(
                    LabelPrinter.labelFor(this, address.getAddressType())
            );
        }

        return builder.toString();
    }

    @Nullable
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Nullable
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return UserExtensions.getFullName(this) + " - Address: " + addresses.size() + "\n" + allAddress();
    }

    @NotNull
    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    private List<Address> addresses = new ArrayList<>();
}
