
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        ArrayList<Team> teams = new ArrayList<>();

        try ( Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String row = fileReader.nextLine();
                String[] parts = row.split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int scoreHome = Integer.valueOf(parts[2]);
                int scoreVisiting = Integer.valueOf(parts[3]);
                if (!ifTeamExists(homeTeam, teams)) {
                    teams.add(new Team(homeTeam));
                }
                if (!ifTeamExists(visitingTeam, teams)) {
                    teams.add(new Team(visitingTeam));
                }

                if (scoreHome > scoreVisiting) {
                    addOutcome(homeTeam, visitingTeam, teams);
                } else {
                    addOutcome(visitingTeam, homeTeam, teams);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        if (!ifTeamExists(team, teams)) {
            System.out.println("Games: 0");
            System.out.println("Wins: 0");
            System.out.println("Losses: 0");
        } else {
            for (Team each : teams) {
                if (each.getName().equals(team)) {
                    System.out.println("Games: " + each.getGames());
                    System.out.println("Wins: " + each.getWins());
                    System.out.println("Losses: " + each.getLosses());
                }
            }
        }

    }

    public static void addOutcome(String winningTeam, String losingTeam, ArrayList<Team> teams) {
        for (Team each : teams) {
            if (each.getName().equals(winningTeam)) {
                each.addWin();
            }
            if (each.getName().equals(losingTeam)) {
                each.addLoss();
            }
        }
    }

    public static boolean ifTeamExists(String newTeamName, ArrayList<Team> teams) {
        for (Team each : teams) {
            if (each.getName().equals(newTeamName)) {
                return true;
            }
        }
        return false;
    }

}
