import java.util.*;

public class Players{
private int noOfPlayers;
private Map<String,Integer> nameOfPlayers= new HashMap<String,Integer>();
public Players(int noOfPlayers){
  this.noOfPlayers=noOfPlayers;
}
public void addNameOfPlayer(String Name,int num){
  nameOfPlayers.put(name,num);
}
public Map<String,Integer> getNoOfPlayers{
  return nameOfPlayers;
}
 public int getnoOfPlayers{
   return noOfPlayers;
 }
}
