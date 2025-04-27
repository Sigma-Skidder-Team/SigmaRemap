// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;

import javax.annotation.Nullable;

public abstract class Class3531 extends Class3446
{
    public int field16560;
    public int field16561;
    public final /* synthetic */ Class770 field16562;
    
    public Class3531(final Class770 field16562) {
        this.field16562 = field16562;
    }
    
    @Override
    public boolean method11013() {
        final LivingEntity method4152 = this.field16562.method4152();
        return method4152 != null && method4152.isAlive() && !this.field16562.method4265() && this.field16562.ticksExisted >= this.field16561;
    }
    
    @Override
    public boolean method11017() {
        final LivingEntity method4152 = this.field16562.method4152();
        if (method4152 != null) {
            if (method4152.isAlive()) {
                return this.field16560 > 0;
            }
        }
        return false;
    }
    
    @Override
    public void method11015() {
        this.field16560 = this.method11083();
        this.field16562.field4162 = this.method11084();
        this.field16561 = this.field16562.ticksExisted + this.method11085();
        final Class7795 method11086 = this.method11086();
        if (method11086 != null) {
            this.field16562.method1695(method11086, 1.0f, 1.0f);
        }
        this.field16562.method4266(this.method11087());
    }
    
    @Override
    public void method11016() {
        --this.field16560;
        if (this.field16560 == 0) {
            this.method11082();
            this.field16562.method1695(this.field16562.method4262(), 1.0f, 1.0f);
        }
    }
    
    public abstract void method11082();
    
    public int method11083() {
        return 20;
    }
    
    public abstract int method11084();
    
    public abstract int method11085();
    
    @Nullable
    public abstract Class7795 method11086();
    
    public abstract Class2107 method11087();
}
