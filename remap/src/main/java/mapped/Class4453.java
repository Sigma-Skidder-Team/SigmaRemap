// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Comparator;

public final class Class4453 implements Comparator<PlayerEntity>
{
    private static String[] field19802;
    
    @Override
    public int compare(final PlayerEntity playerEntity, final PlayerEntity class513) {
        final float method1732 = Class4609.method13716().field4684.method1732(playerEntity);
        final float method1733 = Class4609.method13716().field4684.method1732(class513);
        if (method1732 - method1733 < 0.0f) {
            return 1;
        }
        if (method1732 - method1733 != 0.0f) {
            return -1;
        }
        return 0;
    }
}
