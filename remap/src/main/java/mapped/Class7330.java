// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

import java.util.Random;

public class Class7330 implements Class7326
{
    private static String[] field28325;
    
    private Class7330() {
    }
    
    @Override
    public boolean method22483(final Class8123 class8123) {
        if (!Class8123.method26745(class8123)[Direction.WEST.getIndex()]) {
            if (!Class8123.method26745(class8123)[Direction.EAST.getIndex()]) {
                if (!Class8123.method26745(class8123)[Direction.NORTH.getIndex()]) {
                    if (!Class8123.method26745(class8123)[Direction.SOUTH.getIndex()]) {
                        if (!Class8123.method26745(class8123)[Direction.UP.getIndex()]) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public Class4469 method22484(final Direction class179, final Class8123 class180, final Random random) {
        Class8123.method26746(class180, true);
        return new Class4529(class179, class180);
    }
}
