import java.util.ArrayList;
import java.util.Scanner;


public class Array_List {

   public static void main(String[] args){

       ArrayList<Object> perSonal = new ArrayList<Object>();

       try (Scanner al = new Scanner(System.in)) {

           System.out.print("Name: " );
           String name = al.nextLine();

           System.out.print("Age: ");
           int age = al.nextInt();

           System.out.print("Gender: ");
           String gender = al.next();

           System.out.print("Address: ");
           String address = al.next();

           System.out.print("School: ");
           String school = al.next();

           perSonal.add(name);
           perSonal.add(age);
           perSonal.add(gender);
           perSonal.add(address);
           perSonal.add(school);
       }

       System.out.println(perSonal);
        }

}

