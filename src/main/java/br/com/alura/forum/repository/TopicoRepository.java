package br.com.alura.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.alura.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long>{

	//padrão do spring
	List<Topico> findByCursoNome(String nomeCurso);
	
	//Conforme for definindo pela equipe a forma de consulta 
	@Query("SELECT t FROM Topico t where t.curso.nome = :nomeCurso")
	List<Topico> carregarPorNomeDoCurso(@Param("nomeCurso")String nomeCurso);
	
	

}
