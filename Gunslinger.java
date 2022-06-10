
/**
 * Write a description of class Gunslinger here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Gunslinger implements Class
{
    public int i = 1;
    @Override
    public String setBackground(int CRR){
        String[] bGResult={    
                "Any Fool Can Swing a Sword: Sometime during your youth, you came to the conclusion that most melee and ranged weapons are crude and primitive compared to firearms. It puzzles you that anyone with martial aptitude deigns to devote their skill to anything other than firearms. You disregard such “lesser” weapons and prefer the feel of your trusty firearm over any other tool of war. You gain access to the Reckless Contempt combat trait. ",
                "Bucking Tradition: You come from a proud tradition of ancient arms and august codes of conduct like those followed by paladins, cavaliers, and samurai. Instead of following in the vaunted steps of your predecessors, though, you chose to learn the art of firearms to the shock and perhaps even anger of your family and peers. Your break with tradition fostered in you a nearly insurmountable will that fuels your identity as a gunslinger. You gain access to the Resolve of the Rejected combat trait. ",
                "Custodian of the Future: Firearms are not just an effective implement for killing or a curious mechanical trinket; they are the next step in the technological development of your people. Your passion for the workings of your weapons has you constantly assembling and dismantling firearms to truly understand their mechanics. This ongoing dedication improves your ability to repair firearms and make them deadlier while in your skilled hands. You gain access to the Unblemished Barrel combat trait. ",
                "Defining Moment: Guns are inexorably linked to a moment where your life dramatically changed. Perhaps you were so sickly as a child that you couldn’t turn a crossbow’s winch or bend a bow, but firearms showed you that you could still hunt and fight. Perhaps you picked up a firearm in a desperate moment to help a wounded gunslinger and knew that you had just taken your first step along the same path. A firearm at your side instills in you a sense of purpose and destiny that no one can take away. You gain access to the Black Powder Fortune combat trait.",
                "Look at What I Can Do: The lure of something new and showy drove you to first pick up a gun. Although several near mishaps taught you to respect the volatile weapon and the powder that powers it, you still enjoy doing trick shots and getting the oohs and aahs of a crowd. You gain access to the Black Powder Bravado combat trait. ",
                "Mechanical Savant: For you, the lure of firearms is not the effect they produce, but the science and mechanical process behind the effect. Your endless tinkering and perfectionism have made your own gun easier to upgrade. You gain access to the Just Like New combat trait. ",
                "Black Powder Presence: You grew up belittled and even beaten for not being the biggest or the strongest of your compatriots, family, or race. With no burgeoning aptitude for magic, you looked for some other way to exceed those who found superiority in brute strength—and you found it in gunslinging. You gain access to the Larger Than Life combat trait. ",
                "Sacred Charge: Your gunslinger training is more than just martial skill—it’s a calling. Perhaps you are part of an elite group of guards serving and defending a temple or faith. Conversely, you might come from a land where firearms represent the pinnacle of your society’s advancement or are the last vestige of those who came before. Your sense of higher purpose allows you to fight on and keep firing when winning seems impossible. You gain access to the Never Stop Shooting combat trait. ",
                "Shock and Awe: The sound and fury of gunfire is as potent a weapon as the pellets and bullets your weapon discharges. You live for the reflexive wince that others make when they jump at the sound of a firearm, and laugh heartily at the amazement you inspire in others with your cacophonous black-powder weapons. You gain access to the Startling Report combat trait. ",
                "Some Things Are Stronger Than Magic: You grew up either oppressed by magic cruelly wielded or loathing the elitism of those who possessed such arcane or divine power. Searching for something nonmagical that relies on skill and practice led you to the study and wielding of firearms. You relish trumping pompous spellcasters with a quick draw and a keen eye. You gain access to the Black Powder Interjection combat trait. ",
                "ERROR"
            };
        while(CRR>i*10){i++;}
        return bGResult[i-1];
    }
}