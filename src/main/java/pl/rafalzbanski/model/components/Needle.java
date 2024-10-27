package pl.rafalzbanski.model.components;

import pl.rafalzbanski.model.TreeComponent;

/**
 * Class representing a needle of a coniferous tree.
 */
public class Needle extends TreeComponent {
    @Override
    public void grow() {
        // Implementation of needle growth
        System.out.println("Needle is growing.");
    }

    // Needles stay on the tree during winter
    public void stayOnTree() {
        System.out.println("Needle stays on the tree.");
    }
}
