package race;
import roll.RollDice;

/**
 * Décrivez votre classe HalfOrc ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class HalfOrc implements Race
{
    private RollDice die = new RollDice();

    public int[] hmldDieValue = {25,60,75,90,100};
    public String[] hmldResult = {
        "You were raised in a deam Subterranean home.",
        "You were raised in an Orc Settlement.",
        "You were raised in a Human Homeland: ",
        "You have No True Homeland, and have always been on the run.",
        "You grew up in an Unusual Homeland for your people:"
    };

    public int[] humanHmldDieValue = {50,85,100};
    public String[] humanHmldResult = {
        "You grew up in a Town.",
        "You grew up in a large City.",
        "You grew up in a Frontier region."
    };

    public int[] parentsDieValue = {11,23,35,47,59,100};
    public String[] parentsResult = {
        "Both of your parents are alive.",
        "Only your father(orc) is alive.",
        "Only your father(human) is alive.",
        "Only your mother(human) is alive.",
        "Only your mother(orc) is alive.",
        "Both of your parents are dead."
    };

    public int[] siblingsDieValue = {60,70,80,100};
    public int[] bioSiblResults = {0,0,1,0};
    public int[] adoptedSiblResults = {0,0,0,0};
    public int[] halfSiblResults = {die.rollDY(6,1),die.rollDY(4),0,0};

    @Override
    public String[] setEarlyLife(int[] CRR){
        String[] childhood= new String[20];
        int i =0;                              //Foreign/UnusualHomelandMod
        while(CRR[2]>hmldDieValue[i]){i++;}         //Homeland set
        childhood[2]=hmldResult[i];
        do{                     //Foreign/UnusualHomeland loop
            switch(i){
                case 3:
                    i = 0;
                    while(CRR[4]>humanHmldDieValue[i]){i++;}  //Foreign Homeland set
                    if(i==3){i=4; continue;}
                    childhood[3]=humanHmldResult[i];
                    break;
                case 4:
                    i = 0;
                    while(CRR[4]>Race.unHmldDieValue[i]){i++;}  //Unusual Homeland set
                    childhood[3]=Race.unHmldResult[i];
                    break;
                default:
                    break;
            }
            break;
        }while(true);
        i=0; 
        while(CRR[5]>parentsDieValue[i]){i++;}      //Parent set
        childhood[4]=parentsResult[i];
        i=0;
        while(CRR[6]>siblingsDieValue[i]){i++;}     //Nb of siblings set
        if(i==0){childhood[9] = "You have " + halfSiblResults[i]+" orc halfsiblings";}   //HalfSiblings set
        if(i==1){childhood[9] = "You have " + halfSiblResults[i]+" human halfsiblings";} //HalfSiblings set
        if(i==2){childhood[5] = "You have one biological half orcish sibling";}   //Biological sibling set
        if(i==3){childhood[5] = "You're an Only child";}
        return childhood;
    }
}
