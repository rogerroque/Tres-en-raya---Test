package com.company;

import java.util.Scanner;

public class Notifier {

    Scanner scanner = new Scanner(System.in);

    void choosePosition(String playerName) {
        System.out.print("\n");
        System.out.print("     "+ playerName + " elije una posicion: ");
    }

    void choosePosition2(String playerName2) {
        System.out.print("\n");
        System.out.print("     "+ playerName2 + " elije una posicion: ");
    }

    void choosePositionCPU(int cpuPosition) {
        System.out.println("Posicion de la CPU: " + cpuPosition +"\n");
    }

    void choosePositionP2() {
        System.out.print("Posicion del Player2: ");
    }

    /*---------------- MENU ----------------*/

    void Bienvenido() {
        System.out.println("    +--------------------------+");
        System.out.println("     Binevenido al tres en raya ");
        System.out.println("    +--------------------------+");
    }

    void MenuJugar() {
        System.out.println("     1. Player vs CPU");
        System.out.println("     2. Player1 vs Player2");
    }

    void MenuSalir() {
        System.out.println("     0. Salir");
    }

    void MenuOpcion() {
        System.out.print("     Opcion: ");
    }

}


