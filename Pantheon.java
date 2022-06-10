
/**
 * Write a description of class Pantheon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pantheon
{
    private Deity[] pantheon;
    private String[] deitiesName={    
            "Abadar",
            "Achaekek",
            "Alseta",                                   //Elf
            "Angradd",                                  //Dwarf
            "Apsu",                                     //Draconic
            "Asmodeus",          
            "Besmara",                
            "Bolka",                                    //Dwarf
            "Brigh",            
            "Calistria",                                //Elf
            "Cayden Cailean",        
            "Cernunnos",                                //Elf
            "Chaldira Zuzaristan",                      //Halfling
            "Dahak",                    //CN, NE, CE    //Draconic
            "Desna",                    //NG, CG, CN    //Elf
            "Dranngvit",                //L, NN         //Dwarf
            "Dretha",                   //CN, NE, CE    //Orc
            "Droskar",                  //E             //Dwarf
            "Erastil",                  //LG, NG, LN
            "Findeladlara",             //NG, CG, CN    //Elf
            "Folgrit",                  //LG, NG, LN    //Dwarf
            "Ghlaunder",                //CN, NE, CE
            "Gorum",                    //C, NN
            "Gozreh",                   //N
            "Groetus",                  //C, NN
            "Grundinnar",               //LG, NG, LN    //Dwarf
            "Gyronna",                  //CN, NE, CE
            "Hanspur",                  //C, NN
            "Iomedae",                  //LG, NG, LN
            "Irori",                    //L, NN
            "Ketephys",                 //NG, CG, CN    //Elf
            "Kols",                     //L, NN         //Dwarf
            "Kurgress",                 //G, NN
            "Lamashtu",                 //CN, NE, CE
            "Lanishra",                 //CN, NE, CE    //Orc
            "Magrim",                   //L, NN         //Dwarf
            "Milani",                   //NG, CG, CN
            "Naderi",                   //N
            "Nethys",                   //N             //Elf
            "Nivi Rhombodazzle",        //N             //Gnome
            "Norgorber",                //E, NN
            "Nulgreth",                 //CN, NE, CE    //Orc
            "Pharasma",                 //N
            "Razmir",                   //LN, LE, NE
            "Rovagug",                  //CN, NE, CE
            "Rull",                     //CN, NE, CE    //Orc
            "Sarenrae",                 //G, NN
            "Sezelrian",                //CN, NE, CE    //Orc
            "Shelyn",                   //G, NN
            "Sivanah",                  //N
            "Thamir Gixx",              //CN, NE, CE    //Halfling
            "Torag",                    //LG, NG, LN    //Dwarf
            "Trudd",                    //G, NN         //Dwarf
            "Urgathoa",                 //E, NN
            "Varg",                     //CN, NE, CE    //Orc
            "Verex",                    //CN, NE, CE    //Orc
            "Yuelral",                  //G, NN         //Elf
            "Zagresh",                  //CN, NE, CE    //Orc
            "Zon-Kuthon",               //LN, LE, NE
            "Zyphus",                   //E, NN
            "No Deity",
            "Undecided"
        };  

    private int[][] deitiesAlignment={
            {2,1},
            {3,1},
            {2,1},      //Elf
            {1,1},      //Dwarf
            {1,1},      //Draconic
            {3,1},
            {2,3},
            {1,2},      //Dwarf
            {2,2},
            {2,3},      //Elf
            {1,3},
            {1,3},      //Elf
            {1,2},      //Halfling
            {3,3},      //Draconic
            {1,3},
            {1,3},      //Elf
            {2,1},      //Dwarf
            {3,3},      //Orc
            {1,1},      //Dwarf
            {1,3},      //Elf
            {1,1},      //Dwarf
            {3,3},
            {2,3},
            {2,2},
            {2,3},
            {1,1},      //Dwarf
            {3,3},
            {2,3},
            {1,1},
            {2,1},
            {1,3},      //Elf
            {2,1},      //Dwarf
            {1,2},
            {3,3},
            {3,3},      //Orc
            {2,1},      //Dwarf
            {1,3},
            {2,2},
            {2,2},      //Elf
            {2,2},      //Gnome
            {3,2},
            {3,3},      //Orc
            {2,2},
            {3,1},
            {3,3},
            {3,3},      //Orc
            {1,2},
            {3,3},      //Orc
            {1,2},
            {2,2},
            {3,3},      //Halfling
            {1,1},      //Dwarf
            {1,2},      //Dwarf
            {3,2},
            {3,3},      //Orc
            {3,3},      //Orc
            {1,2},      //Elf
            {3,3},      //Orc
            {3,1},
            {3,2},
            {0,0},
            {0,0}
        };

    public String[] preferedRace={
            null,
            null,
            "Elf",
            "Dwarf",
            "Dragon",
            null,
            null,
            "Dwarf",
            "Half-Elf,Half-Orc,Human,Gnome",
            "Elf",
            null,
            "Elf",
            "Halfling",
            "Dragon",
            null,
            "Dwarf",
            "Orc",
            "Dwarf",
            null,
            "Elf",
            "Dwarf",
            null,
            null,
            null,
            null,
            "Dwarf",
            null,
            null,
            null,
            null,
            "Elf",
            "Dwarf",
            null,
            null,
            "Orc",
            "Dwarf",
            "Human, Half-Orc, Half-Elf",
            null,
            null,
            "Gnome",
            null,
            "Orc",
            null,
            null,
            null,
            "Orc",
            null,
            "Orc",
            null,
            null,
            "Halfling",
            "Dwarf",
            "Dwarf",
            null,
            "Orc",
            "Orc",
            "Elf",
            null,
            "Orc",
            null,
            null,
            null
        };

    public String[][] domains={
            {"cities","earth","travel","weather"},                  //0
            {"death","evil","law","trickery","war"},
            {"community","law","magic","protection"},
            {"fire","good","law","war"},
            {"artifice","good","law","travel"},
            {"evil","fire","law","magic","trickery"},               //5
            {"chaos","trickery","war","water","weather"},
            {"charm","community","good","healing"},
            {"artifice","fire","earth","knowledge"},
            {"chaos","charm","knowledge","luck","trickery"},
            {"chaos","charm","good","strength","travel"},           //10
            {"animal","chaos","good","plant"},
            {"good","luck","trickery","war"},
            {"chaos","destruction","evil","trickery"},
            {"chaos","good","liberation","luck","travel"},
            {"knowledge","law","strength","travel"},                //15
            {"chaos","community","evil","protection"},
            {"artifice","charm","darkness","evil","trickery"},
            {"animal","community","good","law","plant"},
            {"air","artifice","chaos","community","good"},
            {"community","law","nobility","good"},                  //20
            {"air","animal","chaos","destruction","evil"},
            {"chaos","destruction","glory","strength","war"},
            {"air","animal","plant","water","weather"},
            {"chaos","darkness","destruction","madness","void"},
            {"community","good","law","protection"},                //25
            {"chaos","destruction","evil","madness"},
            {"chaos","death","travel","water"},
            {"glory","good","law","sun","war"},
            {"healing","knowledge","law","rune","strength"},
            {"animal","chaos","good","plant","weather"},            //30
            {"glory","law","nobility","strength"},
            {"community","good","luck","strength","travel"},
            {"chaos","evil","madness","strength","trickery"},
            {"chaos","evil","leadership","strength"},
            {"law","earth","repose","rune"},                        //35
            {"chaos","good","healing","liberation","protection"},
            {"charm","nobility","repose","water"},
            {"destruction","knowledge","magic","protection","rune"},
            {"community","earth","luck","trickery"},
            {"charm","death","evil","knowledge","trickery"},        //40
            {"chaos","evil","strength","war"},
            {"death","healing","knowledge","repose","water"},
            {"charm","evil","law","trickery"},
            {"chaos","evil","destruction","war","weather"},
            {"air","chaos","evil","weather"},                       //45
            {"fire","glory","good","healing","sun"},
            {"chaos","evil","fire","magic"},
            {"air","charm","good","luck","protection"},
            {"knowledge","madness","magic","rune","trickery"},
            {"chaos","evil","nobility","trickery"},                 //50
            {"artifice","earth","good","law","protection"},
            {"good","nobility","protection","strength"},
            {"death","evil","magic","strength","war"},
            {"chaos","earth","evil","war"},
            {"chaos","charm","evil","trickery"},                    //55
            {"artifice","earth","good","knowledge","magic"},
            {"darkness","death","destruction","evil","law"},
            {"chaos","death","destruction","evil"},
            {"death","destruction","evil","plant","war"},
            {null},                                                 //60
            {null}
        };

    public String[] preferedWeapons={
            "crossbow",                 //0
            "sawtooth sabre",
            "dagger",
            "greataxe",
            "bite/quaterstaff",
            "mace",                         //5
            "rapier",
            "mace",
            "light hammer",
            "whip",
            "rapier",                                  //10
            "longbow",
            "shortsword",
            "bite/whip",
            "starknife",
            "light pick",                  //15
            "scimitar",
            "light hammer",
            "longbow, sling(for halflings)",
            "quarterstaff",
            "quarterstaff",                    //20
            "spear",
            "greatsword",
            "trident",
            "heavy flail",
            "hammer",                   //25
            "dagger",
            "trident",
            "longsword",
            "unarmed",
            "bow",                  //30
            "hammer",
            "javelin",
            "falchion",
            "heavy flail",
            "hammer",                   //35
            "morning star",
            "dagger",
            "quarterstaff",
            "light hammer",
            "shortsword",               //40
            "orc double axe",
            "dagger",
            "none",
            "greataxe",
            "falchion",                 //45
            "scimitar",
            "heavy mace",
            "glaive",
            "bladed scarf",
            "dagger",                   //50
            "warhammer",
            "warhammer",
            "scythe",
            "greataxe",
            "battleaxe",                //55
            "dagger",
            "spiked chain",
            "great club",
            "heavy pick",
            "none",                 //60
            "none"
        };

    public String[][] preferedColors={
            {"gold"},                   //0
            {"red"},
            {"brown","gray"},
            {"gray","red"},
            {"metal"},
            {"black","red"},            //5
            {"black","white"},
            {"gold","green"},
            {"bronze","silver"},
            {"black","yellow"},
            {"silver","tan"},           //10
            {"brown","green"},
            {"green","red"},
            {"chromatic"},
            {"blue","white"},
            {"gold","red"},             //15
            {"brown","green"},
            {"gray","orange"},
            {"brown","green"},
            {"blue","gold"},
            {"gray","orange"},          //20
            {"gray","red"},
            {"gray","red"},
            {"blue","green"},
            {null},
            {"gold","white"},           //25
            {"pink","white"},
            {"blue","gold"},
            {"red","white"},
            {"blue","white"},
            {"gold","silver"},          //30
            {"brown","green"},
            {"gold","white"},
            {"red","yellow"},
            {"green","purple"},
            {"black","white"},          //35
            {"red","white"},
            {"blue","red"},
            {"black","white"},
            {"gray","red"},
            {"black","gray"},           //40
            {"green","red"},
            {"blue","white"},
            {"gray","blue"},
            {"brown","red"},
            {"green","yellow"},         //45
            {"blue","gold"},
            {"green","orange"},
            {"all"},
            {"gray"},
            {"black","brown"},          //50
            {"gold","gray"},
            {"brown","gray"},
            {"red","green"},
            {"green","iron gray"},
            {"gold","green"},           //55
            {"blue","green","red"},
            {"dark gray","red"},
            {"black","green"},
            {"ivory","red"},
            {null},                     //60
            {null},
        };

    public int NBGODS=deitiesName.length;
    public Deity[] createPantheon(){
        pantheon = new Deity[NBGODS];
        for (int i =  0; i < NBGODS; i++){
            String tempName=deitiesName[i];
            System.out.println(deitiesName[i]);
            int[] tempAlign=deitiesAlignment[i];
            String tempRace=preferedRace[i];
            String[] tempDomains=domains[i];
            String tempWeapon=preferedWeapons[i];
            String[] tempColors=preferedColors[i];
            
            /**********/
            
            Deity tempDeity = new Deity(tempName,
                    tempAlign,
                    tempRace,
                    tempDomains,
                    tempWeapon,
                    tempColors);
                    
            /**********/
            
            pantheon[i]=tempDeity;
        }
        return pantheon;
    }
}
