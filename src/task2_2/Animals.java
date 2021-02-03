package task2_2;

public enum Animals {

    Cat(3), Dog(5), Cow(10);

    private int age;

    Animals (int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name() + ":\nAge: " + age + " years;";
    }
}
