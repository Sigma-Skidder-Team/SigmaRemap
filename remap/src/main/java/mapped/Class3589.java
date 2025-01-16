// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;

public class Class3589 extends Class3587
{
    private static String[] field16717;
    private final Class791 field16726;
    private int field16727;
    public final /* synthetic */ Class791 field16728;
    
    public Class3589(final Class791 field16728, final Class791 field16729, final double n) {
        this.field16728 = field16728;
        super(field16729, n);
        this.field16726 = field16729;
    }
    
    @Override
    public boolean method11013() {
        if (!super.method11013() || this.field16726.method4371() != 0) {
            return false;
        }
        if (this.method11120()) {
            return true;
        }
        if (this.field16727 <= this.field16726.ticksExisted) {
            this.field16726.method4372(32);
            this.field16727 = this.field16726.ticksExisted + 600;
            if (this.field16726.method2749()) {
                Class791.method4422(this.field16726).method11166(this.field16721.method7135(Class791.method4421(), this.field16726));
            }
        }
        return false;
    }
    
    private boolean method11120() {
        final BlockPos class354 = new BlockPos(this.field16726);
        final Mutable class355 = new Mutable();
        for (int i = 0; i < 3; ++i) {
            for (boolean b = false; (b ? 1 : 0) < 8; ++b) {
                for (int j = 0; j <= (b ? 1 : 0); j = ((j <= 0) ? (1 - j) : (-j))) {
                    for (int k = (j < (b ? 1 : 0) && j > ((-b) ? 1 : 0)) ? b : 0; k <= (b ? 1 : 0); k = ((k <= 0) ? (1 - k) : (-k))) {
                        class355.method1287(class354).method1292(j, i, k);
                        if (this.field16721.getBlockState(class355).method21696() == Class7521.field29761) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
