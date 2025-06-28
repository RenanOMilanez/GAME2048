package FrontEnd;

import console.Console;
import BackEnd.Game2048;
import BackEnd.Load;
import BackEnd.Tabuleiro2048;
import static console.Tecla.*;


public class TeladePause {
    
    public static final String RESET = "\033[0m";  // Resetar cor
    public static final String VERMELHO = "\033[0;31m";     // Vermelho
    public static final String VERDE = "\033[0;32m";   // Verde
    public static final String AMARELO = "\033[0;33m";  // Amarelo
    public static final String AZUL = "\033[0;34m";    // Azul
    public static final String ROXO = "\033[0;35m";  // Roxo
    public static final String CIANO = "\033[0;36m";    // Ciano
    public static final String BRANCO = "\033[0;37m";   // Branco
    
    public static void exibirMenuPausa(Game2048 game, Tabuleiro2048 tab) {
        while (true) {
            Console.limpaTela();
            Console.println("\n");
            Console.println(AMARELO + "   ⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤" + RESET);
            Console.println(AMARELO + "   ⣿⣿⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿                          ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿                          ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿" + BRANCO +  "      ⭐  ＰＡＵＳＡ ⭐" + AMARELO +   "   ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿                          ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿                          ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿" + BRANCO +  "    1 - CONTINUAR JOGO" + AMARELO + "    ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿                          ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿" + BRANCO +  "     2 - SALVAR JOGO   " + AMARELO +     "   ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿                          ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿" + BRANCO +  "   3 - SAIR PARA O MENU" + AMARELO + "   ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿                          ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿                          ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣿⣿" + RESET);
            Console.println(AMARELO + "   ⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛" + RESET);
            switch (Console.getTecla()) {
                case NUM_1:
                    game.setisPaused(false) ;
                    Console.println("Voltando pro Jogo...");
                    Load.carregarJogo("AutoSave/AutoSave.VelKoz");
                    return;
                    
                    
                case NUM_2:
                    Console.println("Salvando o jogo...");
                    TelaSaveManual.telaDeSave(game, tab);
                    return;
                    
                case NUM_3:
                    Console.println("Saindo para o Menu Principal...");
                    game.setisPaused(false);
                    MenuPrincipal.exibirMenu();
                    return;
            }
        }
    }
}
