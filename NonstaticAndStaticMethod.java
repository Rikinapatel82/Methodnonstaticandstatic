package nonstaticandstaticpackage;

public class NonstaticAndStaticMethod {
    void mymethod(){
        System.out.println("NONSTATIC METHOD");
    }
        static void mymethod(int a) {
            System.out.println("STATIC METHOD");
        }

    public static void main(String[] args) {
        NonstaticAndStaticMethod obj =new NonstaticAndStaticMethod();
        obj.mymethod();
        obj.mymethod( 0);
    }

            }

