import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String p1Name;
        String p2Name;
        //Asks the user to input thier name for the player
        System.out.println("What is player1's name?: ");
        //TO DO: Create Player 1 - DONE
        p1Name = sc.nextLine();
        Player p1 = new Player(p1Name);

        //Asks the user to input their name for the player.
        System.out.println("What is player2's name?: ");
        //TO DO: Create Player 2 - DONE
        p2Name = sc.nextLine();
        Player p2 = new Player(p2Name);

        String again = "Literally any string";
        Player currentPlayer;
        
        //Runs the game
        while (!again.equals("q")){
            //Generates the game
            //TO DO: Create "game" - DONE
            Game game = new Game(p1,p2);
            //TO DO: Set the a random player as the current player - DONE
            if(Math.random()*2 < 1){
                currentPlayer = p1;
                System.out.println("Player 1 goes first");
            } else {
                currentPlayer = p2;
                System.out.println("Player 2 goes first");
            }

            game.setFirstPlayer(currentPlayer);
            //This is the loop in which the game will be played
            while(game.isComplete()==false){
               //TO DO
               currentPlayer = game.getNextPlayer();
               game.takePiece();
            }
            System.out.println(currentPlayer.getName()+ " Won!!");
            System.out.println(p1.getName() +" had removed "+ p1.getScore()+" pieces!");
            System.out.println(p2.getName() +" had removed "+ p2.getScore()+" pieces!");
            System.out.println("------------------------------------------");
            System.out.println("Enter q to quit, enter anything else to play again.");
            again = sc.nextLine();
        }
        System.out.println("Thank you for playing!");
    }
}
