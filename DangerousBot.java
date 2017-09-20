
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DangerousBot extends Robot
{
    public DangerousBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public void choosePile() {
        testEven();
    }
    
    public void testEven(){
    int numBeepers = 0;
        while(nextToABeeper()){
            pickBeeper();
            numBeepers++;
        }
        if (numBeepers % 2==0){
            turnRight();
            move();
        }
        else{
            turnLeft();
            move();
            
        }
        while(nextToABeeper()){
            pickBeeper();
            
        }
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
}

