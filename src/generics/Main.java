package generics;
import javax.swing.plaf.ListUI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.function.DoublePredicate;

public class Main {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        List<Dog> dogs = new ArrayList<>();
        List<Cat> cats = new ArrayList<>();
        List<Cub> cub = new ArrayList<>();
        List<Tiger> tiger = new ArrayList<>();
        doSomething(animals);
        doSomething(dogs);

        doAnything(tiger);
        doAnything(animals);
        //   doAnything(cub);        --> This will give error cause Cub extends(child of) Tiger and our doAnything function has Super in it so it cannot have the child class
    }

    private static void doSomething(List<? extends Animal> animals) {
        System.out.println("Inside dosomething function");
    }

    //? extends Animal -> Animal + any child class of Animal.
    //? super Animal -> Animal + parent class of Animal.

    private static void doAnything(List<? super Tiger> tiger){
        System.out.println("Inside doAnything function");
    }
}