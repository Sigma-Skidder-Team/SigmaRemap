// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;
import java.util.List;

public class Class6948
{
    private static List<Class6655> field27205;
    
    public static Class8087 method21327(final int i, final Integer[] a) {
        if (i < Class6948.field27205.size()) {
            final Class6655 class6655 = Class6948.field27205.get(i);
            return class6655.method20236(new Class8087(class6655.method20237()), a);
        }
        Class8563.method28793().method34742().severe("Failed to transform particles with id " + i + " and data " + Arrays.toString(a));
        return null;
    }
    
    private static void method21328(final int n) {
        Class6948.field27205.add(new Class6655(n, null));
    }
    
    private static void method21329(final int n, final Class8191 class8191) {
        Class6948.field27205.add(new Class6655(n, class8191));
    }
    
    private static Class8191 method21330() {
        return new Class8192();
    }
    
    private static boolean method21331() {
        return ThreadLocalRandom.current().nextBoolean();
    }
    
    private static Class8191 method21332() {
        return new Class8190();
    }
    
    private static Class8191 method21333() {
        return new Class8193();
    }
    
    static {
        Class6948.field27205 = new LinkedList<Class6655>();
        method21328(34);
        method21328(19);
        method21328(18);
        method21328(21);
        method21328(4);
        method21328(43);
        method21328(22);
        method21328(42);
        method21328(42);
        method21328(6);
        method21328(14);
        method21328(37);
        method21328(30);
        method21328(12);
        method21328(26);
        method21328(17);
        method21328(0);
        method21328(44);
        method21328(10);
        method21328(9);
        method21328(1);
        method21328(24);
        method21328(32);
        method21328(33);
        method21328(35);
        method21328(15);
        method21328(23);
        method21328(31);
        method21328(-1);
        method21328(5);
        method21329(11, method21330());
        method21328(29);
        method21328(34);
        method21328(28);
        method21328(25);
        method21328(2);
        method21329(27, method21332());
        method21329(3, method21333());
        method21329(3, method21333());
        method21328(36);
        method21328(-1);
        method21328(13);
        method21328(8);
        method21328(16);
        method21328(7);
        method21328(40);
        method21329(20, method21333());
        method21328(41);
        method21328(38);
    }
}
