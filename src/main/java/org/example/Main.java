package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Point Tests ---");
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));

        System.out.println("\n--- Player Tests ---");
        Player player = new Player("Arthur", 90, Weapon.SWORD);
        System.out.println("Initial Health: " + player.healthRemaining());

        player.loseHealth(40);
        System.out.println("After Damage: " + player.healthRemaining());

        player.restoreHealth(20);
        System.out.println("After Potion: " + player.healthRemaining());

        player.loseHealth(80);
    }
}