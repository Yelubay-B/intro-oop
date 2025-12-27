public abstract class Human {

    protected int id;
    protected String fullName;
    protected boolean active;

    public Human(int id, String fullName, boolean active) {
        this.id = id;
        this.fullName = fullName;
        this.active = active;
    }

    public abstract String getType();
}
