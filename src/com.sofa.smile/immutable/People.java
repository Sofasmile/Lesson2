package immutable;

public final class People {
    private final String name;
    private final String surname;
    private final Address adress;

    public People(String name, String surname, Address adress) {
        this.name = name;
        this.surname = surname;
        this.adress = (adress == null) ? null : new Address(adress.getStreet());
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Address getAdress() {
        return (adress == null) ? null : new Address(adress.getStreet());
    }
}
