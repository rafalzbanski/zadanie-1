package pl.rafalzbanski.model.tree;

import pl.rafalzbanski.model.components.Trunk;

/**
 * Abstract base class for trees.
 */
public abstract class Tree {
    protected Trunk trunk;
    protected int age;
    protected double height;

    public Tree() {
        trunk = new Trunk();
        age = 0;
        height = 0.0;
    }

    // Abstract method for tree growth
    public abstract void grow();

    // Abstract method for winter behavior
    public abstract void winter();

    // Method simulating tree regeneration
    public void heal() {
        System.out.println(getClass().getSimpleName() + " is regenerating.");
    }

    // Getter for the trunk
    public Trunk getTrunk() {
        return trunk;
    }

    // Getter for tree age
    public int getAge() {
        return age;
    }

    // Getter for tree height
    public double getHeight() {
        return height;
    }
}
