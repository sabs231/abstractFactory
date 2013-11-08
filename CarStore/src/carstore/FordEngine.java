/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carstore;

/**
 *
 * @author sabs231
 */
public class FordEngine implements Engine
{
    private int valves;
    private String gas;
    
    public FordEngine()
    {
        valves = 4;
        gas = "Shell";
        this.printInfo();
    }
    
    public FordEngine(int v, String g)
    {
        valves = v;
        gas = g;
        this.printInfo();
    }
    
    @Override
    public void printInfo() 
    {
        System.out.println("Creating a Ford Engine");
        System.out.println("Valves: " + valves);
        System.out.println("Gas: " + gas);
    }
    
}
