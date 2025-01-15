// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;

public class Class3577 extends Class3574
{
    private static String[] field16697;
    public final /* synthetic */ Class775 field16698;
    
    public Class3577(final Class775 field16698, final Class775 class775) {
        this.field16698 = field16698;
        super(class775, 1.0, false);
    }
    
    @Override
    public double method11117(final LivingEntity class511) {
        if (!(this.field16685.method1920() instanceof Class779)) {
            return super.method11117(class511);
        }
        final float n = this.field16685.method1920().method1930() - 0.1f;
        return n * 2.0f * n * 2.0f + class511.method1930();
    }
}
