// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.LivingEntity;

public class Class5451 extends Class5419<LivingEntity>
{
    private static String[] field22683;
    
    public Class5451() {
        super(ImmutableMap.of());
    }
    
    @Override
    public boolean method16538(final Class1849 class1849, final LivingEntity class1850) {
        return !class1850.method2618().method1209(Class7635.field30230) && class1850.method2783();
    }
    
    @Override
    public void method16539(final Class1849 class1849, final LivingEntity class1850, final long n) {
        class1850.method2787();
    }
}
