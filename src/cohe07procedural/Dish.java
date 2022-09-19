package cohe07procedural;

public interface Dish {
    void addIngredient(Ingredient ingredient);
    public void mix();
    public void cook();
    public void serve();
    
    public default void prepare() {
    	mix();
    	cook();
    	serve();
    }
}