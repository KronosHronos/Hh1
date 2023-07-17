package units;

import java.util.ArrayList;

public class Imp extends BaseHero{
    public Imp(String name,int x,int y) {
        super(60, name, "units.Imp", 6, 4, 0,x,y);
    }

    @Override
    public void step(ArrayList<BaseHero> enemies) {
        int[] temp= findnearenemy(enemies);
        System.out.println(" LN = " + temp[0] + " Enemy name " + enemies.get(temp[1]).name);
    }

    @Override
    public String getInfo() {
        return "Name: " + name + " ,Type: " + type +", Hp: " + hp + ", Attack: " + BaseAttack + ", Initiative: " + initiative + ", mp: " + mp + "  " + "X = " + place.x + "  " + "Y = " + place.y;
    }
}

