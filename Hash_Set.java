import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class Main {
   public static void main(String[] args) {
       HashSet<String> perSonal = new HashSet<String>();
       try (Scanner al = new Scanner(System.in)) {

           System.out.print("Hobby: ");
           String hob = al.next();

           System.out.print("Favorite Song: ");
           String song = al.next();

           System.out.print("Talent: ");
           String tal = al.next();

           System.out.print("Height: ");
           String hgt = al.next();

           System.out.print("Favorite Animal: ");
           String ani = al.next();

           perSonal.add(hob);
           perSonal.add(song);
           perSonal.add(tal);
           perSonal.add(hgt);
           perSonal.add(ani);
       }

       Iterator it = perSonal.iterator();
       while (it.hasNext()) {
           System.out.println(it.next());
       }
   }

}


