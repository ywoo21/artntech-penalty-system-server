package artntech.system.penalty.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "advantage")
public class Advantage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private int appliedScore;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime createdTime;
}
