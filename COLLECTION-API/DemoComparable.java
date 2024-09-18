
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public  class DemoComparable{

    public static void main(String[] args) {
        


        List<Integer> nums = new ArrayList<>();
        nums.add(56);
        nums.add(78);
        nums.add(34);
        nums.add(26);
        
        // using COLLECTIONS class to sort
        // Collections.sort(nums);
        // System.out.println(nums);

        List<String> names = new ArrayList<>();
        names.add("test12345678");
        names.add("test123456");
        names.add("te");
        names.add("tes");
        names.add("test1");
        names.add("test12");
   
      
        
        //comparator is Interface class, create anonymous function to initialise it 
        Comparator<String> c = (String o1, String o2) -> {
            if(o1.length() > o2.length())
                return 1;
            else
                return -1;
        };
        System.out.println(names);
        Collections.sort(names,c);
        System.out.println(names);



        // List<Student> students = new ArrayList<>();
        // students.add(new Student(22, "te"));
        // students.add(new Student(89, "tes"));
        // students.add(new Student(75, "tset"));
        // students.add(new Student(53, "ttestt"));

        // Comparator<Student> c1= (Student s1, Student s2) -> {
        //     if(s1.getAge() > s2.getAge())
        //         return 1;
        //     else
        //         return -1;
        // };
        // System.out.println(students);
        //ONE WAY OF SORTING AN OBJECT
        // Collections.sort(students,c1);
        // System.out.println(students);

        List<Student> students = new ArrayList<>();
        students.add(new Student(22, "te"));
        students.add(new Student(89, "tes"));
        students.add(new Student(75, "tset"));
        students.add(new Student(53, "ttestt"));

        // ANOTHER WAY OF SORTING BY IMPLEMENTING COMPARABLE
        System.out.println(students);
        Collections.sort(students);
        System.out.println(students);

    }
}

//ONE WAY OF SORTING AN OBJECT
// class Student{
//     String name;
//     int age;

//     public Student(int age, String name) {
//         this.age = age;
//         this.name = name;
//     }

//     @Override
//     public String toString() {
//         return "Student [name=" + name + ", age=" + age + "]";
//     }

//     public String getName() {
//         return name;
//     }

//     public int getAge() {
//         return age;
//     }
// }


class Student implements Comparable<Student>{
    String name;
    int age;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Student that) {
            if(this.age > that.age)
                return 1;
            else 
                return -1;
    }
}