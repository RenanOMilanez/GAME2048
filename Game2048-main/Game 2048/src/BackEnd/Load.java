
package BackEnd;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Load {
    
      public static void carregarJogo(String path)  { 
          
        String jogoSalvo = lerArquivo(Save.getSavesPath() + path);
        Tabuleiro2048.carregarTabuleiro(jogoSalvo);
    }
      
    public static String lerArquivo(String path)  {
        String data = "";
        try {
            File arquivo = new File(path);
            Scanner scanner = new Scanner(arquivo);
            while (scanner.hasNextLine()) {
                data = scanner.nextLine();
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
        return data;
    }
    
     public static File[] listaArquivo(String path){
        File file = new File(path);
        return file.listFiles();
    }
    
    public static boolean arquivoExiste(File[] arquivos, String nomeArquivo) {
        for (File arquivo : arquivos) {
            if (arquivo.getName().equals(nomeArquivo)) {
                return true;
            }
        }
        return false;
    }
}
