package clas;
/**
 * Write a description of class Barbarian here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Barbarian implements Class
{
    public int i = 1;
    @Override
    public String setBackground(int CRR){
        String[] bGResult={    
                "Vengeance: When you were young, a great wrong was done to you, a loved one, your family, or your people. This experience tore you apart and reduced you to a being of primal emotions. Dreams of vengeance became your only promise of comfort. You gain access to the Axe to Grind combat trait, the Foeslayer story feat, and the Vengeance story feat. ",
                "Champion of a God: At your coming-of-age ritual, your deity, totem, or patron spirit sparked your soul with a religious zeal. This entity might be a beast spirit, a warmongering god, a demon lord, or some other supernatural entity. In the name of this otherworldly force you become an unstoppable warrior—the bane of all your tribe’s foes. You gain access to the Inspired faith trait and the Champion story feat. ",
                "Conquest: Upon coming of age, you went on your first raid, where you learned the thrill of violence and chaos and the satisfaction that came with the spoils of your victory. When your enemies dare to stand against you, your rage rekindles until you have conquered and subdued them. You gain access to the Killer combat trait. ",
                "Hated Foe: In your formative years, you learned to despise a certain individual, tribe, kingdom, empire, race, or monster due to some slight it inflicted upon you or your people. This foe lurks ever close to your thoughts. So intense is your hatred that the mere thought of this foe can incite your rage. You gain access to the Reckless combat trait and the Foeslayer story feat. ",
                "Personal Flaw: There is a part of yourself that you hate more than anything else. In your adolescence, you first realized this imperfection— to your lasting shame. This might be a gentle part of yourself you wish to eliminate or a brutal, prideful, greedy, or monstrous side you can’t control. Your rage is fueled by self-loathing, or by projecting this part of yourself onto a foe you wish to destroy. You gain access to the Axe to Grind combat trait.",
                "Hatred of Civilization: When you first encountered civilization in your youth, its weak and decadent people revolted you. Once, such people were free and strong, but rules and laws made them feeble. Your rage is the wild part— the pure part—of yourself that separates you from the craven ways of “civilized” people. You gain access to the Savage social trait. ",
                "Persecution: You grew up under the persecution of another power—perhaps a rival tribe, an expansionistic empire, or a tribe of violent monsters. Beaten and bloodied, your people barely survived the onslaught. But the beatings made you strong and taught you how to channel the pain into something useful. Since that time, the flame of rage has burned inside you, waiting to be released against your oppressors. You gain access to the Bullied combat trait. ",
                "One of a Dying Breed: You grew up knowing that your people were slowly dying out—that your extinction was inevitable in the face of the changing world. In youthful vigor, you declared that your fire would not be snuffed without a fight. Your rage stems from the desperate desire to be remembered, to make a mark upon the world before the sun sets on your dwindling kind. When you rage, a single thought permeates your burning mind: If you’re going down, you’re taking everyone with you. You gain access to the Reactionary combat trait. ",
                "Chaos Embraced: You grew up in wild lands where there were no laws except for those of nature—the laws of the predator and the prey. You searched for meaning in the world, in the gods, in the prayers of priests, in the patterns of the stars, but you found nothing. There is no true order to the natural universe except for that of raw and unbridled power. Chaos is the natural state of all things, and that’s how you like it. You gain access to the Unpredictable social trait. ",
                "Bloodthirsty: The first time you spilled a deserving foe’s blood and watched the thing’s life ebb out onto the hard ground, you found yourself filled with a mad, euphoric ecstasy like none other. The memory of this visceral experience returns to you in every battle, like an insatiable addiction that can only be abated with further bloodshed. You gain access to the Bloodthirsty combat trait and the Innocent Blood story feat.",
                "ERROR"
            };
        while(CRR>i*10){i++;}
        return bGResult[i-1];
    }
}
