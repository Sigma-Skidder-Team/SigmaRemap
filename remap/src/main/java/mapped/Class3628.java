// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;

import java.util.EnumSet;

public class Class3628 extends Class3446
{
    private static String[] field16857;
    public final Class759 field16858;
    public Entity field16859;
    public final float field16860;
    private int field16861;
    public final float field16862;
    public final Class<? extends LivingEntity> field16863;
    public final Class7843 field16864;
    
    public Class3628(final Class759 class759, final Class<? extends LivingEntity> clazz, final float n) {
        this(class759, clazz, n, 0.02f);
    }
    
    public Class3628(final Class759 field16858, final Class<? extends LivingEntity> field16859, final float field16860, final float field16861) {
        this.field16858 = field16858;
        this.field16863 = field16859;
        this.field16860 = field16860;
        this.field16862 = field16861;
        this.method11019(EnumSet.of(Class2139.field12581));
        if (field16859 != PlayerEntity.class) {
            this.field16864 = new Class7843().method25337(field16860).method25339().method25338().method25341();
        }
        else {
            this.field16864 = new Class7843().method25337(field16860).method25339().method25338().method25341().method25343(class760 -> Class9170.method33475(class759).test(class760));
        }
    }
    
    @Override
    public boolean method11013() {
        if (this.field16858.method2633().nextFloat() < this.field16862) {
            if (this.field16858.method4152() != null) {
                this.field16859 = this.field16858.method4152();
            }
            if (this.field16863 != PlayerEntity.class) {
                this.field16859 = this.field16858.world.method7139((Class<? extends Entity>)this.field16863, this.field16864, (LivingEntity)this.field16858, this.field16858.getPosX(), this.field16858.method1944(), this.field16858.getPosZ(), this.field16858.getBoundingBox().method18495(this.field16860, 3.0, this.field16860));
            }
            else {
                this.field16859 = this.field16858.world.method7136(this.field16864, this.field16858, this.field16858.getPosX(), this.field16858.method1944(), this.field16858.getPosZ());
            }
            return this.field16859 != null;
        }
        return false;
    }
    
    @Override
    public boolean method11017() {
        return this.field16859.method1768() && this.field16858.method1734(this.field16859) <= this.field16860 * this.field16860 && this.field16861 > 0;
    }
    
    @Override
    public void method11015() {
        this.field16861 = 40 + this.field16858.method2633().nextInt(40);
    }
    
    @Override
    public void method11018() {
        this.field16859 = null;
    }
    
    @Override
    public void method11016() {
        this.field16858.method4147().method24668(this.field16859.getPosX(), this.field16859.method1944(), this.field16859.getPosZ());
        --this.field16861;
    }
}
