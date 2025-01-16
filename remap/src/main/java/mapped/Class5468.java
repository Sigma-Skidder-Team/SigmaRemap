// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;

public class Class5468 extends Class5467
{
    private static String[] field22734;
    
    public Class5468(final int n, final float n2) {
        super(n, n2, 1);
    }
    
    @Override
    public boolean method16538(final Class1849 class1849, final LivingEntity class1850) {
        final Class8792 method6927 = class1849.method6927(new BlockPos(class1850));
        if (super.method16538(class1849, class1850)) {
            if (method6927 != null) {
                if (method6927.method30663()) {
                    if (!method6927.method30622()) {
                        if (!method6927.method30623()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
