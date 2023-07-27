package seminar003.task01;
/*
 * - Создать класс Студент
- Создать класс УчебнаяГруппаИтератор
- Создать класс УчебнаяГруппаИтератор, заставив его реализовать интерфейс Iterator
- Реализовать его контракты (включая удаление)
 */
public class Students {
    private String firstName;
    private String lastName;
    private int id;
    double meanBall;

    public Students(String firstName, String lastName, int id, double meanBall) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.meanBall = meanBall;
    }
    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    @Override
    public String toString() {
        return "Students{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", meanBall=" + meanBall +
                '}';
    }
}
