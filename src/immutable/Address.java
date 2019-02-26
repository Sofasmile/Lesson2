package immutable;

public class Address implements Cloneable {
    private String street;

    public Address(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
