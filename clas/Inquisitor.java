package clas;
/**
 * Write a description of class Inquisitor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Inquisitor implements Class
{
    public int i = 1;
    @Override
    public String setBackground(int CRR){
        String[] bGResult={    
                "Bureaucracy’s Bane: You chose the inquisitor’s path because you have no taste for the petty rules and regulations that mire the leaders of your faith in inaction and inefficacy. You know that you are an instrument of your deity and that your directives do not require intercession by the less motivated. You gain access to the Focused Disciple faith trait. ",
                "Chaplain: You learned long ago that in the heat of battle and under the pall of war, even the most devout can waiver in faith. You subsequently dedicated yourself to stewarding the faith of soldiers and allies in times of great conflict. You gain access to the Battlefield Disciple combat trait and the Battlefield Healer story feat.",
                "Exemplar: You found early on that you lacked the logic or the vocabulary to communicate the virtues of faith—more precisely, your faith—to others. You decided that the best way to foster respect and appreciation for your god was not with words, but with action. You gain access to the Beacon of Faith faith trait. ",
                "Failed Cleric: Your original training in divine magic was as a cleric, but your faith eventually distilled into you the ability to hear lies and see weaknesses in the “unfaithful.” You gain access to the Schooled Inquisitor faith trait. ",
                "Faith-Bringer: You know that in order to bring the light of your deity to others, you must traverse hostile territories and face even more hostile inhabitants. You gain access to the Weathered Emissary social trait and the Fearless Zeal story feat. ",
                "False Witness: You’ve seen innocent people suffer due to another’s lies. While these injustices made you feel powerless, they’ve also kindled a desire in you to punish those who regard truth so cheaply. You gain access to the Vigilant Battler combat trait. ",
                "Few Left to Safeguard the Faith: You are the vanguard of your faith. Perhaps you are a pilgrim for a good deity in an unholy land, or the secret enforcer of a sect that operates in the shadows of the world. You are accustomed to working alone and with little guidance from the superiors of your church, trusting your own moral judgment to act on behalf of your god. This certainty acts as a defense against the magic of other, “lesser” deities. You gain access to the Disdainful Defender faith trait.",
                "Temple Detective: Your ability to sniff out falsehood and see weakness in others made you uniquely suited to guard the religious houses of your order. You gain access to the Truth’s Agent social trait. 81",
                "The Path of Righteous Rage: Your faith does not manifest in calm prayer or serene meditation. You achieve the transcendent feeling of the divine when you are in the throes of battle for your deity. You gain access to the Indelible Ire combat trait. ",
                "Zealot: Your devotion is fanatical and your powers are clearly proof of your connection with the divine. Although you know that other gods bestow similar powers upon their own disciples, you either revile or pity those of “lesser” faiths. You gain access to the Zealous Striker faith trait.",
                "ERROR"
            };
        while(CRR>i*10){i++;}
        return bGResult[i-1];
    }
}
