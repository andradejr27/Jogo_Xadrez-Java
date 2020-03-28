package xadrez.pecas;

import tabuleiro.Tabuleiro;
import xadrez.Cor;
import xadrez.PecaXadrez;

public class Rei extends PecaXadrez{
    
    public Rei(Cor cor, Tabuleiro tabuleiro) {
        super(cor, tabuleiro);
    }
    
    @Override
    public String toString(){
        return "R";
    }
    
}
