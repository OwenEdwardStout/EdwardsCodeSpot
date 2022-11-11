import java.util.Scanner;
public class Runner {
    public static void main (String[] args){
        Board board = new Board();
        Scanner sc = new Scanner(System.in);
        Player player = new Player();
        String using = board.loadPhrase();
        System.out.println(using);
        System.out.println(board.replacePhrase(using));
        System.out.println(player.checkGuess("e", using));
    }
}
