// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

import java.util.Comparator;

public class Class4436 implements Comparator<Class8131>
{
    private static String[] field19770;
    public final /* synthetic */ Class3211 field19771;
    
    public Class4436(final Class3211 field19771) {
        this.field19771 = field19771;
    }
    
    @Override
    public int compare(final Class8131 class8131, final Class8131 class8132) {
        final Entity method26798 = class8131.method26798();
        final Entity method26799 = class8132.method26798();
        final float method26800 = Class3211.method10096().field4684.method1732(method26798);
        final float method26801 = Class3211.method10097().field4684.method1732(method26799);
        if (method26800 - method26801 < 0.0f) {
            return -1;
        }
        if (method26800 - method26801 != 0.0f) {
            return 1;
        }
        return 0;
    }
}
