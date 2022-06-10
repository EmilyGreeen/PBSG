
/**
 * Write a description of class Alchemist here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Alchemist implements Class
{
    public int i = 1;
    @Override
    public String setBackground(int CRR){
        String[] bGResult={
                "Accidental Discovery: Your keen intellect has always been an asset in your studies of the alchemical arts, but along with your logic and rationale, you have a “sense” for alchemy. This intuition sometimes leads to discoveries through methods most of your peers would never have thought possible, but that you somehow know will work. You gain access to the Alchemical Intuition magic trait.",
                "Firebug: Although you’ve studied all aspects of the alchemist’s craft, your have a talent for fire. Fire has always been a seductive and powerful force that you have either embraced with glee or focused care. You are adept at exploiting a weakness to fire when you recognize it. You gain access to the Focused Burn magic trait. ",
                "Wasn’t Strong Enough: You suffered something at an early age that made you feel powerless. Maybe a relative died from plague, a friend was crushed beneath rubble you were too weak to move, or some other horrible tragedy occurred. You turned to alchemy to transcend the limitations of your physical form. Your relentless dedication has made your bolstering abilities more persistent. You gain access to the Enduring Mutagen magic trait. ",
                "Magic for the Uninclined: You were always interested in the arcane, but lacked the innate magic of sorcerers or the single-minded dedication possessed by wizards. As a disciple of science, the magic of faith was also closed to you. You dedicated yourself to alchemy, focusing on extracts that mimic the magic you once hoped to wield. That original interest in magic still grants you occasional rare insight into the workings of your formulae. You gain access to the Cross-Knowledge magic trait.",
                "Master Craftsman: The first time you saw air mix with the shapeless goo of a tanglefoot bag or shielded your eyes at the heatless light of a sunrod, you became ensnared by the wonders of alchemy. You’ve since labored to learn the secrets to crafting such items. You gain access to the Alchemical Adept magic trait.",
                "Physician: Alchemy was the natural outgrowth of your time spent learning the healer’s craft. Your first extracts were the accidental byproduct of making poultices and elixirs. Continuing your studies, you found the natural compassion you had as a healer mixing with an alchemist’s cold logic, forging you into a clinician unlike most others. You gain access to the Precise Treatment magic trait. ",
                "Formulae Stickler: To you, alchemy is a delicate and complex symphony requiring multiple different elements to work together to produce the perfect result. Though others in your craft come up with ways to substitute certain ingredients when making bombs or mutagens, you disdain such practices, deeming them pollutions. To you, there is always a perfect ingredient and its addition makes your alchemy more potent. You gain access to the Meticulous Concoction magic trait. ",
                "Nature’s Foe: You lost something or someone important to you through the cruel indifference of nature. Perhaps you watched someone get swallowed by a storm-tossed sea or witnessed a summer forest fire destroy your home and all of your possessions. No matter the impetus, the unpredictability of nature made you feel small and helpless. Your subsequent devotion to alchemy has been in no small part due to a desire to exert control over nature itself, a domineering intent palpable to all creatures of nature. You gain access to the Unnatural Revenge social trait. ",
                "To Recreate a Miracle: Your life or the life of someone you loved was saved by a magical elixir. Witnessing this instilled a sense of awe for the art of alchemy. Although your research has not yet been able to recreate the sheer potency of that draught long ago, your years questing to duplicate it have made you adept at brewing potions. You gain access to the Perfectionist’s Brew magic trait. ",
                "Mad Alchemist: Rampant curiosity and a near fearlessness of the unknown drove you to experiment with the rudiments of alchemy. That curiosity has uncovered interesting alchemical secrets, at the cost of alchemical instability. Some consider your experiments mad. You gain access to the Unstable Mutagen magic trait.",
                "ERROR"
            };
        while(CRR>i*10){i++;}
        return bGResult[i-1];
    }
}
