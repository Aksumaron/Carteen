package carteen.dataClesses;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.HashMap;

@NoArgsConstructor
@Data
public class Product
{
    private String name;
    private int weight;
    private int calorificValue;
    private HashMap<String, Integer> traceElements;
    private String pathToImage;
    private Integer price = 40;
}
