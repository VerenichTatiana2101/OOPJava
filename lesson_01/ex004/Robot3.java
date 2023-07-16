package lesson_01.ex004;

import java.util.ArrayList;

public class Robot3 {
    enum State {
        On, Off
    }

    private static int defaultIndex;
    private static ArrayList<String> names;

    static {
        defaultIndex = 1;
        names = new ArrayList<>();
    }

    /**
     * уровень робота
     */
    private int level;

    /**
     * имя робота
     */
    private String name;

    private State state;

    private Robot3(String name, int level) {
        if ((name.isEmpty() || Character.isDigit(name.charAt(0))) || Robot3.names.indexOf(name) != -1) {
            this.name = String.format("DefaultName_%d", defaultIndex++);
        } else {
            this.name = name;
        }

        Robot3.names.add(this.name);
        this.level = level;
        this.state = State.Off;
    }

    // #region другие конструкции
    // public Robot3(String name){
    // if((name.isEmpty() || Character.isDigit(name.charAt(0 ))) ||
    // Robot3.names.indexOf(name) == -1){
    // this.name = String.format("DefaultName_%d", defaultIndex++);
    // } else this.name = name;

    // Robot3.names.add(this.name);
    // this.level = 1;
    // this.state = State.Off;
    // }

    // public Robot3() {
    //     this.name = String.format("DefaultName_%d", defaultIndex++);

    //     Robot3.names.add(this.name);
    //     this.level = 1;
    //     this.state = State.Off;
    // }

    //#endregion
    //#region правильные конструкторы

    public Robot3(String name){
        this(name, 1);
    }

    public Robot3(){
        this("");
    }

    public void power(){
        if(this.state == State.Off){
            this.powerOn();
            this.state = State.On;
        } else{
            this.powerOff();
            this.state = State.Off;
        }
        System.out.println();
    }

    //методы вкл/выкл
    public void powerOn(){
        this.startBIOS();
        this.startOS();
        this.sayHay();
    }

    public void powerOff(){
        this.sayBye();
        this.stopOS();
        this.stopBIOS();
    }

    public int getLevel(){
        return this.level;
    }

    public String getName(){
        return this.name;
    }

        /**
     * Загрузка BIOS
     */
    private void startBIOS(){
        System.err.println("Start BIOS....");
    }

    /**
     * Загрузка OC
     */
    private void startOS(){
        System.err.println("Start OS....");
    }

    /**
     * Приветствие
     */
    private void sayHay(){
        System.err.println("Hallo world...");
    }

    /**
     * Выгрузка BIOS
     */
    private void stopBIOS(){
        System.out.println("Stop BIOS....");
    }

    /**
     * Выгрузка OS
     */
    private void stopOS(){
        System.out.println("Stop OS....");
    }

    /**
     * Прощание
     */
    private void sayBye(){
        System.out.println("Bye....");
    }

    /**
     * Работа
     */
    public void work(){
        if(this.state == State.On){
            System.out.println("Working...");
        }
        
    }

}
