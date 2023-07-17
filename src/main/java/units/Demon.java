package units;

import java.util.ArrayList;

public class Demon extends Wizard{
    public Demon(String name,int x,int y) {
        super(90, name, "units.Demon", 8, 3, 150, 20, 15,x,y);
    }

    @Override
    public void step(ArrayList<BaseHero> enemies) {
        int[] temp= findnearenemy(enemies);
        System.out.println("LN = " + temp[0] + " Enemy name " + enemies.get(temp[1]).name);
    }

    @Override
    public String getInfo() {
        return "Name: " + name + " ,Type: " + type +", Hp: " + hp + ", Attack: " + BaseAttack + ", Initiative: " + initiative + ", mp: " + mp +", Spell: FireBall " + FireBall + ", Spell: Lighting " + Lighting + "  " + "X = " + place.x + "  " + "Y = " + place.y;
    }
}

