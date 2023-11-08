// parent class
public class INHERITANCE {
    public void IND(){

        System.out.println("This is a creative independent company.");
    }
}

// CactuJackBrand inherts INHERITANCE and CactusJackStore

 class CactusJackBrand extends INHERITANCE implements CactusJackStore {
    public void show(){

          }
    }
// the other parent class of the CactusJackBrand
  interface CactusJackStore {

     void show();

}
// SB_Dunks inherts CactusJackBrand properties 
 class SB_Dunks extends CactusJackBrand{

    public void SBD(){
    System.out.println("CactusJack is the brandname of the company!");// output message
    System.out.println();// jump line
    System.out.println("WEAR CACTUSJACKS FOR THE SAKE OF UTOPIA!!!");// output message
    }

}
    
 // SB_Dunks_laces inherts SB-Dunks properties
 class SB_Dunks_laces extends SB_Dunks{
    public void SBL(){
        System.out.println("The company released two pair of shoe laces, that's the thing!");
    }

}
// object to call all created methods
 class UTOPIA_object {
    
    public static void main(String[] args) {
    

        SB_Dunks_laces  laces= new SB_Dunks_laces();
        System.out.println();// jump line

        laces.IND();// calling method created in IndependentCompany
        laces.SBL();// calling method created in SD_Dunks_laces 
        laces.SBD();// calling method created in SB_Dunks

         //output message:
        // This is a creative independent company.
        //CactusJack is the brandname of the company!
        //WEAR CACTUSJACKS FOR THE SAKE OF UTOPIA!!!
        //The company released two pair of shoe laces, that's the thing!

        System.out.println();// jump line
 }
}




    
