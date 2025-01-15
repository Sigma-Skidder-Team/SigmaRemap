// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;
import java.util.Date;
import java.util.Map;

public final class Class8509
{
    private static char[] field34907;
    private static int field34908;
    private static int field34909;
    private static String field34910;
    private static Map<Character, Integer> field34911;
    
    private Class8509() {
    }
    
    public static String method28427(final long n) {
        final StringBuilder sb = new StringBuilder();
        long n2 = n;
        do {
            sb.insert(0, Class8509.field34907[(int)(n2 % Class8509.field34908)]);
            n2 /= Class8509.field34908;
        } while (n2 > 0L);
        return sb.toString();
    }
    
    public static long method28428(final String s) {
        long n = 0L;
        final char[] charArray = s.toCharArray();
        for (int length = charArray.length, i = 0; i < length; ++i) {
            n = n * Class8509.field34908 + Class8509.field34911.get(charArray[i]);
        }
        return n;
    }
    
    public static String method28429() {
        final String method28427 = method28427(new Date().getTime());
        if (method28427.equals(Class8509.field34910)) {
            return method28427 + "." + method28427(Class8509.field34909++);
        }
        Class8509.field34909 = 0;
        return Class8509.field34910 = method28427;
    }
    
    static {
        Class8509.field34907 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz-_".toCharArray();
        Class8509.field34908 = Class8509.field34907.length;
        Class8509.field34909 = 0;
        Class8509.field34911 = new HashMap<Character, Integer>(Class8509.field34908);
        for (int i = 0; i < Class8509.field34908; ++i) {
            Class8509.field34911.put(Class8509.field34907[i], i);
        }
    }
}
