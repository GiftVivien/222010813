public class ShiftOperator3 {// class name 
    public static void main(String[] args) {// mandatory main method
        //For positive number, >> and >>> works same  
    System.out.println(20>>2);  // output message
    System.out.println(20>>>2);  // new line and output message 
    //For negative number, >>> changes parity bit (MSB) to 0  
    System.out.println(-20>>2);  // output message
    System.out.println(-20>>>2); // new line and output message  
    }
}
