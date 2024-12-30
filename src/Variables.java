public class Variables {
    public int i; // instance variable declared with some default values like String null int 0 float 0.0f
    public static String name = "カカシ"; // Static variable  declared with a value and created when code executed and destroyed when execution done.

    public static void main(String[] args) {
        int age = 20; // Local variable defines within a block of code and have scope only inside block
        System.out.println("Happy Birthday " + name + "\nYou are now " + age);
    }
}
