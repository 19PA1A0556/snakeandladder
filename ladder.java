import java.util.*;

public class Ladders{
    private int noOfLadders;
    private Map<Integer, Integer> startAndEnds = new HashMap<Integer, Integer>();
    
    public Snakes(int noOfLadders){
        this.noOfLadders = noOfLadders;
    }
    
    public void addStartAndEnds(int start,int end){
        startAnEnd.put(start,end);
    }
    public int getNoOfLadders(){
        return this.noOfLadders;
    }
    public Map<Integer, Integer> getStartAndEnds(){
        return StartAndEnds;
    }
    
}
