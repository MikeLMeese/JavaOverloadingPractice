public class CounterMain {

    public static void main(String[] args) throws Exception {

        // Constructor that constructs counter with "startValue"
        Counter counter1 = new Counter(10);
        System.out.println("Counter: " + counter1.value());

        // Constructor that construct counter
        Counter counter2 = new Counter();
        System.out.println("Counter: " + counter2.value());

        // Using all methods on counter1
        System.out.println("counter1 methods");
        System.out.println(counter1.value());

        counter1.increase();
        System.out.println(counter1.value());

        counter1.decrease();
        System.out.println(counter1.value());

        counter1.increase(20);
        System.out.println(counter1.value());

        counter1.increase(-20);
        System.out.println(counter1.value());

        counter1.decrease(15);
        System.out.println(counter1.value());

        counter1.decrease(-15);
        System.out.println(counter1.value());

        // Using all methods on counter2
        System.out.println("counter2 methods");
        System.out.println(counter2.value());

        counter2.increase();
        System.out.println(counter2.value());

        counter2.decrease();
        System.out.println(counter2.value());

        counter2.increase(100);
        System.out.println(counter2.value());

        counter2.increase(-100);
        System.out.println(counter2.value());

        counter2.decrease(40);
        System.out.println(counter2.value());
        
        counter2.decrease(-40);
        System.out.println(counter2.value());
    }
}