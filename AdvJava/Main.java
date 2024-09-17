package AdvJava;


//enums is good for using switch statement
public class Main {

    public static void main(String[] args) {
        Status[] ss = Status.values();
        for(Status s: ss){
            System.out.println(s.ordinal() + " : " + s );
        }


        Status s = Status.Failed;

        // switch (s) {
        //     case Running:
        //             System.out.println("Running");
        //         break;
        //     case Failed:
        //             System.out.println("Failed");
        //         break;
        //     case Success:
        //             System.out.println("Success");
        //         break;

        // }
        switch (s) {
            case Running -> System.out.println("Running");
            case Failed -> System.out.println("Failed");
            case Success -> System.out.println("Success");
        }

        for(Fruits fruit : Fruits.values()){
            System.out.println(fruit + " : " + fruit.getPrice());
        }

    }
}

enum Status{
    Running, Failed, Success
}

enum Fruits {
    
    Mango(20), Apple(22), Orange(15);

    int price;

    Fruits(int price) {
      this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

//if the constructor is initilised every static enum should have parameters[n is based on how many parameters / arguments]