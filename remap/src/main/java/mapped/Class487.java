// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

public class Class487 extends Class443 implements Class441
{
    private static String[] field2678;
    private final Class7096 field2797;
    private final Class1851 field2798;
    private final BlockPos field2799;
    private boolean field2800;
    
    public Class487(final Class7096 field2797, final Class1851 field2798, final BlockPos field2799) {
        super(1);
        this.field2797 = field2797;
        this.field2798 = field2798;
        this.field2799 = field2799;
    }
    
    @Override
    public int method2254() {
        return 1;
    }
    
    @Override
    public int[] method2248(final Direction class179) {
        return (class179 != Direction.UP) ? new int[0] : new int[] { 0 };
    }
    
    @Override
    public boolean method2249(final int n, final Class8321 class8321, final Direction class8322) {
        if (!this.field2800) {
            if (class8322 == Direction.UP) {
                if (Class3965.field17916.containsKey((Object)class8321.method27622())) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public boolean method2250(final int n, final Class8321 class8321, final Direction class8322) {
        return false;
    }
    
    @Override
    public void method2161() {
        final Class8321 method2157 = this.method2157(0);
        if (!method2157.method27620()) {
            this.field2800 = true;
            Class3965.method12102(this.field2797, this.field2798, this.field2799, method2157);
            this.method2159(0);
        }
    }
}
