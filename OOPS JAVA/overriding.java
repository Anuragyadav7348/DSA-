

public class overriding {
    public static void main(String[] args) {
        Animal d = new Deer();
        d.eat();
    }
    
}

class Animal {
    void eat() {
        System.err.println("eats anything");
    }
}

class Deer extends  Animal {
    void eat() {
        System.err.println("eat grass");
    }
}
