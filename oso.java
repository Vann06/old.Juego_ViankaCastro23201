import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class oso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class oso extends Malitos
{
    /**
     * Act - do whatever the oso wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public oso()
    {
        getImage().scale(getImage().getWidth(),getImage().getHeight());
    }
    public void act()
    {
        move(4);
        esquinas();
    }
}
