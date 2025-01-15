// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

public class Class442 extends Class443 implements Class441
{
    private static String[] field2673;
    private final Class7096 field2674;
    private final Class1851 field2675;
    private final BlockPos field2676;
    private boolean field2677;
    
    public Class442(final Class7096 field2674, final Class1851 field2675, final BlockPos field2676, final Class8321 class8321) {
        super(new Class8321[] { class8321 });
        this.field2674 = field2674;
        this.field2675 = field2675;
        this.field2676 = field2676;
    }
    
    @Override
    public int method2254() {
        return 1;
    }
    
    @Override
    public int[] method2248(final Direction class179) {
        return (class179 != Direction.DOWN) ? new int[0] : new int[] { 0 };
    }
    
    @Override
    public boolean method2249(final int n, final Class8321 class8321, final Direction class8322) {
        return false;
    }
    
    @Override
    public boolean method2250(final int n, final Class8321 class8321, final Direction class8322) {
        if (!this.field2677) {
            if (class8322 == Direction.DOWN) {
                if (class8321.method27622() == Class7739.field31400) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public void method2161() {
        Class3965.method12101(this.field2674, this.field2675, this.field2676);
        this.field2677 = true;
    }
}
