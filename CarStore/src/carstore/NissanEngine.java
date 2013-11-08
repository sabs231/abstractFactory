/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carstore;

/**
 *
 * @author sabs231
 */
public class NissanEngine implements Engine
{
    private int valves;
    private String gas;
    
    public NissanEngine()
    {
        valves = 6;
        gas = "Super";
        this.printInfo();
    }
    
    public NissanEngine(int v, String g)
    {
        valves = v;
        gas = g;
        this.printInfo();
    }
    
    @Override
    public void printInfo() 
    {
        System.out.println("Creating a Nissan Engine");
        System.out.println("Valves: " + valves);
        System.out.println("Gas: " + gas);
    }
    
}
