package by.tms.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "payments")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class AutoPayment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
//    private Operation operation;

}
