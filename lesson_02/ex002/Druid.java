package lesson_02.ex002;

public class Druid extends BaseHero {
    private int harmony;
    private int maxHarmony;

    public Druid() {
        super(String.format("Hero_Druid #%d", ++Druid.number),
                Magician.r.nextInt(100));
        this.maxHarmony = Magician.r.nextInt(50);
        this.harmony = maxHarmony;
    }

    public String getInfo() {
        return String.format("%s  Harmony: %d", super.getInfo(), this.harmony);
    }

    public void healing(BaseHero target) {
        int heal = BaseHero.r.nextInt(10);
        if (this.harmony >= heal) {
            target.healed(heal);
        }
    }
}