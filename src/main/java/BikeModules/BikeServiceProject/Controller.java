package BikeModules.BikeServiceProject;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired //object create panna use aaguthu
    serviceDetailsService Sservice;
@Autowired
    BikeDetailService service;
@PostMapping("/newbikedetails") //create pannrathu use aaguthu
    public String makecreate(@RequestBody BikeDetails Bikes){
        return  service.create(Bikes).getCusName()+"  has added in the database ";
    }
    @PutMapping("/update")
    public String update(@RequestBody BikeDetails Bikes){
        BikeDetails temp=service.create(Bikes);

        return temp.getCusName()+   "   has been updated";
    }
    @DeleteMapping("/Delete/{key}")
    public String delete(@PathVariable("key")int key)
    {
        return service.erasing(key);
    }
    @GetMapping("/example")
    public void example()
    {
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
        return  service.getone(id);
    }

    @GetMapping("/onelist/{id}")
    public serviceDetails listoneservice(@PathVariable ("id") int id)
    {
        return Sservice.gettingone(id);
    }

@PostMapping("/createservice")
public serviceDetails servicecreate(@RequestBody serviceDetails serv)//pathu varabile set pannrathu use haguthu
{
    BikeDetails temp=service.getone(serv.getBikeDetails1().getCusID());
    if(serv.getBikeServicetype()=="free")
    {
     int total=serv.getBikeNewproductcost()+(serv.getBikeNewproductcost()*18/100);
    serv.setBikeFinalpay(total);
    }
    else {
    int total=serv.getBikeLabourcost()+serv.getBikeNewproductcost();
    total+=total*18/100;
    serv.setBikeFinalpay(total);
    }
    temp.getMyservicedetail().add(serv);
    serv.setBikeDetails1(temp);
    Sservice.newservice(serv);
    return serv;
   }
    @GetMapping("/getAll/{cusid}")
    public List<serviceDetails> ListAllServicedetails(@PathVariable ("cusid")int cusid)//@pathvaraiable =requstbody +value va sathu konduvarthu ku use aaguthu
    {
        BikeDetails temp=service.getone(cusid);
        return Sservice.GetAllServiceDetails(temp);
    }
    @GetMapping("/getType/{type}")//list panni paakurathuku use hakuthu
    public List<serviceDetails> ListBasedOnType(@PathVariable("type") String type)
    {
        return Sservice.getAllbikeServiceDetail(type);
    }
}