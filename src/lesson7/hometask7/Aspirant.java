package lesson7.hometask7;

public class Aspirant extends Student {
   String scienceWork;

   public Aspirant(String firstName, String lastName, int group, double averageMark, String scienceWork) {
      super(firstName, lastName, group, averageMark);
      this.scienceWork = scienceWork;
   }

   public int getMoney() {
      int sum = 0;
      if (averageMark >= 5) {
         sum = 100;
      } else {
         sum = 10;
      }
      return sum;
   }

}
