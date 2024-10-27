package pl.rafalzbanski.model.components;

import pl.rafalzbanski.model.TreeComponent;

/**
 * Class representing a leaf of a deciduous tree.
 */
public class Leaf extends TreeComponent {
    @Override
    public void grow() {
        // Implementation of leaf growth
        System.out.println("Leaf is growing.");
    }

    // Method simulating leaf falling
    public void fall() {
        System.out.println("Leaf falls to the ground.");
    }
}
