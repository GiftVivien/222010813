public class conditionExample2 {

    public static void main(String [] args){
        int percentage=50;
        if (percentage>=50) {
            System.out.println("Since you are above 50%, you are admitted!!");
            System.out.println("Congratulations");
            
        } else 
        {
            if (percentage<50){
                System.out.println("Since you are below 50%, you are not admitted");
                System.out.println("We are sorry.");
            }
            else{
                System.out.println("The Places have already been filled");
            }
        }

    }
    
}

