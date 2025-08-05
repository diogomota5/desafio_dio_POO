package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Titulo: " + getTitulo() + '\n' +
                "Descrição: " + getDescricao() + '\n' +
                "Data: " + data;
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20.0;
    }
}
