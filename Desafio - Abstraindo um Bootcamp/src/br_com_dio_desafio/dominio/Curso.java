package br_com_dio_desafio.dominio;

public class Curso extends Conteudo {

  int cargaHoraria;

  @Override
  public double calcularXp() {
    return XP_PADRAO * cargaHoraria;
  }

  public Curso() {

  }

  public int getCargaHoraria() {
    return cargaHoraria;
  }

  public void setCargaHoraria(int cargaHoraria) {
    this.cargaHoraria = cargaHoraria;
  }

  @Override
  public String toString() {
    return "Curso{" +
        "Titulo: " + getTitulo() + " | " +
        "descricao: " + getDescricao() + " | " +
        "cargaHoraria: " + cargaHoraria +
        "}";
  }

}
