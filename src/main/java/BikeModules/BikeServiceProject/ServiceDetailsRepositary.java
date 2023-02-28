package BikeModules.BikeServiceProject;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceDetailsRepositary extends JpaRepository<serviceDetails,Integer>
{
    public List<serviceDetails> findAllBybikeDetails1(BikeDetails bike);

    public List<serviceDetails> findAllBybikeServicetype(String type);



}
