/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carstore;

/**
 *
 * @author sabs231
 */
public class FordWindow implements Window
{
    private int width;
    private boolean protection;
    
    public FordWindow()
    {
        width = 5;
        protection = false;
        this.printInfo();
    }
    
    public FordWindow(int w, boolean p)
    {
        width = w;
        protection = p;
        this.printInfo();
    }
    
    @Override
    public void printInfo() 
    {
        System.out.println("Creating Ford Window");
        System.out.println("Width: " + width);
        System.out.println("Protection: " + protection);
    }
    
}
