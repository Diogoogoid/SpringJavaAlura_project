package br.com.livrariaastec.loja.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import br.com.livrariaastec.loja.controllers.HomeController;
import br.com.livrariaastec.loja.daos.ProdutoDAO;

@EnableWebMvc
@ComponentScan(basePackageClasses= {HomeController.class,ProdutoDAO.class})
public class AppWebConfiguration {

	@Bean
	public InternalResourceViewResolver InternalResourceViewResolver() {
		org.springframework.web.servlet.view.InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		
		return resolver;
	}
	
	
}
