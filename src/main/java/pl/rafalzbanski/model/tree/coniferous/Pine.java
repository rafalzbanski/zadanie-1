package pl.rafalzbanski.model.tree.coniferous;

/**
 * Class representing a pine tree. (sosna)
 */
public class Pine extends ConiferousTree {
    public Pine() {
        super();
        // Specific initialization for pine
    }

    @Override
    public void grow() {
        System.out.println("Pine is growing.");
        age++;
        height += 0.8;
        trunk.grow();
    }

    // Additional methods for pine
    public void emitEssentialOil() {
        System.out.println("Pine is emitting essential oil.");
    }
}
