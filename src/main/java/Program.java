import java.util.ArrayList;
import java.util.Random;

public class Program {
    private static String getName() {
        Humannames[] names = Humannames.values();
        int randomIndex = new Random().nextInt(names.length);
        return names[randomIndex].toString();
    }

    public static void main(String[] args) {
        ArrayList<BaseHero> team1 = new ArrayList<>();
        ArrayList<BaseHero> team2 = new ArrayList<>();

        int r;
        for (int i = 0; i < 10; i++) {
            r = new Random().nextInt(0, 7);
            switch (r) {
                case 0:
                    team1.add(new Mage(getName()));
                    team2.add(new Mage(getName()));
                    break;
                case 1:
                    team1.add(new Monk(getName()));
                    team2.add(new Monk(getName()));
                    break;
                case 2:
                    team1.add(new Rouge(getName()));
                    team2.add(new Rouge(getName()));
                    break;
                case 3:
                    team1.add(new Sniper(getName()));
                    team2.add(new Sniper(getName()));
                    break;
                case 4:
                    team1.add(new Archer(getName()));
                    team2.add(new Archer(getName()));
                    break;
                case 5:
                    team1.add(new Spearman(getName()));
                    team2.add(new Spearman(getName()));
                    break;
                default:
                    team1.add(new Farmer(getName()));
                    team2.add(new Farmer(getName()));
                    break;
            }
        }

        System.out.println("Команда 1:");
        team1.forEach(hero -> System.out.println(hero.getInfo()));

        System.out.println("Команда 2:");
        team2.forEach(hero -> System.out.println(hero.getInfo()));
        }
    }
