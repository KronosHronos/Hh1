public abstract class Healers extends BaseHero {
    public Healers(int hp, String name, String type, int baseAttack, int initiative, int mp, int heal) {
        super(hp, name, type, baseAttack, initiative, mp);
        this.heal=heal;
    }
    public int heal;
}
