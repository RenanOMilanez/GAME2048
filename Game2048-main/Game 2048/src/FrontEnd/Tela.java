package FrontEnd;

import console.Console;
import BackEnd.Tabuleiro2048;
import cores.StringColorida;
import BackEnd.Game2048;
import BackEnd.Peca;
import static console.Tecla.NUM_1;
import static console.Tecla.NUM_2;

public class Tela {
    
    public static final String RESET = "\033[0m";  // Resetar cor
    public static final String VERMELHO = "\033[0;31m";     // Vermelho
    public static final String VERDE = "\033[0;32m";   // Verde
    public static final String AMARELO = "\033[0;33m";  // Amarelo
    public static final String AZUL = "\033[0;34m";    // Azul
    public static final String ROXO = "\033[0;35m";  // Roxo
    public static final String CIANO = "\033[0;36m";    // Ciano
    public static final String BRANCO = "\033[0;37m";   // Branco
    
    public static void mostrarTabuleiro(Tabuleiro2048 tab) {
        Console.limpaTela();
        
            
        int totalColunas = tab.getTotalColunas();
        String pontuacao = imprimirNome(String.valueOf(tab.getPontos()), 10);
        Console.println("\n");
        Console.println(AMARELO +"   ⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤" + RESET);
        Console.println(AMARELO +"   ⣿⣿⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⣿⣿"+ RESET);
        Console.println(AMARELO +"   ⣿⣿                               ⣿⣿"+ RESET);
        Console.println(AMARELO +"   ⣿⣿                               ⣿⣿"+ RESET);
        Console.println(AMARELO +"   ⣿⣿" + BRANCO + "          Pontuação:" +  pontuacao + AMARELO + " ⣿⣿" + RESET);
        Console.println(AMARELO +"   ⣿⣿                               ⣿⣿"+ RESET);
        Console.println(AMARELO +"   ⣿⣿                               ⣿⣿"+ RESET);
        Console.println(AMARELO +"   ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿"+ RESET);
        Console.println(AMARELO +"   ⣿⣿                               ⣿⣿"+ RESET);
        Console.println(AMARELO +"   ⣿⣿                               ⣿⣿"+ RESET);
        Console.println(AMARELO +"   ⣿⣿                               ⣿⣿"+ RESET);
        for (int y = 0; y < tab.getTotalLinhas(); y++) {
             Console.print( AMARELO + "   ⣿⣿   ");
             
            for (int x = 0; x < totalColunas; x++) {
                StringColorida texto = tab.getFundo(y, x).getTexto();
                Console.print(texto);
                if(x < totalColunas - 1) 
                   Console.print(AMARELO +" │ "+ RESET);
            }
            Console.print( AMARELO + "   ⣿⣿   ");
            Console.print("\n   " + AMARELO + "⣿⣿  ");
            
            for (int x = 0; x < totalColunas - 1; x++) {
                
                Console.print(AMARELO +"━━━━━━━━━"+ RESET);
            }
            Console.print( AMARELO + "  ⣿⣿   ");
            Console.print("\n");
        }
        
         // Mensagem para pausar o jogo
        Console.println(AMARELO +"   ⣿⣿                               ⣿⣿"+ RESET);
        Console.println(AMARELO +"   ⣿⣿                               ⣿⣿"+ RESET);
        Console.println(AMARELO +"   ⣿⣿                               ⣿⣿"+ RESET);
        Console.println(AMARELO +"   ⣿⣿" + BRANCO +"     Aperte 'P' para pausar" + AMARELO +"    ⣿⣿"+ RESET);
        Console.println(AMARELO +"   ⣿⣿                               ⣿⣿"+ RESET);
        Console.println(AMARELO +"   ⣿⣿⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣿⣿"+ RESET);
        Console.println(AMARELO +"   ⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛" + RESET);
        // Verificar se a tecla de pausa foi pressionada
        
    }

    public static void telaDeDerrota() {
        
        while(true){
             Console.limpaTela();
            Console.println("\n");
            Console.println(AMARELO + "   ⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤"+ RESET);
            Console.println(AMARELO +"   ⣿⣿⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⣿⣿"+ RESET);
            Console.println(AMARELO +"   ⣿⣿                          ⣿⣿"+ RESET);
            Console.println(AMARELO +"   ⣿⣿                          ⣿⣿"+ RESET);
            Console.println(AMARELO +"   ⣿⣿" + BRANCO +  "     ⭐  VOCÊ PERDEU ⭐" + AMARELO + "     ⣿⣿"+ RESET);
            Console.println(AMARELO +"   ⣿⣿                          ⣿⣿"+ RESET);
            Console.println(AMARELO +"   ⣿⣿                          ⣿⣿"+ RESET);
            Console.println(AMARELO +"   ⣿⣿" + BRANCO +  "  1 - INICIAR NOVO JOGO" + AMARELO + "   ⣿⣿"+ RESET);
            Console.println(AMARELO +"   ⣿⣿                          ⣿⣿"+ RESET);
            Console.println(AMARELO +"   ⣿⣿" + BRANCO +  "  2 - VOLTAR PARA O MENU" + AMARELO + "  ⣿⣿"+ RESET);
            Console.println(AMARELO +"   ⣿⣿                          ⣿⣿"+ RESET);
            Console.println(AMARELO +"   ⣿⣿                          ⣿⣿"+ RESET);
            Console.println(AMARELO +"   ⣿⣿⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣿⣿"+ RESET);
            Console.println(AMARELO +"   ⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛"+ RESET);

                switch (Console.getTecla()) {
                    case NUM_1:
                    Console.println("Iniciando Novo Jogo..");
                    new Game2048().iniciarJogo(new Tabuleiro2048(4, 4, new Peca()));
                    Console.limpaTela();
                    break;
                    
                    case NUM_2:
                    Console.println("Saindo para o Menu Principal...");
                    MenuPrincipal.exibirMenu();
                    break;
                    
                }
            }
    }
    
    public static String imprimirNome(String nome, int length){

        int nomeLength = Math.min(nome.length(), length); 

        String nomePreenchido = nome + " ".repeat(length - nomeLength);
        
       return   nomePreenchido;

    }
}
