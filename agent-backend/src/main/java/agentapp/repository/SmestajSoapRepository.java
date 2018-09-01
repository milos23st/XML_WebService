package agentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import agentapp.domain.SmestajSoap;

@Repository
public interface SmestajSoapRepository extends JpaRepository<SmestajSoap, Long>{

}
