// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;

public class Class5417 extends Class5418
{
    private static String[] field22588;
    
    public Class5417(final float n) {
        super(n);
    }
    
    @Override
    public boolean method16538(final Class1849 class1849, final LivingEntity class1850) {
        final Class8792 method6927 = class1849.method6927(new BlockPos(class1850));
        if (method6927 != null) {
            if (method6927.method30622()) {
                return super.method16538(class1849, class1850);
            }
        }
        return false;
    }
}
