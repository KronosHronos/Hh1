import units.*;

import java.util.ArrayList;
import java.util.Random;

public class Program {
    private static String getName() {
        Humannames[] names = Humannames.values();
        int randomIndex = new Random().nextInt(names.length);
        return names[randomIndex].toString();
    }
    private static String getName2() {
        Demonnames[] names = Demonnames.values();
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
                case 0 -> {
                    team1.add(new Mage(getName(), 0, new Random().nextInt(0, 50)));
                    team2.add(new Demon(getName2(), 9, new Random().nextInt(0, 50)));
                }
                case 1 -> {
                    team1.add(new Monk(getName(), 0, new Random().nextInt(0, 50)));
                    team2.add(new Сultist(getName2(), 9, new Random().nextInt(0, 50)));
                }
                case 2 -> {
                    team1.add(new Rouge(getName(), 0, new Random().nextInt(0, 50)));
                    team2.add(new Shadow(getName2(), 9, new Random().nextInt(0, 50)));
                }
                case 3 -> {
                    team1.add(new Sniper(getName(), 0, new Random().nextInt(0, 50)));
                    team2.add(new Succubus(getName2(), 9, new Random().nextInt(0, 50)));
                }
                case 4 -> {
                    team1.add(new Archer(getName(), 0, new Random().nextInt(0, 50)));
                    team2.add(new LivingEmber(getName2(), 9, new Random().nextInt(0, 50)));
                }
                case 5 -> {
                    team1.add(new Spearman(getName(), 0, new Random().nextInt(0, 50)));
                    team2.add(new Hound(getName2(), 9, new Random().nextInt(0, 50)));
                }
                default -> {
                    team1.add(new Farmer(getName(), 0, new Random().nextInt(0, 50)));
                    team2.add(new Imp(getName2(), 9, new Random().nextInt(0, 50)));
                }
            }
        }

        System.out.println("Команда 1:");
        team1.forEach(hero -> System.out.println(hero.getInfo()));

        System.out.println("Команда 2:");
        team2.forEach(hero -> System.out.println(hero.getInfo()));

        System.out.println("Враги Людей:");
        team1.forEach(n ->n.step(team2));

        System.out.println("Враги Демонов:");
        team2.forEach(n ->n.step(team1));
        }
    }
