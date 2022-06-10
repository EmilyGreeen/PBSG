package clas;
/**
 * Write a description of class Wizard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Wizard implements Class
{
    public int i = 1;
    @Override
    public String setBackground(int CRR){
        String[] bGResult={    
                "Brains over Brawn: You were bullied or excluded throughout your life because you lacked physical power and fighting prowess. To compensate, you turned to transmutation magic. Your practice and perseverance has granted you skill with spells of that school. You gain access to the Tenacious Shifting magic trait. ",
                "Dangerous Intellect: At a young age, those around you, whether family or friends, realized that your intellect was more than mere precociousness. As your sense of curiosity became dangerous, those responsible for you pushed you into studying magic in the hopes that you would find infinite puzzles to solve. You gain access to the Tireless Logic social trait. ",
                "Fitting In: You hail from a long line of sorcerers or from a community known for its natural affinity for magic. Your manifestation of wizardly talent, as opposed to blood-based sorcery, caused you to hide those talents at a young age, and then to disguise them as sorcery to the best of your ability later. You still retain some tricks from this early misdirection. You gain access to the Shrouded Casting magic trait.",
                "Gifted Pride: Your affinity for magic has made you somewhat crass and arrogant, though some find your blunt disposition charming or worthy of respect. The air of superiority surrounding you is palpable and allows you to use you intellect to cow others at times when lesser individuals might barely get a word in. You gain access to the Bruising Intellect social trait. ",
                "Mortality’s Mirror: Your childhood innocence ended the moment you realized that someday you would die. This revelation may have come to you at the deathbed of a beloved relative, during a bloody siege against your homeland, or via some other eye-opening event. You have spent the rest of your life trying to master magic in order to change this most universal fate from stealing your last breaths away. You now have a keen eye for the magic of death and for discerning answers to ancient riddles. You gain access to the Greater Purpose magic trait. ",
                "Righting a Wrong: In your youth, you witnessed an event that changed the fate of many or of a tragic few, such as a natural disaster (like a flood, hurricane, or fire) or simply a friend’s unfortunate accident during a childish game. You were burdened by the knowledge that magic— perhaps even a spell as simple as feather fall— could have changed the course of lives. You’ve dedicated yourself to magic in an effort to make sure that you are never subject to the capricious whims of fate again. You gain access to the Desperate Resolve magic trait. ",
                "Storied Lineage: Your family name is synonymous with wizardry of the highest caliber. Magic was your destined path before you were even born, and both your family and those who know of your lineage have supported this notion your entire life, granting you an unwavering confidence in your talents. While the pursuit of arcane mastery is never easy, you are driven to live up to the expectations set forth for you. You gain access to the Resilient Caster magic trait. ",
                "The Way Things Work: Magic came alive the first time you held a magic item. The notion of extraordinary magic resting within something as seemingly ordinary as a ring, amulet, or stoppered vial changed the way you viewed the world, and ever since you’ve possessed a sense of curiosity and awe for all magic items. You gain access to the Magic Crafter magic trait and the Eldritch Researcher story feat. ",
                "Unpaid Debt: Someone saved your life at great cost. Whether through healing magic or basic heroism, your savior gave her life that you might live. Striving to repay this debt has led you to study magic, the only thing capable of making enough of a difference in the world to make you feel that you have earned the gift given to you. This sense of purpose has engendered an unshakable resolve in you. You gain access to the Principled faith trait. ",
                "Unquenchable Hunger for Knowledge: For most wizards, magic is an end to which all studies strive, but not for you. For you, magic is a means to an end—and that end is knowledge. Your desire to know all of the secrets of the world requires the ability to cross continents in a blink, ride the winds, breathe water like a fish, and survive any kind of trap. Your unquenching quest for knowledge has made you ever ready for danger. You gain access to the Eldritch Delver magic trait.",
                "ERROR"
            };
        while(CRR>i*10){i++;}
        return bGResult[i-1];
    }
}
