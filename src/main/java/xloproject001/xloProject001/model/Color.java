package xloproject001.xloProject001.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "colors")
@NoArgsConstructor
public class Color {

    @Id
    private String black;
    private String white;
    private String blue;
    private String green;

    public Color(String black, String white, String blue, String green) {
        this.black = black;
        this.white = white;
        this.blue = blue;
        this.green = green;
    }

}
