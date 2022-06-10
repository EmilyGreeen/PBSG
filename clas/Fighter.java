package clas;
/**
 * Write a description of class Fighter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fighter implements Class
{
    public int i = 1;
    @Override
    public String setBackground(int CRR){
        String[] bGResult={    
                "Adventure: Since you can remember, you sought to become a great warrior. Inspired by legends of the past or personal heroes of your civilization, you longed to wield steel and carve your way in the world. You gain access to the Seeker social trait",
                "Conscripted: You didn’t choose the military life so much as you were drafted into it. You have a non-military background and skill set. Who knows what course your life might have taken had you not been forced to take up arms? You gain access to the Worldly social trait.",
                "Duty: You took up the sword because no one else would. When a great danger threatened your home, you stepped forth to meet the challenge, though you were only a youth with just the strength of your arm and steadfastness of your courage to see you through. You gain access to the Courageous combat trait.",
                "Gladiator: As an adolescent, you learned to fight and kill because your master made you, and if you had not learned, you would be dead. Killing was a way of life—a means of survival. At first you did it because you had to, but that soon changed when you heard the chorus of the crowd. You gain access to the Killer combat trait, the Life of Toil social trait, and the Champion story feat.",
                "Joined the Watch: Your village, town, city, or tribe needed new recruits for the volunteer watch patrol, and you joined up—whether for money, duty, peace, or power. This rudimentary training gave you an understanding of civilized justice and showed you how to wield a weapon with skill. You gain access to the Militia Veteran regional trait. ",
                "Knighted: Your military path began when you were knighted or made a squire to a knight. Your family’s status could have influenced this event, or you might be a simple commoner rewarded with a title for a rare feat of courage. As a member of the nobility, you gain access to the Influence social trait. ",
                "Mercenary: Everyone needs to earn a living, and in your youth you were fast, strong, or tough enough to fight for pay. There are good causes and bad causes, but at the end of the day, it all comes down to money. Sometimes you got easy jobs, like guarding merchant caravans; other times the jobs are rough, like fighting in a rebel lord’s private army. You gain access to the Mercenary social trait. ",
                "On the Street: You spent adolescence in a seedy part of town. You learned to fight dirty and fight mean. Turns out you were good at it. Your skills drew the interest of gang and guild leaders, tavern keepers, and anyone else who needed hired muscle. You gain access to the Child of the Streets social trait. ",
                "Schooled: You learned to fight in a structured environment where you were exposed to a variety of weapons, armor, strategies, and tactics. You learned to fight as part of a unit, how to follow orders and how to command a squad. You gain access to the Tactician combat trait.",
                "Survival: You spent some part of your life in the wild—in places that abide by the laws of nature rather than those of civilization. You survived by being stronger, faster, and more cunning than the predators. That meant you fought not for coin, honor, or principle, but for your very life. You gain access to the Resilient combat trait.",
                "ERROR"
            };
        while(CRR>i*10){i++;}
        return bGResult[i-1];
    }
}
