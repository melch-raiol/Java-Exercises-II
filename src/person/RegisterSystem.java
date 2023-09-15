package person;

public class RegisterSystem {
    public static void main(String[] args) {
        Person person = new Person("Melch", "12346789");
        person.setAddress("Rua cherne");

        System.out.println(person.getName() + ", " + person.getCpf() + ", " + person.getAddress());
    }
}
