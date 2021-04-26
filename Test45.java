import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test45 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(12, 32, 453,33,23, 222222);
        System.out.println(integers.stream().sorted(
        ).collect(Collectors.toList()));
    }
}
