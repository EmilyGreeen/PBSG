package clas;
/**
 * Write a description of class Monk here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Monk implements Class
{
    public int i = 1;
    @Override
    public String setBackground(int CRR){
        String[] bGResult={    
                "Bellicose Historian: What started as a scholar’s curiosity in exotic fighting styles bloomed into a fanatical desire not just to learn about martial arts, but to master them. You gain access to the Style Sage social trait. ",
                "Classically Schooled: Training from dawn to dusk to hone every inch of your body into a fighting instrument, you studied with scores of other students in an academy or school dedicated to one specific martial art. You gain access to the Simple Disciple social trait.",
                "Elite Fighting Force: You learned your fighting skills as one of a highly trained group dedicated to a special purpose, such as guarding a temple or protecting a noble. Your training emphasized unobtrusive teamwork and unquestioned dedication to some higher purpose. You gain access to the Veiled Disciple social trait. ",
                "Tournament Champion: A shining example of your style or order, you’ve honed martial prowess through spirited and exciting competition. You gain access to the Martial Performer combat trait. ",
                "Lineage Holder: You are the senior or sole student of a great master. You rose to prominence early and received secret training in an art that is rare and exotic. Having achieved a strong foundation in the physical and metaphysical elements of this martial art, you’ve been designated the lore keeper for its history and traditions, and must now find new student or students to train. You gain access to the Martial Manuscript faith trait. ",
                "Nature’s Disciple: Just as many great masters learned and crafted styles from the beauty and majesty of nature, your fighting style comes from time spent in the wild rather than from formal training. You have seen firsthand how the mantis hunts, how the tiger swipes, and how the crane beats its wings. Your observance of the natural world gave you the ability to extrapolate combat forms without traditional training. You gain access to the Nature’s Mimic combat trait. ",
                "Secret Student: Your teacher and fellow students grew up as part of a conquered people, forbidden to train at war and forced to conceal the fighting style as seemingly harmless dances and your weapons as mundane tools… until the day you all you could rise up against tyranny. You gain access to the Hidden Hand combat trait. ",
                "Spirit Teacher: Your martial training is both physical and metaphysical in nature, allowing you to unlock a higher state of consciousness that allows you to draw on the wisdom and power of long-dead masters. You gain access to the Spirit Sense faith trait. ",
                "Unsuspecting Master: You were trained in martial arts through unorthodox methods such as seemingly menial tasks or training through conditioning exercises that promised the smallest scrap of food as a reward. Your nontraditional training makes you resourceful and clever. You gain access to the Surprise Weapon combat trait. ",
                "Wandering Savant: Although you’ve received some formal training in exotic combat, you decided to put your skills to the test and further your learning by wandering the wide world. You gain access to the Wanderer’s Shroud faith trait.",
                "ERROR"
            };
        while(CRR>i*10){i++;}
        return bGResult[i-1];
    }
}
