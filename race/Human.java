package race;
import roll.RollDice;

/**
 * Décrivez votre classe Human ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Human implements Race
{
    private RollDice die = new RollDice();
    
    public int[] hmldDieValue = {50,85,95,100};
    public String[] hmldResult = {
        "You grew up in a Town.",
        "You grew up in a large City.",
        "You grew up in a Frontier region.",
        "You grew up in an Unusual Homeland for your people:"
    };
    
    
    public int[] parentsDieValue = {50,70,90,100};
    public String[] parentsResult = {
        "Both of your parents are alive.",
        "Only your father is alive.",
        "Only your mother is alive.",
        "Both of your parents are dead."
    };
    
    public int[] siblingsDieValue = {40,70,90,100};
    public int[] bioSiblResults = {die.rollDY(2),die.rollDY(2),die.rollDY(4)+die.rollDY(4),0};
    public int[] adoptedSiblResults = {0,0,0,0};
    public int[] halfSiblResults = {0,die.rollDY(2),0,0};
    
    @Override
    public String[] setEarlyLife(int[] CRR){
        String[] childhood= new String[20];
        int i =0;                          //UnusualHomelandMod
        while(CRR[2]>hmldDieValue[i]){i++;}         //Homeland set
        childhood[2]=hmldResult[i];
        if(i==3){      
            i = 0;
            while(CRR[4]>Race.unHmldDieValue[i]){i++;}  //Unusual Homeland set
            childhood[3]=Race.unHmldResult[i];
        }
        i=0; 
        while(CRR[5]>parentsDieValue[i]){i++;}      //Parents set
        childhood[4]=parentsResult[i];
        i=0;
        while(CRR[6]>siblingsDieValue[i]){i++;}     //nb of Siblings set
        childhood[5] = "You have " + bioSiblResults[i]+" biological siblings";
        if(i==1){
            childhood[9] = "You have " + halfSiblResults[i]+" halfsiblings";
            for(int j=0;j<halfSiblResults[1];j++){     //Race of half siblings set
                if(CRR[7+i]<=50){
                    childhood[10+j]="Half sibling #"+(j+1)+" is half elven";
                }else{
                    childhood[10+j]="Half sibling #"+(j+1)+" is half orc";
                }
            }
        }
        return childhood;
    }
}
