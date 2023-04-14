package prokos.crowd.domain;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Konstantin Matushenko
 */
@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue
    private Long id;
    private String lastName;
    private String firstName;
    private String patronymic;
}
