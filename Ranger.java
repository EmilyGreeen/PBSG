
/**
 * Write a description of class Ranger here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ranger implements Class
{
    public int i = 1;
    @Override
    public String setBackground(int CRR){
        String[] bGResult={    
                "An Eye for an Eye: The choice of your favored enemy was nothing more than simple vengeance. Perhaps you lost a loved one, family, or even a whole community to the vicious rampaging of a ferocious beast, or saw your entire homeland swallowed up by monstrous hordes. No matter the reason, your drive to hunt down and destroy creatures of their kind won’t be sated so long as even one lives. You gain access to the Tireless Avenger faith trait and the Foeslayer story feat. ",
                "Ancient Hatred: The history of your people is a saga of struggle against another race. Though common among elves and orcs or dwarves and giants, many different races can have such longstanding animosity. Your choice of a favored enemy was a simple outgrowth of this racial antipathy. You gain access to the Knowing the Enemy social trait. ",
                "Big Game Hunter: Whether you sought out the thrill of hunting large prey or merely grew up in the shadows of creatures large enough to crush an entire village with a careless step, you have learned how to be quick and to size up weaknesses in those behemoths who seem to have none. You gain access to the Evasive Sting combat trait.",
                "Blood Cleansing: Either you have forsaken your kinsfolk or they have forsaken you. Maybe you grew up among a wicked or corrupt people who you needed to escape, or maybe they exiled you for being different. Whatever the case, your own kind are now your favored enemy, much to your continued chagrin or morbid amusement. You gain access to the Scarred Descendant combat trait.",
                "Bounty Hunter: You have always been good at finding and extracting people from their hidey-holes. Most likely you hunt humanoids of either your own subtype or of one common to your region. You gain access to the Easy Way or the Hard Way combat trait and the Town Tamer story feat. ",
                "Detached Observer: You set yourself apart with a pall of cold logic that allows you to see weaknesses in members of your own race that you strive not to succumb to yourself. Most likely, you pick your own race as your dominant favored enemy, and you excel as a spy or assassin paid to capture enemies of your organization. You gain access to the Cold and Calculating combat trait. ",
                "Divine Purpose: Not all those who hear the voices of the gods can distill that echo into magical power like clerics or oracles. These whispers of belief encouraged you to track and hunt those creatures who pose the greatest threat to your faith. Perhaps you’re a good ranger who hunts the undead or devotes effort to slaying fiends, or you could choose to target good fey and celestials, emboldened by divine invective. You gain access to the Faith’s Hunter combat trait. ",
                "Nightmare Slayer: From an early age, you stood up against some of the most terrifying creatures imaginable, facing off against creatures most mortals only dream of in their wildest nightmares. Possibly hailing from lands besieged by dragons or plagued by the living dead, you are not only resistent to the fear such creatures normally engender, but you live to show your enemies the face of the unafraid. You gain access to the Fearless Defiance faith trait.",
                "Opportunist: You are an expert in creatures both common and exotic, particularly in terms of what valuable items you can harvest from their remains. The natural world exists for the benefit of those who know what to take, and you have learned how to scavenge pelts, toxins, and even rare spell components from your defeated foes. You might pick animals, magical beasts, or dragons as your dominant favored enemy—or humanoids if you’re a particularly grisly trophy collector. You gain access to the Harvester social trait. ",
                "Survivalist: You were orphaned at a young age and left to fend for yourself in the wilds, or simply lived a life at the edge of society that required a constant scrabble for basic existence. You probably have animals or magical beasts (the edible ones) as your dominant favored enemy, and are adept at lying in wait and springing into action. You gain access to the Hunter’s Knack combat trait.",
                "ERROR"
            };
        while(CRR>i*10){i++;}
        return bGResult[i-1];
    }
}
