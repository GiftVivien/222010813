
// second parent class of Marvel Studios
public interface Disney {

    void show();
}

class Marvel_Studios extends Walt_Disney implements Disney{ // Marvel Studios inherts Walt Disney and Disney properties

    public void MO(){

        System.out.println("Walt Disney is a big production house, that owns Marvel Studios.");
        System.out.println();
        System.out.println("Marvel Studios started a franchise based comic books called MCU");
    }

}

class Walt_Disney{// parent class of Marvel Studios

    public void show(){
         }

}
class MCU extends Marvel_Studios  { // MCU inherts Marvel Studios properties
    public void TATA(){

        System.out.println("It is characterised with blockbusters that strike the audience, like Iron Msn, etctera.");
    }
}
class Iron_Man3{// class name 

    public void TOTO(){
        System.out.println("Iron Man and Captain are the foundation of this amazing release to the theaters.");
    }
}

class Special_agent{// object 
   public static void main(String[] args) {
    
   
    
     Marvel_Studios first = new Marvel_Studios();// calling the method for clas A
     MCU middle= new MCU();// calling method for class C
      Iron_Man3 last= new Iron_Man3();// calling method for class E
    
    first.MO();//Walt Disney is a big production house, that owns Marvel Studios.
    //Marvel Studios started a franchise based comic books called MCU
    
    middle.TATA();//It is characterised with blockbusters that strike the audience, like Iron Msn, etctera.
    
    last.TOTO();//Iron Man and Captain are the foundation of this amazing release to the theaters.
    
    System.out.println();// jump line 
    System.out.println("WHAT!!! HUH");// output message
    
    

}
}