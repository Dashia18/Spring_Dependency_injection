package taskFive;

/**
 * Created by Daria Serebryakova on 23.04.2017.
 */
public class Family {
    private Father father;
    private Mother mother;
    private Children children;

    public Family() {
    }

    public Family(Father father, Mother mother, Children children) {
        this.father = father;
        this.mother = mother;
        this.children = children;
    }

    public Father getFather() {
        return father;
    }

    public void setFather(Father father) {
        this.father = father;
    }

    public Mother getMother() {
        return mother;
    }

    public void setMother(Mother mother) {
        this.mother = mother;
    }

    public Children getChildren() {
        return children;
    }

    public void setChildren(Children children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Family{" +
                "\nfather=" + father +
                ",\nmother=" + mother +
                ",\nchildren=" + children +
                '}';
    }
}
