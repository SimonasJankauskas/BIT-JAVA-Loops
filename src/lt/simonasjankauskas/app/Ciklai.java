package lt.simonasjankauskas.app;

import java.util.Scanner;


public class Ciklai {
    public static void main (String[] args) {
        // 1. Niekada nesibaigiantis while/for ciklas:

        // while (true) {
        //     System.out.println("Labas");
        // }
        // for ( ; ;) {
        //     System.out.println("Labas");
        // }

        // 2. Niekada neprasidedantis while/for ciklas:
        int x = 9;
        while(x > 10){
            System.out.println("Labas");
            x++;
        }
        for (x = 9; x > 10; x++) {
            System.out.println("Labas");
        }

        // 3. Programėlė su raide "q":
        Scanner sc = new Scanner(System.in);
        String userInput = null;
        String raide = "q";
        do {
            System.out.print("Įvesta reikiamą raidę! ");
            userInput = sc.nextLine();
        } while(!userInput.equals(raide));
        System.out.println("Valio! Jūs įvedėte teisingą raidę!");

        // 4. Reverse echo:
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Įveskite žodį:");
        String zodis = sc1.nextLine();
        StringBuilder zodis1 = new StringBuilder();
        zodis1.append(zodis);
        zodis1 = zodis1.reverse();
        System.out.println(zodis1);

        // 5. Raidė su indexu:
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Įveskite žodį:");
        String tekstas = sc2.nextLine();
        for(int i = 0; i <= tekstas.length()-1; i++) {
            System.out.println(tekstas.charAt(i) + " " + i );
            }
        }
    }

