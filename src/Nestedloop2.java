public class Nestedloop2 {// class name 
    public static void main(String[] args) {// mandatory main method
        for (int i = 1; i <= 5; ++i) {//loop for i
            for (int j = 1; j < 5; ++j) {// loop for j
                System.out.println(i + " " + j);// output message
            }
        }
    }

}
