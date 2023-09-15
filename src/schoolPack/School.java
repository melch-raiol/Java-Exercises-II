package schoolPack;

public class School {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Felipe");
        student.setAge(8);

        System.out.println("O aluno " + student.getName() + " tem " + student.getAge() + " anos.");
    }
}
