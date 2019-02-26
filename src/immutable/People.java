package immutable;

public final class People {
    private final int age;
    private final String name;
    private final String surname;
    private final Address adress;

    public People(int age, String name, String surname, Address adress) {
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.adress = new Address(adress.getStreet());
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Address getAdress() {
        return (Address) adress.clone();
    }
}
