public interface Electronics {
    boolean on();
    boolean off();
    boolean onOroff = false;
    default void electronic() {
        if (onOroff) {
            System.out.println("Default status is inactive");
        }
    }
}
