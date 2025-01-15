// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;

public class Class5943 extends Class5936
{
    private static String[] field24442;
    
    public Class5943(final Class4574<?> class4574, final int n, final int n2, final Class6997 class4575, final int n3, final long n4) {
        super(class4574, n, n2, class4575, n3, n4);
    }
    
    @Override
    public void method17850(final Class6346<?> class6346, final Class1795 class6347, final int n, final int n2, final Class3090 class6348) {
        final Class2052 class6349 = Class2052.values()[this.field24436.nextInt(Class2052.values().length)];
        final int method13602 = Class4578.method13602(n, n2, class6346);
        if (method13602 >= 60) {
            Class7699.method24513(class6347, new Class354(n * 16 + 8, method13602, n2 * 16 + 8), class6349, this.field24431, this.field24436);
            this.method17854();
        }
    }
}
