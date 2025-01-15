// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Comparator;

public class Class4456 implements Comparator
{
    private static String[] field19806;
    
    @Override
    public int compare(final Object o, final Object o2) {
        final Class8680 class8680 = (Class8680)o;
        final Class8680 class8681 = (Class8680)o2;
        if (class8680.method29719() != class8681.method29719()) {
            return class8680.method29719() - class8681.method29719();
        }
        if (class8680.method29720() != class8681.method29720()) {
            return class8680.method29720() - class8681.method29720();
        }
        final int n = class8680.method29721() + class8680.method29722() + class8680.method29723();
        final int n2 = class8681.method29721() + class8681.method29722() + class8681.method29723();
        if (n == n2) {
            return (class8680.method29724() == class8681.method29724()) ? 0 : (class8680.method29724() - class8681.method29724());
        }
        return n - n2;
    }
}
