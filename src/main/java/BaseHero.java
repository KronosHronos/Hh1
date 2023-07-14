public abstract class BaseHero implements Action {
    int hp;
    String name;
    String type;
    int BaseAttack;
    int initiative;
    int mp;

    public BaseHero(int hp, String name, String type, int baseAttack, int initiative, int mp) {
        this.hp = hp;
        this.name = name;
        this.type = type;
        BaseAttack = baseAttack;
        this.initiative = initiative;
        this.mp = mp;
    }
}
