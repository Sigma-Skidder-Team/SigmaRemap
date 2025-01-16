// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

import java.util.Comparator;

public class Class4431 implements Comparator<Class8131>
{
    private static String[] field19764;
    public final /* synthetic */ Class8866 field19765;
    
    public Class4431(final Class8866 field19765) {
        this.field19765 = field19765;
    }
    
    @Override
    public int compare(final Class8131 class8131, final Class8131 class8132) {
        final Entity method26798 = class8131.method26798();
        final Entity method26799 = class8132.method26798();
        final Entity class8133 = (Class3376.field16061 != null && Class3376.field16061.method26798() != null) ? Class3376.field16061.method26798() : this.field19765.field37269.player;
        final float method26800 = class8133.method1732(method26798);
        final float method26801 = class8133.method1732(method26799);
        if (method26800 - method26801 < 0.0f) {
            return -1;
        }
        if (method26800 - method26801 != 0.0f) {
            return 1;
        }
        return 0;
    }
}
