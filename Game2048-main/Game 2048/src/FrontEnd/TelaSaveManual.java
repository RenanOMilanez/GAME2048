package FrontEnd;

import BackEnd.Game2048;
import BackEnd.Load;
import BackEnd.Save;
import BackEnd.Tabuleiro2048;
import static FrontEnd.MenuPrincipal.*;
import console.Console;

public class TelaSaveManual {

    public static void telaDeSave(Game2048 game, Tabuleiro2048 tab) {
        while (true) {
            Console.limpaTela();
            Console.println("\n");
            Console.println(AMARELO + "   ⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤" + RESET);
            Console.println(AMARELO + "   ⣿⣿⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿                                       ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿                                       ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿" + BRANCO + "        ⭐  JOGOS SALVOS  ⭐" + AMARELO + "           ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿                                       ⣿⣿" + RESET);

            Console.println(AMARELO + "   ⣿⣿                                       ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣿⣿" + RESET);
            Console.println(AMARELO + "   ⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛" + RESET);

            String Salvo = Save.pedirSave();
            if (!Salvo.isEmpty()) {
                Save.criarSave(tab, "ManualSave/" + Salvo);
                Load.carregarJogo("ManualSave/" + Salvo);
            }
        }
    }
}
