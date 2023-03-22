package br.com.cidade.infraestrutura.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.cidade.infraestrutura.model.Solicitacao;

@Controller
public class SolicitacaoController {

	private ModelAndView andView;
	
	@RequestMapping(method = RequestMethod.GET, value = "/cadastroSolicitacao")
	public ModelAndView inicio() {
		andView = new ModelAndView("infraestrutura/cadastro/cadastrarSolicitacao");
		andView.addObject("solicitacaoObj", new Solicitacao());
		return andView;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "**/salvarSolicitacao")
	public ModelAndView salvar(Solicitacao solicitacao) {
		andView = new ModelAndView("adicionado/solicitacaoAdicionado");
		//solicitacaoRepository.save(solicitacao);
		andView.addObject("solicitacaoObj", new Solicitacao());
		return andView;

	}
}
