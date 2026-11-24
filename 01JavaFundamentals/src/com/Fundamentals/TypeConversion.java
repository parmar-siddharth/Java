package com.Fundamentals;

public class TypeConversion {
    static void main() {
        /// Implicit type conversion : Java automatically converts it
        /// it goes smaller to higher
        /// java widening order
        /// byte => short => int => long => float => double

        byte b = 24;
        int a = b ;
        System.out.println(a);

        long l = 45;
        float f = l;
        System.out.println(f);

        /// Explicit type coversion : when you manually convert larger data type into smaller data type

        double d = 10.75;
        int c = (int) d;

        System.out.println(d);

        long m = 9148764280L;
        int n = (int) m; // long is 64 bit and int is only 32 bit
        System.out.println(m);

        int i = 300;
        byte x = (byte) i;
        System.out.println(x);

        /// char to int
        char c1 = '9';
        int num = c1;
        System.out.println(num);

        /// Java use unicode (UTF-16) for character encoding 
    }
}
