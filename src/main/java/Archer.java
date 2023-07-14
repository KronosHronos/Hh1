public class Archer extends Range {
    public Archer(String name) {
        super(90, name, "Archer", 10, 5, 0);
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Name: " + name + " ,Type: " + type +", Hp: " + hp + ", Attack: " + BaseAttack + ", Initiative: " + initiative + ", mp: " + mp;
    }
}
