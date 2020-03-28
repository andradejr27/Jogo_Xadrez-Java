package xadrez;

import tabuleiro.Posicao;

public class PosicaoXadrez {
    
    private char coluna;
    private int linha;

    public PosicaoXadrez(char coluna, int linha) {
        if(coluna < 'a' || coluna > 'h' || linha < 1 || linha > 8){
            throw new ExcecaoXadrez("Erro instanciando a posição do xadrez. Valores válidos de 1 até 8 e de a até h");
        }
        this.coluna = coluna;
        this.linha = linha;
    }

    public char getColuna() {
        return coluna;
    }

    public int getLinha() {
        return linha;
    }

    protected Posicao toPosicao(){
        return new Posicao(8 - linha, coluna - 'a');
    }   
    
    protected static PosicaoXadrez daPosicao(Posicao posicao){
        return new PosicaoXadrez((char)('a' - posicao.getColuna()), 8 - posicao.getLinha());
    }
    
    @Override
    public String toString(){
        return "" + coluna + linha;
    }
}
