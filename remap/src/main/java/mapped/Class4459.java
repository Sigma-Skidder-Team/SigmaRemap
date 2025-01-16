// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;

import java.util.Comparator;

public class Class4459 implements Comparator<Class8131>
{
    private static String[] field19811;
    public final /* synthetic */ Class8866 field19812;
    
    public Class4459(final Class8866 field19812) {
        this.field19812 = field19812;
    }
    
    @Override
    public int compare(final Class8131 class8131, final Class8131 class8132) {
        final Entity method26798 = class8131.method26798();
        final Entity method26799 = class8132.method26798();
        final float method26800 = ((LivingEntity)method26798).method2664();
        final float method26801 = ((LivingEntity)method26799).method2664();
        if (method26800 - method26801 < 0.0f) {
            return -1;
        }
        if (method26800 - method26801 != 0.0f) {
            return 1;
        }
        final float method26802 = this.field19812.field37269.player.method1732(method26798);
        final float method26803 = this.field19812.field37269.player.method1732(method26799);
        if (method26802 - method26803 < 0.0f) {
            return -1;
        }
        if (method26802 - method26803 != 0.0f) {
            return 1;
        }
        return 0;
    }
}
