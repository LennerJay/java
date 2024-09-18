
import java.util.Arrays;
import java.util.List;

public class Demo{
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("test","test1","test2","test3");

        // without  method reference
        // List<String> unames = names.stream().map(name->name.toUpperCase()).toList();

        // "map(String::toUpperCase)" this is the method reference means
        List<String> unames = names.stream().map(String::toUpperCase).toList();
        System.out.println(unames);

    }
}


