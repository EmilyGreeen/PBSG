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
    public String[] hmldResult = {"","","","","Unusual Homeland"};
    public int[] unHmldDieValue = {10,25,40,50,60,70,80,85,90,95,100};
    public String[] unHmldResult = {"Subterranean","Mountains", "Plains", "Town or Village", "City or Metropolis", "Forest", "River, Swamp, or Wetlands", "Desert", "Sea", "Tundra", "Another Plane"};
    
    public int[] parentsDieValue = {0,0,0,100};
    public String[] parentsResult = {"Both","Father","Mother","None"};
    
    public int[] siblingsDieValue = {0,0,0,100};
    public int[] bioSiblResults = {0,0,0,0};
    public int[] adoptedSiblResults = {0,0,0,0};
    public int[] halfSiblResults = {0,0,0,0};
    
    public int[] adoptedSiblingRaceDieValue = {1, 2, 4, 5, 6, 16, 26, 27, 28, 38, 39, 40, 50, 60, 70, 71, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};
    public String[] adoptedSiblingRaceResult = {"Aasimar","Catfolk","Changeling","Dhampir","Duergar","Dwarf","Elf","Fetchling","Gillman","Gnome","Goblin","Grippli", "Half-Elf","Half-Orc","Halfling","Hobgoblin","Human","Ifrit","Kitsune","Kobold","Merfolk","Nagaji","Orc","Oread","Ratfolk","Samsaran","Strix","Suli","Svirfneblin","Sylph","Tengu","Tiefling","Undine","Vanara","Vishkanya","Wayang"};


    public String[] setEarlyLife(int[] CRR);
}
