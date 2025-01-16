// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;

import java.util.List;

public class Class3534 extends Class3531
{
    private static String[] field16568;
    private final Class7843 field16569;
    public final /* synthetic */ Class771 field16570;
    
    public Class3534(final Class771 field16570) {
        this.field16570 = field16570;
        super(field16570);
        this.field16569 = new Class7843().method25337(16.0).method25338().method25343(class511 -> ((Class802)class511).method4634() == Class181.field548);
    }
    
    @Override
    public boolean method11013() {
        if (this.field16570.method4152() != null) {
            return false;
        }
        if (this.field16570.method4265()) {
            return false;
        }
        if (this.field16570.ticksExisted < this.field16561) {
            return false;
        }
        if (!this.field16570.world.method6765().method31216(Class8878.field37316)) {
            return false;
        }
        final List<LivingEntity> method7142 = this.field16570.world.method7142((Class<? extends LivingEntity>)Class802.class, this.field16569, (LivingEntity)this.field16570, this.field16570.getBoundingBox().grow(16.0, 4.0, 16.0));
        if (!method7142.isEmpty()) {
            Class771.method4278(this.field16570, (Class802)method7142.get(Class771.method4277(this.field16570).nextInt(method7142.size())));
            return true;
        }
        return false;
    }
    
    @Override
    public boolean method11017() {
        return Class771.method4272(this.field16570) != null && this.field16560 > 0;
    }
    
    @Override
    public void method11018() {
        super.method11018();
        Class771.method4278(this.field16570, null);
    }
    
    @Override
    public void method11082() {
        final Class802 method4272 = Class771.method4272(this.field16570);
        if (method4272 != null) {
            if (method4272.method1768()) {
                method4272.method4635(Class181.field551);
            }
        }
    }
    
    @Override
    public int method11083() {
        return 40;
    }
    
    @Override
    public int method11084() {
        return 60;
    }
    
    @Override
    public int method11085() {
        return 140;
    }
    
    @Override
    public Class7795 method11086() {
        return Class8520.field35184;
    }
    
    @Override
    public Class2107 method11087() {
        return Class2107.field12216;
    }
}
