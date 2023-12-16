package Route.Traffic.com;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Timer;

@Data
@Entity
@Table(name = "Traffic")
public class Traffic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    int Id;
    @Column
    String streetName;
    @Column
    String CountryName;
    @Column
    float TrafficPercentage;
    @Column
    String cityName;
}
