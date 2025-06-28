 package BackEnd;

import mecanicas.Carta;
import cores.StringColorida;

public class Peca extends Carta {
    
    public Peca() {
        super(new StringColorida("0", getCor(0), getCorFundo(0)));
    }
     
    public Peca(StringColorida frente) {
        super(frente);
    }
    
    public Peca(int v) {
        super(new StringColorida(String.valueOf(v), getCor(v)));
    }
    
    public int getValor() {
        return Integer.parseInt(getFrente().getString());
    }
    
    private static String getCor(int v) {
        String resultado = "PRETO";
        switch(v) {
            case 0 -> resultado = "BRANCO";
            case 2 -> resultado = "PRETO";
            case 4 -> resultado = "BRANCO";
            case 8 -> resultado = "PRETO";
            case 16 -> resultado = "PRETO";
            case 32 -> resultado = "BRANCO";
            case 64 -> resultado = "PRETO";
            case 128 -> resultado = "BRANCO";
            case 256 -> resultado = "PRETO";
            case 512 -> resultado = "PRETO";
            case 1024 -> resultado = "BRANCO";
            case 2048 -> resultado = "PRETO";
            case 4096 -> resultado = "BRANCO";
        }
        return resultado;
    }

     private static String getCorFundo(int vLen) {
        String resultado = "FUNDO_BRANCO";
        switch(vLen) {
            case 2 -> resultado = "AMARELO"; 
            case 4 -> resultado = "VERMELHO";
            case 8 -> resultado = "VERDE";
            case 16 -> resultado = "FUNDO_CIANO";
            case 32 -> resultado = "FUNDO_ROXO";
            case 64 -> resultado = "AMARELO";
            case 128 -> resultado = "VERMELHO";
            case 256 -> resultado = "VERDE";
            case 512 -> resultado = "FUNDO_CIANO";
            case 1024 -> resultado = "FUNDO_ROXO";
            case 2048 -> resultado = "AMARELO";
            case 4096 -> resultado = "AMARELO";
            case 8192 -> resultado = "VERMELHO";
        }
        return resultado;
    }
       
       public StringColorida getTexto() {
        int v = getValor();

        return new StringColorida(String.format("%4d", v), getCor(v), getCorFundo(v));
    }
}
