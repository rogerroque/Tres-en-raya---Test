package com.company;

import java.awt.*;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PlayerVS {

    Notifier notifier = new Notifier();
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    Ganador ganador = new Ganador();
    Main main = new Main();

    boolean jugar = true;

    String playerName1, playerName2;

    void playerVScpu() throws IOException, InterruptedException {

        int gameMode = 1;

        char[][] tableroJuego = {
                {' ',' ',' ',' ',' ',' ',' ',' ',' ', ' ', ' ',' ', '|', ' ', ' ', ' ', '|', ' ', ' ', ' '},
                {' ',' ',' ',' ',' ',' ',' ',' ',' ','-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-'},
                {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ', ' ', ' ', '|', ' ', ' ', ' ', '|', ' ', ' ', ' '},
                {' ',' ',' ',' ',' ',' ',' ',' ',' ','-', '-', '-', '+', '-', '-', ' ', '+', '-', '-', '-'},
                {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ', ' ', ' ', '|', ' ', ' ', ' ', '|', ' ', ' ', ' '}};

        System.out.print("    Elije tu nombre: ");
        String playerName = scanner.next();
        System.out.println("\n");

        System.out.println("<----- Player vs CPU ----->");


        PrintBoard.printTablero(tableroJuego, playerName, playerName2, gameMode);

        while (jugar) {

            notifier.choosePosition(playerName);
            int playerPosicion = scanner.nextInt();
            while (Ganador.playerPositions.contains(playerPosicion) || Ganador.cpuPositions.contains(Ganador.playerPositions)) {
                playerPosicion = scanner.nextInt();
            }
            PlacePiece.ponerPieza(tableroJuego, "Player", playerPosicion, gameMode);
            PrintBoard.printTablero(tableroJuego, playerName, playerName2, gameMode);

            String resultado = ganador.GanadorGameMode1();
            if (resultado.length() > 0) {
                PrintBoard.printTablero(tableroJuego, playerName, playerName2, gameMode);
                System.out.println("\n");
                System.out.println("         "+resultado);
                break;
            }

            int cpuPosicion = random.nextInt(9) + 1;
            notifier.choosePositionCPU(cpuPosicion);
            while (Ganador.playerPositions.contains(cpuPosicion) || Ganador.cpuPositions.contains(cpuPosicion)) {
                cpuPosicion = random.nextInt(9) + 1;
            }
            PlacePiece.ponerPieza(tableroJuego, "CPU", cpuPosicion, gameMode);

            PrintBoard.printTablero(tableroJuego, playerName, playerName2, gameMode);

            resultado = ganador.GanadorGameMode1();
            if (resultado.length() > 0) {
                PrintBoard.printTablero(tableroJuego, playerName, playerName2, gameMode);
                System.out.println("         "+resultado);
                break;
            }
        }
    }

    void playerVSplayer() throws IOException, InterruptedException {

        int gameMode = 2;

        ganador.GanadorGameMode2();

        char[][] tableroJuego = {
                {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ', ' ', ' ',' ', '|', ' ', ' ', ' ', '|', ' ', ' ', ' '},
                {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-'},
                {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ', ' ', ' ', '|', ' ', ' ', ' ', '|', ' ', ' ', ' '},
                {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','-', '-', '-', '+', '-', '-', ' ', '+', '-', '-', '-'},
                {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ', ' ', ' ', '|', ' ', ' ', ' ', '|', ' ', ' ', ' '}};

        System.out.print("    Player1 name: ");
        String playerName = scanner.next();

        System.out.print("    Player2 name: ");
        String playerName2 = scanner.next();
        System.out.println("\n");

        System.out.println("<----- Player1 vs Player2 ----->");


        PrintBoard.printTablero(tableroJuego, playerName, playerName2, gameMode);

        while (jugar) {

            notifier.choosePosition(playerName);
            int playerPosicion = scanner.nextInt();
            while (Ganador.playerPositions.contains(playerPosicion) || Ganador.cpuPositions.contains(Ganador.playerPositions)) {
                playerPosicion = scanner.nextInt();
            }
            PlacePiece.ponerPieza(tableroJuego, "Player", playerPosicion, gameMode);
            PrintBoard.printTablero(tableroJuego, playerName, playerName2, gameMode);

            String resultado = ganador.GanadorGameMode2();
            if (resultado.length() > 0) {
                PrintBoard.printTablero(tableroJuego, playerName, playerName2, gameMode);
                System.out.println("\n");
                System.out.println("        "+ playerName +""+resultado);
                break;
            }

            notifier.choosePosition2(playerName2);
            int player2Postion = scanner.nextInt();
            notifier.choosePositionCPU(player2Postion);
            while (Ganador.playerPositions.contains(player2Postion) || Ganador.player2Positions.contains(player2Postion)) {
                player2Postion = scanner.nextInt();
            }
            PlacePiece.ponerPieza(tableroJuego, "Player2", player2Postion, gameMode);

            PrintBoard.printTablero(tableroJuego, playerName, playerName2, gameMode);

            resultado = ganador.GanadorGameMode2();
            if (resultado.length() > 0) {
                PrintBoard.printTablero(tableroJuego, playerName, playerName2, gameMode);
                System.out.println("\n");
                System.out.println("        "+ playerName2 +""+resultado);
                break;
            }
        }
    }
}


