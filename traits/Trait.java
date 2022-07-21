package traits;

/**
 * Write a description of class Trait here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Trait
{
    // instance variables - replace the example below with your own
    private final int ID;
    private boolean selectable;
    private final String name;
    private final String lore;
    private final String effect;
    
    public Trait(int ID, boolean selectable, String name, String lore, String effect){
        this.ID=ID;
        this.selectable=selectable;
        this.name=name;
        this.lore=lore;
        this.effect=effect;
    }
    
    public int getID(){return ID;}
    public boolean isSelectable(){return selectable;}
    public String getName(){return name;}
    public String getLore(){return lore;}
    public String getEffect(){return effect;}
    
}
