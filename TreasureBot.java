
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class TreasureBot extends Robot
{
    public TreasureBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void findTreasure() {
       countBeeper();
    }
    
    public void countBeeper(){
        int numBeepers=0;
        while(nextToABeeper()){
            pickBeeper();
            numBeepers++;
        }
        if (numBeepers ==1){
            //go north
            faceNorth();
        }
        if (numBeepers ==2){
            //go east
            faceEast();
        }
        if (numBeepers ==3){
            //go south
            faceSouth();
        }
        if (numBeepers ==4){
            //go west
            faceSouth();
        }
    }
    public void faceNorth(){
        while (!facingNorth()){
            turnLeft();
        }
    }
    public void faceSouth(){
        while (!facingSouth()){
            turnLeft();
        }
    }
    public void faceEast(){
        while (!facingEast()){
            turnLeft();
        }
    }
    public void faceWest(){
        while (!facingWest()){
            turnLeft();
        }
    }
}

