package pl.rafalzbanski.model.components;

/**
 * Class representing a branch.
 */
public class Branch extends CompositeComponent {
    @Override
    public void grow() {
        // Implementation of branch growth
        System.out.println("Branch is growing.");
        // Invoke growth on child components
        super.grow();
    }

    // Method for winter action
    public void winterAction() {
        super.winterAction();
    }
}
