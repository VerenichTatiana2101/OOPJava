package seminar004.ex02;

import java.util.ArrayList;
import java.util.Iterator;


public class GroupStudyIterator implements Iterator<Students>{
    private final ArrayList<Students> students;
    private int count;

    public GroupStudyIterator(StudyGroup students) {
        this.students = students.getStudents();
        this.count=0;
    }

    @Override
    public boolean hasNext(){
        if (count<students.size()){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Students next(){
        if (hasNext()){
            count++;
            return students.get(count);
        } else {
            return null;
        }
    }

    @Override
    public void remove(){
        students.remove(count);
    }

}
