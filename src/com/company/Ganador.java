package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ganador {

    static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
    static ArrayList<Integer> player2Positions = new ArrayList<Integer>();
    static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();

    public static String GanadorGameMode1() {

        PlayerVS playerVS = new PlayerVS();

        List topRow = Arrays.asList(1, 2, 3);
        List midRow = Arrays.asList(4, 5, 6);
        List botRow = Arrays.asList(7, 8, 9);
        List leftCol = Arrays.asList(1, 4, 7);
        List midCol = Arrays.asList(2, 5, 8);
        List rightCol = Arrays.asList(3, 6, 9);
        List cross1 = Arrays.asList(1, 5, 9);
        List corss2 = Arrays.asList(7, 5, 3);

        List<List> winCondition = new ArrayList<List>();
        winCondition.add(topRow);
        winCondition.add(midRow);
        winCondition.add(botRow);
        winCondition.add(leftCol);
        winCondition.add(midCol);
        winCondition.add(rightCol);
        winCondition.add(cross1);
        winCondition.add(corss2);



        for (List l : winCondition) {
            if (playerPositions.containsAll(l)) {
                return "Has ganado! \n";
            } else if (cpuPositions.containsAll(l)) {
                return "La CPU ha ganado";
            } else if (playerPositions.size() + cpuPositions.size() == 9) {
                return "¡¡¡Empate!!! \n";
            }
        }
        return "";
    }

    public static String GanadorGameMode2() {

        PlayerVS playerVS = new PlayerVS();

        List topRow = Arrays.asList(1, 2, 3);
        List midRow = Arrays.asList(4, 5, 6);
        List botRow = Arrays.asList(7, 8, 9);
        List leftCol = Arrays.asList(1, 4, 7);
        List midCol = Arrays.asList(2, 5, 8);
        List rightCol = Arrays.asList(3, 6, 9);
        List cross1 = Arrays.asList(1, 5, 9);
        List corss2 = Arrays.asList(7, 5, 3);

        List<List> winCondition = new ArrayList<List>();
        winCondition.add(topRow);
        winCondition.add(midRow);
        winCondition.add(botRow);
        winCondition.add(leftCol);
        winCondition.add(midCol);
        winCondition.add(rightCol);
        winCondition.add(cross1);
        winCondition.add(corss2);



        for (List l : winCondition) {
            if (playerPositions.containsAll(l)) {
                return " ha ganado! \n";
            } else if (player2Positions.containsAll(l)) {
                return " ha ganado \n";
            } else if (playerPositions.size() + player2Positions.size() == 9) {
                return "Empate!!! \n";
            }
        }
        return "";
    }

}
