// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;

public class Class7331 implements Class7326
{
    private static String[] field28326;
    
    private Class7331() {
    }
    
    @Override
    public boolean method22483(final Class8123 class8123) {
        return Class8123.method26745(class8123)[Class179.field513.method779()] && !Class8123.method26747(Class8123.method26743(class8123)[Class179.field513.method779()]);
    }
    
    @Override
    public Class4469 method22484(final Class179 class179, final Class8123 class180, final Random random) {
        Class8123 class181 = class180;
        if (!Class8123.method26745(class180)[Class179.field513.method779()] || Class8123.method26747(Class8123.method26743(class180)[Class179.field513.method779()])) {
            class181 = Class8123.method26743(class180)[Class179.field514.method779()];
        }
        Class8123.method26746(class181, true);
        Class8123.method26746(Class8123.method26743(class181)[Class179.field513.method779()], true);
        return new Class4472(class179, class181);
    }
}
