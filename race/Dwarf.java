package race;
import roll.RollDice;

/**
 * Décrivez votre classe Dwarf ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Dwarf implements Race
{
    public RollDice die = new RollDice();

    public int[] hmldDieValue = {40,80,87,95,100};
    public String[] hmldResult = {"Hills","Underground","Town","City","Unusual Homeland: "};

    public int[] parentsDieValue = {60,73,86,100};
    public String[] parentsResult = {"Both parents","Father","Mother","Both parents dead"};

    public int[] siblingsDieValue = {80,90,95,100};
    public int[] bioSiblResults = {die.rollDY(4),die.rollDY(4,1),die.rollDY(3,-1),0};
    public int[] adoptedSiblResults = {0,0,die.rollDY(3,-1),0};
    public int[] halfSiblResults = {0,0,0,0};

    @Override
    public String[] setEarlyLife(int[] CRR){
        String[] childhood= new String[20];
        int i = 0;                               //UnusualHomelandMod
        while(CRR[2]>hmldDieValue[i]){i++;}         //Homeland set
        childhood[2]=hmldResult[i];
        if(i==4){     
            i = 0;
            while(CRR[4]>Race.unHmldDieValue[i]){i++;}  //Unusual Homeland set
            childhood[3]=Race.unHmldResult[i];
        }
        i=0; 
        while(CRR[5]>parentsDieValue[i]){i++;}      //Parents set
        childhood[4]=parentsResult[i];
        i=0;
        while(CRR[6]>siblingsDieValue[i]){i++;}     //Nb of siblings set
        if(bioSiblResults[i]+adoptedSiblResults[i]>0){
            childhood[5] = bioSiblResults[i]+" biological siblings";
        }
        else{childhood[5] = "Only Child";}
        if(adoptedSiblResults[i]!=0){               //Race of adopted siblings set
            childhood[6] = adoptedSiblResults[i]+" adopted siblings";
            for(i=0;i<adoptedSiblResults[i];i++){
                int j = 0;
                while(CRR[7+i]>Race.adoptedSiblingRaceDieValue[j]){j++;}
                childhood[7+i]="Adopted Sibling #"+(i+1)+"'s Race = "+Race.adoptedSiblingRaceResult[j];
            }
        }
        return childhood;
    }
}
