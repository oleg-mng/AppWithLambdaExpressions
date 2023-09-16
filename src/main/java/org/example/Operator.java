package org.example;

import java.util.function.DoubleUnaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.UnaryOperator;

/**
 * LambdaExpressions
 * example_1
 */

public class Operator {
    public static int a = 10;
    public static int b = 20;
    public static int c = 30;

    public static IntBinaryOperator binaryOperator = (x, y) -> {
        x = (x > y) ? x : y;
        return x;
    };

    /**
     * Closures
     */

    public static DoubleUnaryOperator unaryOperator = (x) -> {
        x = a * x * x + b * x + c;
        return x;
    };

    public static void main(String[] args) {
        System.out.println(binaryOperator.applyAsInt(6, 7));
        System.out.println(unaryOperator.applyAsDouble(1.5));

    }
}

/**
 * LambdaExpressions
 * example_2
 */

class PrefixSuffixOperator {

    public static final String PREFIX = "__pref__";
    public static final String SUFFIX = "__suff__";

    public static UnaryOperator<String> operator = (x) ->{
        x = x.trim().replaceAll("\\s+", "");
        x = PREFIX + x + SUFFIX;
        return x;
    };


    public static void main(String[] args) {
        System.out.println(operator.apply(" rtty    "));
    }
}

/**
 * LambdaExpressions
 * example_3
 */

//class Operator {
//
//    public static LongUnaryOperator unaryOperator = (x) -> {
//        x = (x % 2 == 0) ? x + 2 : x + 1;
//        return x;
//    };
//
//    public static void main(String[] args) {
//        System.out.println(unaryOperator.applyAsLong(5));
//    }
//}

/**
 * LambdaExpressions
 * example_4
 */

//import java.util.*;
//import java.util.function.*;
//
//
//public class Main {
//
//    public static <T> void applyFunction(T[] array, Function<T, T> func) {
//        for (int i = 0; i < array.length; i++) {
//            array[i] = func.apply(array[i]);
//
//        }
//    }
//
//
//    // do not change code below
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String method = scanner.nextLine();
//        String[] array = scanner.nextLine().split(" ");
//        applyFunction(array,
//                "lower".equals(method) ? String::toLowerCase :
//                        "upper".equals(method) ? String::toUpperCase :
//                                "new".equals(method) ? String::new :
//                                        "trim".equals(method) ? String::trim : String::intern);
//        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
//    }
//}

/**
 * Generics and Object
 * example_1
 */

//class NonGenericClass {
//
//    private Object val;
//
//    public NonGenericClass(Object val) {
//        this.val = val;
//    }
//
//    public Object get() {
//        return val;
//    }
//
//    public static void main(String[] args) {
//        NonGenericClass instance = new NonGenericClass("Hello");
////        Integer num = (Integer) instance.get();
////        String str = instance.get();
////        Object obj = instance.get();
//        String str = (String) instance.get();
//    }
//}

/**
 * Generics and Object
 * example_2
 */
//
//class Holder<T> {
//    private T value;
//
//    public void set(T value) {
//        this.value = value;
//    }
//
//    public T get() {
//        return value;
//    }
//}
//
//class Main {
//    public static void main(String... args) {
//        // initialize an instance of Holder to make the code below compiled
//        Holder <String> holder = new Holder();
//
//        // do not change the code below
//        holder.set("This is an instance of String");
//
//        String value = holder.get();
//        System.out.println(value);
//    }
//}

/**
 * Generics and Object
 * example_3
 */

/**

 Object-based box class that requires casting every time you want to get some specific stuff from it, e.g.:

 Box cakeBox = new Box();
 cakeBox.put(new Cake());
 // Without casting only object can be retrieved out of the box
 Cake cake = (Cake) cakeBox.get();

 Casting is not desirable and can fall at runtime, could you create more... generic solution?

 */
//class Box<T> {
//
//    private T item;
//
//    public void put(T item) {
//        this.item = item;
//    }
//
//    public T get() {
//        return this.item;
//    }
//
//}

/**
 * Generics and Object
 * example_4
 */
//class Box<T> {
//    T value;
//
//    void set(T value) {
//        this.value = value;
//    }
//
//    public static void main(String[] args) {
////        Box<String> box = new Box<>();
////        box.set(10L);
//        Box box = new Box();
//        box.set(10L);
//
//    }
//}

/**
 * Generics and Object
 * example_5
 */

//class Holder {
//    private Object value;
//
//    public void set(Object value) {
//        this.value = value;
//    }
//
//    public Object get() {
//        return value;
//    }
//}
//
//class Main {
//    public static void main(String... args) {
//        Holder holder = new Holder();
//        holder.set(256);
//        Object value = holder.get();
//        System.out.println(value);
//    }
//}

/**
 * Generics and Object
 * example_6
 */

//public class Box {
//    private Object object;
//    public void set(Object object) { this.object = object; }
//    public Object get() { return object; }
//}

//public class GenericBox<T> {
//    private T t;
//    public void set(T t) { this.t = t; }
//    public T get() { return t; }
//
//    public static void main(String[] args) {
//        GenericBox<Integer> genericBox = new GenericBox();
//        genericBox.set(123);
//        System.out.println(genericBox.get());
//    }
//}





