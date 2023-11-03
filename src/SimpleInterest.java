public class SimpleInterest {// class name
    public static double Interest (double deposit,double rate, double time ){
        
        return deposit*rate*time;// return value


    }
    

    public static void main(String[] args) {// mandatory main method
     double depo= 100000;// initialize value
     double percentage= 0.05;// initialize value
     double timePeriod= 5;//initialize value
     double SInterest = Interest(depo, percentage, timePeriod);
     System.out.println("The simple interest of the deposited amount: " + SInterest);// output message 
        
    }
}
