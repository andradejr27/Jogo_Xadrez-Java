package xadrez.pecas;

import tabuleiro.Tabuleiro;
import xadrez.Cor;
import xadrez.PecaXadrez;

public class Torre extends PecaXadrez {
    
    public Torre(Cor cor, Tabuleiro tabuleiro) {
        super(cor, tabuleiro);
    }

      
    @Override
    public String toString(){
        return "T";
    }
    
}
