package br.com.livrariaastec.loja.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.livrariaastec.loja.daos.ProdutoDAO;
import br.com.livrariaastec.loja.models.Produto;
import br.com.livrariaastec.loja.models.TipoPreco;

@Controller
public class ProdutoController {

	@Autowired
	private ProdutoDAO produtoDao;
	
	@RequestMapping("/produto/registerProduto")
	public ModelAndView registerProduto() {
		
		System.out.println("entrando no formulario produto");
		
		ModelAndView modelAndView = new ModelAndView("produto/formProduto");
		modelAndView.addObject("tipos", TipoPreco.values());
		
		return modelAndView;
	}
	
	@RequestMapping("/produto")
	public String grava(Produto produto) {
		System.out.println("entrando no gravar produto");
		produtoDao.gravar(produto);
		return "produto/registerSucess";
	}
	
}
