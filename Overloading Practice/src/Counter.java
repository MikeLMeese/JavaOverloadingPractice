public class Counter {

    private int value;

    public Counter (int startValue) {
        this.value = startValue;
    }

    public Counter () {
        this.value = 0;
    }

    public int value() {
        return value;
    }

    public void increase() {
        this.value = value += 1;
    }

    public void decrease() {
        this.value = value -=1;
    }

    public void increase (int increaseBy) {
        if (increaseBy > 0) {
            value += increaseBy;
        } else {
            return;
        }
    }

    public void decrease (int decreaseBy) {
        if (decreaseBy > 0) {
            value -= decreaseBy;
        } else {
            return;
        }
    }

    @Override
    public String toString() {
        return "Counter: " + value;
    }
}