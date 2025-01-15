// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;

public class Class133 extends Class126
{
    private static String[] field403;
    private final Class5770 field404;
    private final boolean field405;
    
    private Class133(final Class122[] array, final Class5770 field404, final boolean field405) {
        super(array);
        this.field404 = field404;
        this.field405 = field405;
    }
    
    @Override
    public Class8321 method639(final Class8321 class8321, final Class7529 class8322) {
        final Random method23586 = class8322.method23586();
        return Class8742.method30224(method23586, class8321, this.field404.method17159(method23586), this.field405);
    }
    
    public static Class4959 method666(final Class5770 class5770) {
        return new Class4959(class5770);
    }
}
