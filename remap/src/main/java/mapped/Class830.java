// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.Random;

public class Class830 extends Class827 implements Class768
{
    private static String[] field4440;
    private boolean field4441;
    public final Class7752 field4442;
    public final Class7747 field4443;
    
    public Class830(final EntityType<? extends Class830> class7499, final World class7500) {
        super(class7499, class7500);
        this.stepHeight = 1.0f;
        this.field4110 = new Class6568(this);
        this.method4145(Class257.field1211, 0.0f);
        this.field4442 = new Class7752(this, class7500);
        this.field4443 = new Class7747(this, class7500);
    }
    
    @Override
    public void method4157() {
        this.field4114.method22062(1, new Class3591(this, 1.0));
        this.field4114.method22062(2, new Class3508(this, 1.0, 40, 10.0f));
        this.field4114.method22062(2, new Class3584(this, 1.0, false));
        this.field4114.method22062(5, new Class3482(this, 1.0));
        this.field4114.method22062(6, new Class3586(this, 1.0, this.world.method6743()));
        this.field4114.method22062(7, new Class3514(this, 1.0));
        this.field4115.method22062(1, new Class3547(this, (Class<?>[])new Class[] { Class830.class }).method11100(Class828.class));
        this.field4115.method22062(2, new Class3555<Object>(this, Class512.class, 10, true, false, this::method4944));
        this.field4115.method22062(3, new Class3555<Object>(this, Class819.class, false));
        this.field4115.method22062(3, new Class3555<Object>(this, Class786.class, true));
        this.field4115.method22062(5, new Class3555<Object>(this, Class793.class, 10, true, false, Class793.field4242));
    }
    
    @Override
    public Class5496 method4188(final Class1851 class1851, final Class9592 class1852, final Class2101 class1853, Class5496 method4188, final Class51 class1854) {
        method4188 = super.method4188(class1851, class1852, class1853, method4188, class1854);
        if (this.method2718(Class2215.field13601).method27620()) {
            if (this.rand.nextFloat() < 0.03f) {
                this.method1803(Class2215.field13601, new ItemStack(Items.field31609));
                this.field4119[Class2215.field13601.method8402()] = 2.0f;
            }
        }
        return method4188;
    }
    
    public static boolean method4942(final EntityType<Class830> class7499, final Class1851 class7500, final Class2101 class7501, final BlockPos class7502, final Random random) {
        final Class3090 method6959 = class7500.method6959(class7502);
        boolean b = false;
        Label_0078: {
            if (class7500.method6954() != Class2113.field12290) {
                if (Class763.method4229(class7500, class7502, random)) {
                    if (class7501 == Class2101.field12176 || class7500.method6702(class7502).method21793(Class7324.field28319)) {
                        b = true;
                        break Label_0078;
                    }
                }
            }
            b = false;
        }
        final boolean b2 = b;
        if (method6959 != Class7102.field27639 && method6959 != Class7102.field27643) {
            if (random.nextInt(40) == 0) {
                if (method4943(class7500, class7502)) {
                    if (b2) {
                        return true;
                    }
                }
            }
            return false;
        }
        return random.nextInt(15) == 0 && b2;
    }
    
    private static boolean method4943(final Class1851 class1851, final BlockPos class1852) {
        return class1852.getY() < class1851.method6743() - 5;
    }
    
    @Override
    public boolean method4926() {
        return false;
    }
    
    @Override
    public Class7795 method4160() {
        return this.method1706() ? Class8520.field35132 : Class8520.field35131;
    }
    
    @Override
    public Class7795 method2683(final DamageSource class7929) {
        return this.method1706() ? Class8520.field35136 : Class8520.field35135;
    }
    
    @Override
    public Class7795 method2684() {
        return this.method1706() ? Class8520.field35134 : Class8520.field35133;
    }
    
    @Override
    public Class7795 method4917() {
        return Class8520.field35138;
    }
    
    @Override
    public Class7795 method1686() {
        return Class8520.field35139;
    }
    
    @Override
    public ItemStack method4918() {
        return ItemStack.field34174;
    }
    
    @Override
    public void method4184(final Class9592 class9592) {
        if (this.rand.nextFloat() > 0.9) {
            if (this.rand.nextInt(16) >= 10) {
                this.method1803(Class2215.field13600, new ItemStack(Items.field31376));
            }
            else {
                this.method1803(Class2215.field13600, new ItemStack(Items.field31607));
            }
        }
    }
    
    @Override
    public boolean method4166(final ItemStack class8321, final ItemStack class8322, final Class2215 class8323) {
        if (class8322.getItem() == Items.field31609) {
            return false;
        }
        if (class8322.getItem() != Items.field31607) {
            return class8321.getItem() == Items.field31607 || super.method4166(class8321, class8322, class8323);
        }
        return class8321.getItem() == Items.field31607 && class8321.method27632() < class8322.method27632();
    }
    
    @Override
    public boolean method4912() {
        return false;
    }
    
    @Override
    public boolean method4180(final Class1852 class1852) {
        return class1852.method6975(this);
    }
    
    public boolean method4944(final LivingEntity class511) {
        return class511 != null && (!this.world.method6703() || class511.method1706());
    }
    
    @Override
    public boolean method1868() {
        return !this.method1817();
    }
    
    private boolean method4945() {
        if (!this.field4441) {
            final LivingEntity method4152 = this.method4152();
            return method4152 != null && method4152.method1706();
        }
        return true;
    }
    
    @Override
    public void method2729(final Vec3d class5487) {
        if (this.method2749()) {
            if (this.method1706()) {
                if (this.method4945()) {
                    this.method1724(0.01f, class5487);
                    this.method1671(Class2160.field12826, this.getMotion());
                    this.method1936(this.getMotion().scale(0.9));
                    return;
                }
            }
        }
        super.method2729(class5487);
    }
    
    @Override
    public void method1714() {
        if (!this.world.isRemote) {
            if (this.method2749()) {
                if (this.method1706()) {
                    if (this.method4945()) {
                        this.field4113 = this.field4442;
                        this.method1820(true);
                        return;
                    }
                }
            }
            this.field4113 = this.field4443;
            this.method1820(false);
        }
    }
    
    public boolean method4946() {
        final Class9468 method24727 = this.method4150().method24727();
        if (method24727 != null) {
            final BlockPos method24728 = method24727.method35232();
            if (method24728 != null) {
                if (this.method1733(method24728.getX(), method24728.getY(), method24728.getZ()) < 4.0) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public void method4252(final LivingEntity class511, final float n) {
        final Class403 class512 = new Class403(this.world, this, new ItemStack(Items.field31607));
        final double n2 = class511.getPosX() - this.getPosX();
        final double n3 = class511.method1942(0.3333333333333333) - class512.getPosY();
        final double n4 = class511.getPosZ() - this.getPosZ();
        class512.method1958(n2, n3 + MathHelper.sqrt(n2 * n2 + n4 * n4) * 0.20000000298023224, n4, 1.6f, (float)(14 - this.world.method6954().method8235() * 4));
        this.method1695(Class8520.field35137, 1.0f, 1.0f / (this.method2633().nextFloat() * 0.4f + 0.8f));
        this.world.method6886(class512);
    }
    
    public void method4947(final boolean field4441) {
        this.field4441 = field4441;
    }
}
