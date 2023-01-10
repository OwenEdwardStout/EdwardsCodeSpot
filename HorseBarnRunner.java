import java.util.ArrayList;

/*
 * Activity 3.7.3
 */
public class HorseBarnRunner
{
  public static void main(String[] args)
  {
    //Initialize instances and variables
    ArrayList<String> HorseList = new ArrayList<String>();
    HorseList.add("Fortnite");
    HorseList.add("Pubg");
    HorseList.add("Minecraft");
    HorseList.add("F1 2023");
    HorseList.add("Apex Legends");
    HorseList.add("Rainbow Six Siege");
    HorseList.add("Roblox");
    HorseList.add("Pokemon Gopher");
    HorseList.add("Roblox");
    HorseList.add("Modern Warfare");
    HorseList.add("Fifa 2007");

    ArrayList<String> HorseRandom = new ArrayList<String>();
    while(HorseList.size()>0){
    if((int)(Math.random()*HorseList.size())==0){
      HorseRandom.add(HorseList.get(0));
      HorseList.remove(0); } else 
      if((int)(Math.random()*HorseList.size())==1){
        HorseRandom.add(HorseList.get(1));
        HorseList.remove(1); } else
       if((int)(Math.random()*HorseList.size())==2){
          HorseRandom.add(HorseList.get(2));
          HorseList.remove(2); } else
          if((int)(Math.random()*HorseList.size())==3){
            HorseRandom.add(HorseList.get(3));
            HorseList.remove(3); } else
            if((int)(Math.random()*HorseList.size())==4){
              HorseRandom.add(HorseList.get(4));
              HorseList.remove(4); } else
              if((int)(Math.random()*HorseList.size())==5){
                HorseRandom.add(HorseList.get(5));
                HorseList.remove(5); } else
                if((int)(Math.random()*HorseList.size())==6){
                  HorseRandom.add(HorseList.get(6));
                  HorseList.remove(6); } else
                  if((int)(Math.random()*HorseList.size())==7){
                    HorseRandom.add(HorseList.get(7));
                    HorseList.remove(7); } else
                    if((int)(Math.random()*HorseList.size())==8){
                      HorseRandom.add(HorseList.get(8));
                      HorseList.remove(8); } else 
                      if((int)(Math.random()*HorseList.size())==9){
                        HorseRandom.add(HorseList.get(9));
                        HorseList.remove(9); } 
                      }
                      HorseRandom.remove((0));
    
    System.out.println("\nWelcome to the barn! Here are your horses\n-------------------------");

    while(HorseRandom.size()>=2){
      System.out.println(HorseRandom.get(0)+ " and " + HorseRandom.get(1));
      HorseRandom.remove(0);
      HorseRandom.remove(0);
    }
    if(HorseRandom.size()==1){
      System.out.print(HorseRandom.get(0) + " is alone :(");
    } else {System.out.print("No horses alone!");}


  }
} 