public class Adder {//class name
    public int add(int num1, int num2){//class method
        return num1 + num2;// return value

    }
    public class Main{
        public static void main(String[] args) {// mandatory main method
            Adder myAdder= new Adder();// object name
            int result= myAdder.add(5,3);//recalling class method
            System.out.println("result: " + result);// output message
            
        }
    }
}

