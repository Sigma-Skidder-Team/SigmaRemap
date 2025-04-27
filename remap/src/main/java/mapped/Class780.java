// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Pose;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.time.temporal.ChronoField;
import java.time.LocalDate;

public abstract class Class780 extends Class763 implements Class768
{
    private final Class3626<Class780> field4189;
    private final Class3574 field4190;
    
    public Class780(final EntityType<? extends Class780> class7499, final World class7500) {
        super(class7499, class7500);
        this.field4189 = new Class3626<Class780>(this, 1.0, 20, 15.0f);
        this.field4190 = new Class3579(this, this, 1.2, false);
        this.method4329();
    }
    
    @Override
    public void method4142() {
        this.field4114.method22062(2, new Class3633(this));
        this.field4114.method22062(3, new Class3496(this, 1.0));
        this.field4114.method22062(3, new Class3448<Object>(this, Class799.class, 6.0f, 1.0, 1.2));
        this.field4114.method22062(5, new Class3517(this, 1.0));
        this.field4114.method22062(6, new Class3628(this, PlayerEntity.class, 8.0f));
        this.field4114.method22062(6, new Class3503(this));
        this.field4115.method22062(1, new Class3547(this, new Class[0]));
        this.field4115.method22062(2, new Class3555<Object>(this, PlayerEntity.class, true));
        this.field4115.method22062(3, new Class3555<Object>(this, Class786.class, true));
        this.field4115.method22062(3, new Class3555<Object>(this, Class793.class, 10, true, false, Class793.field4242));
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2710(Class8107.field33408).method23941(0.25);
    }
    
    @Override
    public void method1691(final BlockPos class354, final Class7096 class355) {
        this.method1695(this.method4328(), 0.15f, 1.0f);
    }
    
    public abstract Class7795 method4328();
    
    @Override
    public Class6363 method2712() {
        return Class6363.field25461;
    }
    
    @Override
    public void method2736() {
        int method4217 = this.method4217() ? 1 : 0;
        if (method4217 != 0) {
            final ItemStack method4218 = this.method2718(Class2215.field13605);
            if (!method4218.method27620()) {
                if (method4218.method27630()) {
                    method4218.method27633(method4218.method27632() + this.rand.nextInt(2));
                    if (method4218.method27632() >= method4218.method27634()) {
                        this.method2794(Class2215.field13605);
                        this.method1803(Class2215.field13605, ItemStack.EMPTY);
                    }
                }
                method4217 = 0;
            }
            if (method4217 != 0) {
                this.setFire(8);
            }
        }
        super.method2736();
    }
    
    @Override
    public void method1772() {
        super.method1772();
        if (this.method1920() instanceof Class787) {
            this.field2951 = ((Class787)this.method1920()).field2951;
        }
    }
    
    @Override
    public void method4184(final Class9592 class9592) {
        super.method4184(class9592);
        this.method1803(Class2215.field13600, new ItemStack(Items.field31279));
    }
    
    @Nullable
    @Override
    public Class5496 method4188(final Class1851 class1851, final Class9592 class1852, final Class2101 class1853, Class5496 method4188, final CompoundNBT class1854) {
        method4188 = super.method4188(class1851, class1852, class1853, method4188, class1854);
        this.method4184(class1852);
        this.method4187(class1852);
        this.method4329();
        this.method4193(this.rand.nextFloat() < 0.55f * class1852.method35975());
        if (this.method2718(Class2215.field13605).method27620()) {
            final LocalDate now = LocalDate.now();
            final int value = now.getDayOfMonth();
            if (now.getMonth() == 10) {
                if (value == 31) {
                    if (this.rand.nextFloat() < 0.25f) {
                        this.method1803(Class2215.field13605, new ItemStack((this.rand.nextFloat() >= 0.1f) ? Blocks.field29342 : Blocks.field29343));
                        this.field4121[Class2215.field13605.getIndex()] = 0.0f;
                    }
                }
            }
        }
        return method4188;
    }
    
    public void method4329() {
        if (this.world != null) {
            if (!this.world.isRemote) {
                this.field4114.method22063(this.field4190);
                this.field4114.method22063(this.field4189);
                if (this.method2715(Class7476.method23100(this, Items.field31279)).getItem() != Items.field31279) {
                    this.field4114.method22062(4, this.field4190);
                }
                else {
                    int n = 20;
                    if (this.world.method6954() != Class2113.field12293) {
                        n = 40;
                    }
                    this.field4189.method11163(n);
                    this.field4114.method22062(4, this.field4189);
                }
            }
        }
    }
    
    @Override
    public void method4252(final LivingEntity class511, final float n) {
        final Class402 method4330 = this.method4330(this.method2790(this.method2715(Class7476.method23100(this, Items.field31279))), n);
        final double n2 = class511.getPosX() - this.getPosX();
        final double n3 = class511.method1942(0.3333333333333333) - method4330.getPosY();
        final double n4 = class511.getPosZ() - this.getPosZ();
        method4330.method1958(n2, n3 + MathHelper.sqrt(n2 * n2 + n4 * n4) * 0.20000000298023224, n4, 1.6f, (float)(14 - this.world.method6954().method8235() * 4));
        this.method1695(Class8520.field35575, 1.0f, 1.0f / (this.method2633().nextFloat() * 0.4f + 0.8f));
        this.world.method6886(method4330);
    }
    
    public Class402 method4330(final ItemStack class8321, final float n) {
        return Class7476.method23101(this, class8321, n);
    }
    
    @Override
    public void method1760(final CompoundNBT class51) {
        super.method1760(class51);
        this.method4329();
    }
    
    @Override
    public void method1803(final Class2215 class2215, final ItemStack class2216) {
        super.method1803(class2215, class2216);
        if (!this.world.isRemote) {
            this.method4329();
        }
    }
    
    @Override
    public float method2789(final Pose class290, final EntitySize class291) {
        return 1.74f;
    }
    
    @Override
    public double method1776() {
        return -0.6;
    }
}
