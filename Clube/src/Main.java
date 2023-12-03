
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Club sporting = new Club();
        BallCatcher ballCatcher = new BallCatcher(50,sporting);
        Security security =  new Security(5000,sporting);
        President president = new President(50000,sporting);



        sporting.addStaffHired(new Player(100000, sporting), true);
        sporting.addStaffHired(new President(85000, sporting), true);
        sporting.addStaffHired(new Coach(90000,sporting),true);
        sporting.addStaffHired(new BallCatcher(50, sporting), false);
        sporting.addStaffHired(new Security(1000, sporting), false);



        System.out.println("Did we won the league won? (true/false)");
        boolean leagueWon = input.nextBoolean();
        sporting.setLeagueWinner(leagueWon);


        System.out.println("Enter the number of games played: ");
        int gamesPlayed = input.nextInt();
        for (int i = 0; i < gamesPlayed; i++) {
            ballCatcher.amountGamesPlayed();
        }
        System.out.println("Enter the number of invasions onto the field: ");
        int invasions = input.nextInt();
        for (int i = 0; i < invasions; i++) {
            security.fieldInvasions();
        }

        System.out.println("Enter the amount won per game: ");
        int winningsPerGame = input.nextInt();
        sporting.setWinningsPerGame(winningsPerGame);

        int profit = sporting.calculateProfit(gamesPlayed);
        System.out.println("Profit at the end of the league: " + profit + "€");
        System.out.println("Presidents salary was :" + president.annualSalary() + "€");
        System.out.println("Security guard salary was :" + security.annualSalary()+ "€");
        System.out.println("BallCatcher salary was : " + ballCatcher.annualSalary()+ "€");

        input.close();
    }

}
