package view;

import model.Player;
import java.util.List;

public class PlayerView {
    public void displayPlayer(Player player) {
        System.out.println("ID: " + player.getId() +
                           ", Name: " + player.getName() +
                           ", Team: " + player.getTeam() +
                           ", Role: " + player.getRole() +
                           ", Runs: " + player.getRuns() +
                           ", Wickets: " + player.getWickets());
    }

    public void displayAllPlayers(List<Player> players) {
        for (Player player : players) {
            displayPlayer(player);
        }
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}
