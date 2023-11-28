package br.com.mariojp.game;

public class NaveFactory implements EntidadeFactory {
    @Override
    public Nave criarNave(int x, int y, int largura) {
        return new Nave(x, y, largura);
    }

    @Override
    public Inimigo criarInimigo(int x, int y) {
        throw new UnsupportedOperationException("NaveFactory não cria inimigos.");
    }
}

