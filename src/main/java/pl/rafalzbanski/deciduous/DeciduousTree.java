package pl.rafalzbanski.deciduous;

import pl.rafalzbanski.tree.Tree;

/**
 * Abstract class representing a deciduous tree.
 */
public abstract class DeciduousTree extends Tree {
    @Override
    public void grow() {
        System.out.println("Deciduous tree is growing.");
        age++;
        height += 0.5; // Height increment
        trunk.grow();
    }

    @Override
    public void winter() {
        System.out.println("Deciduous tree in winter:");
        shedLeaves();
    }

    // Method for shedding leaves
    public void shedLeaves() {
        System.out.println(getClass().getSimpleName() + " is shedding leaves.");
        // Invoke winter action on the trunk
        trunk.winterAction();
    }
}
