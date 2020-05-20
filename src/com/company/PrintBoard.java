package com.company;

import java.io.IOException;

public class PrintBoard {

    public static void clearScreen() throws IOException, InterruptedException {

        String OS = System.getProperty("os.name");

        if (OS.equals("Windows 10") || OS.equals("Windows 8.1") || OS.equals("Windows 7")) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println("\n");
       } else if (OS.contains("Linux")) {
            System.out.print("\033\143");
        }

    }



    public static void printTablero(char[][] tableroJuego, String playerName, String playerName2, int gameMode) throws IOException, InterruptedException {

        clearScreen();

        if (gameMode == 1) {
            System.out.println("       +-------------+");
            System.out.println("        Player vs CPU");
            System.out.println("       +-------------+" + "\n");
        } else if (gameMode == 2) {
            System.out.println("       +------------------+");
            System.out.println("        Player1 vs Player2");
            System.out.println("       +------------------+");

        }

        if (gameMode == 1) {
            System.out.println("        Player: "+ playerName +"\n");
        } else if (gameMode == 2) {
            System.out.println("        Player1: "+ playerName);
            System.out.println("        Player2: "+ playerName2 + "\n");
        }

        for (char[] row: tableroJuego) {
            for (char c: row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

}
