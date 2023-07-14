public class Monk extends Healers{
    public Monk(String name) {
        super(100, name, "Monk", 5, 7, 130, 3);
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Name: " + name + " ,Type: " + type +", Hp: " + hp + ", Attack: " + BaseAttack + ", Initiative: " + initiative + ", mp: " + mp +", Spell: Heal " + heal;
    }
}
