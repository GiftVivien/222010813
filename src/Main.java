public class Main {
    public static void main(String[] args) {// mandatory main method
        int number1 = 5;// initialize value
        int number2 = 7;// initialize value
        int result= addnumbers(number1, number2);
        System.out.println("the sum of two numbers is " + result);// output message

        
    }
    public static int addnumbers(int num1, int num2){// class name 
        return num1+ num2;// return value
    }
}
