 class simpleinterest2 {// class name
    double deposit;
    public simpleinterest2(double d){
        deposit=d;
        
    }
    public double Amount( double rate, int time){
        return deposit*rate*time;// return value
    }
    

        public static void main(String[] args) {// mandatory main method

            simpleinterest2 myInterest= new simpleinterest2(100000);// object name
            double SAmount=myInterest.Amount( 0.05, 5);//recalling class method
            System.out.println("the interest is: " + SAmount);// output message

            
        }
    }

