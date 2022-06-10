
/**
 * Write a description of class Oracle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Oracle implements Class
{
    public int i = 1;
    @Override
    public String setBackground(int CRR){
        String[] bGResult={    
                "Battle: In your early years, a battle broke out near your home and you were embroiled in the fighting. At the end of the battle, you were the only one left standing, with scores of slain foes strewn at your feet. You gain access to the Veteran of Battle religion trait and the Battlefield Healer story feat. ",
                "Bones: In your formative years, you were entombed or buried alive in a graveyard. For days, you lay within the grave until your terror strangely turned to comfort. Since your return, you’ve been a different person: part mortal and part ghost, in possession of the powers of the dead. You gain access to the Fearless Defiance faith trait. ",
                "Flame: A great fire consumed you and laid waste to the environment around you. It might have devoured your family, friends, or an entire settlement, but you survived unburned as if the fire did not dare to touch you. Since that day, you’ve tamed fire as though it were a savage animal bent to your will. You gain access to the Flame–Touched magic trait. ",
                "Heavens: The night sky’s mysteries have always enthralled you. But one night, while you gazed upon the stars, the perfect order of the universe revealed itself and you nearly went mad from the revelation. Since that night, you’ve possessed strange powers over the heavens. You gain access to the Starchild religion trait. ",
                "Life: A terrible plague afflicted your homeland, killing thousands. You caught the disease, but instead of dying from it, you flourished. As you grew healthier, so did everyone you came into contact with. You gain access to the Sacred Touch faith trait",
                "Lore: You were able to speak before any other child your age. Rather than stumble through the rudimentary syllables of language, you spoke in full sentences, reciting the greatest literature of many languages in story, song, and poem. Sometimes you spoke of events that had not yet come to pass, and the wise came to seek your counsel. Your gift came at a cost, however—though your knowledge is vast, your body and mind carry a curse. You gain access to the Scholar of the Great Beyond faith trait. ",
                "Nature: You became separated from your family and lost in the untamed wilderness for many days, months, or years. The wilderness took its toll, but when you finally emerged from the wild, you were its master. You gain access to the Child of Nature religion trait. ",
                "Stone: You were buried beneath the earth, possibly after an avalanche or earthquake. For 3 days the earth covered you, until at the end of the third day you emerged from the mountain unharmed but not unchanged. You gain access to the Earth-Touched magic trait. ",
                "Waves: You were swept beneath the surface of the water once. You should have drowned, but instead you washed up on shore after a long interval. You emerged from the depths afflicted with a strange condition but otherwise unharmed. You gain access to the Water-Touched magic trait. ",
                "Wind: In your early years, you were caught in a powerful storm that ravaged the countryside, destroying everything in its path. Bolts of lightning struck your body and thunder deafened your ears, but when you came to the storm’s tranquil center, the tempest ceased. Since then you’ve had power over storms, though you still bear the mark of the great storm you endured. You gain access to the Storm-Touched magic trait. ",
                "ERROR"
            };
        while(CRR>i*10){i++;}
        return bGResult[i-1];
    }
}
