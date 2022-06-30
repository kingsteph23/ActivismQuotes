import java.util.*;

public class main {

// for countries
public static void countries(){

    //calling methods for countries
    activismquotes americasactivists = new activismquotes();
    activismquotes africanactivists = new activismquotes();
    activismquotes asianactivists = new activismquotes();

    System.out.println("------------------------------------------------"+
                        "\n     Activism Nation                          "+
                        "\n------------------------------------------------");
    String userchoice;
    Scanner scan = new Scanner(System.in);
    System.out.println("For eligible Americans....Dont forget to vote on November 8th!🇺🇸🇺🇸");
System.out.println("Select a region(Input either 1,2,or 3):"+
"\n(1)Americas"+
"\n(2)Africa"+
"\n(3)Asia");

userchoice = scan.nextLine();

if(userchoice.equals("1")){
    System.out.println("Welcome to the  Americas!");
    activismquotes.americasactivists();
}else if(userchoice.equals("2")){
    System.out.println("Welcome to the African continent!");
    activismquotes.africanactivists();
}else if(userchoice.equals("3")){
    System.out.println("Welcome to the continent of Asia!");
    activismquotes.asianactivists();
}
    
//end of method
}

   //main method 
 public static void main(String[] args) {
   countries();
      

}
//end of class


}
