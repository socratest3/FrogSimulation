public class Main
{
    public static void main(String[] args)
    {
        FrogSimulation sim = new FrogSimulation(24, 5);
        FrogSimulation lim = new FrogSimulation(24, 4);
        FrogSimulation dim = new FrogSimulation(31, 3);
        FrogSimulation kim = new FrogSimulation(18, 5);
System.out.println(sim.runSimulations(4));
    }
}
