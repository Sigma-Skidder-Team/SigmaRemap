// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class9361
{
    public static void method34711(final Class7523 class7523, final String s, final int n, final int n2) {
        method34716(class7523, s, 1, n, n2, 0, Class2427.field14355);
    }
    
    public static void method34712(final Class7523 class7523, final String s, final int n, final int n2, final int n3) {
        method34716(class7523, s, 2, n, n2, n3, Class2427.field14355);
    }
    
    public static void method34713(final Class7523 class7523, final String s, final int n, final int n2, final int n3, final Class2427 class7524) {
        method34716(class7523, s, 2, n, n2, n3, class7524);
    }
    
    public static void method34714(final Class7523 class7523, final String s, final int n, final int n2, final int n3) {
        method34716(class7523, s, 3, n, n2, n3, Class2427.field14355);
    }
    
    public static void method34715(final Class7523 class7523, final String s, final int n, final int n2, final int n3, final Class2427 class7524) {
        method34716(class7523, s, 3, n, n2, n3, class7524);
    }
    
    public static final int method34716(final Class7523 class7523, final String s, final int n, final int n2, final int n3, final int n4, final Class2427 class7524) {
        final int n5 = 0;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n == 4) {
                        final int n6 = n4 - class7523.method23505(s);
                        if (n6 <= 0) {
                            class7523.method23501((float)n2, (float)n3, s, class7524);
                        }
                        return method34718(class7523, s, n2, n3, method34717(class7523, s, n6));
                    }
                }
                else {
                    class7523.method23501((float)(n2 + n4 - class7523.method23505(s)), (float)n3, s, class7524);
                }
            }
            else {
                class7523.method23501((float)(n2 + n4 / 2 - class7523.method23505(s) / 2), (float)n3, s, class7524);
            }
        }
        else {
            class7523.method23501((float)n2, (float)n3, s, class7524);
        }
        return n5;
    }
    
    private static int method34717(final Class7523 class7523, final String s, final int n) {
        int n2 = 0;
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i++) != ' ') {
                continue;
            }
            ++n2;
        }
        if (n2 > 0) {
            n2 = (n + class7523.method23505(" ") * n2) / n2;
        }
        return n2;
    }
    
    private static int method34718(final Class7523 class7523, final String s, final int n, final int n2, final int n3) {
        int i = 0;
        int n4 = n;
        while (i < s.length()) {
            int endIndex = s.indexOf(32, i);
            if (endIndex == -1) {
                endIndex = s.length();
            }
            final String substring = s.substring(i, endIndex);
            class7523.method23500((float)n4, (float)n2, substring);
            n4 += class7523.method23505(substring) + n3;
            i = endIndex + 1;
        }
        return n4;
    }
}