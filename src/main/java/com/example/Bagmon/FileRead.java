package com.example.Bagmon;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileRead {
    private List<String[]> movesList = new ArrayList<>();

    public void readFileForMovesInfo() {
        try {
            Scanner input = new Scanner(new File("moves.csv"));

            while (input.hasNextLine()) {
                String eachLine = input.nextLine();
                String[] moveInfo = eachLine.split(",");
                movesList.add(moveInfo);
            }

            input.close();
        }
        catch (FileNotFoundException e) {
        }
    }

    public List<String[]> getMovesInfoList() {
        return movesList;
    }
}
