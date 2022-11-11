import java.util.Scanner;
public class Player{
    Scanner sc = new Scanner(System.in);
    String checkGuess(String e, String f){
        String postGuess = "";
        for(int i = 0; i< f.length(); i++){
            if(e.equals(f.substring(i,i+1))){
                postGuess += e;
            } else if(f.substring(i,i+1).equals(" ")){
                postGuess += " ";
            }else {
                postGuess += "_";
            }
        }
        return postGuess;
    }

}