package pl.rafalzbanski.coniferous;


import pl.rafalzbanski.tree.Tree;

/**
 * Abstract class representing a coniferous tree.
 */
public abstract class ConiferousTree extends Tree {
    @Override
    public void grow() {
        System.out.println("Coniferous tree is growing.");
        age++;
        height += 0.7; // Height increment
        trunk.grow();
    }

    @Override
    public void winter() {
        System.out.println("Coniferous tree in winter:");
        retainNeedles();
    }

    // Method indicating that needles remain on the tree
    public void retainNeedles() {
        System.out.println(getClass().getSimpleName() + " retains its needles.");
    }

    public void produceResin() {
        System.out.println(getClass().getSimpleName() + " is producing resin.");
    }
}
