package agentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import agentapp.domain.ZauzetostSoap;

@Repository
public interface ZauzetostSoapRepository extends JpaRepository<ZauzetostSoap, Long>{

}
