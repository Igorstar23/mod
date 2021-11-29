package edu.sumdu;

public class General extends Human{
       private int countStars;
       private Commander[] commanders;
       public static final int DEF_NUM_COM = 2;



       @Override
       public String canWar() { return super.getStatus(); }
       @Override
       public void doReport() {
              System.out.print("General " + this.getName() + " ");

                     System.out.println(this.getName() + "I have not Boss and I ");


              try {
                     System.out.println(this.canWar());
              } catch (BadStatusException e) {
                     System.out.println("Soldier have problem : " + e);
              }
       }

       public int getCountStars() {
              return countStars;
       }

       public void setCountStars(int countStars) {
              this.countStars = countStars;
       }

       public Commander[] getCommanders() {
              return commanders;
       }

       public void setCommanders(Commander[] commanders) {
              this.commanders = commanders;
       }
}
