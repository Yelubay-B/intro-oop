import interfaces.IWork;
import interfaces.IStudy;

public class Main {
    public static void main(String[] args) {

        Student s = new Student(1, "Medina", true, 3.8f);

        Human h = new Employee(2, "Ayan", true, "IT", 300000);

        IWork w = new Employee(3, "Ali", true, "Finance", 400000);
        IStudy st = new Employee(4, "Dana", true, "HR", 280000);

        s.study();
        s.passExam();
        System.out.println("GPA: " + s.getGpa());
        System.out.println("Type: " + s.getType());

        System.out.println("Type: " + h.getType());

        w.work();
        w.receiveSalary();

        st.study();
        st.passExam();
    }
}
