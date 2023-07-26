package lesson_02.ex001;

public class Foo {
    public Integer value;
    private static Integer count;

    public static Integer getCount(){
        return count;
    }



    public Foo() {
        count++;
    }

    static{
        count = 0;
    }

    public void printCount(){
        System.out.println(count);
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
