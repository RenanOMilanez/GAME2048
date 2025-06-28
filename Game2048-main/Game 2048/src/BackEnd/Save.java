package BackEnd;

import console.Console;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Save {

    public static void escreverArquivo(String path, String texto) {
        try {
            FileWriter arquivo = new FileWriter(path);
            arquivo.write(texto);
            arquivo.close();
        } catch (IOException e) {
            Console.println("Erro ao Salvar o Jogo.");
        }
    }

    public static void criarSave(Tabuleiro2048 tab, String path) {
        String resultado = "";
        for (int xDim = 0; xDim < tab.getTotalColunas(); xDim++) {
            for (int yDim = 0; yDim < tab.getTotalLinhas(); yDim++) {
                resultado += tab.getFundo(xDim, yDim).getFrente().getString();
                if (!(xDim == (tab.getTotalColunas() - 1) && yDim == (tab.getTotalLinhas() - 1))) {
                    resultado += ";";
                }
            }
        }
        resultado += ";" + tab.getPontos();
        Save.escreverArquivo(getSavesPath() + path, resultado);
    }

    public static String getSavesPath() {
        String[] locations = new Game2048().getClass().getProtectionDomain().getCodeSource().getLocation().toString().replaceAll("%20", " ").split("/");
        String savesPath = "";
        for (int i = 1; i < locations.length - 2; i++) {
            savesPath += locations[i] + "/";
        }
        return savesPath + "saves/";
    }

    public static String pedirSave() {
        Scanner scanner = new Scanner(System.in);
        Console.println("Digite o nome do save");
        return scanner.next();
    }

}
