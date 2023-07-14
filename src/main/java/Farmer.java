public class Farmer extends BaseHero{
    public Farmer(String name) {
        super(60, name, "Farmer", 6, 4, 0);
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Name: " + name + " ,Type: " + type +", Hp: " + hp + ", Attack: " + BaseAttack + ", Initiative: " + initiative + ", mp: " + mp;
    }
}
