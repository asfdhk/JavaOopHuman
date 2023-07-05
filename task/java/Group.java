import java.util.Arrays;
import java.util.Comparator;

public class Group {

    private String groupName;
    private Student[] students = new Student[10];

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
        int a = 0;
        for (int i= 0;i<students.length;i++){
            a++;
            if (students[i] == null){
                a--;
            }
        }
        if (a!=students.length){
            students =  Arrays.copyOf(students,a);
            Arrays.sort(students, Comparator.comparing(Student::getLastName));
        }else {
            Arrays.sort(students, Comparator.comparing(Student::getLastName));
        }

    }

    public void addStudent(Student student) throws GroupOverflowException {
        student.setGroupName(getGroupName());

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
    }

    public Student searchStudentByLastName(String lastName) throws StudentNotFoundException {
        int a = 0;
        for (int i= 0;i<students.length;i++){
            a++;
            if (students[i] == null){
                a--;
            }
        }
        Student st = null;
        for (int i = 0; i < a; i++) {
            if (students[i].getLastName().equals(lastName)) {
                st = students[i];
                System.out.println(st);
            }
        }
        if (st == null){
            throw new StudentNotFoundException();
        }
        return st;
    }

    public boolean removeStudentByID(int id){
        boolean a = false;
        int n = 0;
        for (int i= 0;i<students.length;i++){
            n++;
            if (students[i] == null){
                n--;
            }
        }
        for (int i = 0;i< n;i++){
            if (getStudents()[i].getId() == id){
                a = true;
            }
        }
        return a;
    }

    public String getGroupName() {
        return groupName;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
