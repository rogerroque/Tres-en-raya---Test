package com.company;

import java.io.IOException;

public class SwitchMenu {

    public static void MenuJuego(int opcion) throws IOException, InterruptedException {

        PlayerVS playervs = new PlayerVS();

        switch (opcion) {
            case 1: {
                playervs.playerVScpu();
                break;
            }
            case 2: {
                playervs.playerVSplayer();
                break;
            }

        }

    }

}
