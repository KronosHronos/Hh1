package units;

import java.util.ArrayList;

public abstract class BaseHero implements Action {
    int hp;
    String name;
    String type;
    int BaseAttack;
    int initiative;
    int mp;

    protected Coordinates place;

    public BaseHero(int hp, String name, String type, int baseAttack, int initiative, int mp,int x, int y) {
        this.hp = hp;
        this.name = name;
        this.type = type;
        BaseAttack = baseAttack;
        this.initiative = initiative;
        this.mp = mp;
        place=new Coordinates(x, y);
    }

    protected int[] findnearenemy(ArrayList<BaseHero> enemies){
        double min = 10000;

        int count=0;
        for (int i = 0; i< enemies.size(); i++) {
            if (place.calcDist(enemies.get(i).place)< min ){
                min = place.calcDist(enemies.get(i).place);
                count=i;
            }
        }
       return new int[]{(int) Math.round(min), count};
    }
}
