package pl.rafalzbanski.components;


import pl.rafalzbanski.tree.TreeComponent;
import java.util.ArrayList;
import java.util.List;

/**
 * Abstract class for composite components (branches, trunk).
 */
public abstract class CompositeComponent extends TreeComponent {
    // List holding child components
    protected List<TreeComponent> children = new ArrayList<>();

    // Method to add a child component
    public void add(TreeComponent component) {
        children.add(component);
    }

    // Method to remove a child component
    public void remove(TreeComponent component) {
        children.remove(component);
    }

    @Override
    public void grow() {
        // Invoke grow() on each child component
        for (TreeComponent component : children) {
            component.grow();
        }
    }

    // Method for winter action on components
    public void winterAction() {
        for (TreeComponent component : children) {
            if (component instanceof Leaf) {
                ((Leaf) component).fall();
            } else if (component instanceof CompositeComponent) {
                ((CompositeComponent) component).winterAction();
            }
        }
    }
}
