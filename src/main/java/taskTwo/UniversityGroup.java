package taskTwo;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Daria Serebryakova on 19.04.2017.
 */
public class UniversityGroup {
    private List<String> studentsList;
    private Set<String> studentSet;
    private Map<Integer, String> studentMap;

    public UniversityGroup() {
    }

    public UniversityGroup(List<String> studentsList) {
        this.studentsList = studentsList;
    }

    public UniversityGroup(List<String> studentsList, Set<String> studentSet, Map<Integer, String> studentMap) {
        this.studentsList = studentsList;
        this.studentSet = studentSet;
        this.studentMap = studentMap;
    }

    public List<String> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<String> studentsList) {
        this.studentsList = studentsList;
    }

    public Set<String> getStudentSet() {
        return studentSet;
    }

    public void setStudentSet(Set<String> studentSet) {
        this.studentSet = studentSet;
    }

    public Map<Integer, String> getStudentMap() {
        return studentMap;
    }

    public void setStudentMap(Map<Integer, String> studentMap) {
        this.studentMap = studentMap;
    }
}
