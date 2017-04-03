import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    Actor help = new help();
    Actor reset = new ResetMaxScore();
    public static GreenfootSound bgm = new GreenfootSound("A Golden Star Is Born.mp3");
    static String playerName;
    /**
     * Constructor for objects of class Interface.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1400, 876, 1);
        addObject(new name(), 700, 206);
        addObject(new start(), 700, 550);
        addObject(help, 700, 680);
        addObject(reset, 700,813);
    }
    
    public void removeHelp() {
        removeObject(help);
    }
    
    public void removeReset() {
        removeObject(reset);
    }
    
    public void started(){
        bgm.playLoop();
    }
    public void stopped(){
        bgm.pause();
    }
}
