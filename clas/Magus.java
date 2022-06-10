package clas;
/**
 * Write a description of class Magus here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Magus implements Class
{
    public int i = 1;
    @Override
    public String setBackground(int CRR){
        String[] bGResult={    
                "A Mage without Magic: Early in your arcane training, you were exposed to antimagic. The powerlessness you felt from all of your magic being stripped away left you feeling desperate and helpless. You vowed to never be that helpless child again, to be strong in such moments, putting you on the path of the magus. You gain access to the Dispelled Battler combat trait. ",
                "Conflicting Legacy: You were born to a family or clan with two great pedigrees: one of magic and one of battle. Unable to choose either path for fear of alienating a mentor or parent, you sought to master both. Your dedication to the blending of martial and magical has been so intense that your martial prowess feeds your arcane power. You gain access to the Arcane Revitalization magic trait.",
                "Ready for Anything: For you, the path of the magus is not about the fluid blend of disparate fields of study or conquering an insurmountable challenge, but the art of preparation for any obstacle that comes your way. A dedicated and logical person, you hone the magus affinity for operating all manner of magical devices from blind luck to a refined procedure. You gain access to the Pragmatic Activator magic trait.",
                "Lost Teacher: Your magus training was interrupted when you lost your teacher through the displacement of your family, lack of funds to continue schooling, or the teacher’s unexpected death. Despite this hardship, the time you spent with your mentor had already sown the seeds of your training and you’ve been able to continue on your own in the time since—ceaselessly seeking, reading, and learning from any magical text you can find. You gain access to the SelfTaught Scholar magic trait. ",
                "Promise Keeper: Your dreams of becoming a wizard were cut short by unfortunate circumstances, such as the death of your family or clan’s matriarch or patriarch, hostile invading forces, conscription in the army, and so on. This forced you to become a protector and stunted the growth of your studies. Though you have successfully blended the two disciplines, you still long for the unfulfilled potential of your career as a wizard. You gain access to the Cross-Disciplined magic trait. ",
                "Shameful Secret: You come from either a proud military and martial background or a legacy of skilled wizards. When you developed an aptitude for two different powers viewed as incompatible by your family or teachers, it drove you to hide half of your abilities and to pretend full-blown competency with the other. Some of the tricks you used to perpetrate this deception have stayed with you to this day. You gain access to the Partial Protege magic trait. ",
                "Spell Backfire: At some point during your magical training, you attempted to cast a spell and failed. But rather than being wasted, the arcane energy reabsorbed itself into your body, waiting to be reused in some other way. When the arcane energy exploded outward through your staff or some other instrument you wielded, you received your first glimpse of the ways that magic could be repurposed—a versatility you retain today. You gain access to the Malleable Magic magic trait. ",
                "Spell’s Edge: The first time you held a magic weapon and felt the thrum of arcane energy within, you knew that magic and melee were meant to be joined. Since that moment, magic weaponry has become symbolic of the most potent syntheses of your magus training, and your ability to create magical weapons and imbue mundane arms with magic still resonates with this focus. You gain access to the Bladed Magic magic trait. ",
                "Vindication: You spent your formative years trying to convince combat instructors of the virtues of magic and arcane mentors of the importance of strength in arms, only to be mocked and exiled from both disciplines. Since then, you’ve wandered from master to master, honing your knowledge of both fields of study to show them all that not only have you achieved power, but you’ve also eclipsed all those who shunned you. You gain access to the Arcane Temper magic trait. ",
                "What If: You don’t know the meaning of impossible. Everyone around you thinks you have your head stuck in the clouds, but you continually strive to achieve things that have never been accomplished before—perhaps things that have never even been dreamed of. Bucking convention has brought numerous failures, but you’ve learned from your mistakes and are able to snatch victory over seemingly impossible odds. You gain access to the Inspired faith trait.",
                "ERROR"
            };
        while(CRR>i*10){i++;}
        return bGResult[i-1];
    }
}
