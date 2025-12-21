import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter full name: ");
        String name = sc.nextLine();

        System.out.print("Is active (true/false): ");
        boolean active = sc.nextBoolean();

        Human human = new Human(id, name, active);
        human.printStatus();
        System.out.println("Type: " + human.getType());

        Employee emp = new Employee(101, "Arman S.", true,
                "IT Department", 4200.75f);
        emp.printStatus();
        System.out.println("Type: " + emp.getType());
        System.out.println("Company: " + Employee.companyName);

        Student st = new Student(202, "Dana K.", true,
                "Cybersecurity", 3.6f);
        st.printStatus();
        System.out.println("Type: " + st.getType());

        st.setRating(3.9f);
        System.out.println("Updated rating: " + st.getRating());

        sc.close();
    }
}
