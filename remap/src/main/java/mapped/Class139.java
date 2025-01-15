// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;
import java.util.Random;

public class Class139 extends Class126
{
    private static String[] field416;
    
    private Class139(final Class122[] array) {
        super(array);
    }
    
    @Override
    public Class8321 method639(final Class8321 class8321, final Class7529 class8322) {
        final Float n = class8322.method23579(Class6683.field26371);
        if (n != null) {
            final Random method23586 = class8322.method23586();
            final float n2 = 1.0f / n;
            final int method23587 = class8321.method27690();
            int n3 = 0;
            for (int i = 0; i < method23587; ++i) {
                if (method23586.nextFloat() <= n2) {
                    ++n3;
                }
            }
            class8321.method27691(n3);
        }
        return class8321;
    }
    
    public static Class4943<?> method685() {
        return Class126.method640((Function<Class122[], Class125>)Class139::new);
    }
}
