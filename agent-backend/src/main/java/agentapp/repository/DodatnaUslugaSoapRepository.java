package agentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import agentapp.domain.DodatnaUslugaSoap;

@Repository
public interface DodatnaUslugaSoapRepository extends JpaRepository<DodatnaUslugaSoap, Long>{

}
