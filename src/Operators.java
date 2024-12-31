public class Operators {
    public static void main(String[] args){
        // Operators in java
        // 1. is Binary operators
        int i = 1;
        ++i; // Post increment operator by 1
        i++; // Increment the variable by 1
        i--; // Decrement by 1
        System.out.println(i);

        // 2. Urinary Operators
        int x=10, y=20;
        System.out.println(x+y); // This operations are in between two values  for ex. add(+) subtract(-) multiply(*) divide(/)
        String name = "Sonu", surname = "Sid";
        System.out.println(name+surname); // In case of strings + operator concatenates the two strings as an Urinary operation

        // 3. Logical operations || Logic Operations Returns a boolean value either True Or False
        System.out.println(x<y);
        System.out.println(x>y);
        System.out.println(x==y); // in programming we use 2 = signs to check equality
        System.out.println(x<=y);
        System.out.println(x>=y);

        // 4. Assignment Operator
        // use to assign a value to a variable
        int z = 50;
        z = z + 10;
        System.out.println(z);
    }
}
