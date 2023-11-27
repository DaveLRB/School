import java.util.Scanner;

/*A superclass Staff que tem como superclass Clube, vai ter método de salário por ano e variável de instância salário

 A subclass treinador que tem como superclass Staff e método salário por ano/multiplicar salário por 14 e
 se ganhou a liga é 20% a mais do salário e se perdeu 10%

 A subclasse presidente que tem como superclass Staff e método salário por ano/ multiplicar salário por 14
 e bonus é sempre 50 mil

 A subclass jogador que tem como superclass Staff e método salário por ano/multiplicar salário por 14 e se ganhou
 a linha é 10% a mais do salário e se perdeu é 5%

 A subclass segurança que tem como superclass Staff e método salário por ano/salário vai ser o bonus
 que tem como default 2000 e mínimo 1000, vai ser calculado com base no número de invasões *20 ou seja, 2000- (nInvasões*20)

 A subclass apanha Bolas que tem como superclass Staff e método salário por ano/salário é número de jogos * 20

 A superclass Clube vai ser a superclass de Staff
*/
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        President president = new President(80000);
        Player player = new Player(150000);
        Coach coach = new Coach(100000);
        Security security = new Security(5000);
        BallCatcher ballCatcher = new BallCatcher(10);

        System.out.println("Did the league won? (true/false)");
        boolean leagueWon = input.nextBoolean();
        president.setLeagueWinner(leagueWon);
        player.setLeagueWinner(leagueWon);
        coach.setLeagueWinner(leagueWon);

        System.out.println("Enter the number of games played: ");
        int gamesPlayed = input.nextInt();
        for (int i = 0; i < gamesPlayed; i++) {
            ballCatcher.amountGamesPlayed();
        }
        System.out.println("Enter the number of trespasses onto the field: ");
        int trespasses = input.nextInt();
        for (int i = 0; i < trespasses; i++) {
            security.fieldTrespassing();
        }

        System.out.println("President salary was : " + president.annualSalary());
        System.out.println("Players salary was : " + player.annualSalary());
        System.out.println("Coach salary was : " + coach.annualSalary());
        System.out.println("Security guard salary was :" + security.annualSalary());
        System.out.println("BallCatcher salary was : " + ballCatcher.annualSalary());

        input.close();
    }

}
