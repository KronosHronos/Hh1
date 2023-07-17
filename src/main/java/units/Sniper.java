package units;

import java.util.ArrayList;

public class Sniper extends Range{
    private int headShot;
    public Sniper(String name,int x, int y) {
        super(70, name, "units.Sniper", 12, 3, 60,x,y);
        this.headShot=40;
    }

    @Override
    public void step(ArrayList<BaseHero> enemies) {
        int[] temp= findnearenemy(enemies);
        System.out.println("LN = " + temp[0] + " Enemy name " + enemies.get(temp[1]).name);
    }

    @Override
    public String getInfo() {
        return "Name: " + name + " ,Type: " + type +", Hp: " + hp + ", Attack: " + BaseAttack + ", Initiative: " + initiative + ", mp: " + 60 +", Spell: HeadShot " + headShot + "  "+"X = " + place.x +"  "+ "Y = " + place.y;

    }
}

