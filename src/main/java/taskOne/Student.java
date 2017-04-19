package TaskOne;

/**
 * Created by Daria Serebryakova on 18.04.2017.
 */
public class Student {
    private Person person;
    private University university;

    public Student() {
    }

    public Student(Person person, University university) {
        this.person = person;
        this.university = university;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return "Student{" +
                "person=" + person +
                ", university=" + university +
                '}';
    }
}
