package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        Notifier notifier = new Notifier();
        SwitchMenu switchMenu = new SwitchMenu();
        PrintBoard printBoard = new PrintBoard();

        printBoard.clearScreen();
        notifier.Bienvenido();
        notifier.MenuJugar();
        notifier.MenuSalir();
        System.out.println();

        notifier.MenuOpcion();
        int opcion = scanner.nextInt();
        printBoard.clearScreen();
        switchMenu.MenuJuego(opcion);

    }
}

/* Compile: javac -d com\company\Class com\company\*.java */
/* Run:  java -cp com\company\Class com.company.Main*/
