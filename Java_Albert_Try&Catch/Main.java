import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> actor = new ArrayList<String>();

        Actor<String> firstActor = new Actor<String>();
        firstActor.setactorName("Coco Martin");
        firstActor.setactorKnownMovie("Ang Probinsyano");
        firstActor.setactorLoveTeam("Julia Montes");
        actor.add("\"" + firstActor.getactorName() + "\"" + " My famous movie is" + firstActor.getactorKnownMovie() + " and my love partner is "
                + firstActor.getactorLoveTeam());

        Actor<String> secondActor = new Actor<String>();
        secondActor.setactorName("Daniel Padilla");
        secondActor.setactorKnownMovie("She's dating a gangster");
        secondActor.setactorLoveTeam("Catherine Bernado");
        actor.add("\"" + secondActor.getactorName() + "\"" + " My famous movie is " + secondActor.getactorKnownMovie() + " and my love partner is "
                + secondActor.getactorLoveTeam());

        Actor<String> thirdActor = new Actor<String>();
        thirdActor.setactorName("John Loyd Cruz");
        thirdActor.setactorKnownMovie("A Very Special Love");
        thirdActor.setactorLoveTeam("Sarah Geronimo");
        actor.add("\"" + thirdActor.getactorName() + "\"" + " My famous movie is " + thirdActor.getactorKnownMovie() + " and my love partner is "
                + thirdActor.getactorLoveTeam());

        Actor<String> fourthActor = new Actor<String>();
        fourthActor.setactorName("Joshua Garcia");
        fourthActor.setactorKnownMovie("Love You to the Stars and Back");
        fourthActor.setactorLoveTeam("Julia Barretto");
        actor.add("\"" + fourthActor.getactorName() + "\"" + " My famous movie is " + fourthActor.getactorKnownMovie() + " and my love partner is "
                + fourthActor.getactorLoveTeam());

        Actor<String> fifthActor = new Actor<String>();
        fifthActor.setactorName("Robin Padilla");
        fifthActor.setactorKnownMovie("Manila Boy");
        fifthActor.setactorLoveTeam("Mariel Rodriguez");
        actor.add("\"" + fifthActor.getactorName() + "\"" + " My famous movie is " + fifthActor.getactorKnownMovie() + " and my love partner is "
                + fifthActor.getactorLoveTeam());

        System.out.print("     [0,1,2,3,4]");
        System.out.print("\nChoose your index:");
        int input = sc.nextInt();

        try {
            if (input < 0) {
                sc.close();
                throw new ActorException("Your input is negative. Please input positive index.");
            }
            if (input > 5) {
                sc.close();
                throw new ActorException("Your input exceeds the size of the array.");
            }

            System.out.println("Index number: " + input);
            System.out.println(actor.get(input));

        } catch (ActorException e) {
            System.out.println(e.getMessage());
        }

        sc.close();

    }
}