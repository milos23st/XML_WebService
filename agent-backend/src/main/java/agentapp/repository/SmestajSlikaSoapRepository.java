package agentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import agentapp.domain.SmestajSlikaSoap;

@Repository
public interface SmestajSlikaSoapRepository extends JpaRepository<SmestajSlikaSoap, Long>{

}
