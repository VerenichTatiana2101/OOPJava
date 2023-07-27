package seminar003.task01;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        Students students1 = new Students("Ivan", "Ivanov", 1, 5);
        Students students2 = new Students("Petr", "Petrov", 2, 4);
        Students students3 = new Students("Vasiliy", "Vasiliev", 3, 3.5);
        ArrayList<Students> groupStudents = new ArrayList<>();
        groupStudents.add(students1);
        groupStudents.add(students2);
        groupStudents.add(students3);
        StudyGroup group1 = new StudyGroup(groupStudents);
        GroupStudentsIterator studentsIterator = new GroupStudentsIterator(group1);
        while(studentsIterator.hasNext()){
            Students temp = studentsIterator.next();
            if(temp.meanBall < 4){
                studentsIterator.remove();
            }
        }
        System.out.println(group1.toString());
    }

    // public int compare(Student o1, Student o2) {
    //     int resultOfComparing = o1.getSecondName().compareTo(o2.getSecondName());
    //     if (resultOfComparing == 0) {
    //         resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());
    //         if (resultOfComparing == 0) {
    //             return o1.getPatronymic().compareTo(o2.getPatronymic());
    //         } else {
    //             return resultOfComparing;
    //         }
    //     } else {
    //         return resultOfComparing;
    //     }
    // }
}
