package br.com.alfaloja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.alfaloja.model.Produto;

@Repository
public interface ProdutoDAO extends JpaRepository<Produto, Long> {
	
}
