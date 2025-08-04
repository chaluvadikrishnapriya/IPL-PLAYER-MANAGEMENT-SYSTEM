package controller;

import model.Player;
import view.PlayerView;
import java.util.ArrayList;
import java.util.List;

public class PlayerController {
    private List<Player> players = new ArrayList<>();
    private PlayerView view;

    public PlayerController(PlayerView view) {
        this.view = view;
    }

    public void addPlayer(Player player) {
        players.add(player);
        view.displayMessage("Player added: " + player.getName());
    }

    public void updateRuns(int id, int newRuns) {
        for (Player p : players) {
            if (p.getId() == id) {
                p.setRuns(newRuns);
                view.displayMessage("Updated runs for " + p.getName());
                return;
            }
        }
        view.displayMessage("Player not found!");
    }

    public void updateWickets(int id, int newWickets) {
        for (Player p : players) {
            if (p.getId() == id) {
                p.setWickets(newWickets);
                view.displayMessage("Updated wickets for " + p.getName());
                return;
            }
        }
        view.displayMessage("Player not found!");
    }

    public void showAllPlayers() {
        view.displayAllPlayers(players);
    }

    public void showTopScorer() {
        Player top = null;
        for (Player p : players) {
            if (top == null || p.getRuns() > top.getRuns()) {
                top = p;
            }
        }
        view.displayMessage("Top Scorer:");
        view.displayPlayer(top);
    }

    public void showTopWicketTaker() {
        Player top = null;
        for (Player p : players) {
            if (top == null || p.getWickets() > top.getWickets()) {
                top = p;
            }
        }
        view.displayMessage("Top Wicket Taker:");
        view.displayPlayer(top);
    }
}
