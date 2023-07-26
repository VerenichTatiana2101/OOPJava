package lesson_02.ex002;

public class Priest extends BaseHero {

    private int elixir;
    private int maxElixir;

    public Priest() {
        super(String.format("Hero_Priest #%d", ++Magician.number),
                Magician.r.nextInt(100));
        this.maxElixir = Magician.r.nextInt(50);
        this.elixir = maxElixir;
    }
    
    public String getInfo() {
        return String.format("%s  Elixir: %d", super.getInfo(), this.elixir);
    }
    
    public void attack(BaseHero target) {
        int damage = BaseHero.r.nextInt(10);
        target.GetDamage(damage);
    }
}
