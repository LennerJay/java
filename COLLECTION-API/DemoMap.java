
import java.util.HashMap;
import java.util.Map;

public class DemoMap {
    public static void main(String[] args) {
       
        // Map Class is for key : value pair array
        //note: no duplicate key / key cannot be repeated
        Map<String, Integer> students = new HashMap<>();
        // Map<String, Integer> students = new Hashtable<>();
        students.put("s1", 18);
        students.put("s2", 23);
        students.put("s3", 89);
        students.put("s4", 45);

        // System.out.println(students.get("s1"));
        // System.out.println(students);

        // way of looping a Map
        for(String key: students.keySet()){
            System.out.println(key + " -> " + students.get(key));
        }

    }
}
