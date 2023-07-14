public class Rouge extends Infantry{
    private int assassination;
    public Rouge(String name) {
        super(130, name, "Rouge", 12, 8, 30);
        this.assassination=60;
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Name: " + name + " ,Type: " + type +", Hp: " + hp + ", Attack: " + BaseAttack + ", Initiative: " + initiative + ", mp: " + mp +", Spell: Assassination: " + assassination;
    }
}
