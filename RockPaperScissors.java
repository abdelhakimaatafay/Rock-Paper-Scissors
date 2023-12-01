import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");

        String answer = scan.nextLine();
   
        if (answer.equals("yes")) {
            System.out.println("Great!");
            System.out.println("rock - paper - scissors, shoot!");
            String yourChoice = scan.nextLine();
            String computerChoice = computerChoice();
            String result = result(yourChoice, computerChoice);
            printResult(yourChoice, computerChoice, result);
        } else {
            System.out.println("other time");
        }

        scan.close();
    }

    public static String computerChoice(){
        int randomNumber = (int)(Math.random()*3);
        String computerChoice = "";
        switch (randomNumber) {
            case 0: computerChoice = "rock";
                break;
            case 1: computerChoice = "paper";
                break;
            case 2: computerChoice = "scissors";
                break;
        }
        return computerChoice;
    }

    public static String result(String yourChoice, String computerChoice){
        String result = "";
        if ((yourChoice.equals("rock")&&computerChoice.equals("scissors"))||(yourChoice.equals("paper")&&computerChoice.equals("rock"))||(yourChoice.equals("scissors")&&computerChoice.equals("paper"))){
            result = "You win!";
        }
        else if ((yourChoice.equals("scissors")&&computerChoice.equals("rock"))||(yourChoice.equals("rock")&&computerChoice.equals("paper"))||(yourChoice.equals("paper")&&computerChoice.equals("scissors"))){
            result = "You lose";
        }
        else if (yourChoice.equals(computerChoice)){
            result = "It's a tie";
        } else {
            System.out.println("INVALID CHOICE");
            System.exit(0);
        }
        return result;
    }
 
     public static void printResult(String yourChoice, String computerChoice, String result){
        System.out.println("You chose: " + yourChoice);
        System.out.println("The computer chose: " + computerChoice);
        System.out.println(result);
     }

}
