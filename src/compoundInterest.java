public class compoundInterest {// class name 
    
    public static double Interest (double deposit,double rate, double time ){// class method
        
        return deposit*Math.pow(1+rate/100/12, time*12);// return value


    }
    

    public static void main(String[] args) {//mandatory main method
     double depo= 500000;// initialize value
     double percentage= 18;// initialize value
     double timePeriod= 3;// initialize value
     double compoundInterest = Interest(depo, percentage, timePeriod);
     System.out.println("The compound interest of the deposited amount: " + compoundInterest);// output message
        
    }
}

