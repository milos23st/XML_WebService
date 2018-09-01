package agentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import agentapp.domain.PorukaSoap;

@Repository
public interface PorukaSoapRepository extends JpaRepository<PorukaSoap, Long>{

}
