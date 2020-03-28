package xadrez;

import tabuleiro.Posicao;
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
    
    private void posicaoInicial(){
        tabuleiro.colocaPeca(new Torre(Cor.WHITE, tabuleiro), new Posicao(0,0));
        tabuleiro.colocaPeca(new Rei(Cor.BLACK, tabuleiro), new Posicao(0,3));
        tabuleiro.colocaPeca(new Torre(Cor.BLACK, tabuleiro), new Posicao(7,0));
        tabuleiro.colocaPeca(new Rei(Cor.WHITE, tabuleiro), new Posicao(7,3));
    }
    
}
