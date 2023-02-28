package BikeModules.BikeServiceProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class serviceDetailsService {
    @Autowired
    ServiceDetailsRepositary Srepo;

    public serviceDetails newservice(serviceDetails service) {
        return Srepo.save(service);

    }

    public List<serviceDetails> GetAllServiceDetails(BikeDetails bike) {
        return Srepo.findAllBybikeDetails1(bike);
    }

    public List<serviceDetails> getAllbikeServiceDetail(String type) {
        return Srepo.findAllBybikeServicetype(type);
    }

    public serviceDetails gettingone(int Jobcardno) {
        return Srepo.findById(Jobcardno).orElse(new serviceDetails());
    }
}
