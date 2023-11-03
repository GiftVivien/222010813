public class compoundinterest2 {// class name 
    
    double deposit;
    public compoundinterest2(double d){
        deposit=d;
        
    }
    public double Amount( double rate, int time){
        return deposit*Math.pow(1+rate/100/12, time*12);// return value
    }
    

        public static void main(String[] args) {// mandatory main method

            compoundinterest2 myInterest= new compoundinterest2(500000);//object name
            double newAmount=myInterest.Amount( 18, 3);//recalling class method
            System.out.println("the compound interest is: " + newAmount);// output message 

            
        }
}
