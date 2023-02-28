package BikeModules.BikeServiceProject;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class serviceDetails {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int bikeJobcardno;
    private String[]bikeIssues;
    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date bikeDateofservice;
    private String bikeKilometer;
    private String bikeStatus;
    private String bikeServicetype;
    private int bikeEstmatedcharge;
    private int bikeNewproductcost;
    private int bikeLabourcost;
    private int bikeFinalpay;
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "BikeCustomerID")
    @Nullable
    private BikeDetails bikeDetails1;

}
