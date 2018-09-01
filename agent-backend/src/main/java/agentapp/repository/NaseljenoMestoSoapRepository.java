package agentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import agentapp.domain.NaseljenoMestoSoap;

@Repository
public interface NaseljenoMestoSoapRepository extends JpaRepository<NaseljenoMestoSoap, Long>{

}
