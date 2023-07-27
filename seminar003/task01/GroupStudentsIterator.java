package seminar003.task01;

import java.util.ArrayList;
import java.util.Iterator;

public class GroupStudentsIterator implements Iterator<Students> {
    private final ArrayList<Students> students;
    private int count;


    public GroupStudentsIterator(StudyGroup students) {
        this.students = students.getStudents();
        this.count = 0;
    }


    @Override
    public boolean hasNext() {
        if(count < students.size()){
            return true;
        }
        return false;
    }

    @Override
    public Students next() {
        if(hasNext()) {
            count++;
            return students.get(count);
        }
        else{
            return null;
        }
    }

    @Override
    public void remove() {
        students.remove(count);
    }

}
