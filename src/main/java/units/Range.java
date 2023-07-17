package units;

import java.util.ArrayList;

public abstract class Range extends BaseHero {
    public Range(int hp, String name, String type, int baseAttack, int initiative, int mp,int x, int y) {
        super(hp, name, type, baseAttack, initiative, mp,x,y);
    }
    @Override
    public void step(ArrayList<BaseHero> enemies) {
        int[] temp= findnearenemy(enemies);
        System.out.println("LN = " + temp[0] + " Enemy name " + enemies.get(temp[1]).name);
    }

    @Override
    public String getInfo() {
        return null;
    }
}
