package units;

import java.util.ArrayList;

public class Archer extends Range {
    public Archer(String name,int x,int y) {
        super(90, name, "units.Archer", 10, 5, 0,x,y);
    }

    @Override
    public void step(ArrayList<BaseHero> enemies) {
        int[] temp= findnearenemy(enemies);
        System.out.println("LN = " + temp[0] + " Enemy name " + enemies.get(temp[1]).name);
    }

    @Override
    public String getInfo() {
        return "Name: " + name + " ,Type: " + type +", Hp: " + hp + ", Attack: " + BaseAttack + ", Initiative: " + initiative + ", mp: " + mp + "  " + "X = " + place.x + "  " + "Y = " + place.y;
    }
}
