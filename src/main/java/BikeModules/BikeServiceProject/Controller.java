package BikeModules.BikeServiceProject;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    BikeDetailService service;

    @PostMapping("/newbikedetails")
    public String makecreate(@RequestBody BikeDetails Bikes){
        return  service.create(Bikes).getCusName()+"has added in the database ";
    }
    @PutMapping("/update")
    public String update(@RequestBody BikeDetails Bikes){
        BikeDetails temp=service.create(Bikes);
        return temp.getCusName()+   " has been updated";
    }
    @DeleteMapping("/Delete/{key}")
    public String delete(@PathVariable("key")int key) {
        return service.erasing(key);
    }
    @GetMapping("/example")
    public void example(){
        System.out.println("well come to back end ");
    }
    @GetMapping("/")
    public List<BikeDetails>ListALL()
    {
        return service.listall();

    }
    @GetMapping("/Listone/{id}")
    public BikeDetails listone(@PathVariable("id")int id)
    {
        return  service.get(id);
    }
}
