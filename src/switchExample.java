public class switchExample {
    public static void main(String [] args){
        String person="Chicken";
        switch(person){
            case "MALE": System.out.println("You are male");
            break;
            case "FEMALE": System.out.println("You are female");
            break;
            case "NON-BINARY":System.out.println("You are neither male nor female");
            break;
            default:System.out.println("You are an animal then");
        }
    }
    
}
