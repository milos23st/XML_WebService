package agentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import agentapp.domain.KomentarSoap;

@Repository
public interface KomentarSoapRepository extends JpaRepository<KomentarSoap, Long>{

}
