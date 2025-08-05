package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
   private int cargaHoraria;

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Titulo: " + getTitulo() + '\n' +
               "Descrição: " + getDescricao() + '\n' +
               "Carga Horária: " + cargaHoraria;
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }
}
