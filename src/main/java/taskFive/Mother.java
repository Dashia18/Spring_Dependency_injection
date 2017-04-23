package taskFive;

/**
 * Created by Daria Serebryakova on 23.04.2017.
 */
public class Mother {
    private Person person;
    private Children children;

    public Mother() {
    }

    public Mother(Children children) {
        this.children = children;
    }

    public Children getChildren() {
        return children;
    }

    public void setChildren(Children children) {
        this.children = children;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }


    @Override
    public String toString() {
        return "Mother{" +
                "person=" + person +
                ", children=" + children +
                '}';
    }
}
