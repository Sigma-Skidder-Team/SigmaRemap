// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class Class421 extends Class419
{
    private static String[] field2534;
    private static final DataParameter<Boolean> field2535;
    
    public Class421(final EntityType<? extends Class421> class7499, final World class7500) {
        super(class7499, class7500);
    }
    
    public Class421(final World class1847, final LivingEntity class1848, final double n, final double n2, final double n3) {
        super(EntityType.field29050, class1848, n, n2, n3, class1847);
    }
    
    public Class421(final World class1847, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        super(EntityType.field29050, n, n2, n3, n4, n5, n6, class1847);
    }
    
    @Override
    public float method2035() {
        return this.method2036() ? 0.73f : super.method2035();
    }
    
    @Override
    public boolean method1804() {
        return false;
    }
    
    @Override
    public float method1856(final Class6154 class6154, final Class1855 class6155, final BlockPos class6156, final BlockState class6157, final Class7099 class6158, final float b) {
        return (this.method2036() && Class767.method4244(class6157)) ? Math.min(0.8f, b) : b;
    }
    
    @Override
    public void method2032(final Class7006 class7006) {
        super.method2032(class7006);
        if (!this.world.isRemote) {
            if (class7006.method21449() == Class2165.field12882) {
                final Entity method21452 = ((Class7007)class7006).method21452();
                if (this.field2527 == null) {
                    method21452.attackEntityFrom(DamageSource.field32576, 5.0f);
                }
                else if (method21452.attackEntityFrom(DamageSource.method25693(this.field2527), 8.0f)) {
                    if (!method21452.method1768()) {
                        this.field2527.method2663(5.0f);
                    }
                    else {
                        this.method1900(this.field2527, method21452);
                    }
                }
                if (method21452 instanceof LivingEntity) {
                    int n = 0;
                    if (this.world.method6954() != Class2113.field12292) {
                        if (this.world.method6954() == Class2113.field12293) {
                            n = 40;
                        }
                    }
                    else {
                        n = 10;
                    }
                    if (n > 0) {
                        ((LivingEntity)method21452).method2655(new Class1948(Class9439.field40493, 20 * n, 1));
                    }
                }
            }
            this.world.method6723(this, this.getPosX(), this.getPosY(), this.getPosZ(), 1.0f, false, this.world.method6765().method31216(Class8878.field37316) ? Class2196.field13367 : Class2196.field13365);
            this.method1652();
        }
    }
    
    @Override
    public boolean method1749() {
        return false;
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource class7929, final float n) {
        return false;
    }
    
    @Override
    public void method1649() {
        this.dataManager.register(Class421.field2535, false);
    }
    
    public boolean method2036() {
        return this.dataManager.get(Class421.field2535);
    }
    
    public void method2037(final boolean b) {
        this.dataManager.set(Class421.field2535, b);
    }
    
    @Override
    public boolean method2033() {
        return false;
    }
    
    static {
        field2535 = EntityDataManager.method33564(Class421.class, Class7709.field30661);
    }
}
