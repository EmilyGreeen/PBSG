
/**
 * Write a description of class TESTGAPA here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TESTGAPA
{
    int[][] PPA=new int[81][2];
    int[][] PGA=new int[9][2];
    public TESTGAPA(){
        int counter=0;
        for(int i=1;i<=9;i++){
            for(int j=1;j<=9;j++){
                PPA[counter][0]=i;
                PPA[counter][1]=j;
                counter++;
            }
        }
        /*int k=0;
        while(k<counter){
        System.out.println(PPA[k][0]+" "+PPA[k][1]);
        k++;
        }*/

        counter=0;
        for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                PGA[counter][0]=i;
                PGA[counter][1]=j;
                counter++;
            }
        }
        /*k=0;
        while(k<counter){
        System.out.println(PGA[k][0]+" "+PGA[k][1]);
        k++;
        }*/

        for(int[] pal: PPA){
            for(int[] gal: PGA){
                if(gal[0]-1 <= (pal[0]+3-1)/3 && (pal[0]+3-1)/3 <= gal[0]+1
                && gal[1] == (pal[1]+3-1)/3
                || gal[1]-1 <= (pal[1]+3-1)/3 && (pal[1]+3-1)/3 <= gal[1]+1
                && gal[0] == (pal[0]+3-1)/3
                ){
                        System.out.printf("["+(pal[0]+3-1)/3+","+(pal[1]+3-1)/3+"] is compatible with "
                                         +"["+gal[0]+","+gal[1]+"]\n");
                }
            }
            System.out.printf("/*********/\n");
        }
    }

}
