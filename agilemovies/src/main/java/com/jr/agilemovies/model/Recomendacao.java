package com.jr.agilemovies.model;

public class Recomendacao {

    private final Filme filme;
    private final double pontuacao;
    private final String motivo;

    public Recomendacao(
            Filme filme,
            double pontuacao,
            String motivo
    ) {

        this.filme = filme;
        this.pontuacao = pontuacao;
        this.motivo = motivo;
    }

    public Filme getFilme() {
        return filme;
    }

    public double getPontuacao() {
        return pontuacao;
    }

    public String getMotivo() {
        return motivo;
    }
}
