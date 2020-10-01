
public class Swdemo
 {
  
    public static void main(String[] args) 
        {

      String s="MONDAY";
     

      switch (s)
         {
          case "MONDAY":
          case "TUESDAY":
          case "WEDNESDAY":
              System.out.println("Development Day");
              break;
          case "THURSDAY":
              System.out.println("Meeting");
          case "FRIDAY":
          case "SATURDAY":
          case "SUNDAY":
              System.out.println("Deployment & weekend");
              break;

      }
  }
}