package build.realize;

public class Student {
    private String name;
    private String surname;
    private int age;
    private String stugentNumber;
    private double averageMark;

    private Student() {
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getStugentNumber() {
        return stugentNumber;
    }

    public double getAverageMark() {
        return averageMark;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + age + " " + stugentNumber + " " + averageMark;
    }

    public static Builder newBuilder() {
        return new Student().new Builder();
    }

    public class Builder {
        private Builder() {

        }

        public Builder setName(String name) {
            Student.this.name = name;
            return this;
        }

        public Builder setSurname(String surname) {
            Student.this.surname = surname;
            return this;
        }

        public Builder setAge(int age) {
            Student.this.age = age;
            return this;
        }

        public Builder setStugentNumber(String stugentNumber) {
            Student.this.stugentNumber = stugentNumber;
            return this;
        }

        public Builder setAverageMark(double averageMark) {
            Student.this.averageMark = averageMark;
            return this;
        }

        public Student build() {
            return Student.this;
        }
    }
}
