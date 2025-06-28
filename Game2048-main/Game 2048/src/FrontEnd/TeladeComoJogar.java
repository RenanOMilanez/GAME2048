package FrontEnd;

import BackEnd.Game2048;
import BackEnd.Peca;
import BackEnd.Tabuleiro2048;
import console.Console;
import static console.Tecla.NUM_1;
import static console.Tecla.NUM_2;


public class TeladeComoJogar {
    public static final String RESET = "\033[0m";  // Resetar cor
    public static final String VERMELHO = "\033[0;31m";     // Vermelho
    public static final String VERDE = "\033[0;32m";   // Verde
    public static final String AMARELO = "\033[0;33m";  // Amarelo
    public static final String AZUL = "\033[0;34m";    // Azul
    public static final String ROXO = "\033[0;35m";  // Roxo
    public static final String CIANO = "\033[0;36m";    // Ciano
    public static final String BRANCO = "\033[0;37m";   // Branco
    
    public static void exibirTutorial() {
        while (true) {
            Console.limpaTela();
            Console.println("\n");
            Console.println(AMARELO + "   ⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤" + RESET);
            Console.println(AMARELO + "   ⣿⣿⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿                                       ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿                                       ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿" + BRANCO + "        ⭐  ＣＯＭＯ ＪＯＧＡＲ ⭐" + AMARELO +  "       ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿                                       ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿                                       ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿" + BRANCO + "   1. Combine blocos numerados até  " + AMARELO + "   ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿" + BRANCO + "   criar um bloco com o número 2048." + AMARELO + "   ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿                                       ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿" + BRANCO + "   2. O jogo ocorre em uma grade de " + AMARELO + "   ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿" + BRANCO + "   4x4." + AMARELO + "                                ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿                                       ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿" + BRANCO + "   3. O Use as setas do teclado para" + AMARELO + "   ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿" + BRANCO + "   mover todos os blocos com ↑,↓,→,←" + AMARELO + "   ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿" + BRANCO + "   e W,S,D,A." + AMARELO + "                          ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿                                       ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿" + BRANCO + "   4. A cada movimento, um novo bloco" + AMARELO + "  ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿" + BRANCO + "   de valor 2 ou 4 aparece em uma " + AMARELO + "     ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿" + BRANCO + "   posição vazia do tabuleiro." + AMARELO + "         ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿                                       ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿" + BRANCO + "   5. O jogo termina quando não há " + AMARELO + "    ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿" + BRANCO + "   mais movimentos possíveis,ou sej" + AMARELO + "    ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿" + BRANCO + "   quando o tabuleiro está cheio e " + AMARELO + "    ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿" + BRANCO + "   não há blocos adjacentes com o  " + AMARELO + "    ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿" + BRANCO + "   mesmo número para combinar.     " + AMARELO + "    ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿                                       ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿" + BRANCO + "   6. Você ganha ao criar um bloco " + AMARELO + "    ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿" + BRANCO + "   com o número 2048, mas pode " + AMARELO + "        ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿" + BRANCO + "   continuar jogando para alcançar " + AMARELO + "    ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿" + BRANCO + "   pontuações mais altas." + AMARELO + "              ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿                                       ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿                                       ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿" + BRANCO + "      1 - VAMOS JOGAR UMA PARTIDA      " + AMARELO + "⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿                                       ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿" + BRANCO + "        2 - VOLTAR PARA O MENU         " + AMARELO + "⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿                                       ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿                                       ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣿⣿" + RESET);
            Console.println(AMARELO + "   ⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛" + RESET);
            switch (Console.getTecla()) {
                case NUM_1:
                    Console.println("Iniciando Novo Jogo..");
                    new Game2048().iniciarJogo(new Tabuleiro2048(4, 4, new Peca()));
                    Console.limpaTela();
                    break;
                    
                case NUM_2:
                    Console.println("Indo para o Menu...");
                    MenuPrincipal.exibirMenu();
                    break;
            }
        }
    }
}
