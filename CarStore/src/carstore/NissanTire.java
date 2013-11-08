/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carstore;

/**
 *
 * @author sabs231
 */
public class NissanTire implements Tire
{
    private int width;
    private String material;
    
    public NissanTire()
    {
        width = 11;
        material = "Rubber";
        this.printInfo();
    }
    
    public NissanTire(int w, String m)
    {
        width = w;
        material = m;
        this.printInfo();
    }
    
    @Override
    public void printInfo() 
    {
        System.out.println("Creating Nissan Tire");
        System.out.println("Width: " + width);
        System.out.println("Material: " + material);
    }
    
}
