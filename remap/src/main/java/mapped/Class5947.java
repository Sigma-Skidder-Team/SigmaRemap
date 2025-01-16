// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;

public class Class5947 extends Class5936
{
    private static String[] field24446;
    
    public Class5947(final Class4574<?> class4574, final int n, final int n2, final MutableBoundingBox class4575, final int n3, final long n4) {
        super(class4574, n, n2, class4575, n3, n4);
    }
    
    @Override
    public void method17850(final Class6346<?> class6346, final Class1795 class6347, final int n, final int n2, final Class3090 class6348) {
        Class6449.method19302(class6347, new BlockPos(n * 16, 90, n2 * 16), Class2052.values()[this.field24436.nextInt(Class2052.values().length)], this.field24431, this.field24436, class6346.method18878(class6348, Class4535.field19964));
        this.method17854();
    }
}
