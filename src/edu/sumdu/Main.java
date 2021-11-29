package edu.sumdu;

public class Main {

    public static void main(String[] args) {
           Human[] shtab = new Human[9];
           shtab[0] = new General("Petrenko", 7,
                    new Commander[] {
                            new Commander("Cody",
                                    new Soldier[] {new Soldier("1"), new Soldier("2"), new Soldier("3")}
                            ),
                            new Commander("Rex",
                                    new Soldier[] {new Soldier("4"), new Soldier("5"), new Soldier("6")}
                            )
                    }
           );
           shtab[1] = ((General)shtab[0]).getCommanders()[0];
           shtab[2] = ((General)shtab[0]).getCommanders()[1];
           for (int i = 3; i < 3 + ((Commander)shtab[1]).getSoldiers().length; i++) {
                shtab[i] = ((Commander) shtab[1]).getSoldiers()[i - 3];
           }
           for (int i = 6; i < 6 + ((Commander)shtab[2]).getSoldiers().length; i++) {
                shtab[i] = ((Commander) shtab[2]).getSoldiers()[i - 6];
           }
           for(int i = 0; i < shtab.length; i++) {
               shtab[i].doReport();
           }
    }
}
