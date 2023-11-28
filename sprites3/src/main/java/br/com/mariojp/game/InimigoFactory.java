package br.com.mariojp.game;

public class InimigoFactory implements EntidadeFactory {
    @Override
    public Nave criarNave(int x, int y, int largura) {
        throw new UnsupportedOperationException("InimigoFactory não cria naves.");
    }

    @Override
    public Inimigo criarInimigo(int x, int y) {
        return new Inimigo(x, y);
    }
}
