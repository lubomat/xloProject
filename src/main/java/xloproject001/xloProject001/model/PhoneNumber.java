package xloproject001.xloProject001.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "phone_number")
public class PhoneNumber {

    @Id
    private int number1;
    private int number2;

    @ManyToOne
    @JoinColumn(name = "phone_number")
    private PhoneNumber number;




}
