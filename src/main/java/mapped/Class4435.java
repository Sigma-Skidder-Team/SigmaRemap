// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Comparator;

public class Class4435 implements Comparator<Class8680>
{
    private static String[] field19769;
    
    @Override
    public int compare(final Class8680 class8680, final Class8680 class8681) {
        if (class8680.method29719() != class8681.method29719()) {
            return class8680.method29719() - class8681.method29719();
        }
        if (class8680.method29720() != class8681.method29720()) {
            return class8680.method29720() - class8681.method29720();
        }
        if (class8680.method29724() == class8681.method29724()) {
            final int n = class8680.method29721() + class8680.method29722() + class8680.method29723();
            final int n2 = class8681.method29721() + class8681.method29722() + class8681.method29723();
            return (n == n2) ? 0 : (n - n2);
        }
        return class8680.method29724() - class8681.method29724();
    }
}
