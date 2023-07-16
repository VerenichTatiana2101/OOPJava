package lesson_01.ex004;

public class Robot2 {
    /**
     * уровень робота
     */
    private int level;

    /**
     * имя робота
     */
    private String name;

    /**
     * Создание робота
     * @param name Имя робота !Не должно начинаться с цифр
     * @param level Уровень робота
     */
    public Robot2(String name, int level){
        this.name = name;
        this.level = level;
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
        System.out.println("Working...");
    }

}
