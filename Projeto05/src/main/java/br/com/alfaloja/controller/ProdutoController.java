package br.com.alfaloja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.alfaloja.model.Produto;
import br.com.alfaloja.repository.ProdutoDAO;

@Controller
public class ProdutoController {
	
	@Autowired
	private ProdutoDAO daopro;
	
	@RequestMapping(value="/listar", method=RequestMethod.GET)
	public ModelAndView listarProdutos() {
		List<Produto> lstpro = daopro.findAll();
		ModelAndView mv = new ModelAndView("list");
		return mv;
	}
	
	@RequestMapping(value="/inserir", method=RequestMethod.GET)
	public String inserirProduto() {
		return "form";
	}
	
	@RequestMapping(value="/inserir", method=RequestMethod.POST)
	public ModelAndView gravarProduto(Produto objpro) {
		daopro.save(objpro);
		ModelAndView mv = new ModelAndView("form");
		mv.addObject("msg", "Great! Cadastrado com sucesso");
		return mv;
	}
	
}
