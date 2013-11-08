/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carstore;

/**
 *
 * @author sabs231
 */
public class FordChassis implements Chassis
{
    private String color;
    private String material;
    
    public FordChassis()
    {
        color = "Red";
        material = "Carbon Fiber";
        this.printInfo();
    }
    
    public FordChassis(String c, String m)
    {
        color = c;
        material = m;
        this.printInfo();
    }
    
    @Override
    public void printInfo() 
    {
        System.out.println("Createing a new Ford Chassis");
        System.out.println("Color: " + color);
        System.out.println("Material: "+ material);
    }
}
