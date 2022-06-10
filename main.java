/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    final static int NBCHARAC =5;
    public main()
    {
        int[][] mean = new int[NBCHARAC][2];
        int[] fMean = {0,0};
        for(int i=0;i<NBCHARAC;i++){
            Character tempCharac = new Character();
            mean[i]=tempCharac.CPValue;
        }
        for(int i=0;i<NBCHARAC;i++){
            fMean[0]+=mean[i][0];
            fMean[1]+=mean[i][1];
        }
        fMean[0]=fMean[0]/NBCHARAC;
        fMean[1]=fMean[1]/NBCHARAC;
        //System.out.println("Mean Alignement value for "+NBCHARAC+" characters = ["+fMean[0]+","+fMean[1]+"]");
    }
}
