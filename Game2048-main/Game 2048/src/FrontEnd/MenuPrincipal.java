package FrontEnd;

import BackEnd.Game2048;
import BackEnd.Load;
import BackEnd.Peca;
import BackEnd.Tabuleiro2048;
import console.Console;
import static console.Tecla.NUM_1;
import static console.Tecla.NUM_2;
import static console.Tecla.NUM_3;

public class MenuPrincipal {

    // Definindo as cores ANSI
    public static final String RESET = "\033[0m";  // Resetar cor
    public static final String VERMELHO = "\033[0;31m";     // Vermelho
    public static final String VERDE = "\033[0;32m";   // Verde
    public static final String AMARELO = "\033[0;33m";  // Amarelo
    public static final String AZUL = "\033[0;34m";    // Azul
    public static final String ROXO = "\033[0;35m";  // Roxo
    public static final String CIANO = "\033[0;36m";    // Ciano
    public static final String BRANCO = "\033[0;37m";   // Branco

    public static void exibirMenu() {
        while (true) {
            Console.limpaTela();
            Console.println("\n");
            Console.println(AMARELO + "   ⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤" + RESET);
            Console.println(AMARELO + "   ⣿⣿⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿                           ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿                           ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿" + BRANCO + "    ⭐  ＢＥＭ-ＶＩＮＤＯ  " + AMARELO + "⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿                           ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿" + BRANCO + "  ＡＯ ＪＯＧＯ ２０４８ ⭐" + AMARELO + "⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿                           ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿                           ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿                           ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿                           ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿" + BRANCO + "      ⭐  ＭＥＮＵ ⭐      " + AMARELO + "⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿                           ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿                           ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿" + BRANCO + "      1 - NOVO JOGO        " + AMARELO + "⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿" + BRANCO + "     2 - CONTINUAR JOGO    " + AMARELO + "⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿" + BRANCO + "     3 - CARREGAR JOGO     " + AMARELO + "⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿" + BRANCO + "      4 - COMO JOGAR       " + AMARELO + "⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿" + BRANCO + "     5 - SAIR DO JOGO      " + AMARELO + "⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿                           ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿                           ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣿⣿" + RESET);
            Console.println(AMARELO + "   ⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛" + RESET);
            switch (Console.getTecla()) {
                case NUM_1:
                    Console.println(AMARELO + "Iniciando Novo Jogo.." + RESET);
                    new Game2048().iniciarJogo(new Tabuleiro2048(4, 4, new Peca()));
                    Console.limpaTela();
                    break;

                case NUM_2:
                    Console.println(AMARELO + "Carregar Jogo..." + RESET);
                    Load.carregarJogo("AutoSave/AutoSave.VelKoz");
                    break;

                case NUM_3:
                    Console.println(AMARELO + "Carregar Jogo..." + RESET);
                    TelaLoading.loadingJogos();
                    break;

                case NUM_4:
                    Console.println(AMARELO + "Aprenda como jogar 2048 " + RESET);
                    TeladeComoJogar.exibirTutorial();
                    break;

                case NUM_5:
                    Console.println(AMARELO + "Saindo do jogo... Até a próxima partida jogador " + RESET);
                    Console.saiDoPrograma();
                    break;
            }
        }
    }
}
