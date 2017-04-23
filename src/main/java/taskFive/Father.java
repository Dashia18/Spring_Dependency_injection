package taskFive;

/**
 * Created by Daria Serebryakova on 23.04.2017.
 */
public class Father {
    private Person person;
    private Children children;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Children getChildren() {
        return children;
    }

    public void setChildren(Children children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Father{" +
                "person=" + person +
                ", children=" + children +
                '}';
    }
}
