
/**
 * Write a description of class Rogue here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rogue implements Class
{
    public int i = 1;
    @Override
    public String setBackground(int CRR){
        String[] bGResult={    
                "Gang War: Growing up in the backstreets of an urban jungle, you were forced to choose between surviving as a predator or suffering as prey. You affiliated with a guild, gang, or group of thieves and thugs, carrying out illicit missions to further their interests and sabotage those of rival gangs. You gain access to the Dirty Fighter combat trait. ",
                "Greed: No matter how much or little you had growing up, it was never enough. You discovered a talent for lifting items and coin purses from others’ belts. The world always provided for you, and when you saw something you wanted, you learned to take it. You gain access to the Ambitious social trait and the Thief of Legend story feat. ",
                "Poverty: In your youth, you rarely had enough food to keep from starving. Poverty and hunger forced you to steal to survive, or to help your loved ones survive. You gain access to the Poverty-Stricken social trait. ",
                "Spy: You’ve always had an innocent expression and a silver tongue, so naturally you were recruited as a spy during your childhood. You could have come from any social class; you might have gathered information as an urchin on the streets or acted as servant to one lord while you reported to another. You gain access to the Fast Talker social trait.",
                "The Kill: You killed someone when you were relatively young. You might have done it in self- defense, in anger, or as part of an initiation ritual. And it was easier than you suspected. Afterward, some individuals or groups started paying you to kill for them, and you made a lucrative career of assassination. You gain access to the Killer combat trait and the Innocent Blood story feat.",
                "The Trained: Your early talent for feats of agility and acrobatics garnered you an experienced mentor. Impressed by your natural ability, this mentor taught you how to fight, dodge, and throw. He may have been a master thief, circus performer, fencing master, or swashbuckling pirate. You gain access to the Mentored social trait. ",
                "Outlawed: For reasons just or unjust, you became a fugitive at an early age. You have lived outside the light of society for some time, risking capture or punishment whenever you need to break the law again. You gain access to the Criminal social trait.",
                "Thrill Seeker: As an adolescent, you and your friends took turns daring one another to take risks, each new challenge inspiring greater excitement. Since then, you’ve become an adrenaline junkie, performing dangerous tasks in order to chase that high. You gain access to the Acrobat social trait.",
                "Henchman: You’ve always worked for someone else. You do what you are told and in return you are appreciated by the boss, rewarded, and paid. You gain access to either the Oathbound faith trait or the Child of the Streets social trait.",
                "Scout: Your natural ability turned into employment in an elite squad of stealthy infiltrators. You penetrate enemy lines, gather information, deliver coded messages, and sabotage enemy supplies. You likely work for a private individual or military order. You gain access to the Canter social trait.",
                "ERROR"
            };
        while(CRR>i*10){i++;}
        return bGResult[i-1];
    }
}
