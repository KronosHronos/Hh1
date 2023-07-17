package units;

import java.util.ArrayList;

public class Hound extends Infantry{
    public Hound(String name,int x,int y) {
        super(150, name, "units.Hound", 20, 7, 0,x,y);
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


