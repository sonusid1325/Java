public class DataTypes {
    public static void main(String[] args){
        boolean bool = true; // Stores True or false value {1 byte}
        byte numByte = 8; // Stores a 8bit data  {1 byte}
        short shortNum = 10; // SStores a 16 bit value in memory (2 byte)
        int num = 12; // Stores a number (integer) value in memory (32bit) (4 byte)
        long longNum = 14; // Stores a number (Integer) of  64 bit in memory (8 byte)
        float floatNum = 16.2f ; // Stores a floating point number ends with f in memory (4 byte)
        double doubleNum = 18.4; // Stores a decimal value (8 Byte)
        char c = 'C'; // Stores a single character in memory between single quotes ( '2 bytes' )
        String str = "String"; // Stores a set of characters in memory (Size depends on length)

        System.out.println(bool);
        System.out.println(numByte);
        System.out.println(shortNum);
        System.out.println(num);
        System.out.println(longNum);
        System.out.println(floatNum);
        System.out.println(doubleNum);
        System.out.println(c);
        System.out.println(str);
    }
}
