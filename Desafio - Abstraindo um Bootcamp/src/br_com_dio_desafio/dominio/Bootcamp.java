package br_com_dio_desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
  private String nome;
  private String descricao;
  private final LocalDate dataInicial = LocalDate.now();
  private final LocalDate dataFinal = dataInicial.plusDays(45);
  private Set<Dev> devsInscritos = new HashSet<>();
  private Set<Conteudo> conteudos = new LinkedHashSet<>();

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public LocalDate getDataInicial() {
    return dataInicial;
  }

  public LocalDate getDataFinal() {
    return dataFinal;
  }

  public Set<Dev> getDevsInscritos() {
    return devsInscritos;
  }

  public void setDevsInscritos(Set<Dev> devsInscritos) {
    this.devsInscritos = devsInscritos;
  }

  public Set<Conteudo> getConteudos() {
    return conteudos;
  }

  public void setConteudos(Set<Conteudo> conteudos) {
    this.conteudos = conteudos;
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, descricao, dataInicial, dataFinal, devsInscritos, conteudos);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    if (getClass() != o.getClass())
      return false;
    Bootcamp other = (Bootcamp) o;
    if (nome == null) {
      if (other.nome != null)
        return false;
    } else if (!nome.equals(other.nome))
      return false;
    if (descricao == null) {
      if (other.descricao != null)
        return false;
    } else if (!descricao.equals(other.descricao))
      return false;
    if (dataInicial == null) {
      if (other.dataInicial != null)
        return false;
    } else if (!dataInicial.equals(other.dataInicial))
      return false;
    if (dataFinal == null) {
      if (other.dataFinal != null)
        return false;
    } else if (!dataFinal.equals(other.dataFinal))
      return false;
    if (devsInscritos == null) {
      if (other.devsInscritos != null)
        return false;
    } else if (!devsInscritos.equals(other.devsInscritos))
      return false;
    if (conteudos == null) {
      if (other.conteudos != null)
        return false;
    } else if (!conteudos.equals(other.conteudos))
      return false;
    return true;
  }

}
