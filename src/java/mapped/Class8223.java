// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import java.util.List;

public class Class8223
{
    private static String[] field33780;
    
    public static int method27248(final List<? extends Class6826> list) {
        int n = 0;
        for (int i = 0; i < list.size(); ++i) {
            n += list.get(i).field26816;
        }
        return n;
    }
    
    public static <T extends Class6826> T method27249(final Random random, final List<T> list, final int bound) {
        if (bound > 0) {
            return method27250(list, random.nextInt(bound));
        }
        throw Class8349.method27859(new IllegalArgumentException());
    }
    
    public static <T extends Class6826> T method27250(final List<T> list, int n) {
        for (int i = 0; i < list.size(); ++i) {
            final Class6826 class6826 = list.get(i);
            n -= class6826.field26816;
            if (n < 0) {
                return (T)class6826;
            }
        }
        return null;
    }
    
    public static <T extends Class6826> T method27251(final Random random, final List<T> list) {
        return method27249(random, list, method27248(list));
    }
}
