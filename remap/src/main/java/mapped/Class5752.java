// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;

public class Class5752 extends CancellableEvent2
{
    private static String[] field23345;
    private final int field23346;
    private final boolean field23347;
    private final BlockPos field23348;
    
    public Class5752(final int field23346, final boolean field23347, final BlockPos field23348) {
        this.field23346 = field23346;
        this.field23347 = field23347;
        this.field23348 = field23348;
    }
    
    public int method17061() {
        return this.field23346;
    }
    
    public boolean method17062() {
        return this.field23347;
    }
    
    public BlockPos method17063() {
        return this.field23348;
    }
}
