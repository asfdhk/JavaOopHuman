public class Human {

    private String name;
    private String lastName;
    private Gender gender;

    public Human(String name,String lastName, Gender gender ){
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                '}';
    }

    public Gender getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}

