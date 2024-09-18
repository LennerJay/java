import java.util.Arrays;
import java.util.List;

public class Demo{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("test","test1","test12","test1233");
        // using optional class
        // Optional<String> filteredName = names.stream()
        //                                      .filter(s -> s.contains("0"))
        //                                      .findFirst();

        // using optional class
        // System.out.println(filteredName.get());
        // if no result it will get error so try this
        // System.out.println(filteredName.orElse("not found"));

        //or this
        String filteredName = names.stream()
                                             .filter(s -> s.contains("0"))
                                             .findFirst()
                                             .orElse("not found");
        System.out.println(filteredName);
    }

}