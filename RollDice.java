import java.util.Random;

/**
 * Defines methods for rolls and random events.
 *
 * @author MrGreen
 * @version 0.1
 */
public class RollDice
{
    Random dice = new Random();
    
    /**
     * Constructeur d'objets de classe Random
     */
    public RollDice(){}

    /**
     * Method to roll a dice with y sides.
     *
     * @param  y   number of sides on the rolled dice
     * @return     the roll of a y-sided dice
     */
    public int rollDY(int y)
    {
        int roll = dice.nextInt(y)+1;
        return roll;
    }
    
    public int rollDY(int y, int x){
        int roll = dice.nextInt(y)+1+x;
        return roll;
    }
}
