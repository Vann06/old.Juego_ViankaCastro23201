import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class michi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class michi extends Jugador
{
    /**
     * Act - do whatever the michi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public michi()
    {
        getImage().scale(getImage().getWidth()/2,getImage().getHeight()/2);
    }
    public void act()
    {
        slideAround();
        eat();
        maxSpeed();
        Hit();
        ganaste();
    }
    public void Hit()
    {
        if(ataque())
        {
            setLocation(95,750);
        }
    }
    
}
    
