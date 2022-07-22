package race;
import roll.RollDice;

/**
 * Décrivez votre classe Gnome ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Gnome implements Race
{
    private RollDice die = new RollDice();

    public int[] hmldDieValue = {30,65,95,100};
    public String[] hmldResult = {
        "You were raised in the Forest.",
        "You grew up in a Town.",
        "You grew up in a large City.",
        "You grew up in an Unusual Homeland for your people:"
    };

    public int[] parentsDieValue = {90,93,96,100};
    public String[] parentsResult = {
        "Both of your parents are alive.",
        "Only your father is alive.",
        "Only your mother is alive.",
        "Both of your parents are dead."
    };

    public int[] siblingsDieValue = {50,60,100,100};
    public int[] bioSiblResults = {die.rollDY(4),die.rollDY(4,-1),0,0};
    public int[] adoptedSiblResults = {0,1,0,0};
    public int[] halfSiblResults = {0,0,0,0};

    @Override
    public String[] setEarlyLife(int[] CRR){
        String[] childhood= new String[20];
        int i =0;                             //UnusualHomelandMod
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
        while(CRR[6]>siblingsDieValue[i]){i++;}     //Nb of siblings set
        childhood[5]= "You're an Only Child";
        if(bioSiblResults[i]>0){childhood[5] ="You have " + bioSiblResults[i]+" biological siblings";}
        if(i==1){
            int j = 0;
            childhood[6] = "You have one adopted sibling.";
            while(CRR[7]>Race.adoptedSiblingRaceDieValue[j]){j++;}  //Race of adopted sibling set
            childhood[7]="Adopted Sibling's Race = "+Race.adoptedSiblingRaceResult[j];
        }
        return childhood;
        }
    }
