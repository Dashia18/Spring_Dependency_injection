package TaskOne;

/**
 * Created by Daria Serebryakova on 18.04.2017.
 */
public class University {
    private String name;
    private int studentCount;

    public University() {
    }

    public University(String name, int count) {
        this.name = name;
        this.studentCount = count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public String getName() {

        return name;
    }

    public int getStudentCount() {
        return studentCount;
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", studentCount=" + studentCount +
                '}';
    }
}
