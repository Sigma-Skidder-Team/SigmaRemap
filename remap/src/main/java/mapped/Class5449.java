// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;

public class Class5449 extends Class5448
{
    private static String[] field22675;
    
    public Class5449(final float n) {
        super(n);
    }
    
    public boolean method16553(final Class1849 class1849, final Class787 class1850) {
        final Class8792 method6927 = class1849.method6927(new BlockPos(class1850));
        if (method6927 != null) {
            if (method6927.method30622()) {
                return super.method16538(class1849, class1850);
            }
        }
        return false;
    }
}
