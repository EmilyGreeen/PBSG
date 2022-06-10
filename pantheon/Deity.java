package pantheon;

/**
 * Write a description of class Deities2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Deity
{
    public String dName;
    public int[] dAlignment = new int[2];
    public String preferedRaces;
    public String[] domains;
    public String favoredWeapon;
    public String[] sacredColord;
    public int featFlag;
    public int featReference;

    public Deity(   String dName1, int[] dAlignment1, String preferedRaces1, 
                    String[] domains1, String favoredWeapon1,
                    String[] sacredColord1){
        this.dName=dName1;
        this.dAlignment=dAlignment1;
        this.preferedRaces=preferedRaces1;
        this.domains=domains1;
        this.favoredWeapon=favoredWeapon1;
        this.sacredColord=sacredColord1;
        featFlag=0;                     //Does the religious philosophy give access to a feat?
                                        // 0->no, 1->yes    
        featReference=-1;               //feature TODO accesses feat given by rP
    }
}
