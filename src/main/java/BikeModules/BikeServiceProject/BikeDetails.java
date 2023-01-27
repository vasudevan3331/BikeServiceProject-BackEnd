package BikeModules.BikeServiceProject;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BikeDetails
{
    private String cusName;
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cusID;
    private  String cusBikeno;
    private long cusContactno;
    private String cusEmail;
    @JsonFormat (pattern = "yyyy-mm-dd")
    private Date PurchaseofDate;
}
