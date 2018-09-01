package agentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import agentapp.domain.KategorijaSoap;

@Repository
public interface KategorijaSoapRepository extends JpaRepository<KategorijaSoap, Long>  {

}
