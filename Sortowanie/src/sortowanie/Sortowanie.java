
package sortowanie;

import java.util.Random;
import java.util.Scanner;

public class Sortowanie {
    public static void main(String[] args) {
        int[]tablica= new int[200];
        Random r = new Random();
        for (int x=1;x<tablica.length+1;x++){    
            int a=r.nextInt(200);
            while (tablica[a]!=0){
                a=r.nextInt(200);
            }
            tablica[a]=x;
        }
        System.out.println("Obecna tablica z losowo ustawionymi liczbami");
        for (int x=0; x<tablica.length;x++){
            System.out.print(tablica[x]+" , ");
        }
        System.out.println();
        System.out.println("Wybierz, które sortowanie chcesz wykonac");
        System.out.println("Wpisz b jesli chcesz babelkowe");
        System.out.println("Wpisz k jesli chcesz kubelkowe");
        Scanner scan = new Scanner(System.in);
        String wybor =scan.nextLine();
        
        if (wybor.equals("b")==true){
            System.out.println("Wybrales sortowanie babelkowe");
            SortowanieBbabelkowe babelek= new SortowanieBbabelkowe() ;
           tablica=babelek.sort(tablica);
            
           System.out.println( babelek.step_counting());
           
        }
        else if (wybor.equals("k") == true){
            System.out.println("Wybrales sortowanie kubelkowe");
            SortowanieKubelkowe kubelek=new SortowanieKubelkowe();
            tablica=kubelek.sort(tablica);
            System.out.println(kubelek.step_counting());
        }
        else {System.out.println("Zly wybor");}
        
    }
}
