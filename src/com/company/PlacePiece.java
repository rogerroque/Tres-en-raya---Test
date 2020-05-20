package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PlacePiece {

    public static void ponerPieza(char[][] tableroJuego, String usuario, int posicion, int identificador) {

        char simbolo = ' ';

        if (identificador == 1) {
            if (usuario.equals("Player")) {
                simbolo = 'X';
                Ganador.playerPositions.add(posicion);
            } else if (usuario.equals("CPU")) {
                simbolo = '0';
                Ganador.cpuPositions.add(posicion);
            }
        } else if (identificador == 2) {
            if (usuario.equals("Player")) {
                simbolo = 'X';
                Ganador.playerPositions.add(posicion);
            } else if (usuario.equals("Player2")) {
                simbolo = '0';
                Ganador.player2Positions.add(posicion);
            }
        }

        switch (posicion) {

            case 1: {
                tableroJuego[0][10] = simbolo;
                break;
            }
            case 2: {
                tableroJuego[0][14] = simbolo;
                break;
            }
            case 3: {
                tableroJuego[0][18] = simbolo;
                break;
            }
            case 4: {
                tableroJuego[2][10] = simbolo;
                break;
            }
            case 5: {
                tableroJuego[2][14] = simbolo;
                break;
            }
            case 6: {
                tableroJuego[2][18] = simbolo;
                break;
            }
            case 7: {
                tableroJuego[4][10] = simbolo;
                break;
            }
            case 8: {
                tableroJuego[4][14] = simbolo;
                break;
            }
            case 9: {
                tableroJuego[4][18] = simbolo;
                break;
            }
            default:
                break;
        }
    }

    public static void clearArray(char [][] tablerojuego) {
        PlayerVS playerVS = new PlayerVS();

    }

}
