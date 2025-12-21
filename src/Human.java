public class Human {

    private int id;
    private String fullName;
    private boolean active;

    public Human(int id, String fullName, boolean active) {
        this.id = id;
        this.fullName = fullName;
        this.active = active;}

    public void printStatus() {
        System.out.println("ID: " + id + ", Name: " + fullName + ", Active: " + active);}

    public String getType() {
        return "Human";}

    public int getId() {
        return id;}

    public void setId(int id) {
        this.id = id;}

    public String getFullName() {
        return fullName;}

    public void setFullName(String fullName) {
        this.fullName = fullName;}

    public boolean isActive() {
        return active;}

    public void setActive(boolean active) {
        this.active = active;}
}
