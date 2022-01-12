// Maxx Secrest, 01/10/22, AP Data Lab, V0.4

public class Cereal
{


    private double fiber;
    private String cerealName;
    private double cups;
    private double fiberPerCup;

    public Cereal(String cerealName, double fiber, double cups, double fiberPerCup)  

    {
        name = cerealName;
        Fiber = fiber; 
        cups = cups;
        FPC = fiberPerCup;

    }

    public Cereal()
    {
        cerealName = "";
        fiber = 0.0
        cups = 0.0
        fiberPerCup = 0.0

    }

    // Getters
    public string getName()
    {
        return name;
    }

    public double getFiber()
    {
        return fiber;
    }

    public double getCups() 
    {
        return cups;
    }

    public double getFPC()
    {
        return fiberPerCup;
    }

    // toString Method

    public string toString()
    {
        return "Cereal: " + name + "Fiber Content: " + fiber + "Cups: " + cups + "Fiber Per Cup: " + fiberPerCup;
    }









}

