package com.example.Bagmon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mon {
    private Random rand = new Random();
    private int hp;
    private int atk;
    private int spd;
    private String type;
    private String name;
    private List<Moves> moveset = new ArrayList<>();
    private List<Moves> allMoves = new ArrayList<>();

    public Mon(String name) {
        createMoves();
        this.name = name;

        if (name.equals("Splashle")) {
            hp = rand.nextInt(101,121);
            type = "water";
            moveset.add(allMoves.get(0));
            moveset.add(allMoves.get(3));
        } else {
            hp = rand.nextInt(81, 101);
        }

        if (name.equals("Burntmander")) {
            atk = rand.nextInt(41, 51);
            type = "fire";
            moveset.add(allMoves.get(0));
            moveset.add(allMoves.get(2));
        } else {
            atk = rand.nextInt(31, 41);
        }

        if (name.equals("Leafasaur")) {
            spd = rand.nextInt(41, 51);
            type = "grass";
            moveset.add(allMoves.get(0));
            moveset.add(allMoves.get(1));
        } else {
            spd = rand.nextInt(31, 41);
        }
    }

    public void createMoves() {
        FileRead file = new FileRead();
        file.readFileForMovesInfo();
        List<String[]> arr = file.getMovesInfoList();

        for (int i = 0; i < arr.size(); i++) {
            String[] moveInfo = arr.get(i);
            String name = moveInfo[0];
            String type = moveInfo[1];
            double scaling = Double.parseDouble(moveInfo[2]);
            int points = Integer.parseInt(moveInfo[3]);

            Moves eachMove = new Moves(name, type, scaling, points);
            allMoves.add(eachMove);
        }
    }

    public void decreaseHP(int damage) {
        hp -= damage;
    }

    public String toString() {
        return "name: " + name + " hp: " + hp + " atk: " + atk + " spd: " + spd + " type: " + type;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getSpd() {
        return spd;
    }

    public void setSpd(int spd) {
        this.spd = spd;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Moves> getMoveset() {
        return moveset;
    }
}
