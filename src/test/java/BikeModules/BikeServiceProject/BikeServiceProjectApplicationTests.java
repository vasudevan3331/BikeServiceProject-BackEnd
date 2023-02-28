package BikeModules.BikeServiceProject;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;
import java.util.Collection;
import java.util.Date;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootTest
@RunWith(SpringRunner.class)
class BikeServiceProjectApplicationTests {
	@Autowired
	BikeDetailService service;
	@MockBean
	BikeDetailsRepositary repo;

	@Test
	public void testing()
	{
		Date d=new Date(2000,12,01);
		Date d1=new Date(2001,03,12);
		BikeDetails bike =new BikeDetails("vasudevan",1,"tn30by2221",98765432L,"vasudevan3331@gmail.com",d,null);
		BikeDetails bike1=new BikeDetails("arun",2,"tn12rt3452",234567890L,"arunraja123@gmail.com",d1,null);
		BikeDetails bike2=new BikeDetails("siva",3,"tn32yu9874",945134653L,"sivaload123@gmail.com0",d1,null);


		Mockito.when(repo.findAll()).thenReturn(Stream.of(bike,bike2,bike1).collect(Collectors.toList()));

		Assert.assertNotEquals(d,service.listall().get(2).getPurchaseofDate());


	}
}
