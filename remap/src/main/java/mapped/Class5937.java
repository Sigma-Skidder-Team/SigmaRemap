// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;

public class Class5937 extends Class5936
{
    private static String[] field24437;
    
    public Class5937(final Class4574<?> class4574, final int n, final int n2, final MutableBoundingBox class4575, final int n3, final long n4) {
        super(class4574, n, n2, class4575, n3, n4);
    }
    
    @Override
    public void method17850(final Class6346<?> class6346, final Class1795 class6347, final int n, final int n2, final Biome class6348) {
        this.field24431.add(new Class4474(new BlockPos(n * 16 + 9, 90, n2 * 16 + 9)));
        this.method17854();
    }
    
    @Override
    public BlockPos method17861() {
        return new BlockPos((this.method17859() << 4) + 9, 0, (this.method17860() << 4) + 9);
    }
}
