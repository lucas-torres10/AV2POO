package br.com.mariojp.game;

public interface EntidadeFactory {
    Nave criarNave(int x, int y, int largura);
    Inimigo criarInimigo(int x, int y);
}
