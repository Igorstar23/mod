package edu.sumdu;

public class General extends Human{
       private int countStars;
       private Commander[] commanders;
       public static final int DEF_NUM_COM = 2;

       public General() {
              super();
       }
       public General(String name) {
              this();
              this.setName(name);
       }

       public General(String name, int countStars, Commander[] commanders) {
              this(name);
              this.countStars = countStars;
              this.commanders = commanders;
              for (var c : commanders) c.setMyGen(this);
       }

       @Override
       public String canWar() { return super.getStatus(); }
       @Override
       public void doReport() {
              System.out.print("General " + this.getName() + " ");

              System.out.println("I have not Boss and ");


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
