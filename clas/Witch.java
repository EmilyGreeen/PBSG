package clas;
/**
 * Write a description of class Witch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Witch implements Class
{
    public int i = 1;
    @Override
    public String setBackground(int CRR){
        String[] bGResult={    
                "Apprenticed: Your development was guided by a mortal or magical creature, such as a wisewoman, hag, dryad, elf, or pixie, who instructed you in the arts of spellcasting, potions, charms, and hexes. You gain access to the Hedge Magician magic trait. ",
                "Desperate Accident: You lived an ordinary life until one day catastrophe struck and you called out desperately to any power that would come to your aid. The entity that gave you this power might be benevolent or sinister in nature, but ever since you called it, the being remains close to you. You gain access to the Reckless combat trait.",
                "Forbidden Lore: In your youth, there was something you fervently desired—perhaps love, wealth, or revenge. But no matter how hard you tried, you couldn’t obtain that which you coveted. Only when you turned your eye to ancient tomes and ruins and experimented with strange powers beyond your comprehension were you able to get what you wanted. You gain access to the Dangerously Curious magic trait. ",
                "Found Familiar: When you were young, you happened upon a strange animal with whom you forged an instant bond. It instructed you in casting spells and became your closest, most trusted companion. You gain access to the Animal Friend gnome race trait (which you may take regardless of your race). ",
                "Gifted: You received your magical ability as a gift from a supernatural being, such as an angel, devil, god, ancient dragon, or powerful fey. This creature expects you to act on its behalf in exchange for the power it loaned you. You gain access to the Magical Knack magic trait.",
                "Inborn Power: Many fey creatures are born with the innate ability to cast spells, and either because of having fey blood in your lineage or being born near fey lands you too were gifted this talent. You gain access to the Magical Lineage magic trait. ",
                "Initiated: When you came of age, a coven of witches initiated you into their circle because you showed great promise. After your initiation ritual, you changed on a fundamental level. You gain access to the Mentored social trait. ",
                "Invocation: When you reached adolescence, you wanted power and you wanted it immediately. You didn’t have the patience or tolerance to endure endless years of boring theory and formal magical training, so you offered up your body and soul in an invocation to an entity that would grant your desire. You gain access to the Oathbound faith trait. ",
                "Possessed: For reasons you may never understand, an otherworldly entity took possession of you in your formative years. Since then, your mortal body has been the vessel for this mysterious power. You gain access to the Possessed magic trait. ",
                "Unknown: The circumstances by which you gained your powers are confusing, even to you. You may have received them when you stepped into a enchanted land or touched a strange artifact, or perhaps you simply awoke one day with them. You strive to find the meaning of your powers, as they drive your life in unforeseen directions. You gain access to the Seeker social trait.",
                "ERROR"
            };
        while(CRR>i*10){i++;}
        return bGResult[i-1];
    }
}
