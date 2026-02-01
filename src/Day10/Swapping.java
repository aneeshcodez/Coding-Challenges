package Day10;

public class Swapping {
     int a  ;
     int b ;

    // Constructor to intialize variables
    public Swapping(int a ,int b){
        this.a = a;
        this.b = b;
    }

    // Method to swap
    void swap(){
        int c = a ;
        a = b ;
        b = c ;

    }

    public static void main(String[] args) {
        Swapping obj1 = new Swapping(5,10);

        obj1.swap();

        System.out.println(obj1.a);
        System.out.println(obj1.b);
    }
}

// what is wrong in this program ,any how there will be a defualt no args right then why can't I declare with 'new Swappin()'