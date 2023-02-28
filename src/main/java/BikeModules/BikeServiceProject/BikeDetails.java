package BikeModules.BikeServiceProject;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.micrometer.common.lang.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;
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
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @Nullable
    @JsonBackReference
    @JoinTable(name = "AllRecords",joinColumns = @JoinColumn(name = "CustomerId"),inverseJoinColumns = @JoinColumn(name = "ServiceId"))
    private Collection<serviceDetails> myservicedetail=new ArrayList<>();

}
