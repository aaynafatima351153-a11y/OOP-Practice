public class MemberCard {

//static (Class-level)
    private static int counter = 0;
    private static final String PREFIX = "LIB-";

//Instances(Object-level)

   private String cardNo;
   private String studentName;
   private String department;
   private int semester;
   private double feePaid;
   private boolean active;
  
//Default Constructor

   public MemberCard(){
    this("unknown","BSSE",1,0.0,true); 
}

//Constructor with studentName

  public MemberCard(String studentName){
   this(studentName,"BSSE",1,0.0,true);
}

//Constructor with studentName and department

  public MemberCard(String studentName,String department){
  this(studentName,department,1,0.0,true);
}
 /* public MemberCard(String studentName,String department,int semester){
  this(studentName,department,semester,0,true);
}*/

 //full constructor

   public MemberCard(String studentName, String department, int semester, double feePaid, boolean active)
{
  this.cardNo = generateCardNo(); //must generate unique card number
  this.studentName = studentName;
  this.department = department;
  this.semester = semester;
  this.feePaid = feePaid;
  this.active = active;
}

 //Copy Constructor(new card number generated)

 public MemberCard(MemberCard other)
{
 this(other.studentName, other.department, other.semester, other.feePaid, other.active);
 }

//Static Method

public static int getTotalCards()
{
  return counter;
}

//Generate Card Number

private static String generateCardNo()
{
 return PREFIX + String.format("%04d", ++counter);
}
 
//Deactivate Card
public void DeactivateCard()
{
 active = false;
}

//Activate Card

public void activateCard()
{
 active = true;
}

//Pay fee (no negative allowed)
 public void payfee(double amount)
{
   if(amount > 0){
       feePaid += amount;
}else{
   System.out.println("Invalid amount!Cannot add negative fee.");
}
}

//toString Method
public String toString(){
 return cardNo + " " +
        studentName + " " +
        department + " "+
        "Semester:" + semester + " " +
        "Fee:" + feePaid + " " +
        "Active:" + active;
}

}  
   

















