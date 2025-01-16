// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

import java.util.Random;

public class Class790 extends Class789
{
    private static String[] field4204;
    private static final DataParameter<Boolean> field4205;
    private float field4206;
    private float field4207;
    private int field4208;
    
    public Class790(final EntityType<? extends Class790> class7499, final World class7500) {
        super(class7499, class7500);
    }
    
    @Override
    public Class788 method4349(final Class788 class788) {
        return EntityType.field29015.method23371(this.world);
    }
    
    @Override
    public boolean method4357(final ItemStack class8321) {
        return false;
    }
    
    @Override
    public void method4142() {
        super.method4142();
        this.field4114.method22062(0, new Class3490(this));
        this.field4114.method22062(1, new Class3576(this));
        this.field4114.method22062(1, new Class3608(this));
        this.field4114.method22062(4, new Class3456(this, 1.25));
        this.field4114.method22062(5, new Class3514(this, 1.0));
        this.field4114.method22062(6, new Class3628(this, PlayerEntity.class, 6.0f));
        this.field4114.method22062(7, new Class3503(this));
        this.field4115.method22062(1, new Class3551(this));
        this.field4115.method22062(2, new Class3565(this));
        this.field4115.method22062(3, new Class3555<Object>(this, Class803.class, 10, true, true, null));
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2710(Class8107.field33405).method23941(30.0);
        this.method2710(Class8107.field33406).method23941(20.0);
        this.method2710(Class8107.field33408).method23941(0.25);
        this.method2711().method20873(Class8107.field33410);
        this.method2710(Class8107.field33410).method23941(6.0);
    }
    
    public static boolean method4366(final EntityType<Class790> class7499, final Class1851 class7500, final Class2101 class7501, final BlockPos class7502, final Random random) {
        final Class3090 method6959 = class7500.method6959(class7502);
        if (method6959 != Class7102.field27642 && method6959 != Class7102.field27682) {
            return Class789.method4356(class7499, class7500, class7501, class7502, random);
        }
        return class7500.method6993(class7502, 0) > 8 && class7500.getBlockState(class7502.method1139()).getBlock() == Class7521.field29330;
    }
    
    @Override
    public Class7795 method4160() {
        return this.method2625() ? Class8520.field35491 : Class8520.field35490;
    }
    
    @Override
    public Class7795 method2683(final DamageSource class7929) {
        return Class8520.field35493;
    }
    
    @Override
    public Class7795 method2684() {
        return Class8520.field35492;
    }
    
    @Override
    public void method1691(final BlockPos class354, final BlockState class355) {
        this.method1695(Class8520.field35494, 0.15f, 1.0f);
    }
    
    public void method4367() {
        if (this.field4208 <= 0) {
            this.method1695(Class8520.field35495, 1.0f, this.method2721());
            this.field4208 = 40;
        }
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.dataManager.register(Class790.field4205, false);
    }
    
    @Override
    public void method1659() {
        super.method1659();
        if (this.world.isRemote) {
            if (this.field4207 != this.field4206) {
                this.method1881();
            }
            this.field4206 = this.field4207;
            if (!this.method4368()) {
                this.field4207 = MathHelper.clamp(this.field4207 - 1.0f, 0.0f, 6.0f);
            }
            else {
                this.field4207 = MathHelper.clamp(this.field4207 + 1.0f, 0.0f, 6.0f);
            }
        }
        if (this.field4208 > 0) {
            --this.field4208;
        }
    }
    
    @Override
    public EntitySize method1933(final Pose class290) {
        if (this.field4207 <= 0.0f) {
            return super.method1933(class290);
        }
        return super.method1933(class290).method27562(1.0f, 1.0f + this.field4207 / 6.0f);
    }
    
    @Override
    public boolean method2734(final Entity class399) {
        final boolean method1740 = class399.attackEntityFrom(DamageSource.method25693(this), (float)(int)this.method2710(Class8107.field33410).method23950());
        if (method1740) {
            this.method1900(this, class399);
        }
        return method1740;
    }
    
    public boolean method4368() {
        return this.dataManager.get(Class790.field4205);
    }
    
    public void method4369(final boolean b) {
        this.dataManager.set(Class790.field4205, b);
    }
    
    public float method4370(final float n) {
        return MathHelper.method35700(n, this.field4206, this.field4207) / 6.0f;
    }
    
    @Override
    public float method2728() {
        return 0.98f;
    }
    
    @Override
    public Class5496 method4188(final Class1851 class1851, final Class9592 class1852, final Class2101 class1853, Class5496 class1854, final CompoundNBT class1855) {
        if (class1854 == null) {
            class1854 = new Class5497();
            ((Class5497)class1854).method16803(1.0f);
        }
        return super.method4188(class1851, class1852, class1853, class1854, class1855);
    }
    
    static {
        field4205 = EntityDataManager.method33564(Class790.class, Class7709.field30661);
    }
}
