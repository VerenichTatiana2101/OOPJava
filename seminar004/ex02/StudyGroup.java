package seminar004.ex02;

import java.util.ArrayList;


public class StudyGroup {
    private ArrayList<Students> students;

    public StudyGroup(ArrayList<Students> students) {
        this.students = students;
    }

    public ArrayList<Students> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Students> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "StudyGroup{" +
                "students=" + students +
                '}';
    }
}
