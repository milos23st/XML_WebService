package agentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import agentapp.domain.RezervacijaSoap;

@Repository
public interface RezervacijaSoapRepository extends JpaRepository<RezervacijaSoap, Long>{

}
