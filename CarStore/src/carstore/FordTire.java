/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carstore;

/**
 *
 * @author sabs231
 */
public class FordTire implements Tire
{
    private int width;
    private String material;
    
    public FordTire()
    {
        width = 10;
        material = "Rubber";
        this.printInfo();
    }
    
    public FordTire(int w, String m)
    {
        width = w;
        material = m;
        this.printInfo();
    }
    
    @Override
    public void printInfo() 
    {
        System.out.println("Creating Ford Tire");
        System.out.println("Width: " + width);
        System.out.println("Material: " + material);
    }
    
}
