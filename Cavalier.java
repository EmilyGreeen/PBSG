
/**
 * Write a description of class Cavalier here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cavalier implements Class
{
    public int i = 1;
    @Override
    public String setBackground(int CRR){
        String[] bGResult={    
                "Tragedy and Loss: In your formative years, you experienced a significant tragedy that forged you into the person you’ve become. You gain access to the Grief-Filled social trait. ",
                "Faith: You embraced a religious faith at an early age and devoted your life to its ideals. You soon learned that it was not enough to follow and worship. Faiths need champions—people capable of defending the virtues, tenets, and precepts of the faith from those who would seek to corrupt, alter, or destroy it. You gain access to the Indomitable Faith faith trait.",
                "Champion of the People: You grew up among common people. You were close to these people and you witnessed their oppression, their suffering, and their helplessness. Someone needed to stand up and protect them, and that someone would be you. You gain access to the Militia Veteran regional trait, the Champion story feat, and the Town Tamer story feat.",
                "Squired: You were a young squire who served a very different kind of knight. This knight taught you more than the art of battle: she taught you to live by a strict code to guide your actions and your sword. You gain access to the Influence social trait and the Oathbound faith trait.",
                "Military Order: At the beginning of your career, you served with a company of mercenaries, rogues, and professional soldiers. The experience taught you how to work strategically with diverse groups. You gain access to the Tactician combat trait and the Worldly social trait. ",
                "Personal Code: In your early years, you made sense of the chaotic, disorderly world you grew up in by formulating your own code of ethics and behavior. Though you are the ultimate arbiter and authority over this code, you do not break it, for without it your existence loses all meaning. You gain access to the Principled faith trait. ",
                "Equestrian: The first time you rode a horse, you discovered a kinship with it and knew you were born to ride, and the superior horsemanship you gained through your bond with the animal propelled you into the ranks of the cavaliers. You gain access to the Beast Bond social trait. ",
                "Entitlement: You became a cavalier early in your career, not by personal action or effort but by family favor, connections, or promotion. You were given fine weapons, tactical training, a mount, and the edicts of your order. Now you must learn how to follow them. You gain access to the Rich Parents social trait.",
                "Honor Bound: Long ago, a promise was made that you are bound to fulfill. This could be a vow you made in your youth, or one made by an ancient forebear. Regardless, you must follow a cavalier’s code despite any personal doubts or misgivings until you have fulfilled the terms of the oath. You gain access to the Oathbound faith trait. ",
                "Old Soldier: When you were young, you discovered an ancient chivalric oath sworn by knights of yore. Though the beautiful edicts of this oath seem to have been forgotten by the world, this old way fulfills you and gives you purpose. You gain access to the Inspired faith trait.",
                "ERROR"
            };
        while(CRR>i*10){i++;}
        return bGResult[i-1];
    }
}