package com.example.Bagmon;

import java.util.Scanner;

public class Input {
    Scanner scanner = new Scanner(System.in);

    public String chooseMon() {
        String input = scanner.nextLine();
        if (input.equals("1")) {
            return "Leafasaur";
        }
        else if (input.equals("2")) {
            return "Burntmander";
        }
        else if (input.equals("3")) {
            return "Splashle";
        }
        return "";
    }

    public String nameMon() {
        String input = scanner.nextLine();
        if (input.equals("1")) {
            return "yes";
        }
        return "";
    }

    public String namingMon() {
        String input = scanner.nextLine();
        return input;
    }

    public String chooseMove() {
        String input = scanner.nextLine();
        if (input.equals("1")) {
            return "1";
        }
        return "2";
    }
}
