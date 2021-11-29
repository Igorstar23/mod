package edu.sumdu;

public class Commander extends Human{
       private int numLegion = 777;
       private Soldier[] soldiers;
       private General myGen;
       public static final int DEF_NUM_SDR = 3;

       public Commander() {
              super();
       }
       public Commander(Soldier[] soldiers) {
              this();
              this.soldiers = soldiers;
              for( var s : soldiers) s.setMyCom(this);
       }
       public Commander(String name, Soldier[] soldiers) {
              this(soldiers);
              this.setName(name);
       }

       @Override
       public String canWar(){
              if (this.getStatus() != DEF_ST_OK && this.getStatus() != DEF_ST_NO) throw new BadStatusException("This Commander has bad status!");
              return this.getStatus();
       }
       @Override
       public void doReport() {
              System.out.print("Commander " + this.getName() + " ");


              if (this.myGen == null) {
                     System.out.println("I have not generals and I ");
              } else {

                     System.out.println("I have general " + this.myGen.getName());
              }


              try {
                     System.out.println(this.canWar());
              } catch (BadStatusException e) {
                     System.out.println("General have problem : " + e);
              }
       }

       public int getNumLegion() {
              return numLegion;
       }

       public void setNumLegion(int numLegion) {
              this.numLegion = numLegion;
       }

       public Soldier[] getSoldiers() {
              return soldiers;
       }

       public void setSoldiers(Soldier[] soldiers) {
              this.soldiers = soldiers;
       }

       public General getMyGen() {
              return myGen;
       }

       public void setMyGen(General myGen) {
              this.myGen = myGen;
       }
}
