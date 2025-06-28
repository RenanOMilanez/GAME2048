package FrontEnd;

import BackEnd.Tabuleiro2048;
import console.Console;
import console.Tecla;
import BackEnd.Game2048;

public class Controles {
    
    
    public static void checarMovimentos(Tabuleiro2048 tab, Game2048 game) {
        Tecla tecla = Console.getTecla();
        
        switch(tecla){
            //MOVIMENTOS PRA CIMA
            case Tecla.UP:
            case Tecla.W: 
                tab.moverAcima();
                break;
            //MOVIMENTOS PRA BAIXO
            case Tecla.DOWN:
            case Tecla.S:
                tab.moverAbaixo();
                break;
            //MOVIMENTOS PRA ESQUERDA
            case Tecla.LEFT:
            case Tecla.A: 
                tab.moverEsquerda();
                break;
            //MOVIMENTOS PRA DIREITA
            case Tecla.RIGHT:
            case Tecla.D: 
                tab.moverDireita();
                break;
            case Tecla.ESC: 
                Console.saiDoPrograma();
                break;
            case Tecla.P: 
                game.setisPaused(true);
                break;
        }
    } 
}
