package bjj;

import java.util.Arrays;
import java.util.List;

public class Lutador implements ILutador {
    private String inscricao;
    private String nome;
    private String faixa;
    private float peso;
    private String categoria;

    public Lutador(String inscricao) {
        this.inscricao = inscricao;
        Lutador objeto = BD.getLutador(inscricao);
        this.nome = objeto.nome;
        this.faixa = objeto.faixa;
        this.peso = objeto.peso;
        this.categoria = objeto.categoria;

    }

    public Lutador( String inscricao, String nome, String faixa, float peso, String categoria) {
        this.inscricao = inscricao;
        this.nome = nome;
        this.faixa = faixa;
        this.peso = peso;
        this.categoria = categoria;
    }

    public String getInscricao(){
        return inscricao;
    }

    @Override
    public List<String> acessarDadosLutador(){
        return Arrays.asList(this.nome, this.faixa, this.categoria);
    }
    @Override
    public List<Float> acessarPeso(Organizacao organizacao){
        return Arrays.asList(this.peso);
    }




}
