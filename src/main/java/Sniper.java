public class Sniper extends Range{
    private int headShot;
    public Sniper(String name) {
        super(70, name, "Sniper", 12, 3, 60);
        this.headShot=40;
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Name: " + name + " ,Type: " + type +", Hp: " + hp + ", Attack: " + BaseAttack + ", Initiative: " + initiative + ", mp: " + 60 +", Spell HeadShot: " + headShot;

    }
}

