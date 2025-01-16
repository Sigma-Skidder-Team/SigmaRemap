// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.mods.impl.combat.InfiniteAura;
import net.minecraft.entity.Entity;

import java.util.Comparator;
import java.util.List;

public class InfiniteAuraComparator implements Comparator<Class8131>, List<Class8131> {
    private static String[] field19770;
    public final /* synthetic */ InfiniteAura infiniteAuraInstance;
    
    public InfiniteAuraComparator(final InfiniteAura infiniteAura) {
        this.infiniteAuraInstance = infiniteAura;
    }
    
    @Override
    public int compare(final Class8131 class8131, final Class8131 class8132) {
        final Entity method26798 = class8131.method26798();
        final Entity method26799 = class8132.method26798();
        final float method26800 = InfiniteAura.mc.field4684.method1732(method26798);
        final float method26801 = InfiniteAura.mc.field4684.method1732(method26799);
        if (method26800 - method26801 < 0.0f) {
            return -1;
        }
        if (method26800 - method26801 != 0.0f) {
            return 1;
        }
        return 0;
    }
}
