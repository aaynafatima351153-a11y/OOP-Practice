public class MemberCardDemo{

      public static void main(String[] args){
 
   // A) Object Creation 
   
   // 1 Default constructor 
 
        MemberCard m1 = new MemberCard();
 
   // 2 overloaded constructors

        MemberCard m2 = new MemberCard("Ali");
        MemberCard m3 = new MemberCard("Aayna" , "BSSE");

   // 2 Full constructors

        MemberCard m4 = new MemberCard("Ahmed", "BSCS", 3, 500, true);
        MemberCard m5 = new MemberCard("Aleeha", "BBA", 2, 0, false);

   // 1 Copy constructor
        MemberCard m6 = new MemberCard(m4);

   // B) Method Calls
        m2.payfee(1000);      // pay fee
        m3.DeactivateCard();  // deactivate
        m3.activateCard();    // activate again
        m5.activateCard();    // activate inactive member

    // C) Printing

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
        System.out.println(m5);
        System.out.println(m6);

          System.out.println("Total Cards Created: " + MemberCard.getTotalCards());
    }
}

