package lesson_01.ex004;

public class Robot1 {
    
    /**
     * уровень робота
     */
    public int level;

    /**
     * имя робота
     */
    public String name;

    /**
     * создание робота
     * @param name Имя робота !Не должно начинаться с цифры
     * @param level Уровень робота
     */
    public Robot1(String name, int level){
        this.name = name;
        this.level = level;
    }

    //методы вкл/выкл подсистем
    /**
     * Загрузка BIOS
     */
    public void startBIOS(){
        System.err.println("Start BIOS....");
    }

    /**
     * Загрузка OC
     */
    public void startOS(){
        System.err.println("Start OS....");
    }

    /**
     * Приветствие
     */
    public void sayHay(){
        System.err.println("Hallo world...");
    }

    /**
     * Выгрузка BIOS
     */
    public void stopBIOS(){
        System.out.println("Stop BIOS....");
    }

    /**
     * Выгрузка OS
     */
    public void stopOS(){
        System.out.println("Stop OS....");
    }

    /**
     * Прощание
     */
    public void sayBye(){
        System.out.println("Bye....");
    }

    /**
     * Работа
     */
    public void work(){
        System.out.println("Working...");
    }

}
