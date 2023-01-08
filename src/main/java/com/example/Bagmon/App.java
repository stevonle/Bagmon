package com.example.Bagmon;

import java.util.Random;

public class App {
    private Random rand = new Random();
    private Input input = new Input();
    private Output output = new Output();
    private String[] monsters = {"Leafasaur", "Burntmander", "Splashle"};
    private int wins = 0;

    public void run() {
        output.displayMons();
        String input1 = input.chooseMon();
        Mon mon = new Mon(input1);

        output.displayNameMon();
        String input2 = input.nameMon();

        if (input2.equals("yes")) {
            output.displayNamingMon();
            String input3 = input.namingMon();
            mon.setName(input3);
        }

        output.displayStart();

        while (mon.getHp() > 0) {
            int opponentID = rand.nextInt(3);
            Mon opponent = new Mon(monsters[opponentID]);
            output.displayOpponent(opponent.getName());

            while (mon.getHp() > 0 && opponent.getHp() > 0) {
                output.displayAction(mon.getName(), mon.getMoveset().get(0).getName(), mon.getMoveset().get(1).getName(), mon.getHp(), opponent.getName(), opponent.getHp());
                String input4 = input.chooseMove();
                int opponentChoice = rand.nextInt(2);

                if (mon.getSpd() >= opponent.getSpd()) {
                    if (input4.equals("1")) {
                        Moves move = mon.getMoveset().get(0);
                        int damage = (int)(move.getScaling() * mon.getAtk());
                        damage = typeEffectivenessDMG(move.getType(), opponent.getType(), damage);
                        opponent.decreaseHP(damage);
                        output.displayDMGdealt(mon.getName(), damage, opponent.getName());
                    }
                    else {
                        Moves move = mon.getMoveset().get(1);
                        int damage = (int)(move.getScaling() * mon.getAtk());
                        damage = typeEffectivenessDMG(move.getType(), opponent.getType(), damage);
                        opponent.decreaseHP(damage);
                        output.displayDMGdealt(mon.getName(), damage, opponent.getName());
                    }
                    if (opponent.getHp() <= 0) {
                        break;
                    }
                    if (opponentChoice == 0) {
                        Moves move = opponent.getMoveset().get(0);
                        int damage = (int)(move.getScaling() * opponent.getAtk());
                        damage = typeEffectivenessDMG(move.getType(), mon.getType(), damage);
                        mon.decreaseHP(damage);
                        output.displayDMGtaken(mon.getName(), damage, opponent.getName());
                    }
                    else {
                        Moves move = opponent.getMoveset().get(1);
                        int damage = (int)(move.getScaling() * opponent.getAtk());
                        damage = typeEffectivenessDMG(move.getType(), mon.getType(), damage);
                        mon.decreaseHP(damage);
                        output.displayDMGtaken(mon.getName(), damage, opponent.getName());
                    }
                }
                else {
                    if (opponentChoice == 0) {
                        Moves move = opponent.getMoveset().get(0);
                        int damage = (int)(move.getScaling() * opponent.getAtk());
                        damage = typeEffectivenessDMG(move.getType(), mon.getType(), damage);
                        mon.decreaseHP(damage);
                        output.displayDMGtaken(mon.getName(), damage, opponent.getName());
                    }
                    else {
                        Moves move = opponent.getMoveset().get(1);
                        int damage = (int)(move.getScaling() * opponent.getAtk());
                        damage = typeEffectivenessDMG(move.getType(), mon.getType(), damage);
                        mon.decreaseHP(damage);
                        output.displayDMGtaken(mon.getName(), damage, opponent.getName());
                    }
                    if (mon.getHp() <= 0) {
                        break;
                    }
                    if (input4.equals("1")) {
                        Moves move = mon.getMoveset().get(0);
                        int damage = (int)(move.getScaling() * mon.getAtk());
                        damage = typeEffectivenessDMG(move.getType(), opponent.getType(), damage);
                        opponent.decreaseHP(damage);
                        output.displayDMGdealt(mon.getName(), damage, opponent.getName());
                    }
                    else {
                        Moves move = mon.getMoveset().get(1);
                        int damage = (int)(move.getScaling() * mon.getAtk());
                        damage = typeEffectivenessDMG(move.getType(), opponent.getType(), damage);
                        opponent.decreaseHP(damage);
                        output.displayDMGdealt(mon.getName(), damage, opponent.getName());
                    }
                }
            }
            if (mon.getHp() > 0) {
                output.displayVictory(mon.getName());
                wins++;
            }
            else {
                output.displayLoss(mon.getName());
            }
            output.displayWins(wins);
        }
    }

    public int typeEffectivenessDMG(String moveType, String monType, int damage) {
        if (moveType.equals("grass") && monType.equals("water") ||
                moveType.equals("fire") && monType.equals("grass") ||
                moveType.equals("water") && monType.equals("fire")) {
            return damage * 2;
        }
        else if (moveType.equals("grass") && monType.equals("fire") ||
                moveType.equals("fire") && monType.equals("water") ||
                moveType.equals("water") && monType.equals("grass") ||
                moveType.equals(monType)) {
            return damage / 2;
        }
        return damage;
    }
}
