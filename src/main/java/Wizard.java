public abstract class Wizard extends BaseHero{
    public Wizard(int hp, String name, String type, int baseAttack, int initiative, int mp,int lighting, int FireBAll) {
        super(hp, name, type, baseAttack, initiative, mp);
        this.FireBall=FireBAll;
        this.Lighting=lighting;
    }

    public int Lighting;
    public int FireBall;
}

