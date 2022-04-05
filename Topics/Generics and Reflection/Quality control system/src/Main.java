import java.util.ArrayList;
import java.util.List;

class QualityControl {


    public static void main(String[] args) {

        final Box<Cake> box = new Box<>();

        box.put(new Cake());

        System.out.println(check(new ArrayList<>(){{
            add(new Box()); // case 1 Box without value
            //add(box); // case 2 Correct value
        }}));

        List list = new ArrayList();

        final Box<Paper> box2 = new Box<>();
        box2.put(new Paper());
        //list.add(box2);   // case 3 when Box contain non Bakery subclass

        list.add("word");   // case 3 when List contain non Box

        System.out.println(check(list));

    }


    public static boolean check(List<Box<? extends Bakery>> boxes) {
        // Add implementation here

        for (Object o: boxes) {
            if(!(o instanceof Box)) return false;
            if (o == null) return false;

            Box box = (Box) o;
            Object raw = box.get();
            if (raw == null) return false;
            if(!(raw instanceof Bakery)) return false;
        }

        return true;
    }

}

// Don't change the code below
class Bakery { }

class Cake extends Bakery { }

class Pie extends Bakery { }

class Tart extends Bakery { }

class Paper { }

class Box<T> {

    private T item;

    public void put(T item) {
        this.item = item;
    }

    public T get() {
        return this.item;
    }
}
