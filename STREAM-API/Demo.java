import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String a[]) {
        List<Integer> nums = Arrays.asList(4, 3,5, 6, 1, 2, 34,7,98,42);

        // nums.forEach(n -> System.out.println(n));
        // Consumer<Integer> con = n -> System.out.println(n);
        // nums.forEach(con);
        
        // Stream<Integer> s1 = nums.stream();
        // s1.forEach(con);

        // always use ".collect(Collectors.toList())" after using stream() to collect the array (expecting a result of array)
    //    List<Integer> res = nums.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
    //     System.out.println(res);


       int res = nums.stream()
                     .filter(n -> n % 2 == 0)
                     .map(n -> n* 2)
                     .reduce(0, (c,e) -> c + e);
    }
}



// to fully understand....
// https://chatgpt.com/share/66ea7d19-bce0-8003-997d-c6143965750e