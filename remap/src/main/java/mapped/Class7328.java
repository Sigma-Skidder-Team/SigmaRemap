// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

import java.util.Random;

public class Class7328 implements Class7326
{
    private static String[] field28323;
    
    private Class7328() {
    }
    
    @Override
    public boolean method22483(final Class8123 class8123) {
        return Class8123.method26745(class8123)[Direction.UP.getIndex()] && !Class8123.method26747(Class8123.method26743(class8123)[Direction.UP.getIndex()]);
    }
    
    @Override
    public Class4469 method22484(final Direction class179, final Class8123 class180, final Random random) {
        Class8123.method26746(class180, true);
        Class8123.method26746(Class8123.method26743(class180)[Direction.UP.getIndex()], true);
        return new Class4525(class179, class180);
    }
}