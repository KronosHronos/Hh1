package units;

import java.util.ArrayList;

public class Monk extends Healers{
    public Monk(String name,int x, int y) {
        super(100, name, "units.Monk", 5, 7, 130, 3,x,y);
    }

    @Override
    public void step(ArrayList<BaseHero> enemies) {
        int[] temp= findnearenemy(enemies);
        System.out.println("LN = " + temp[0] + " Enemy name " + enemies.get(temp[1]).name);
    }

    @Override
    public String getInfo() {
        return "Name: " + name + " ,Type: " + type +", Hp: " + hp + ", Attack: " + BaseAttack + ", Initiative: " + initiative + ", mp: " + mp +", Spell: Heal " + heal + "  "+"X = " + place.x +"  "+ "Y = " + place.y;
    }
}
