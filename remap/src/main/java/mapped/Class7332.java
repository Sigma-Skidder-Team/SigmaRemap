// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util2.Direction;

import java.util.Random;

public class Class7332 implements Class7326
{
    private static String[] field28327;
    
    private Class7332() {
    }
    
    @Override
    public boolean method22483(final Class8123 class8123) {
        if (Class8123.method26745(class8123)[Direction.NORTH.getIndex()]) {
            if (!Class8123.method26747(Class8123.method26743(class8123)[Direction.NORTH.getIndex()])) {
                if (Class8123.method26745(class8123)[Direction.UP.getIndex()]) {
                    if (!Class8123.method26747(Class8123.method26743(class8123)[Direction.UP.getIndex()])) {
                        final Class8123 class8124 = Class8123.method26743(class8123)[Direction.NORTH.getIndex()];
                        return Class8123.method26745(class8124)[Direction.UP.getIndex()] && !Class8123.method26747(Class8123.method26743(class8124)[Direction.UP.getIndex()]);
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public Class4469 method22484(final Direction class179, final Class8123 class180, final Random random) {
        Class8123.method26746(class180, true);
        Class8123.method26746(Class8123.method26743(class180)[Direction.NORTH.getIndex()], true);
        Class8123.method26746(Class8123.method26743(class180)[Direction.UP.getIndex()], true);
        Class8123.method26746(Class8123.method26743(Class8123.method26743(class180)[Direction.NORTH.getIndex()])[Direction.UP.getIndex()], true);
        return new Class4532(class179, class180);
    }
}
