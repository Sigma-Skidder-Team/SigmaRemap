// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.LivingEntity;

public class Class5450 extends Class5419<LivingEntity>
{
    private static String[] field22679;
    private final int field22680;
    private final int field22681;
    private int field22682;
    
    public Class5450(final int n, final int field22680) {
        super((Map)ImmutableMap.of((Object)Class8233.field33820, (Object)Class1952.field10628, (Object)Class8233.field33821, (Object)Class1952.field10628));
        this.field22681 = n * 20;
        this.field22682 = 0;
        this.field22680 = field22680;
    }
    
    @Override
    public void method16539(final Class1849 class1849, final LivingEntity class1850, final long n) {
        final Class365<?> method2618 = class1850.method2618();
        final boolean b = method2618.method1198(Class8233.field33821).get() + 300L <= n;
        if (this.field22682 <= this.field22681 && !b) {
            if (method2618.method1198(Class8233.field33820).get().method1170().withinDistance(new BlockPos(class1850), this.field22680 + 1)) {
                ++this.field22682;
            }
        }
        else {
            method2618.method1195(Class8233.field33821);
            method2618.method1195(Class8233.field33820);
            method2618.method1205(class1849.method6755(), class1849.method6754());
            this.field22682 = 0;
        }
    }
}
