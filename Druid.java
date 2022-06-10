
/**
 * Write a description of class Druid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Druid implements Class
{
    public int i = 1;
    @Override
    public String setBackground(int CRR){
        String[] bGResult={    
                "Lost in the Wild: You got lost in the wilderness and were forced to survive on your own. You may have wandered desert dunes, thick forest, or high mountains—or perhaps you were shipwrecked on a desert island. Young and vulnerable, you feared the natural dangers of the world at first, but acclimated to the natural way of life as you learned to tap into the primal power of the world. You gain access to the Resilient combat trait.",
                "Fey Meeting: Walking in the woods, you met a fey creature, such as a brownie, elf, nymph, gnome, sprite, or treant. This magical being taught you how to tend the natural world in the gentle manner of the fey. You gain access to the Magical Knack magic trait. ",
                "Spirit of Nature: Through a ritual, vision, or dream, you communed with a primordial spirit of  nature. In the form of a majestic beast, this spirit charged you with preserving the natural world from those who would destroy it. You are instilled with the spirit of this creature—a small fragment of its power grows in you as you mature. You gain access to the Sacred Touch faith trait.",
                "Tree Tender: You learned to care for plants in your youth by tending a small garden, orchard, grove, or field. These plants flourished like no others. You’ve always understood plants better than people. You gain access to the Devotee of the Green faith trait. ",
                "Druid Circle: You discovered, or were initiated into, a circle of druids that protects an expanse of wilderness. The druids taught you of their duty to nature and the powers that the natural world granted them. Soon you learned enough to join the circle as an initiate. You gain access to the Mentored social trait. ",
                "Civilized Outcast: For a time, you lived in an urban environment. But you soon discovered that social communities, bureaucracies, and laws made you feel constrained and unnatural. You left civilization and retreated into the wild at the first opportunity. You still retain the lessons, habits, and refinements of civilized behavior, but your heart belongs to nature. You gain access to the Civilized social trait. ",
                "Savage: You spent your formative years among a tribe or village far from civilization. The elders chose you as successor and taught you the lore of the elements and the animals. You gain access to the Savage social trait. ",
                "Raised by Beasts: You were reared in part by wild animals. Most of what you know you learned by observing these beasts, their natural instincts being unburdened by artifice or manipulation. Even though you possess a humanoid body, the beasts recognize you as one of their own. You gain access to the Animal Friend gnome race trait (which you may take regardless of your race) and the Feral Heart story feat. ",
                "Avatar: Once you were an ordinary youth. But when the natural world needed saving, the land chose you as its champion, lending you as much power as you were able to control. You might not understand the reasons for your power, but you are one with nature and your will is the will of the world. You gain access to the Child of Nature religion trait. ",
                "Beastlord: Natural birds and beasts have always obeyed you. From your earliest years, you’ve possessed a gentleness or a power that allows you to communicate with animals as though you shared a common language. Perhaps you have fey blood or traces of lycanthrope ancestry. You gain access to the Beast Bond social trait.",
                "ERROR"
            };
        while(CRR>i*10){i++;}
        return bGResult[i-1];
    }
}
