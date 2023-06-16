import java.util.Arrays;
import java.util.Comparator;

public class Group {

    private String groupName;
    Student[] students = new Student[10];

    public Group (String groupName){
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        sortByLastName();
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", students=" + Arrays.toString(students) +
                '}';
    }

    public void sortByLastName() {
        Arrays.sort(students, Comparator.comparing(Student::getLastName));
    }

    public void addStudent(Student student) throws GroupOverflowException{
        student.setGroupName(getGroupName());
        try {

            int a = 0;
            for (int i = 0; i < students.length; i++) {
                if (students[i] == null) {
                    a++;
                }
            }
            if (a==0){
                throw new GroupOverflowException();
            }
            int n = students.length - a;
            students[n] = student;
            System.out.println("Студента " + student + " додано до групи " + student.getGroupName());
        }catch (Exception e){
            System.out.println("Дана група є заповненою");
        }
    }

    public Student searchStudentByLastName(String lastName) throws StudentNotFoundException{
        Student st = null;
        try {
            for (int i = 0; i < students.length; i++) {
                if (students[i].getLastName() == lastName) {
                    st = students[i];
                    System.out.println(st);
                }
            }
            if (st == null){
                throw new StudentNotFoundException();
            }
        }catch (Exception e){
            System.out.println("Даного студента не має  в даній групі");
        }
        return st;
    }

    public boolean removeStudentByID(int id){
        boolean a = false;

        for (int i = 0;i< students.length;i++){
            if (students[i].getId() == id){
                students[i] = null;
                a = true;
            }
        }
        return a;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
