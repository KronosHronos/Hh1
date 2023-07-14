public class Mage extends Wizard {
    public Mage(String name) {
        super(90, name, "Mage", 8, 3, 150, 20, 15);
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Name: " + name + " ,Type: " + type +", Hp: " + hp + ", Attack: " + BaseAttack + ", Initiative: " + initiative + ", mp: " + mp +", Spell: FireBall " + FireBall + ", Spell: Lighting " + Lighting;
    }
}
