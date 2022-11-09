import java.util.Scanner;
import java.io.File;
public class Board{




 private String loadPhrase()
  {
    String tempPhrase = "";
    
    int numOfLines = 0;
    tempPhrase = "how are you";
    

  
    try 
    {
      
      Scanner sc = new Scanner(new File("/workspace/EdwardsCodeSpot/WOF/phrases.txt"));
      while (sc.hasNextLine())
      {
        tempPhrase = sc.nextLine().trim();
        numOfLines++;
      }
    } catch(Exception e) { System.out.println("Error reading or parsing phrases.txt"); }
    
		int randomInt = (int) ((Math.random() * numOfLines) + 1);
    
    try 
    {
      int count = 0;
      Scanner sc = new Scanner(new File("/workspace/EdwardsCodeSpot/WOF/phrases.txt"));
      while (sc.hasNextLine())
      {
        count++;
        String temp = sc.nextLine().trim();
        if (count == randomInt)
        {
          tempPhrase = temp;
        }
      }
    } catch (Exception e) { System.out.println("Error reading or parsing phrases.txt"); }
    return tempPhrase;
  }
  public String replacePhrase(String e){
    String showPhrase = "";
    String character;
    for (int i = 0; i < e.length(); i++){
      character = e.substring(i,i+1);
      if (character.equals(" ")){
        showPhrase += " ";
      }
      else{
        showPhrase += "_";
      }
    }
    return showPhrase;
  }
  }