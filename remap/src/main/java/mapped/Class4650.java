// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Class4650 extends Class4648
{
    private static String[] field20134;
    public final /* synthetic */ Class494 field20135;
    
    public Class4650(final Class494 field20135) {
        this.field20135 = field20135;
    }
    
    @Override
    public void method13894(final int n) {
        this.field20135.field2656.method6763(this.field20135.field2657, Blocks.SPAWNER, n, 0);
    }
    
    @Override
    public World method13895() {
        return this.field20135.field2656;
    }
    
    @Override
    public BlockPos method13896() {
        return this.field20135.field2657;
    }
    
    @Override
    public void method13893(final Class6829 class6829) {
        super.method13893(class6829);
        if (this.method13895() != null) {
            final BlockState method6701 = this.method13895().getBlockState(this.method13896());
            this.method13895().method6693(this.field20135.field2657, method6701, method6701, 4);
        }
    }
}
