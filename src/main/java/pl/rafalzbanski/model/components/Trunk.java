package pl.rafalzbanski.model.components;

/**
 * Class representing a trunk.
 */
public class Trunk extends CompositeComponent {
    @Override
    public void grow() {
        // Implementation of trunk growth
        System.out.println("Trunk is growing.");
        // Invoke growth on child components
        super.grow();
    }

    // Method for winter action
    public void winterAction() {
        super.winterAction();
    }
}
