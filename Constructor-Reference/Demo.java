
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo{
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("test1","test2","test3","test4");

        List<Student> students = new ArrayList<>();
        
        //first way of creating student
        // for (String name : names) {
        //    students.add(new Student(name));
        // }

        // second way of creating student
        // students =  names.stream().map(n -> new Student(n)).toList();


        // using constructor reference
         students =  names.stream().map(Student::new).toList();
        System.out.println(students);


    }
}


class Student{
    private String name;
    private int age;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
}