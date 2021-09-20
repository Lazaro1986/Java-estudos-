package br.com.alfaloja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.alfaloja.model.Produto;
import br.com.alfaloja.repository.ProdutoDAO;

@Controller
public class ProdutoController {
	
	@Autowired
	private ProdutoDAO daopro;
	
	@RequestMapping(value="/listar", method=RequestMethod.GET)
	public String listarProdutos() {
		List<Produto> lstpro = daopro.findAll();
		return "list";
	}
	
	@RequestMapping(value="/inserir", method=RequestMethod.GET)
	public String inserirProduto() {
		return "form";
	}
	
}
