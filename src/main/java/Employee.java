public class Employee {
    long id;
    public String firstName;
    public String lastName;
    public String country;
    public int age;

    public Employee() {
    }
    public Employee(long id, String firstName, String lastName, String country, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.age = age;
    }

    @Override
    public String toString() {
        return "\"id\" : " + id + ",\n" +
                "\"firstName\" : " + firstName + ",\n" +
                "\"lastName\" : " + lastName + ",\n" +
                "\"country\" : " + country + ",\n" +
                "\"age\" : " + age + "\n";
    }
}
