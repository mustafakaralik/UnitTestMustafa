import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
//@Getter
//@Setter  --->istead of these three just use @Data
//@ToString
@Data

public class Car {
    private int year;
    private int door;
    private String model;
    private String  make;
    private long vinNumber;



}
