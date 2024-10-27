package pl.rafalzbanski.app;

import pl.rafalzbanski.model.components.Branch;
import pl.rafalzbanski.model.components.Leaf;
import pl.rafalzbanski.model.components.Needle;
import pl.rafalzbanski.model.tree.coniferous.Pine;
import pl.rafalzbanski.model.tree.deciduous.Birch;

/**
 * Main application class for testing.
 *
 */

public class Main {
    public static void main(String[] args) {

        // Creating a birch tree
        Birch birch = new Birch();

        // Adding branches and leaves to the birch
        Branch branch1 = new Branch();
        Leaf leaf1 = new Leaf();
        Leaf leaf2 = new Leaf();

        branch1.add(leaf1);
        branch1.add(leaf2);

        birch.getTrunk().add(branch1);

        // Birch tree growth
        birch.grow();
        birch.produceSap();
        System.out.println("Age of birch: " + birch.getAge());
        System.out.println("Height of birch: " + birch.getHeight() + " m");

        // Birch winter behavior
        birch.winter();

        System.out.println();

        // Creating a pine tree
        Pine pine = new Pine();

        // Adding branches and needles to the pine
        Branch branch2 = new Branch();
        Needle needle1 = new Needle();
        Needle needle2 = new Needle();

        branch2.add(needle1);
        branch2.add(needle2);

        pine.getTrunk().add(branch2);

        // Pine tree growth
        pine.grow();
        pine.produceResin();
        pine.emitEssentialOil();
        System.out.println("Age of pine: " + pine.getAge());
        System.out.println("Height of pine: " + pine.getHeight() + " m");

        // Pine winter behavior
        pine.winter();
    }
}
