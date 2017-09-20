


import kareltherobot.*;

/**
 * Write a description of class Template here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoubleBot extends Robot
{
    // instance variables - replace the example below with your own
    public int numBeepers = 0;
    
    /**
     * Constructor for objects of class Template
     */
     public DoubleBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }

    public void doubleBeepers()
    {
        // put your code here
        move();
        countNumberBeepers();
        move();
        placeNumberBeepers();
        move();
    }
    public void countNumberBeepers(){
        while(nextToABeeper()) {
            pickBeeper();
            numBeepers++;
            
        } 
        for(int i=0;i<numBeepers;i++){
            putBeeper();
        }
    }
    public void placeNumberBeepers(){
        for(int i=0; (i-1) <= (2*numBeepers);i++){
            putBeeper();
            
        }
    }
}
