import java.util.*;

public class main {

      // call your congressman/woman
public static void midterms(){
System.out.println();
    System.out.println("For those in the US, if you want to see some change in your community, state, and country...Please:"+
    "\nContact your senators: https://www.senate.gov/states/statesmap.htm"+
    "\nContact your US representative: https://www.house.gov/representatives ");

System.out.println();
    System.out.println("Also, please remember the following:"+
             "\n1. Despite the many circumstances/issues that are occurring/have occurred in the country:inflation, gas prices, climate issues, and the many other political issues..."+
               "\n"+
               "\n2. Please note that the president can only enforce so much power(overdoing power = abuse of power). They don't really have that big of a in matters such as legislation(especially when negotiating and creating laws. Since are prohibited from doing it)"+
               "\n"+
              "\n3. A presidents' is mainly to: veto/sign bills, enforce laws congress passes,act as their parties leader, and mainly oversee the federal government(think FBI, Dept of State, Dept of Justice,  etc)."+
              "\n"+
              "\n4. Much of the major laws that affect us on a day to day basis on normally done by people in congress(senate/house of reps), who create laws that impact us directly(Think CHIPS act, Civil rights act, voting rights act, Bipartisan safer communities act)."+
              "\n"+
              "\n5. So while the president has a say in what goes in the country, congress(senate/house of reps), have even a greater and more direct say of what goes on in the country(and in our lives as well)."+
              "\n"+
              "\n6. So please,if you are eligible to vote, please vote in this years midterms(elect representatives, senators, governess,etc ), to let your issues be heard on a national/state/local scale.");

                
}
// for countries
public static void countries(){

    //calling methods for countries
    activismquotes  midterms = new activismquotes();
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
    midterms();
}
//end of class


}
