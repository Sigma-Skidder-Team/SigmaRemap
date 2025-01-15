// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;

import java.util.EnumSet;

public class Class3504 extends Class3446
{
    private static String[] field16478;
    private final Class853 field16479;
    private int field16480;
    
    public Class3504(final Class853 field16479) {
        this.field16479 = field16479;
        this.method11019(EnumSet.of(Class2139.field12581));
    }
    
    @Override
    public boolean method11013() {
        final LivingEntity method4152 = this.field16479.method4152();
        return method4152 != null && method4152.method1768() && (!(method4152 instanceof Class512) || !((Class512)method4152).field3025.field27301) && this.field16479.method4148() instanceof Class6567;
    }
    
    @Override
    public void method11015() {
        this.field16480 = 300;
        super.method11015();
    }
    
    @Override
    public boolean method11017() {
        final LivingEntity method4152 = this.field16479.method4152();
        if (method4152 == null) {
            return false;
        }
        if (!method4152.method1768()) {
            return false;
        }
        if (method4152 instanceof Class512 && ((Class512)method4152).field3025.field27301) {
            return false;
        }
        final int field16480 = this.field16480 - 1;
        this.field16480 = field16480;
        return field16480 > 0;
    }
    
    @Override
    public void method11016() {
        this.field16479.method4176(this.field16479.method4152(), 10.0f, 10.0f);
        ((Class6567)this.field16479.method4148()).method19913(this.field16479.rotationYaw, this.field16479.method5136());
    }
}
