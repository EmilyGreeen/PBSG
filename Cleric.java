
/**
 * Write a description of class Cleric here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cleric implements Class
{
    public int i = 1;
    @Override
    public String setBackground(int CRR){
        String[] bGResult={    
                "Angelic Encounter: A supernatural being, such as an angel or demon, appeared to you and proclaimed that you were destined to perform a great task in service to your god. You might have tried to deny it—and you even might still have doubts—but eventually you took up the mantle of a holy warrior and chose to meet this destiny head on, either to prove to yourself that you’re worthy of such a destiny or to show your supernatural messenger that you cannot be pigeon-holed so easily. You gain access to the Prophesied faith trait. ",
                "Atonement: In your youth, you committed actions you are not proud of. Your deeds left dark stains upon your soul, ones so deep they might take a lifetime to wash away. When you hit rock-bottom—whether through greed, addiction, hedonism, or simply lack of good sense—you turned to faith, vowing to atone for all of the horrible acts you’ve committed. You gain access to the Oathbound faith trait. ",
                "Converted: In your early life, you followed a different faith, a different god or powerful entity, or perhaps no faith at all. A representative of your current faith showed you the error of your ways and converted you, and you couldn’t be happier. You can only hope to do for others what this individual did for you. You gain access to the Inspired faith trait. ",
                "Devoted: From your earliest memory, you’ve had a close relationship with your deity. This entity has been a constant presence in your life: your greatest comfort, best companion, truest love, or some combination of the three. You’ve never had to see or speak with your deity to know that he watches over you, and the beliefs and criticisms of others do not faze you—your faith is enough. You gain access to the Blessed faith trait and the Fearless Zeal story feat. ",
                "Healed: As a child, you were afflicted with a terrible physical or mental illness or a debilitating wound that prevented you from functioning in society. A miracle worker touched your body and commanded you to be well, and—for perhaps the first time in your life—you were whole. Now you live your life in tribute to the deity whose divine healer restored you, and perhaps hope to bestow similar gifts unto deserving nonbelievers. You gain access to the Sacred Touch faith trait and the Battlefield Healer story feat. ",
                "Reborn: You died or nearly died. In the midst of this experience, your mind came to a place of quiet where you witnessed your deity or its agents pulling your body and spirit back from the brink of death. Every day since has been a gift, and you strive to understand the reason you have been saved while countless others perish. You gain access to the Deathtouched bloodline race trait and the Arisen story feat.",
                "Religious Colony: You grew up in a religious colony or settlement. This may have been a small village in the hinterlands or a kingdomsized theocracy devoted to a single religion. When you came of age, you decided to serve your god and country as a cleric, a choice that garnered respect, dignity, and honor among your people. You gain access to the NaturalBorn Leader social trait. ",
                "Revelation: In your youth, a deity granted you visions or dreams that revealed startling truths. These visions might have been prophetic, deeply insightful, or filled with extraordinary solutions to problems that plagued you, your family, or your community. So powerful and compelling were the visions that you devoted your life to the deity. You gain access to the Worldly social trait. ",
                "Sanctuary: When you were young, you did a very wicked deed—or were accused of one— and fled to the only place that could shelter you from the law. You found sanctuary among the worshipers of a deity, and they took you in and protected you. In time, you joined the faithful to serve their cause in the world, though the shadow of your past sin still lurks beyond the church’s walls. You gain access to the Criminal social trait. See the Crime and Punishment sidebar on page 23.",
                "Taken in by the Church: You spent your youth in a church or monastery serving as an acolyte or doing menial work on the grounds, either taken in as an orphan, sent there by your equally devout parents, or by taking on the faith of your own volition. The traditions and rituals of the religion served as your way of life throughout your adolescence, and you left that pious community with the skills to champion your faith in the world. You gain access to the Child of the Temple faith trait.",
                "ERROR"
            };
        while(CRR>i*10){i++;}
        return bGResult[i-1];
    }
}
