import controller.PlayerController;
import model.Player;
import view.PlayerView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PlayerView view = new PlayerView();
        PlayerController controller = new PlayerController(view);

        while (true) {
            System.out.println("\n===== IPL Player Management Menu =====");
            System.out.println("1. Add Player");
            System.out.println("2. Update Runs");
            System.out.println("3. Update Wickets");
            System.out.println("4. Show All Players");
            System.out.println("5. Show Top Scorer");
            System.out.println("6. Show Top Wicket Taker");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Player ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Team: ");
                    String team = sc.nextLine();
                    System.out.print("Enter Role: ");
                    String role = sc.nextLine();
                    System.out.print("Enter Runs: ");
                    int runs = sc.nextInt();
                    System.out.print("Enter Wickets: ");
                    int wickets = sc.nextInt();

                    Player player = new Player(id, name, team, role, runs, wickets);
                    controller.addPlayer(player);
                    break;

                case 2:
                    System.out.print("Enter Player ID to update runs: ");
                    int updateRunId = sc.nextInt();
                    System.out.print("Enter New Runs: ");
                    int newRuns = sc.nextInt();
                    controller.updateRuns(updateRunId, newRuns);
                    break;

                case 3:
                    System.out.print("Enter Player ID to update wickets: ");
                    int updateWicketId = sc.nextInt();
                    System.out.print("Enter New Wickets: ");
                    int newWickets = sc.nextInt();
                    controller.updateWickets(updateWicketId, newWickets);
                    break;

                case 4:
                    controller.showAllPlayers();
                    break;

                case 5:
                    controller.showTopScorer();
                    break;

                case 6:
                    controller.showTopWicketTaker();
                    break;

                case 7:
                    System.out.println("Exiting... Thank you!");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
