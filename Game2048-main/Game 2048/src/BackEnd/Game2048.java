package BackEnd;

import FrontEnd.Controles;
import FrontEnd.MenuPrincipal;
import FrontEnd.Tela;
import FrontEnd.TeladePause;

public class Game2048 {

    public static void main(String[] args) {
        MenuPrincipal.exibirMenu();
    }
    private boolean isPaused;

    public void iniciarJogo(Tabuleiro2048 tab) {
        Tela.mostrarTabuleiro(tab);
        // Passa a referência do jogo para os controles
        while (true) {
            if (isPaused) {
                TeladePause.exibirMenuPausa(this, tab);
            } else {
                Controles.checarMovimentos(tab, this);
            }
        }
    }

    public void setisPaused(boolean valor) {
        isPaused = valor;
    }
}
