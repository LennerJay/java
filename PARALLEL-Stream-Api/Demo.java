
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Demo{
    public static void main(String[] args) {
        int size = 10_000;
        List<Integer> nums = new ArrayList<>(size);
        Random ran = new Random();
        for(int i = 1; i <=size ; i++){
            nums.add(ran.nextInt(100));
        }

        
        long startSeq = System.currentTimeMillis();
        int res1 = nums.stream()
                       .map(i -> i * 2)
                       .reduce(0,(c,e)-> c + e);
        long endSeq = System.currentTimeMillis();
        long res1Time = endSeq - startSeq;


        long startPar = System.currentTimeMillis();
        int res2 = nums.parallelStream()
                       .map(i -> i * 2)
                       .mapToInt(i -> i)
                       .sum();               
        long endPar = System.currentTimeMillis();
        long res2Time = endPar - startPar;
        
        System.out.println("Result 1 : " + res1);
        System.out.println("Result 2 : " + res2);
        System.out.println("Result 1 Time : " + res1Time);
        System.out.println("Result 2 : " + res2Time);
    }
}


//parallelStream prone to bugss better not use

//parallelStream depend the structure of the code
//the result time still depends the structure of the code i guess :)