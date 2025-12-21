public class Student extends Human {

    private String faculty;
    private float rating;

    public Student(int id, String fullName, boolean active,
                   String faculty, float rating) {
        super(id, fullName, active);
        this.faculty = faculty;
        this.rating = rating;}

    @Override
    public String getType() {
        return "Student";}

    public String getFaculty() {
        return faculty;}

    public void setFaculty(String faculty) {
        this.faculty = faculty;}

    public float getRating() {
        return rating;}

    public void setRating(float rating) {
        this.rating = rating;}
}
