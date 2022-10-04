import java.util.Scanner;
public class main {
    public static void main(String[] args){
        String mysport[] = {"Basketball", "Volleyball", "Table Tennis", "Badminton", "Soccer"};
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter the index of the favorite Sport you want to display: ");
        int choice = Scan.nextInt();
        try{
            if(choice < 0){
                Scan.close();
                throw new sportException("The Index is negative!");
            }if(choice > 5){
                Scan.close();
                throw new sportException("The index "+ choice +" is not valid!");
            }
            System.out.println(mysport[choice]);
        }catch(sportException e){
            System.out.println(e.getMessage());
        }
        Scan.close();
    }
}
