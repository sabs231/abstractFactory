/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carstore;

/**
 *
 * @author sabs231
 */
public class NissanWindow implements Window
{

    private int width;
    private boolean protection;
    
    public NissanWindow()
    {
        width = 7;
        protection = true;
        this.printInfo();
    }
    
    public NissanWindow(int w, boolean p)
    {
        width = w;
        protection = p;
        this.printInfo();
    }
    
    @Override
    public void printInfo() 
    {
        System.out.println("Creating Nissan Window");
        System.out.println("Width: " + width);
        System.out.println("Protection: " + protection);
    }
    
}
