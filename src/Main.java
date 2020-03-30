public class Main {
    public static void main(String[] args) {
        Pointer2D pointer2D1 = new Pointer2D();
        System.out.println(pointer2D1);

        Pointer2D pointer2D2= new Pointer2D(4,5);
        System.out.println(pointer2D2);

        Pointer3D pointer3D1 = new Pointer3D();
        System.out.println(pointer3D1);

        Pointer3D pointer3D2 = new Pointer3D(4, 6, 2);
        System.out.println(pointer3D2);
    }
}
