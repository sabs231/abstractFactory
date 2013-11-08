/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carstore;

/**
 *
 * @author sabs231
 */
public class NissanChassis implements Chassis
{
    private String color;
    private String material;
    
    public NissanChassis()
    {
        color = "Blue";
        material = "Plastic";
        this.printInfo();
    }
    
    public NissanChassis(String c, String m)
    {
        color = c;
        material = m;
    }
    
    @Override
    public void printInfo() 
    {
        System.out.println("Creatring a new Nissan Chassis");
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
    }
    
}
