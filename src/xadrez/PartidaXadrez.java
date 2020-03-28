package xadrez;

import tabuleiro.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaXadrez {
    
    private Tabuleiro tabuleiro;

    public PartidaXadrez() {
        this.tabuleiro = new Tabuleiro(8,8);
        posicaoInicial();
    }
    
    public PecaXadrez[][] getPecas(){
        PecaXadrez[][] mat = new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        
        for (int i = 0; i < tabuleiro.getLinhas(); i++){
            for(int j = 0; j < tabuleiro.getColunas(); j++){
                mat[i][j] = (PecaXadrez) tabuleiro.peca(i, j);
            }
        }
        
        return mat;
    }
    
    private void colocaNovaPeca(char coluna, int linha, PecaXadrez peca){
        tabuleiro.colocaPeca(peca, new PosicaoXadrez(coluna, linha).toPosicao());
    }
    
    private void posicaoInicial(){
        
        colocaNovaPeca('c', 1, new Torre(Cor.WHITE, tabuleiro));
        colocaNovaPeca('c', 2, new Torre(Cor.WHITE, tabuleiro));
        colocaNovaPeca('d', 2, new Torre(Cor.WHITE, tabuleiro));
        colocaNovaPeca('e', 2, new Torre(Cor.WHITE, tabuleiro));
        colocaNovaPeca('e', 1, new Torre(Cor.WHITE, tabuleiro));
        colocaNovaPeca('d', 1, new Rei(Cor.WHITE, tabuleiro));

        colocaNovaPeca('c', 7, new Torre(Cor.BLACK, tabuleiro));
        colocaNovaPeca('c', 8, new Torre(Cor.BLACK, tabuleiro));
        colocaNovaPeca('d', 7, new Torre(Cor.BLACK, tabuleiro));
        colocaNovaPeca('e', 7, new Torre(Cor.BLACK, tabuleiro));
        colocaNovaPeca('e', 8, new Torre(Cor.BLACK, tabuleiro));
        colocaNovaPeca('d', 8, new Rei(Cor.BLACK, tabuleiro));
    }
    
}
