public class Animal {

    private String name;
    private boolean isDog;

    public Animal (String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    public String getName() {
        return name;
    }

    public boolean checkIfDog() {
        return isDog;
    }

    @Override
    public String toString() {
        return getName() + " is a dog = " + checkIfDog();
    }
}