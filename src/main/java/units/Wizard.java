package units;

import java.util.ArrayList;

public abstract class Wizard extends BaseHero{
    public Wizard(int hp, String name, String type, int baseAttack, int initiative, int mp,int lighting, int FireBAll,int x, int y) {
        super(hp, name, type, baseAttack, initiative, mp,x,y);
        this.FireBall=FireBAll;
        this.Lighting=lighting;
    }

    @Override
    public void step(ArrayList<BaseHero> enemies) {
        int[] temp= findnearenemy(enemies);
        System.out.println("LN = " + temp[0] + "Enemy name" + enemies.get(temp[1]).name);
    }

    public int Lighting;
    public int FireBall;
}

