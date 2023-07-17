package units;

import java.util.ArrayList;

public interface Action {
    void step(ArrayList<BaseHero> enemies);
    String getInfo();
}

