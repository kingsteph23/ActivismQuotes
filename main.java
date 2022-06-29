import java.util.*;

public class main {
    private String userchoice;
// for countries
    public static  String countries(String userchoice){
            Scanner scan = new Scanner(System.in);
        System.out.println("Select a region(Input either 1,2,3, or 4):"+
        "\n(1)Americas"+
        "\n(2)Europe"+
        "\n(3)Africa"+
        "\n(4)Asia");

        userchoice = scan.nextLine();

        if(userchoice.equals("1")){
            System.out.println("Welcome to the  Americas!");
        }else if(userchoice.equals("2")){
            System.out.println("Welcome to Europe!");
        }else if(userchoice.equals("3")){
            System.out.println("Welcome to the African continent!");
        }else if(userchoice.equals("4")){
            System.out.println("Welcome to the continent of Asia!");
        }
            
        

        return userchoice;
   }

   //topic
   public static  String topics(String usertopic){
    

return usertopic;
}

//



   //main method 
 public static void main(String[] args) {
    
      countries("1");

}
//end of class
}
