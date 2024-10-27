package pl.rafalzbanski.model.tree.deciduous;

/**
 * Class representing a birch tree. (brzoza)
 */
public class Birch extends DeciduousTree {
    public Birch() {
        super();
        // Specific initialization for birch
    }

    @Override
    public void grow() {
        System.out.println("Birch is growing.");
        age++;
        height += 0.6;
        trunk.grow();
    }

    // Additional methods for birch
    public void produceSap() {
        System.out.println("Birch is producing sap.");
    }
}
