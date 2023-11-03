public class ORoperator {// class name 
    public static void main(String[] args) {// mandatory main method
        int a=10; //initialize value 
int b=5;  //initialize value 
int c=20;  //initialize value  
System.out.println(a>b||a<c);//true || true = true  
System.out.println(a>b|a<c);//true | true = true  
//|| vs |  
System.out.println(a>b||a++<c);//true || true = true  
System.out.println(a);//10 because second condition is not checked  
System.out.println(a>b|a++<c);//true | true = true  
System.out.println(a);//11 because second condition is checked  
    }
}
