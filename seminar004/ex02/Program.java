package seminar004.ex02;

/*
 * Модифицировать ранее созданный класс Студент Компаратор
 * -переименовать в ЮзерКомпаратор
 * -типизировать его Т наследующегося от типа юзер
 * -типизировать реализуемый интерфейс Компаратор Т
 * -изменить метод компаре, внеся во входные данные вместо конкретных классов типизацию Т
 * -внести правки места, где использовался предыдущий компаратор
 */
import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        Students stud1=new Students("Евгений","Васильев",1,5);
        Students stud2=new Students("Яков","Иванов",2,1);
        Students stud3=new Students("Петя","Петров",3,3);
        Students stud4=new Students("Вася","Петров",4,2);

        List<Students> studentList=new ArrayList<>();
        studentList.add(stud1);
        studentList.add(stud2);
        studentList.add(stud3);
        studentList.add(stud4);

       // StudyGroup group1 = new StudyGroup(studentList);

        //GroupStudyIterator studentsIterator = new GroupStudyIterator(group1);

       /* while (studentsIterator.hasNext()){
            Student current = studentsIterator.next();
            if (current.getMeanBall()<4){
                studentsIterator.remove();
            }

        }*/

        //Collections.sort(studentList);
        //studentList.sort(new UserNameComparator());
        //System.out.println(studentList);

       // studentList.sort(new UserNameComparator().reversed());
      //  System.out.println(studentList);

        UserNameComparator<User> compStud = new UserNameComparator<>();

        studentList.sort(compStud);   ///сортировка по имени студентов
        System.out.println(studentList);

        Teachers teacher1 = new Teachers("Олег","Олегов", 10, "Математика", 4.5);
        Teachers teacher2 = new Teachers("Кирилл","Кириллов", 10, "Математика", 4.3);


        List<User> userList = new ArrayList<>();
        userList.add(stud1);
        userList.add(stud2);
        userList.add(teacher1);
        userList.add(teacher2);
        System.out.println();

        userList.sort(compStud);  ///сортировка по имени юзеров
        System.out.println(userList);
        System.out.println();
        stud1.print();  //печать
        teacher2.print();

        

        


    }
}