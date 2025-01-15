// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;

public class Class3582 extends Class3574
{
    private static String[] field16704;
    public final /* synthetic */ Class779 field16705;
    
    public Class3582(final Class779 field16705) {
        this.field16705 = field16705;
        super(field16705, 1.0, true);
    }
    
    @Override
    public double method11117(final LivingEntity class511) {
        final float n = this.field16705.method1930() - 0.1f;
        return n * 2.0f * n * 2.0f + class511.method1930();
    }
}
