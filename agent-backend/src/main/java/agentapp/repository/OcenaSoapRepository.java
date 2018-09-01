package agentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import agentapp.domain.OcenaSoap;

@Repository
public interface OcenaSoapRepository extends JpaRepository<OcenaSoap, Long> {

}
