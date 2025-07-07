package seven.generics;

import java.util.List;
import java.util.Optional;

public class Calculator {

    public Optional<Double> getSum(List<? extends Number> list){
        return list.stream().map(el -> ((Number) el).doubleValue()).reduce((s1,s2) -> s1 + s2);
    }
}
