
/**
 * Décrivez votre classe HalfElf ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class HalfElf implements Race
{
    private RollDice die = new RollDice();

    public int[] hmldDieValue = {25,75,95,100,-1};
    public String[] hmldResult = {"Elven Homeland: ","Human Homeland: ","Forest","Unusual Homeland: ","Error"};
    public int[] elfHmldDieValue = {60,80,95,100,-1};
    public String[] elfHmldResult = {"Forest","City","Town","Unusual Homeland: ","Error"};
    public int[] humanHmldDieValue = {50,85,95,100,-1};
    public String[] humanHmldResult = {"Town","City","Frontier","Unusual Homeland: ","Error"};

    public int[] parentsDieValue = {21,38,55,72,89,100};
    public String[] parentsResult = {"Both parents","Human Father","Elven Father","Human Mother","Elven Mother","Both parents dead"};

    public int[] siblingsDieValue = {20,30,100,100};
    public int[] bioSiblResults = {0,1,0,0};
    public int[] adoptedSiblResults = {0,0,0,0};
    public int[] halfSiblResults = {die.rollDY(2),0,0,0};

    @Override
    public String[] setEarlyLife(int[] CRR){
        String[] childhood= new String[20];
        int i =0;                              //Foreign/UnusualHomelandMod
        while(CRR[2]>hmldDieValue[i]){i++;}         //Homeland set
        childhood[2]=hmldResult[i];
        do{                     //Foreign/UnusualHomeland loop
            switch(i){                              
                case 0:         //Foreign Homeland set
                    i = 0;
                    while(CRR[3]>elfHmldDieValue[i]){i++;}
                    if(i==3){continue;}    //Foreign & Unusual Homeland safety net
                    childhood[3]=elfHmldResult[i];
                    break;
                case 1:         //Foreign Homeland set
                    i = 0;
                    while(CRR[3]>humanHmldDieValue[i]){i++;}
                    if(i==3){continue;}    //Foreign & Unusual Homeland safety net
                    childhood[3]=humanHmldResult[i];
                    break;
                case 3:         //Unusual Homeland set
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
        while(CRR[5]>parentsDieValue[i]){i++;}      //Parents set
        childhood[4]=parentsResult[i];
        i=0;
        while(CRR[6]>siblingsDieValue[i]){i++;}     //Nb of siblings set
        if(i==0){
            childhood[9] = halfSiblResults[0]+" halfsiblings";
            for(i=0; i<halfSiblResults[0];i++){     //Race of half siblings set
                if(CRR[7+i]<=50){
                    childhood[10+i]="Half sibling #"+(i+1)+" is elven";
                }else{
                    childhood[10+i]="Half sibling #"+(i+1)+" is human";
                }
            }
        }

        else if(i==1){childhood[5] ="1 biological half-elven sibling";}
        else{childhood[5] = "Only child";}
        return childhood;
    }
}
