// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

import java.util.Comparator;

public class Class4464 implements Comparator<Class8131>
{
    private static String[] field19820;
    public final /* synthetic */ Class8866 field19821;
    
    public Class4464(final Class8866 field19821) {
        this.field19821 = field19821;
    }
    
    @Override
    public int compare(final Class8131 class8131, final Class8131 class8132) {
        final Entity method26798 = class8131.method26798();
        final Entity method26799 = class8132.method26798();
        final float method26800 = this.field19821.field37269.player.method1732(method26798);
        final float method26801 = this.field19821.field37269.player.method1732(method26799);
        if (method26800 - method26801 < 0.0f) {
            return -1;
        }
        if (method26800 - method26801 != 0.0f) {
            return 1;
        }
        return 0;
    }
}
