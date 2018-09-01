package agentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import agentapp.domain.TipSmestajaSoap;

@Repository
public interface TipSmestajaSoapRepository extends JpaRepository<TipSmestajaSoap, Long>{

}
