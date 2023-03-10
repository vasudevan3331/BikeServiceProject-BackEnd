package BikeModules.BikeServiceProject;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BikeDetailService {
    @Autowired
    BikeDetailsRepositary repo;
    public BikeDetails create(BikeDetails bike){

        return repo.save(bike);
    }
    public String erasing(int ID)//for delete
    {
      BikeDetails temp=repo.findById(ID).orElse(new BikeDetails());
      repo.delete(temp);
      return temp.getCusName() + " has been deleted";
    }
    public List<BikeDetails> listall()
    {
        return (List<BikeDetails>) repo.findAll();
    }
    public BikeDetails getone( int cusID)
    {
        return repo.findById(cusID).orElse(new BikeDetails());
    }
}










































































































































































































































































































































































