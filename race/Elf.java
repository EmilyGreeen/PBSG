package race;
import roll.RollDice;

/**
 * Décrivez votre classe Elf ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Elf implements Race
{
    private RollDice die = new RollDice();

    public int[] hmldDieValue = {60,80,95,100};
    public String[] hmldResult = {
        "You were raised in the Forest.",
        "You grew up in a large elven City.",
        "You grew up in an elven Town.",
        "You grew up in an Unusual Homeland for your people:"
    };

    public int[] parentsDieValue = {79,87,95,100};
    public String[] parentsResult = {
        "Both of your parents are alive.",
        "Only your father is alive.",
        "Only your mother is alive.",
        "Both of your parents are dead."
    };

    public int[] siblingsDieValue = {80,85,90,100};
    public int[] bioSiblResults = {die.rollDY(2),die.rollDY(4,1),die.rollDY(4,1),0};
    public int[] adoptedSiblResults = {0,0,die.rollDY(3,-1),0};
    public int[] halfSiblResults = {0,0,die.rollDY(3,-1),0};

    @Override
    public String[] setEarlyLife(int[] CRR){
        String[] childhood= new String[20];
        int i =0;                                //UnusualHomelandMod
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
        if(bioSiblResults[i]>0){childhood[5] = "You have " + bioSiblResults[i]+" biological siblings";}
        if(adoptedSiblResults[i]>0){childhood[6] = "You have " + adoptedSiblResults[i]+" adopted siblings";}
        for(int k=0;k<adoptedSiblResults[i];k++){ //Race of adopted siblings set
            int j = 0;
            while(CRR[7+k]>Race.adoptedSiblingRaceDieValue[j]){j++;}
            childhood[7+k]="Adopted Sibling #"+(k+1)+"'s Race = "+Race.adoptedSiblingRaceResult[j];
        }
        if(halfSiblResults[i]>0){childhood[9] = halfSiblResults[i]+" half-elven siblings";}
        if(i==3){childhood[5]="You're an Only child";}
        return childhood;
    }
}
