package example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;


@Entity
@Table(name = "clients")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", columnDefinition = "serial")
    @Getter @Setter private Long id;

    @Column(name = "firstname")
    @Getter @Setter private String firstName;

    @Column(name = "lastname")
    @Getter @Setter private String lastName;

    @Column(name = "number")
    @Getter @Setter private Integer number;

    @Column(name = "mail")
    @Getter @Setter private String mail;
}
