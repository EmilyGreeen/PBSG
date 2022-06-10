
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
    public String[] hmldResult = {"Subterranean","Orc Settlement","Human Homeland: ","No Homeland","Unusual Homeland"};
    public int[] humanHmldDieValue = {50,85,95,100,-1};
    public String[] humanHmldResult = {"Town","City","Frontier","Unusual Homeland","Error"};

    public int[] parentsDieValue = {11,23,35,47,59,100};
    public String[] parentsResult = {"Both parents","Orc Father","Human Father","Human Mother","Orc Mother","Both parents dead"};

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
        if(i==0){childhood[9] = halfSiblResults[i]+" orc halfsiblings";}   //HalfSiblings set
        if(i==1){childhood[9] = halfSiblResults[i]+" human halfsiblings";} //HalfSiblings set
        if(i==2){childhood[5] = "1 biological half orcish sibling";}   //Biological sibling set
        if(i==3){childhood[5] = "Only child";}
        return childhood;
    }
}
