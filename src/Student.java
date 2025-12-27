import interfaces.IStudy;

public final class Student extends Human implements IStudy {

    private final float gpa;

    public Student(int id, String fullName, boolean active, float gpa) {
        super(id, fullName, active);
        this.gpa = gpa;
    }

    public final float getGpa() {
        return gpa;
    }

    @Override
    public void study() {
        System.out.println(fullName + " is studying");
    }

    @Override
    public void passExam() {
        System.out.println(fullName + " passed the exam");
    }

    @Override
    public String getType() {
        return "Student";
    }
}
