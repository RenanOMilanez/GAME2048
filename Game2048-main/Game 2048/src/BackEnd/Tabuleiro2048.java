package BackEnd;

import FrontEnd.Tela;
import java.util.ArrayList;
import mecanicas.Tabuleiro;

public class Tabuleiro2048 extends Tabuleiro {

    public Tabuleiro2048(int numLinhas, int numColunas, Peca fundo) {
        super(numLinhas, numColunas, fundo);
        novaPeca();
        novaPeca();
    }

    public Tabuleiro2048() {
        super(4, 4, new Peca());
    }

    @Override
    public Peca getFundo(int x, int y) {
        return new Peca(super.getFundo(x, y).getFrente());
    }

    private void novaPeca() {
        ArrayList<int[]> vazios = espacosVazios();
        if (!vazios.isEmpty()) {
//            Console.println(vazios.size());
            int[] espacoAleatorio = vazios.get((int) (Math.random() * vazios.size()));
            setFundo(espacoAleatorio[0], espacoAleatorio[1], new Peca(2));
        }
    }

    private ArrayList<int[]> espacosVazios() {
        ArrayList<int[]> resultado = new ArrayList<>();

        for (int xDim = 0; xDim < getTotalColunas(); xDim++) {
            for (int yDim = 0; yDim < getTotalLinhas(); yDim++) {

                if (getFundo(xDim, yDim).getValor() == 0) {
                    resultado.add(new int[]{xDim, yDim});
                }
            }
        }
        return resultado;
    }

    public boolean verificarVitoria() {
        for (int x = 0; x < getTotalColunas(); x++) {
            for (int y = 0; y < getTotalLinhas(); y++) {
                if (getFundo(x, y).getValor() == 32) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void carregarTabuleiro(String stateString) {
        String[] state = stateString.split(";");
        Tabuleiro2048 novoTab = new Tabuleiro2048();
        int xDim = 0;
        int yDim = 0;
        for (String pecaString : state) {
            if (xDim < 4 && yDim < 4) {
                // Lendo as peças
                int pecaValor = Integer.parseInt(pecaString);
                novoTab.setValorPessa(yDim, xDim, pecaValor);
                xDim++;
            } else {
                // Lendo a pontucação
                novoTab.setPontos(Integer.parseInt(pecaString));
            }
            if (xDim > 3) {
                xDim = 0;
                yDim++;
            }
        }
        new Game2048().iniciarJogo(novoTab);
    }

    private void mover() {
        novaPeca();
        Save.criarSave(this, "AutoSave/AutoSave.VelKoz");
        if (verificarDerrota()) {
            Tela.telaDeDerrota();
        } else {
            Tela.mostrarTabuleiro(this);
        }

    }

    // mover pra esquerda
    public void moverEsquerda() {
        for (int y = 0; y < getTotalLinhas(); y++) {
            for (int x = 0; x < getTotalColunas(); x++) {
                Peca peca = getFundo(x, y);
                if (peca.getValor() != 0) {
                    for (int y2 = y - 1; y2 >= 0; y2--) {
                        Peca peca2 = getFundo(x, y2);
                        if (peca.getValor() == peca2.getValor()) {
                            this.pontos += peca.getValor() + peca2.getValor();
                            setValorPessa(x, y2, peca.getValor() + peca2.getValor());
                            setValorPessa(x, y, 0);
                        } else if (peca2.getValor() == 0) {
                            if (y2 == 0
                                    || (getFundo(x, y2 - 1).getValor() != 0
                                    && getFundo(x, y2 - 1).getValor() != peca.getValor())) {

                                setValorPessa(x, y2, peca.getValor());
                                setValorPessa(x, y, 0);
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
        }
        mover();
    }

    //mover pra cima
    public void moverAcima() {
        for (int x = 0; x < getTotalColunas(); x++) {
            for (int y = 0; y < getTotalLinhas(); y++) {
                Peca pessa = getFundo(x, y);
                if (pessa.getValor() != 0) {
                    for (int x2 = x - 1; x2 >= 0; x2--) {
                        Peca pessa2 = getFundo(x2, y);
                        if (pessa.getValor() == pessa2.getValor()) {
                            this.pontos += pessa.getValor() + pessa2.getValor();
                            setValorPessa(x2, y, pessa.getValor() + pessa2.getValor());
                            setValorPessa(x, y, 0);
                        } else if (pessa2.getValor() == 0) {
                            if (x2 == 0
                                    || (getFundo(x2 - 1, y).getValor() != 0
                                    && getFundo(x2 - 1, y).getValor() != pessa.getValor())) {

                                setValorPessa(x2, y, pessa.getValor());
                                setValorPessa(x, y, 0);
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
        }
        mover();
    }
    // mover pra direita

    public void moverDireita() {
        for (int y = getTotalLinhas() - 1; y >= 0; y--) {
            for (int x = 0; x < getTotalColunas(); x++) {
                Peca peca = getFundo(x, y);
                if (peca.getValor() != 0) {
                    for (int y2 = y + 1; y2 < getTotalLinhas(); y2++) {
                        Peca peca2 = getFundo(x, y2);
                        if (peca.getValor() == peca2.getValor()) {
                            this.pontos += peca.getValor() + peca2.getValor();
                            setValorPessa(x, y2, peca.getValor() + peca2.getValor());
                            setValorPessa(x, y, 0);
                        } else if (peca2.getValor() == 0) {
                            if (y2 == getTotalLinhas() - 1
                                    || (getFundo(x, y2 + 1).getValor() != 0
                                    && getFundo(x, y2 + 1).getValor() != peca.getValor())) {

                                setValorPessa(x, y2, peca.getValor());
                                setValorPessa(x, y, 0);
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
        }
        mover();
    }
    //mover pra baixo

    public void moverAbaixo() {
        for (int x = getTotalColunas() - 1; x >= 0; x--) {
            for (int y = 0; y < getTotalLinhas(); y++) {
                Peca pessa = getFundo(x, y);
                if (pessa.getValor() != 0) {
                    for (int x2 = x + 1; x2 < getTotalColunas(); x2++) {
                        Peca pessa2 = getFundo(x2, y);
                        if (pessa.getValor() == pessa2.getValor()) {
                            this.pontos += pessa.getValor() + pessa2.getValor();

                            setValorPessa(x2, y, pessa.getValor() + pessa2.getValor());
                            setValorPessa(x, y, 0);
                        } else if (pessa2.getValor() == 0) {
                            if (x2 == getTotalColunas() - 1
                                    || (getFundo(x2 + 1, y).getValor() != 0
                                    && getFundo(x2 + 1, y).getValor() != pessa.getValor())) {

                                setValorPessa(x2, y, pessa.getValor());
                                setValorPessa(x, y, 0);
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
        }
        mover();
    }

    public Peca setValorPessa(int x, int y, int v) {
        Peca novaPeca = new Peca(v);
        setFundo(x, y, new Peca(v));
        return novaPeca;

    }

    private int pontos = 0;

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public boolean verificarDerrota() {
        if (espacosVazios().isEmpty()) {
            int rows = getTotalLinhas();
            int cols = getTotalColunas();

            // Check all elements in the array
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    // Check above
                    if (!((i > 0 && getFundo(i, j) == getFundo(i - 1, j))
                            || (i < rows - 1 && getFundo(i, j) == getFundo(i + 1, j))
                            || (j > 0 && getFundo(i, j) == getFundo(i, j - 1))
                            || (j < cols - 1 && getFundo(i, j) == getFundo(i, j + 1)))) {
                        return true;
                    }
                }
            }

        }
        return false;
    }
}
