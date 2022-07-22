package race;

/**
 * The basis to all the specifities of each races.
 *
 * @author  MrGreen
 * @version 1.0
 */

public interface Race
{
    public int[] hmldDieValue = {0,0,0,0,100};
    public String[] hmldResult = {
        "",
        "",
        "",
        "",
        "You grew up in an Unusual Homeland for your people:"
    };

    public int[] unHmldDieValue = {10,25,40,50,60,70,80,85,90,95,100};
    public String[] unHmldResult = {
        "You were raised in a deam Subterranean home.",
        "You were raised in rugged Badlands or the harsh terrain of a Mountainous region.", 
        "You were raised on the rolling Plains or under the sun of the Savannah.", 
        "You were raised in a Town or Village where your kind were few outside of your family.", 
        "You were raised in a City or Metropolis where your kind were few outside of your family.", 
        "You were raised in the Forest.", 
        "You were 'raised' in the River, Swamp, or Wetlands and water has been a central part of your life.", 
        "You were raised in the sweltering heat of the Desert.", 
        "You were raised at Sea.", 
        "You were raised in the far reaches of the cold north/south, the freezing Tundra was your home.", 
        "You were raised in Another Plane, the Great Beyond has no secret from you."
    };
    
    public int[] parentsDieValue = {0,0,0,100};
    public String[] parentsResult = {
        "Both parents living.",
        "Only your father is alive.",
        "Only your mother is alive.",
        "Both parents dead"
    };

    public int[] siblingsDieValue = {0,0,0,100};
    public int[] bioSiblResults = {0,0,0,0};
    public int[] adoptedSiblResults = {0,0,0,0};
    public int[] halfSiblResults = {0,0,0,0};
    
    public int[] adoptedSiblingRaceDieValue = {1, 2, 4, 5, 6, 16, 26, 27, 28, 38, 39, 40, 50, 60, 70, 71, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};
    public String[] adoptedSiblingRaceResult = {
        "Aasimar",
        "Catfolk",
        "Changeling",
        "Dhampir",
        "Duergar",
        "Dwarf",
        "Elf",
        "Fetchling",
        "Gillman",
        "Gnome",
        "Goblin",
        "Grippli", 
        "Half-Elf",
        "Half-Orc",
        "Halfling",
        "Hobgoblin",
        "Human",
        "Ifrit",
        "Kitsune",
        "Kobold",
        "Merfolk",
        "Nagaji",
        "Orc",
        "Oread",
        "Ratfolk",
        "Samsaran",
        "Strix",
        "Suli",
        "Svirfneblin",
        "Sylph",
        "Tengu",
        "Tiefling",
        "Undine",
        "Vanara",
        "Vishkanya",
        "Wayang"
    };

    public String[] setEarlyLife(int[] CRR);
}
