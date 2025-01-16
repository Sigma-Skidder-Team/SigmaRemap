// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.doubles.DoubleList;
import com.google.common.math.IntMath;

public final class Class84 implements Class83
{
    private static String[] field187;
    private final Class81 field188;
    private final int field189;
    private final int field190;
    private final int field191;
    
    public Class84(final int field189, final int field190) {
        this.field188 = new Class81((int) VoxelShapes.method24491(field189, field190));
        this.field189 = field189;
        this.field190 = field190;
        this.field191 = IntMath.gcd(field189, field190);
    }
    
    @Override
    public boolean method445(final Class9015 class9015) {
        final int n = this.field189 / this.field191;
        final int n2 = this.field190 / this.field191;
        for (int i = 0; i <= this.field188.size(); ++i) {
            if (!class9015.method32279(i / n2, i / n, i)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public DoubleList method447() {
        return (DoubleList)this.field188;
    }
}
