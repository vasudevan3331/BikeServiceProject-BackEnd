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

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class serviceDetails {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private  int bikeJobcardno;
    private String[]bikeIssues;
    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date bikeDateService;
    private String bikeKilometer;
    private String bikeStatus;
    private String bikeServiceType;
    private int estmatedCharge;
    private int newProductCost;
    private int bikelabourCost;
    private int bikeFinalpay;

}
