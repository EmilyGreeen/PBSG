package race;
import roll.RollDice;

/**
 * Décrivez votre classe Halfeling ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Halfeling implements Race
{
    private RollDice die = new RollDice();

    public int[] hmldDieValue = {50,80,95,100,-1};
    public String[] hmldResult = {"Halfling Settlement","Human Settlement","Traveling Caravan","Unusual Homeland","Error"};

    public int[] parentsDieValue = {70,80,90,100};
    public String[] parentsResult = {"Both parents","Father","Mother","Both parents dead"};

    public int[] siblingsDieValue = {30,90,100,-1};
    public int[] bioSiblResults = {die.rollDY(2),die.rollDY(4,1),0,0};
    public int[] adoptedSiblResults = {0,0,0,0};
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
        if(i<2){childhood[5] = bioSiblResults[i]+" biological siblings";}
        else{childhood[5] = "Only child";}
        return childhood;
    }
}
