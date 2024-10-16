import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int fn_1=1;
        int fn_2=1;
        int fn=-1;
        int n=0;
        boolean choice =false;

        Scanner scanner = new Scanner(System.in);

        while (!choice) {
            System.out.println("Zadej čislo: ");
            int zadanecislo = scanner.nextInt();
            System.out.println("Fibonaciho posloupnost: ");
            fibonaci(fn, zadanecislo, fn_1, fn_2, n);


            String moznost;
            do {
                System.out.println("Chces znovu zadat zadanecislo a zobrazit fibonaciho posloupnost ano ne? (y/n): ");
                moznost = scanner.next();
                if (moznost.equals("y")) {
                    choice = false;
                    break;
                } else if (moznost.equals("n")) {
                    choice = true;
                    break;
                } else {
                    System.out.println("Neplatna moznost zadej y/n: ");
                }
            } while (true);
        }

        scanner.close();
    }

    private static void fibonaci(int fn, int zadanecislo, int fn_1, int fn_2, int n) {
        while(fn < zadanecislo){
         if(n==0){
             fn=0;
             System.out.print(fn + " ");
             n++;
         }
         else if (n==1){
             fn=1;
             System.out.print(fn + " ");

             n++;
         }
        else if (n==2){
            fn=1;
            System.out.print(fn + " ");
           n++;
         }
         else if (n>2){
                fn = fn_1 + fn_2;
                fn_1 = fn_2;
                fn_2 = fn;
                n++;
                System.out.print(fn + " ");
               if(fn_1 + fn_2> zadanecislo){
                   n--;
                   break;
               }
        }
    }
        if (zadanecislo == 1) {
            System.out.print("\n"+ "nebo tato posloupnost: " + "\n");
            System.out.print("0 " + fn + " 1 " + "\n");
            System.out.println("Fibonacci číslo je: 1, n: 1 (a n: 2)");

        }else if (zadanecislo == 0) {
            System.out.println( "\n"+ "fibonacci cislo je: " + fn +  " n: " + --n);
        }
        else if (zadanecislo >1) {
            System.out.println("\n"+ "fibonacci cislo je: " + fn+",  n: " +  n);
        }

    }
}