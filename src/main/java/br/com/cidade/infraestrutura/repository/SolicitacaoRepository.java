package br.com.cidade.infraestrutura.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.cidade.infraestrutura.model.Solicitacao;

@Repository
@Transactional
public interface SolicitacaoRepository extends JpaRepository<Solicitacao, Long> {

}
