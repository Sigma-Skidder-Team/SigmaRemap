// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

import java.util.Comparator;

public class Class4439 implements Comparator<Entity>
{
    private static String[] field19775;
    public final /* synthetic */ Class3379 field19776;
    
    public Class4439(final Class3379 field19776) {
        this.field19776 = field19776;
    }
    
    @Override
    public int compare(final Entity class399, final Entity class400) {
        return (Class3167.field15514.player.method1732(class399) <= Class3167.field15514.player.method1732(class400)) ? -1 : 1;
    }
}
