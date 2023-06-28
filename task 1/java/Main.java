public class Main {
    public static void main(String[] args){
        Student monika = new Student("Monika","Lodf",Gender.WOMAN,234);
        Student lina = new Student("Lina","Fedc",Gender.WOMAN,676);
        Student petro = new Student("Petro","Idsc",Gender.MAN,346);
        Student oleg = new Student("Oleg","Wyih",Gender.MAN,512);
        Student andriy = new Student("Andriy","Lom",Gender.MAN,454);
        Student ostap = new Student("Ostap","Kmsd",Gender.MAN,654);
        Student karina = new Student("Karina","Pcdc",Gender.WOMAN,987);
        Student vika = new Student("Vika","Bwd",Gender.WOMAN,321);
        Student anna = new Student("Anna","Akjd",Gender.WOMAN,345);
        Student pavlo = new Student("Pavlo","Skjl",Gender.MAN,877);
        Student den = new Student("Den","Clkd",Gender.MAN,777);
        Group av123 = new Group("AV-123");
        try {
            av123.addStudent(monika);
            av123.addStudent(lina);
            av123.addStudent(petro);
            av123.addStudent(oleg);
            av123.addStudent(andriy);
            av123.addStudent(ostap);
            av123.addStudent(karina);
            av123.addStudent(vika);
            av123.addStudent(anna);
            av123.addStudent(pavlo);
            av123.addStudent(den);
            av123.searchStudentByLastName("Mwd");
            System.out.println(av123);
            System.out.println(av123.removeStudentByID(877));
        }catch (GroupOverflowException e){
            System.out.println("Група є заповненою");
        }catch (StudentNotFoundException e){
            System.out.println("Даного студента немає");
        }
    }

}