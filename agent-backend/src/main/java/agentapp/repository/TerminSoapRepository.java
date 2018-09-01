package agentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import agentapp.domain.TerminSoap;

@Repository
public interface TerminSoapRepository extends JpaRepository<TerminSoap, Long>{

}
