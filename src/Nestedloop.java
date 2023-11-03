public class Nestedloop {//class name 
    public static void main(String[] args) {// mandatory main method
        for (int i = 19; i <= 20; ++i) {// loop for i

            for (int j = 10; j < 20; ++j) { // loop for j
                System.out.println(i + "" + j);// output message
            }
        }
    }

}
