public class Spearman extends Infantry{
    public Spearman(String name) {
        super(150, name, "Spearman", 20, 7, 0);
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Name: " + name + " ,Type: " + type +", Hp: " + hp + ", Attack: " + BaseAttack + ", Initiative: " + initiative + ", mp: " + mp;
    }
}
