package br.com.alfaloja.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Produtos")
public class Produto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idproduto;
	private String nome;
	private String codigo;
	private String descricao;
	private String destaque;
	private Float valor;
	/*
	 * como os atributos estão com o mesmo nome das colunas na
	 * tabela no banco de dados, não será necessário a annotation,
	 * caso estivessem com o nome diferente deveria ser adicionado
	 * uma annotation informando o nome da coluna referente 
	 * */
	public Long getIdproduto() {
		return idproduto;
	}
	public void setIdproduto(Long idproduto) {
		this.idproduto = idproduto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDestaque() {
		return destaque;
	}
	public void setDestaque(String destaque) {
		this.destaque = destaque;
	}
	public Float getValor() {
		return valor;
	}
	public void setValor(Float valor) {
		this.valor = valor;
	}
	@Override
	public int hashCode() {
		return Objects.hash(idproduto);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(idproduto, other.idproduto);
	}
	
	
	
}
