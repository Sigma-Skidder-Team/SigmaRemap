// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.LivingEntity;

public class Class5421 extends Class5419<LivingEntity>
{
    private static String[] field22603;
    private final float field22604;
    private final int field22605;
    
    public Class5421(final float field22604, final int field22605) {
        super((Map)ImmutableMap.of((Object)Class8233.field33809, (Object)Class1952.field10629, (Object)Class8233.field33810, (Object)Class1952.field10628));
        this.field22604 = field22604;
        this.field22605 = field22605;
    }
    
    @Override
    public void method16539(final Class1849 class1849, final LivingEntity class1850, final long n) {
        final Class365<?> method2618 = class1850.method2618();
        method2618.method1196(Class8233.field33809, new Class6949(method2618.method1198(Class8233.field33810).get(), this.field22604, this.field22605));
    }
}
