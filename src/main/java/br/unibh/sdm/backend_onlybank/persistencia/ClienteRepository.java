package br.unibh.sdm.backend_onlybank.persistencia;
import java.util.List;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import br.unibh.sdm.backend_onlybank.entidades.Cliente;

/**
 * Esta classe estende o padrão CrudRepository 
 *
 */
@EnableScan()
public interface ClienteRepository extends CrudRepository<Cliente, String> {
	
	List<Cliente> findByNome(String codigo);
	
}
