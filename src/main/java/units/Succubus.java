package units;

import java.util.ArrayList;

public class Succubus extends Range{
    private int Fleshexplosion;
    public Succubus(String name,int x, int y) {
        super(70, name, "units.Succubus", 12, 3, 60, x, y);
        this.Fleshexplosion=40;
    }

    @Override
    public void step(ArrayList<BaseHero> enemies) {
        int[] temp= findnearenemy(enemies);
        System.out.println("LN = " + temp[0] + " Enemy name " + enemies.get(temp[1]).name);
    }

    @Override
    public String getInfo() {
        return "Name: " + name + " ,Type: " + type +", Hp: " + hp + ", Attack: " + BaseAttack + ", Initiative: " + initiative + ", mp: " + 60 +", Spell: Fleshexplosion " + Fleshexplosion + "  "+"X = " + place.x +"  "+ "Y = " + place.y;

    }
}

