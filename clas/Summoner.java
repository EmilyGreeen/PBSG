package clas;
/**
 * Write a description of class Summoner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Summoner implements Class
{
    public int i = 1;
    @Override
    public String setBackground(int CRR){
        String[] bGResult={    
                "Abandoned: At some point early on, you were abandoned. This sense of loss always made you feel as though something were missing. The discovery of your eidolon and your subsequent mutual bond fostered in you the sense of companionship you’ve always longed for. You gain access to the Greater Link magic trait. ",
                "Caretaker: You met your eidolon or another outsider in a moment of danger. Wounded or lost, the creature crashed between worlds and ended up at your feet. In helping this panicked, otherworldly creature, you felt a link to it. You can still draw on the inspiration from that moment when dealing with others, outsider or not. You gain access to the Destined Diplomat social trait. ",
                "Forced to Confront Your Own Limits: The bond with your eidolon first manifested when you saw someone in danger and were unable to help. Your feeling of desperation and frustration at the limits of your own form attracted your eidolon—whether or not it was able to help you in that moment. This need to exceed your own limitations continues to manifest in the evolution of your eidolon. You gain access to the Desperate Speed magic trait.",
                "Imaginary Friends: As a child, you created imaginary playmates that you felt truly spoke to and heard you. These whispers were actually the wandering thoughts of outsiders trying to make contact, knowing that someday you would have an affinity with their kind. By the time you learned to summon your eidolon and other outsiders, these whispered fragments had turned themselves into an understanding of the language of outsiders. You gain access to the Unintentional Linguist social trait.",
                "Monophobic: You were always terrified of being alone when you were younger, so you surrounded yourself with others. But it was establishing this link to your eidolon that ultimately allowed you to overcome this debilitating fear. Now, even when your eidolon is not with you, you know it’s never far away; conversely, when you have your true friend and companion with you, you are far better for it. You gain access to the Perpetual Companion faith trait.",
                "Outsider’s Lineage: You have the blood of outsiders in your veins. This lineage either laid dormant until your powers manifested or was a storied part of your family heritage. Regardless, your connection to the planes has always been potent. No matter what other subjects you studied, your understanding of planar matters has always seemed instinctive or innate rather than the product of memorization and study. You gain access to the Planar Savant faith trait. ",
                "Pick On Someone Your Own Size: When you were young, you or others you cared for were bullied by agents of an oppressive power. At some point, you stood up against one or many of the tyrants, feeling that somehow you were bigger, stronger and more resilient than you actually were. You later realized that this support was the first trace of your eidolon trying to make contact with you. You can still draw on that power today, making your aura strong and your presence powerful. You gain access to the Twinned Presence magic trait. ",
                "Raising Gone Wrong: You lost someone important to you. Through means, luck, or simple pity, you had the chance to raise that person from the dead, but something went wrong with the spell and the raising did not occur… at least not as planned. Your lost friend or kin’s soul bonded with a powerful outsider on the other side of the veil and returned to you as your eidolon. Possessed of some of the memories and experiences of the life you spent together, your companion feels a stronger devotion than even most others of its kind. You gain access to the Loyalty across Lifetimes faith trait. ",
                "Saved by Another: Someone or something saved you from great danger. It might have been a family member who saved you from a precipitous fall or adventurers who saved you from a marauding monster. Your sense of gratitude fostered a strong sense of protectiveness, particularly when defending your allies or your eidolon. You gain access to the Dedicated Defender combat trait.",
                "Stranger in Your Own Skin: You have felt awkward and uncomfortable your entire life, as if you were born into a body that wasn’t truly yours. Your quest to become what you’ve always felt you should be led you to your eidolon, in which you found what you see as your own idealized form. The link that you and your eidolon share allows you to escape some of the inherent limits of your form from time to time. You gain access to the Linked Surge magic trait.",
                "ERROR"
            };
        while(CRR>i*10){i++;}
        return bGResult[i-1];
    }
}
