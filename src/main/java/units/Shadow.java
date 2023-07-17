package units;

import java.util.ArrayList;

public class Shadow extends Infantry {
    private int assassination;
    public Shadow(String name, int x, int y) {
        super(130, name, "units.Shadow", 12, 8, 30,x,y);
        this.assassination=60;
    }

    @Override
    public void step(ArrayList<BaseHero> enemies) {
        int[] temp= findnearenemy(enemies);
        System.out.println("LN = " + temp[0] + " Enemy name " + enemies.get(temp[1]).name);
    }

    @Override
    public String getInfo() {
        return "Name: " + name + " ,Type: " + type +", Hp: " + hp + ", Attack: " + BaseAttack + ", Initiative: " + initiative + ", mp: " + mp +", Spell: Assassination " + assassination + "  " + "X = " + place.x +"  "+ "Y = " + place.y;
    }
}

