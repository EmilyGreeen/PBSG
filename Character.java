
/**
 * The most abstract construct of a Pathfinder character, backstory wise.
 *
 * @author MrGreen
 * @version 0.5
 */

import clas.*;
import clas.Class;
import draw.DrawAlignement;
import race.*;
import roll.RollDice;

public class Character
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String CName;
    private String CSex;
    private String CRace;
    private Race race;
    private String CHomeland;
    private String CParents;
    private int cOBValue;
    private String CCoB;
    private String CClass;
    private Class clas;
    private String cAlignement;

    private int relationshipEventFlag = 0;
    
    private int nonEvilAlignementFlag = 0;

    private int barbarianFlag = 0;
    private int clerInquiFlag = 0;
    private int druidFlag = 0;
    private int monkFlag = 0;
    private int paladinFlag = 0;

    private String [] childhood = new String[19];
    private String [] adolescence = new String [3];
    private String [] alignement = new String [6];

    private int [] CRollResults = new int[30];
    private RollDice die = new RollDice();

    public int[] CPValue=new int [2];
    private int CP = 0;

    /**
     * Constructeur d'objets de classe Character
     */
    public Character()
    {
        // initialisation des variables d'instance
        CName = "Nott";
        CRollResults = rollCharacterDie();
        /*
         * SEE rollCharacterDie for information on index significance
         */
        switch(CRollResults[0]){
            case 1:
            CSex="Male";
            break;
            case 2:
            CSex="Female";
            break;
        }
        switch(CRollResults[1]){
            case 1:                             //DWARF
            Dwarf dwarf = new Dwarf();
            CRace = "Dwarf";
            race = dwarf;       //race determined 
            setChildhood(dwarf);         
            break;

            case 2:                             //ELF
            Elf elf = new Elf();
            CRace = "Elf";
            race = elf;       //race determined
            setChildhood(elf);
            break;

            case 3:                             //GNOME
            Gnome gnome = new Gnome();
            CRace = "Gnome";
            race = gnome;       //race determined
            setChildhood(gnome);
            break;

            case 4:                             //HALFELF
            HalfElf halfelf = new HalfElf();
            CRace = "Half Elf";
            race = halfelf;       //race determined
            setChildhood(halfelf);
            break;

            case 5:                             //HALFORC
            HalfOrc halforc = new HalfOrc();
            CRace = "Half Orc";
            race = halforc;       //race determined
            setChildhood(halforc);
            break;

            case 6:                             //HALFLING
            Halfeling halfling = new Halfeling();
            CRace = "Halfling";
            race = halfling;       //race determined
            setChildhood(halfling);          
            break;

            case 7:                             //HUMAN
            Human human = new Human();
            CRace = "Human";
            race = human;       //race determined
            setChildhood(human);      
            break;
        }
        switch(CRollResults[18]){
            case 1:                             //Alchemist
            Alchemist alchemist = new Alchemist();
            CClass = "Alchemist";
            clas = alchemist;       //class determined 
            setAdolescence(alchemist);         
            break;

            case 2:
            barbarianFlag=1;
            Barbarian barbarian= new Barbarian();
            CClass = "Barbarian";
            clas = barbarian;       //class determined 
            setAdolescence(barbarian);         
            break;

            case 3:
            Bard bard= new Bard ();
            CClass = "Bard";
            clas = bard;       //class determined 
            setAdolescence(bard); 
            break;

            case 4:
            Cavalier cavalier = new Cavalier ();
            CClass = "Cavalier";
            clas = cavalier;       //class determined 
            setAdolescence(cavalier);         
            break;

            case 5:
            clerInquiFlag=1;
            Cleric cleric= new Cleric ();
            CClass = "Cleric";
            clas = cleric;       //class determined 
            setAdolescence(cleric);         
            break;

            case 6:
            druidFlag=1;
            Druid druid= new Druid ();
            CClass = "Druid";
            clas = druid;       //class determined 
            setAdolescence(druid);         
            break;

            case 7:
            Fighter fighter = new Fighter();
            CClass = "Fighter";
            clas = fighter;       //class determined 
            setAdolescence(fighter);         
            break;

            case 8:
            Gunslinger gunslinger= new Gunslinger();
            CClass = "Gunslinger";
            clas = gunslinger;       //class determined 
            setAdolescence(gunslinger);         
            break;

            case 9:
            clerInquiFlag=1;
            Inquisitor inquisitor = new Inquisitor();
            CClass = "Inquisitor";
            clas = inquisitor;       //class determined 
            setAdolescence(inquisitor);         
            break;

            case 10:
            Magus magus= new Magus();
            CClass = "Magus";
            clas = magus;       //class determined 
            setAdolescence(magus);         
            break;

            case 11:
            monkFlag=1;
            Monk monk= new Monk();
            CClass = "Monk";
            clas = monk;       //class determined 
            setAdolescence(monk);         
            break;

            case 12:
            Oracle oracle= new Oracle();
            CClass = "Oracle";
            clas = oracle;       //class determined 
            setAdolescence(oracle);         
            break;

            case 13:
            paladinFlag=1;
            Paladin paladin= new Paladin();
            CClass = "Paladin";
            clas = paladin;       //class determined 
            setAdolescence(paladin);         
            break;

            case 14:
            Ranger ranger= new Ranger();
            CClass = "Ranger";
            clas = ranger;       //class determined 
            setAdolescence(ranger);         
            break;

            case 15:
            Sorcerer sorcerer = new Sorcerer();
            CClass = "Sorcerer";
            clas = sorcerer;       //class determined 
            setAdolescence(sorcerer);         
            break;

            case 16:
            Summoner summoner = new Summoner();
            CClass = "Summoner";
            clas = summoner;       //class determined 
            setAdolescence(summoner);         
            break;

            case 17:
            Witch witch= new Witch();
            CClass = "Witch";
            clas = witch;       //class determined 
            setAdolescence(witch);         
            break;

            case 18:
            Wizard wizard = new Wizard();
            CClass = "Wizard";
            clas = wizard;       //class determined 
            setAdolescence(wizard);         
            break;
        }
        setAlignement();
        new DrawAlignement(CPValue);
        System.out.println("Love Life: "+setRomanticRelationshipHistory());
        System.out.println("\n");
    }

    public String getName(){
        return CName;
    }

    public void setName(String s){
        CName=s;
    }

    public String getSex(){
        return CSex;
    }

    public void setSex(int i){        
        switch(i){
            case 1:
            CSex="male";
            break;
            case 2:
            CSex="female";
            break;
        }
    }

    public String getRace(){
        return CRace;
    }

    public void setRace(int i){
        switch(i){
            case 1:
            race = new Dwarf();
            CRace = "Dwarf";
            break;
            case 2:
            race = new Elf();
            CRace = "Elf";
            break;
            case 3:
            race = new Gnome();
            CRace = "Gnome";
            break;
            case 4:
            race = new HalfElf();
            CRace = "Half Elf";
            break;
            case 5:
            race = new HalfOrc();
            CRace = "Half Orc";
            break;
            case 6:
            race = new Halfeling();
            CRace = "Halfling";
            break;
            case 7:
            race = new Human();
            CRace = "Human";
            break;
        }
    }

    public String[] setChildhood(Race Cr){
        int i=0;
        childhood = Cr.setEarlyLife(CRollResults);
        childhood[0]=CSex;
        childhood[1]=CRace;

        childhood=setCircumstanceOfBirth(childhood);
        childhood=setMajorChildhoodEvent(childhood);

        for (i=0;i<childhood.length;i++){
            if(childhood[i]!=null){System.out.println("childhood["+i+"] = "+childhood[i]);}
        }

        return childhood;
    }

    public String[] setCircumstanceOfBirth(String[] CH){
        int [] cOBDieValue = {40,65,70,72,77,81,82,84,85,87,88,90,92,94,95,96,97,98,99,100,-1};
        String[] cOBResult =
            {   "Lower-Class Birth",
                "Middle-Class Birth",
                "Noble Birth",
                "Adopted Outside Your Race",
                "Adopted",
                "Bastard Born",
                "Blessed Birth",
                "Born of Violence",
                "Born out of Time",
                "Born into Bondage",
                "Cursed Birth",
                "Dishonored Family",
                "Heir to a Legacy",
                "Left to Die",
                "Marked by the Gods",
                "Energy Infused",
                "Progeny of Power",
                "Prophesied",
                "Reincarneted",
                "The Omen",
                "ERROR"                 
            };

        int i = 0;
        while(CRollResults[9]>cOBDieValue[i]){i++;} //set CoB
        cOBValue=i;
        CCoB=cOBResult[i];
        CH[12]=CCoB;

        switch(cOBValue){
            case 0:
            CH=setParentsProfession(1,CH);
            break;
            case 1:
            CH=setParentsProfession(2,CH);
            break;
            case 2:
            CH=setParentsProfession(3,CH);
            break;
            case 3:
            CH=setParentsProfession(4,CH);
            break;
            case 5:
            if(die.rollDY(2)==1){
                CH[4] = "Father";
            }else{
                CH[4] = "Mother";
            }
            CH=setParentsProfession(5,CH);
            break;
            case 7:
            if(die.rollDY(2)==1){
                CH[4] = "Father";
            }else{
                CH[4] = "Mother";
            }
            CH=setParentsProfession(5,CH);
            break;
            case 9:
            CH=setParentsProfession(0,CH);
            break;
            case 11:
            CH=setParentsProfession(2,CH);
            break;
            case 12:
            CH[4]="Both parents dead";
            break;
            default: 
            CH=setParentsProfession(5,CH);
        }

        return CH;
    }

    public String[] setParentsProfession(int i,String[] CH){
        int [] pPDieValue={5,25,30,34,37,40,55,70,85,95,100,-1};
        String [] pPResult={
                "Parents were Slaves",
                "Parents were Serfs/Peasants",
                "Parents were Entertainers",
                "Parents were Soldiers",
                "Parents were Sailors",
                "Parents were Thieves",
                "Parents were Yeomen",
                "Parents were Tradespeople",
                "Parents were Artisans",
                "Parents were Merchants",
                "Parents were Clergy or Cultists",
                "ERROR"
            };
        int j=0;
        switch(i){
            case 0: //CoB = "Born into Bondage"
            CH[13]="Parents were Slaves";
            break;
            case 1: //CoB = "Lower-Class Birth"
            while(CRollResults[10]>pPDieValue[j]){j++;}
            CH[13]=pPResult[j];
            break;
            case 2: //CoB = "Middle-Class Birth" or "Dishonored Family"
            while(CRollResults[12]+25>pPDieValue[j]){j++;}
            CH[13]=pPResult[j];
            break;
            case 3: //CoB = "Noble Birth"
            CH[15]=setNobleBirth();
            break;
            case 4: //CoB = Adopted Outside Your Race"
            CH[14]=setAdoptiveParentsRace();
            break;
            case 5: //CoB = default
            while(CRollResults[11]>pPDieValue[j]){j++;}
            CH[13]=pPResult[j];
            break;
        }
        return CH;
    }

    public String setNobleBirth(){
        int i = 0;
        int [] nBDieValue={60,78,85,91,96,99,100,-1};
        String [] nBResult={
                "Gentry",
                "Knight",
                "Baron",
                "Count",
                "Duke",
                "Minor Prince",
                "Regent",
                "ERROR"
            };
        while(CRollResults[14]>nBDieValue[i]){i++;}
        return nBResult[i];
    }

    public String setAdoptiveParentsRace(){
        int i = 0;
        int [] aPRieValue={5,10,13,19,25,70,95,100,-1};
        String [] aPRResult={
                "Adopted by Dragons",                   //0
                "Adopted by the Fey",                   //1
                "Raised Among the Dead",                //2
                "Raised by Angels",                     //3
                "Raised by Beasts",                     //4
                "Raised by Civilized Humanoids:(TODO)", //5
                "Raised by Savage Humanoids:(TODO)",    //6
                "Fiends Raised",                        //7
                "ERROR"
            };
        while(CRollResults[13]>aPRieValue[i]){i++;}
        return aPRResult[i];
    }

    public String[] setMajorChildhoodEvent(String[] CH){
        int i = 0;
        int [] mCHEDieValue={5,10,15,20,25,30,35,40,45,50,55,60,65,70,75,80,85,90,95,100,-1};
        String [] mCHEResult={
                "Academy Training",             //1
                "Betrayal",                     //2
                "Bullied",                      //3
                "Competition Champion",         //4
                "Death in the Family",          //5
                "Died",                         //6
                "Fall of a Major Power",        //7
                "Fell in With a Bad Crowd",     //8
                "First Kill",                   //9
                "Troubled First Love",          //10
                "Imprisoned",                   //11
                "Inheritance",                  //12
                "Kidnapped",                    //13
                "Magical Gift",                 //14
                "Major Disaster",               //15
                "Mentorship/Patronage",         //16
                "Met a Fantastic Creature",     //17
                "Ordinary Childhood",           //18
                "Raiders",                      //19
                "The War",                      //20
                "ERROR"
            };
        while(CRollResults[15]>mCHEDieValue[i]){i++;}
        CH[16]=mCHEResult[i];
        switch(i){
            case 9:
            CH[17]="Murder";
            break;
            case 10:
            relationshipEventFlag = 1;
            break;
            case 11:
            CH[17]=setCrime();
            CH[18]="Imprisoned";
            break;
        }
        return CH;
    }

    public String setCrime(){
        int i = 0;
        int [] cDieValue={10,20,30,40,50,60,70,80,90,100,-1};
        String [] cResult={
                "Adultery",
                "Arson",
                "Burglary",
                "Heresy",
                "Minor offense",
                "Murder",
                "Rebellion/Treason",
                "Robbery",
                "Smuggling",
                "Unlawful use of Magic",
                "ERROR"
            };
        while(CRollResults[15]>cDieValue[i]){i++;}
        return cResult[i];
    }

    public String setPunishment(){
        int i = 0;
        int [] pDieValue={10,20,30,40,50,60,70,80,90,100,-1};
        String [] pResult={
                "Beating",
                "Branding",
                "Exile",
                "Fine",
                "Imprisonment",
                "Stocks",
                "Torture",
                "Trial by Combat",
                "Trial by Fire",
                "Trial by Water"
            };
        while(CRollResults[15]>pDieValue[i]){i++;}
        return pResult[i];
    }

    public String [] setAdolescence(Class clas){
        int i = 0;
        adolescence[0]=CClass;
        adolescence[1]=clas.setBackground(CRollResults[19]);
        adolescence[2]=setInfluentialAssociate();

        if(adolescence[0]=="Bard" && adolescence[1]=="For Love: When you were young, you tried to express yourself to your beloved using song or poetry. Driven by desire, you refined your skill and learned to articulate raw emotion in story and song. You gain access to the Ear for Music religion trait and the True Love story feat. You roll a d12 instead of a d20 on Table 1–56: Romantic Relationships.")
        {relationshipEventFlag=1;}
        for (String str : adolescence){
            System.out.println("adolescence["+i+"] = "+str);
            i++;
        }
        return adolescence;
    }

    public String setInfluentialAssociate(){
        int i = 1;
        String [] influentialAssociate = {
                "The Hunter: This person was a lone wolf who nonetheless cautiously allowed you to become a member of her solitary pack. She taught you how to thrive on your own in spite of the many perils and natural dangers of your native environment. You gain access to the Child of Nature religion trait.",
                "The Pariah: You met a disgraced exile, and found in his words and attitudes something that spoke to you. What once seemed true in your religion, society, or family began to appear false the more time you spent with this person, and you quickly learned not to trust everyone you meet—especially among those who would claim to be most deserving of it. You gain access to the Suspicious social trait.",
                "The Confidante: There was a person in your life to whom you could tell anything. She knows your deepest secrets and your emotional weaknesses and vulnerabilities just as you know hers. This person could be a valuable friend and a frightening enemy, so you make sure to never divulge her secrets or give her a reason to do so with yours. You gain access to the Trustworthy social trait. ",
                "The Mentor: You had a mentor who taught you everything worth knowing about life. This could have been the person who taught you the heroic abilities you possess, or simply a kindred spirit who helped form your worldview. You gain access to the Mentored social trait.",
                "The Mercenary: With this person, there was always a cost. No deed was done making a trade for something of equal or greater value. Whether this individual’s actions tended toward good, evil, or pure balance, he was always fair in his dealings. You respected this trait and it influenced your own philosophy. You gain access to the Mercenary social trait. ",
                "The Lover: You had a romantic connection in your adolescent years, and this person deeply influenced your personality. Perhaps this was a first love, a casual partner you grew close to, or the one who got away. The experience bolstered your confidence in romantic interactions even though you often find your thoughts still straying toward that special someone from so long ago. You gain access to the Charming social trait and the True Love story feat.",
                "The Fool: One of your close associates was a clown who mocked propriety and custom, instead engaging in wild and somewhat random actions from time to time. After a while, you learned that there was simple wisdom to this foolery—a careless worldview that taught you how to cast off concern. You gain access to the Unpredictable social trait. ",
                "The Liege Lord: You became close with someone you were bound to serve, be it a minor lord or lady, master (in the case of a slave), prince or princess, king or queen. Though this person held power over you, she held you closer than a subject or servant. As a result, you’re used to dealing with and being close to power, and your name is known among the ranks of the privileged. You gain access to the Influence social trait. ",
                "The Relative: There is a relative you were especially close to. To you, this person was the meaning of family. He helped shepherd you into adulthood, teaching you everything you know about the world. You are bound to this person or his memory, and you strive to keep a promise, vow, or oath that you made to him. You gain access to the Oathbound faith trait. ",
                "The Boss: You once gained employment under an organized and powerful individual with far- reaching influence. When the boss was present, everyone listened. This could have been a military commander, tribal chieftain, guild leader, or gang leader. From the boss, you learned how to make people listen, make them see reason, and keep them in line. You gain access to the Natural-Born Leader social trait.",
                "The Academic: One of your associates had such a lust for knowledge that she could never be satisfied with simple answers or obvious solutions. This desire for knowledge frequently exceeded her need for companionship, but you were the single exception. Through this association you developed a keen appreciation for numbers, geometry, logic, hard study, and problem solving. You gain access to the Mathematical Prodigy magic trait. ",
                "The Criminal: One of your associates committed crimes regularly. He regaled you with many stories of daring robberies and break-ins—and perhaps even murders. You learned most of what you know of the criminal element from him, and he trusted you as a friend. You gain access to the Canter social trait.",
                "The Seer: You were close to a person who claimed to see the future—perhaps an oracle, seer, prophet, or merely some festival charlatan. Whether they’re true or a trick, you’ve seen visions of distant places and of times that may come to pass. The seer’s influence either made you into an optimist with a drive to change the future or a fatalist resigned to accept it. You gain access to the Scholar of the Great Beyond faith trait. ",
                "The Mystic: You were especially close to a holy person in your community who fundamentally changed your life by opening your eyes to the incredible powers that exist beyond the natural world. Regardless of whether you follow a faith, certain religious artifacts, rituals, and texts played a large part in making you the person you are. You gain access to the Child of the Temple faith trait. ",
                "The Dead One: One of your greatest influences was a sentient undead creature, such as a ghost, lich, grave knight, wraith, or vampire. You encountered it on several occasions and survived… mostly unscathed. Through this strange relationship you learned of its mortal life, giving you perspective on your own life. You gain access to the Deathtouched bloodline race trait and the Glimpse Beyond story feat. ",
                "The Fiend: In your adolescent years, you dealt with or were possessed by a fiend who lent you raw power at a time of great need. This experience tainted your body and mind and changed your life. Some part of the demon remains inside you like an old friend, influencing you toward destructive ends. You gain access to the Possessed magic trait and the Damned story feat. ",
                "The Wanderer: You knew someone who traveled from place to place with the changing of the wind, such as a minstrel, convict, merchant, outcast, soldier, or sailor. This person brought you wondrous mementos and told you of all the places he had traveled and the people who lived there, inspiring a wanderlust within you. You gain access to the Worldly social trait. ",
                "The Champion: You were close to someone who excelled at athletic endeavors and tests of strength or skill. Through your friendship or rivalry, you developed the competitive spirit that continues to drive you in everything you do. You gain access to the Ambitious social trait. ",
                "The Craftsperson: One of your major influences cherished perfection in every form of art. This person might have followed any path in life, from craftsperson to artist to assassin. From this person you developed a disciplined mind, a solitary focus, and the ability to create something useful and beautiful. You gain access to the Artisan social trait.",
                "Well-Connected Friend: In your circle of disparate associates, there was someone everyone knew. This person collected friends like trophies, and she had contacts in every social or professional circle. Through this connection, you continue to meet and associate with a wide variety of people in every walk of life. You gain access to the WellInformed halfling race trait (which you may take regardless of your race)."
            };

        while(CRollResults[20]>5*i){i++;}
        if(i-1==5){relationshipEventFlag=1;}
        return influentialAssociate[i-1];
    }

    public int[] setAlignement(){
        int i = 0;
        alignement[0]=setConflict();
        alignement[1]=setSubject();
        alignement[2]=setMotivation();
        alignement[3]=setResolution();
        alignement[4]="Final Conflict Points Tally: "+CP;
        CPValue = setCPValue(CP);
        alignement[5]="Character Alignment: "+cAlignement;
        while(i<=5){
            System.out.println("alignement["+i+"] = "+alignement[i]);
            i++;
        }
        return CPValue;
    }

    public String setConflict(){
        int i = 0;
        String [] cResultString={
                "Minor Failure (CP+1)",
                "Petty Crime (CP+1)",
                "Told a Lie (CP+1)",
                "Broke a Promise (CP+1)",
                "Humilitation (CP+2)",
                "Negligence (CP+2)",
                "Minor Theft (CP+2)",
                "Seducer (CP+3)",
                "Cheater (CP+3)",
                "Betrayal (CP+4)",
                "Malign Associates (CP+4)",
                "Destroyed a Reputation (CP+5)",
                "Major Theft (CP+5)",
                "Corrupted an Innocent (CP+6)",
                "Blackmailed (CP+6)",
                "Destruction (CP+6)",
                "Armed Robbery (CP+6)",
                "Violent Crime (CP+7)",
                "Murder (CP+8)",
                "Mass Murder (CP+12)"
            };
        int [] cResultInt={1,1,1,1,2,2,2,3,3,4,4,5,5,6,6,6,6,7,8,12};

        if(paladinFlag==1){
            CP+=cResultInt[CRollResults[23]-1];
            return cResultString[CRollResults[23]-1];
        }

        CP+=cResultInt[CRollResults[21+nonEvilAlignementFlag]-1];
        return cResultString[CRollResults[21+nonEvilAlignementFlag]-1];

    }

    public String setSubject(){
        String [] sResultString= {
                "Commoner",
                "Merchant",
                "Tradesperson",
                "Artisan",
                "Civic or military official",
                "Noble",
                "Leader",
                "Clergy",
                "Soldier or warrior",
                "Spellcaster",
                "Scoundrel",
                "Child or young person (CP+1)",
                "Family member",
                "Close friend",
                "Lover or former lover",
                "Enemy or rival",
                "Gangster or underworld figure",
                "Adventurer",
                "Humanoid monster",
                "Non-humanoid monster"
            };

        if(CRollResults[24]==12){CP+=1;}
        if(CRollResults[24]==15){relationshipEventFlag=1;}

        return sResultString[CRollResults[24]-1];
    }

    public String setMotivation(){
        String [] mResultString = {
                "Justice (CP+1)",
                "Love (CP+1)",
                "Pressured or Manipulated (CP+2)",
                "Religion (CP+2)",
                "Family (CP+3)",
                "Money (CP+3)",
                "Jealousy (CP+4)",
                "Hatred or Malice (CP+4)",
                "Pleasure (CP+5)",
                "Amusement or Entertainment (CP+5)"
            };
        int [] mResultInt = {1,1,2,2,3,3,4,4,5,5};

        if(paladinFlag==1){
            CP+=mResultInt[CRollResults[27]-1];
            return mResultString[CRollResults[27]-1];
        }

        CP+=mResultInt[CRollResults[25+nonEvilAlignementFlag]-1];
        return mResultString[CRollResults[25+nonEvilAlignementFlag]-1];
    }

    public String setResolution(){
        String [] rResultString = {
                "Regret and Penance (–3 CP)",
                "Sincere Regret (–2 CP)",
                "Secret Regret (–1 CP)",
                "Mixed Feelings (0 CP)",
                "Denial (+1 CP)",
                "No Guilt (+2 CP)", 
                "You Enjoyed It (+3 CP)"
            };
        int [] rResultInt ={-3,-2,-1,0,1,2,3};

        if(paladinFlag==1 || nonEvilAlignementFlag==1){
            CP+=rResultInt[CRollResults[29]-1];
            return rResultString[CRollResults[29]-1];
        }

        CP+=rResultInt[CRollResults[28]-1];
        return rResultString[CRollResults[28]-1];
    }

    public int[] setCPValue(int CP){
        if(CP<1){CP=1;}
        
        int [][] possibleAlignements = new int [CP+1][2];

        for (int i=0;i<CP+1;i++){
            possibleAlignements[i][0]=CP-i;
            possibleAlignements[i][1]=i;
        }

        int surplus=0;
        for(int i=0;i<CP+1;i++){
            if(possibleAlignements[i][0]>9){
                surplus = possibleAlignements[i][0]-9;
                possibleAlignements[i][0]=9;
                possibleAlignements[i][1]+=surplus;
            }
            if(possibleAlignements[i][1]>9){
                surplus = possibleAlignements[i][1]-9;
                possibleAlignements[i][1]=9;
                possibleAlignements[i][0]+=surplus;
            }
            if(possibleAlignements[i][0]>9){
                possibleAlignements[i][0]=9;
            }

            if(possibleAlignements[i][0]<=0){
                possibleAlignements[i][0]=1;
            }
            if(possibleAlignements[i][1]<=0){
                possibleAlignements[i][1]=1;
            }
            System.out.println("possible alignement "+i+": "+"["+possibleAlignements[i][0]+"]["+possibleAlignements[i][1]+"]");
        }

        int alignementResult=die.rollDY(Math.max(CP,1));
        int[] fAlignement = possibleAlignements[alignementResult-1];

        if(monkFlag==1){fAlignement[0]=1;}
        if(barbarianFlag==1 && fAlignement[0]<4){fAlignement[0]=4;}
        if(druidFlag==1){
            if(!(fAlignement[0]>=4 && fAlignement[0]<=6) ||
               !(fAlignement[1]>=4 && fAlignement[1]<=6)){
                   int k = die.rollDY(2)-1;
                   fAlignement[k]=(fAlignement[k]%3)+4;
            }
        }
        
        switch(fAlignement[0]){
            case(1): cAlignement="Lawful";break;
            case(2): cAlignement="Lawful";break;
            case(3): cAlignement="Lawful";break;
            case(4): cAlignement="Neutral";break;
            case(5): cAlignement="Neutral";break;
            case(6): cAlignement="Neutral";break;
            case(7): cAlignement="Chaotic";break;
            case(8): cAlignement="Chaotic";break;
            case(9): cAlignement="Chaotic";break;
        }
        switch(fAlignement[1]){
            case(1): cAlignement+=" Good";  break;
            case(2): cAlignement+=" Good";  break;
            case(3): cAlignement+=" Good";  break;
            case(4): cAlignement+=" Neutral";break;
            case(5): cAlignement+=" Neutral";break;
            case(6): cAlignement+=" Neutral";break;
            case(7): cAlignement+=" Evil";  break;
            case(8): cAlignement+=" Evil";  break;
            case(9): cAlignement+=" Evil";  break;
        }

        return fAlignement;
    }

    public String setReligiousPhilosophy(){
        String rPhi = "";
        String[] rPhiResult={""
            };
        //if(clerInquiFlag==1)
        return rPhi;
    }
    
    public String setRomanticRelationshipHistory(){
        String[] rRHResultString ={
            "One Significant Relationship: You had a true love once, but that time has passed.",
            "A Few Significant Relationships: You've tried to make deep connections with individuals on several occasions, but it's never worked out.",
            "Several Signficant Relationships: You've engaged in a number of partnerships, but for some reason or another your relationships always fail.",
            "Current Lover: You are currently involved in a romantic relationship.",
            "Several Inconsequential Relationships: You have had many lovers but no long-lasting, meaningful relationships.",
            "Experience but Not Substantial Relationships: You've had a fling or two, but have so far shied away from any ties or commitments.",
            "No Experience: You have never experienced any kind of romantic connection whatsoever."
        };
        int[] rRHResultInt={
            2,6,9,12,16,18,20
        };
        
        int i = 0;
        while(CRollResults[30+relationshipEventFlag]>rRHResultInt[i]){i++;}
        return rRHResultString[i];
    }

    public int [] rollCharacterDie(){
        int [] characterDieToRoll = 
            {   2,      //Sex                                   [0]     Y
                7,      //Race                                          Y
                100,    //Homeland                                      Y
                100,    //Foreign Homeland                              Y
                100,    //Unusual Homeland                              Y
                100,    //Parents                               [5]     Y
                100,    //Siblings                                      Y
                100,    //Adopted Siblings #1                           Y
                100,    //Adopted Siblings #2                           Y
                100,    //Cricumstance of birth                         Y
                25,     //Parents Profession - low birth        [10]    Y
                100,    //Parents Profession                            Y
                75,     //Parents Profession - high birth               Y
                100,    //Adoptive Parents race                         Y
                100,    //Nobility                                      Y
                100,    //Major Childhood Event                 [15]    Y
                100,    //Crime                                         Y
                100,    //Punishment                                    Y
                19,     //Class                                         Y
                100,    //Background                                    Y
                100,    //Influencial Associate                 [20]    Y
                20,     //Conflict - All Alignement Allowed             Y
                13,     //Conflict - Non Evil Alignement                Y
                7,      //Conflict - Paladin                            Y
                20,     //Subject                                       Y
                10,     //Motivation - A3                       [25]    Y
                8,      //Motivation - NEA                              Y
                4,      //Motivation - P                                Y
                7,      //Resolution - A3                               Y
                4,      //Resolution - NEA & P                          Y
                20,     //Romantic Relationships                [30]    Y
                12      //Romantic Flag                                 Y
                
            };

        int [] characterDieResults = new int[35];
        for(int i=0; i<31;i++){
            int diceResult=die.rollDY(characterDieToRoll[i]);
            characterDieResults[i]=diceResult;
        }
        return characterDieResults;
    }
}
