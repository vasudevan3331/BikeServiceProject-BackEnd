package BikeModules.BikeServiceProject;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BikeDetailsRepositary extends JpaRepository<BikeDetails,Integer>
{

}
