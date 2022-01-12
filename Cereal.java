// Maxx Secrest, 01/10/22, AP Data Lab, V0.4

public class Cereal
{


    private double fiber;
    private String name;
    private double cups;
    private double FPC;

    public Cereal(String name, double fiber, double cups, double FPC)  

    {
        name = name;
        fiber = fiber; 
        cups = cups;
        FPC = FPC;

    }

    public Cereal()
    {
        name = "";
        fiber = 0.0;
        cups = 0.0;
        FPC = 0.0;

    }

    // Getters
    public String getName()
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
        return FPC;
    }

    // toString Method

    public String toString()
    {
        return "Cereal: " + name + "\nFiber Content: " + fiber + "\nCups: " + cups + "\nFiber Per Cup: " + FPC;
    }


public static void main(String[] args) 
{

   Cereal food1 = new Cereal();
   System.out.println(food1.toString());

   Cereal food2 = new Cereal("Cheerios",2.0,1.25,0.0);
   System.out.println(food2.toString());
   
   Cereal food3 = new Cereal ("Raisin Bran",5.0,0.75,0.0);
   System.out.println(food3.toString());
   
   //Cereal food4

}








}

