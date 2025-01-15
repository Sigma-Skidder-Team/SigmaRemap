// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;

public class Class7325 implements Class7326
{
    private static String[] field28321;
    
    private Class7325() {
    }
    
    @Override
    public boolean method22483(final Class8123 class8123) {
        return Class8123.method26745(class8123)[Class179.field516.method779()] && !Class8123.method26747(Class8123.method26743(class8123)[Class179.field516.method779()]);
    }
    
    @Override
    public Class4469 method22484(final Class179 class179, final Class8123 class180, final Random random) {
        Class8123.method26746(class180, true);
        Class8123.method26746(Class8123.method26743(class180)[Class179.field516.method779()], true);
        return new Class4526(class179, class180);
    }
}
