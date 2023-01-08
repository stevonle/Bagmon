package com.example.Bagmon;

public class Output {

    public void displayMons() {
        System.out.println("Choose a monster:");
        System.out.println("[1] Leafasaur");
        System.out.println("[2] Burntmander");
        System.out.println("[3] Splashle");
    }

    public void displayNameMon() {
        System.out.println("");
        System.out.println("Would you like to name your monster?");
        System.out.println("[1] Yes");
        System.out.println("[2] No");
    }

    public void displayNamingMon() {
        System.out.println("");
        System.out.println("Enter a name for your monster:");
    }

    public void displayStart() {
        System.out.println("");
        System.out.println("Your monster is all set for battle");
    }

    public void displayOpponent(String name) {
        System.out.println("");
        System.out.println("A " + name + " has appeared");
    }

    public void displayAction(String name, String move1, String move2, int hp1, String enemy, int hp2) {
        System.out.println("");
        System.out.println(name + "'s HP: " + hp1);
        System.out.println(enemy + "'s HP: " + hp2);
        System.out.println("What move will " + name +" use?");
        System.out.println("[1] " + move1);
        System.out.println("[2] " + move2);
    }

    public void displayDMGdealt(String name, int damage, String opponent) {
        System.out.println("Your " + name + " dealt " + damage + " damage to the " + opponent);
    }

    public void displayDMGtaken(String name, int damage, String opponent) {
        System.out.println("Your " + name + " took " + damage + " damage from the " + opponent);
    }

    public void displayVictory(String name) {
        System.out.println("");
        System.out.println(name + " survived");
    }

    public void displayLoss(String name) {
        System.out.println("");
        System.out.println(name + " died");
    }

    public void displayWins(int wins) {
        System.out.println("You've killed " + wins + " monster(s)");
    }

}
