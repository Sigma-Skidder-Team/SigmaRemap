// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MathHelper;

import java.util.Comparator;

public class Class4449 implements Comparator<ChunkPos>
{
    private static String[] field19789;
    private final int field19790;
    private final int field19791;
    private final double field19792;
    private final double field19793;
    
    public Class4449(final int field19790, final int field19791, final double field19792, final double a) {
        this.field19790 = field19790;
        this.field19791 = field19791;
        this.field19792 = field19792;
        this.field19793 = 1.0 - MathHelper.clamp(Math.abs(a) / 1.5707963267948966, 0.0, 1.0);
    }
    
    @Override
    public int compare(final ChunkPos class7859, final ChunkPos class7860) {
        return this.method13413(class7859) - this.method13413(class7860);
    }
    
    private int method13413(final ChunkPos class7859) {
        final int n = class7859.field32290 - this.field19790;
        final int n2 = class7859.field32291 - this.field19791;
        final int n3 = n * n + n2 * n2;
        double abs = Math.abs(MathHelper.method35693(n2, n) - this.field19792);
        if (abs > 3.141592653589793) {
            abs = 6.283185307179586 - abs;
        }
        return (int)(n3 * 1000.0 * this.field19793 * abs * abs);
    }
}
