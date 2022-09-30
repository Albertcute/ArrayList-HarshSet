import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class HashSet_Al {
    public static void main(String[]args){
        Character usEr;
        try (Scanner input = new Scanner(System.in)) {
            Set<Integer> integers = new HashSet<Integer>();
            while (true) {
                displaySelect();

                usEr = input.next().charAt(0);
                usEr = Character.toUpperCase(usEr);
                switch (usEr) {
                    case 'A':
                        System.out.println();
                        System.out.print("Add a number: ");
                        int addNum = input.nextInt();
                        System.out.println("");

                        if (addNum < 0) {
                           System.out.println("Error!!!! Input positive number!");
                        }
                        else if(integers.contains(addNum)){
                            System.out.println("The number already existed. The number is not added ");
                            break;
                        }
                         else {
                            integers.add(addNum);
                            System.out.println("The Number" + addNum + " is successfully added to the HashSet!" );
                            break;
                        }

                    case 'B':
                        System.out.println(" ");
                        System.out.print("Number you want to remove from the HashSet: ");
                        int removedNum = input.nextInt();

                        if (integers.contains(removedNum)) {
                            integers.remove(Integer.valueOf(removedNum));
                            System.out.println(
                                    "The number " + removedNum + " is successfully removed from the hashset!");
                            System.out.println("");
                            break;
                        }

                    case 'C':
                        System.out.println(" ");
                        System.out.println("The numbers/number in your HashSet: ");
                        System.out.println("-------------------");
                        System.out.println(integers);
                        System.out.println("--------------------");
                        break;

                    case 'D':
                        System.out.println("Do you want to clear your HashSet?");
                        System.out.print("Type Y for yes and N for no: ");
                        String yesNo =input.next();

                        if (yesNo.equalsIgnoreCase("Y")) {
                            integers.clear();
                            System.out.println("---------------------------");
                            System.out.println("You cleared your HashSet");
                            System.out.println("----------------------------");
                            break;
                        } else {
                            System.out.println("-------------------------------");
                            System.out.println("You didn't clear your HashSet");
                            System.out.println("-------------------------------");
                            break;
                        }
                        

                    case 'E':
                    input.close();
                        System.out.println("Thank you for using the program.");
                        System.exit(0);

                    default:
                        System.out.println("Please input a proper choices in the program!");
                }

            }
        }

    }

    private static void displaySelect() {
        System.out.println("********************");
        System.out.println("A. Add Numbers");
        System.out.println("B. Remove Numbers");
        System.out.println("C. Display Numbers");
        System.out.println("D. Clear Numbers");
        System.out.println("E. Exit");
        System.out.println("********************");
        System.out.println();
        System.out.print("Select: ");

    }
    }