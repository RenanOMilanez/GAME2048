
package FrontEnd;

import BackEnd.Game2048;
import BackEnd.Load;
import static BackEnd.Load.listaArquivo;
import BackEnd.Peca;
import BackEnd.Save;
import BackEnd.Tabuleiro2048;
import static FrontEnd.MenuPrincipal.*;
import console.Console;
import static console.Tecla.*;
import java.io.File;


public class TelaLoading {
    
    public static void loadingJogos() {
        while (true) {
            Console.limpaTela();
            Console.println("\n");
            Console.println(AMARELO + "   ⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤" + RESET);
            Console.println(AMARELO + "   ⣿⣿⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿                                       ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿                                       ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿" + BRANCO + "        ⭐  JOGOS SALVOS  ⭐" + AMARELO +  "           ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿                                       ⣿⣿" + RESET);
            File[] listaloading = listaArquivo (Save.getSavesPath() + "/ManualSave");
            
            for(int i = 0; i < listaloading.length; i++) {
                Console.println(AMARELO + "   ⣿⣿  " + BRANCO + listaloading[i].getName()  + RESET);
            }
            
            Console.println(AMARELO + "   ⣿⣿                                       ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿                                       ⣿⣿" + RESET);
            Console.println(AMARELO + "   ⣿⣿⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣿⣿" + RESET);
            Console.println(AMARELO + "   ⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛" + RESET);
            
            String load = Save.pedirSave();
            boolean arqExiste = Load.arquivoExiste(listaloading, load);
            if(!load.isEmpty() && arqExiste){
                Load.carregarJogo("ManualSave/" + load); 
            }
        }
    }
}
