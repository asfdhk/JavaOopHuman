public class Student extends Human{

    private int id;
    private String groupName;

    public Student(String name,String lastName, Gender gender,int id ){
        super(name, lastName, gender);
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", gender=" + getGender() +
                ", id=" + id +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setId(int id) {
        this.id = id;
    }
}
