// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

import java.util.Comparator;

public final class Class4447 implements Comparator<Entity>
{
    private static String[] field19786;
    
    @Override
    public int compare(final Entity class399, final Entity class400) {
        final float method1732 = Class4609.method13716().field4684.method1732(class399);
        final float method1733 = Class4609.method13716().field4684.method1732(class400);
        if (method1732 - method1733 < 0.0f) {
            return -1;
        }
        if (method1732 - method1733 != 0.0f) {
            return 1;
        }
        return 0;
    }
}
