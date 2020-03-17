public abstract class AbstractAnimal {
    public final String name;
    public AbstractAnimal(String name) {
        this.name = name;
    }

    public abstract void cry();
}
