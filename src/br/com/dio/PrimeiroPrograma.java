package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

    public static void main(String[] args) {
        Gato gato = new Gato();
        Gato gato2 = new Gato();

        Livro livro = new Livro("O Problema dos três copos:", 200);
        System.out.println(livro);
        System.out.println(gato);
        System.out.println(gato2);
    }
}

class Livro{
    private String Nome;
    private Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        Nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "Nome='" + Nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}
