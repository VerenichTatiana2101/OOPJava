package seminar004.ex02;

/*
 * - Создать класс Студент
- Создать класс УчебнаяГруппаИтератор
- Создать класс УчебнаяГруппаИтератор, заставив его реализовать интерфейс Iterator
- Реализовать его контракты (включая удаление)
 */
public class Students extends User implements Comparable<Students>, Printable<Students>{

    private int meanBall;

    public  Students (String firstname, String lastname, int id, int meanBall){
        super(firstname,lastname,id);
        this.meanBall=meanBall;
    }

    public double getMeanBall() {
        return meanBall;
    }

    public void setMeanBall(int meanBall) {
        this.meanBall = meanBall;
    }


    @Override
    public int compareTo(Students o) {
        return (int)(this.getMeanBall()-o.getMeanBall());
    }

    @Override
    public void print() {
        System.out.println(super.toString() +" mean ball= "+meanBall);
    }
}
