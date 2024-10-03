package PersonProject;
public class Main {
    public static void main(String[] args) {

        Student student = new Student("Alice", "123 Main St", "Computer Science", 2, 1500.0);
        System.out.println(student);

        Staff staff = new Staff("Bob", "456 Elm St", "High School", 3000.0);
        System.out.println(staff);
    }
}
