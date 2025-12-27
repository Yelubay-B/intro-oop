import interfaces.IWork;
import interfaces.IStudy;

public class Employee extends Human implements IWork, IStudy {

    private String department;
    private float monthlyIncome;

    public static String companyName = "AITU";

    public Employee(int id, String fullName, boolean active,
                    String department, float monthlyIncome) {
        super(id, fullName, active);
        this.department = department;
        this.monthlyIncome = monthlyIncome;
    }

    @Override
    public String getType() {
        return "Employee";
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public float getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(float monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    // ===== methods from interfaces =====

    @Override
    public void work() {
        System.out.println(fullName + " is working in " + department);
    }

    @Override
    public void receiveSalary() {
        System.out.println(fullName + " received salary: " + monthlyIncome);
    }

    @Override
    public void study() {
        System.out.println(fullName + " is learning new skills");
    }

    @Override
    public void passExam() {
        System.out.println(fullName + " passed a certification exam");
    }
}
