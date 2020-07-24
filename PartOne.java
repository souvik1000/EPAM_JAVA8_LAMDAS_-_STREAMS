import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.NoSuchElementException;
public class PartOne {
    public static void main(String args[]) {
        IntStream stream=IntStream.of();
        IntStream stream_one=IntStream.of(1,2,3,4,5,6,7,8,9);
        OptionalDouble obj=stream.average();
        OptionalDouble obj_one=stream_one.average();
        try {
            System.out.println(obj.getAsDouble());
        }
        catch (NoSuchElementException e) {
            System.out.println(-1);
        }
        try {
            System.out.println(obj_one.getAsDouble());
        }
        catch (NoSuchElementException e) {
            System.out.println(-1);
        }
    }
}
