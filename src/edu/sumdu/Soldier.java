package edu.sumdu;

class Soldier extends Human{
       private String rang;
       private String weaponName;
       private Commander myCom;

       public Soldier() {
              super();
              this.rang = "privet";
              this.weaponName = "AK-74";
       }
       public Soldier(String name) {
               this();
              this.setName(name);
       }
       public Soldier (String name, Commander myCom) {
              this(name);
              this.myCom = myCom;
       }

       @Override
       public String canWar() throws BadStatusException {

              if (this.getStatus() != DEF_ST_OK && this.getStatus() != DEF_ST_NO) throw new BadStatusException("This Soldier has bad status!");
              return this.getStatus();
       }
       @Override
       public  void doReport() throws BadStatusException {
               System.out.print("Soldier " + this.getName() + " ");


               if (this.myCom == null) {
                   System.out.println("I have not commanders and I ");
               } else {

                   System.out.println("I have commander " + this.myCom.getName());
               }


               try {
                    System.out.println(this.canWar());
               } catch (BadStatusException e) {
                    System.out.println("Soldier have problem : " + e);
               }
       }

       public void setRang(String rang) { this.rang = rang; }
       public void setWeaponName(String weaponName) { this.weaponName = weaponName; }
       public void setMyCom(Commander myCom) { this.myCom = myCom; }

       public String getRang() { return rang; }
       public String getWeaponName() { return weaponName; }
       public Commander getMyCom() { return myCom; }
}
