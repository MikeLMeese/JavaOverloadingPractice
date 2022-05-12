public class Animal {

    private String name;
    private boolean isDog;

    //Start of overloaded constructors
    public Animal () {
        this.name = "";
        this.isDog = false;
    }

    public Animal (String name) {
        this.name = name;
        this.isDog = false;
    }

    public Animal (boolean isDog) {
        this.name = "";
        this.isDog = isDog;
    }
    // End of overloaded constructors

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