package xloproject001.xloProject001.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Entity
@Setter
@Getter
@Table(name = "colors")
@NoArgsConstructor
public class Color {

    @Id
    String color[] = {"Red", "Green", "Blue", "Yellow"};


}

