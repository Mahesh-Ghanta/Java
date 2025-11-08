import java.util.*;

class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String[] options = {"rock", "paper", "scissor"};
        System.out.println("Rock Paper Scissor Game");
        System.out.println("Type rock, paper, scissor or exit to quit");
        while (true) {
            System.out.print("Enter your choice: ");
            String userChoice = sc.next().toLowerCase();
            if (userChoice.equals("exit")) {
                System.out.println("Game Over");
                break;
            }
            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissor")) {
                System.out.println("Invalid choice, try again");
                continue;
            }
            String computerChoice = options[rand.nextInt(3)];
            System.out.println("Computer chose: " + computerChoice);
            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((userChoice.equals("rock") && computerChoice.equals("scissor")) ||
                       (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                       (userChoice.equals("scissor") && computerChoice.equals("paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        }
        sc.close();
    }
}
