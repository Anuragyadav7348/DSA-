public class Demo1 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner inner = new Inner();
        inner.fun(outer);

        
    }

    // Static nested class 
      static class Outer {
        static int x = 4;

        
     }
     static class Inner {
        void fun(Outer outer) {
            System.err.println(outer.x);
        }

     }

}


