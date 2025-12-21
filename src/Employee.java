public class Employee extends Human {

    private String department;
    private float monthlyIncome;

    public static String companyName = "AITU";

    public Employee(int id, String fullName, boolean active,
                    String department, float monthlyIncome) {
        super(id, fullName, active);
        this.department = department;
        this.monthlyIncome = monthlyIncome;}

    @Override
    public String getType() {
        return "Employee";}

    public String getDepartment() {
        return department;}

    public void setDepartment(String department) {
        this.department = department;}

    public float getMonthlyIncome() {
        return monthlyIncome;}

    public void setMonthlyIncome(float monthlyIncome) {
        this.monthlyIncome = monthlyIncome;}
}
