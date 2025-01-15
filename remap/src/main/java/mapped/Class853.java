// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.*;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Random;

public class Class853 extends Class759 implements Class762
{
    private static final DataParameter<Integer> field4556;
    public float field4557;
    public float field4558;
    public float field4559;
    private boolean field4560;
    
    public Class853(final EntityType<? extends Class853> class7499, final World class7500) {
        super(class7499, class7500);
        this.field4110 = new Class6567(this);
    }
    
    @Override
    public void method4142() {
        this.field4114.method22062(1, new Class3464(this));
        this.field4114.method22062(2, new Class3504(this));
        this.field4114.method22062(3, new Class3527(this));
        this.field4114.method22062(5, new Class3493(this));
        this.field4115.method22062(1, new Class3555<Object>(this, Class512.class, 10, true, false, class511 -> Math.abs(class511.getPosY() - this.getPosY()) <= 4.0));
        this.field4115.method22062(3, new Class3555<Object>(this, Class786.class, true));
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.dataManager.register(Class853.field4556, 1);
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2711().method20873(Class8107.field33410);
    }
    
    public void method5129(final int n, final boolean b) {
        this.dataManager.set(Class853.field4556, n);
        this.method1657();
        this.method1881();
        this.method2710(Class8107.field33405).method23941(n * n);
        this.method2710(Class8107.field33408).method23941(0.2f + 0.1f * n);
        this.method2710(Class8107.field33410).method23941(n);
        if (b) {
            this.method2665(this.method2701());
        }
        this.field4108 = n;
    }
    
    public int method5130() {
        return this.dataManager.get(Class853.field4556);
    }
    
    @Override
    public void method1761(final Class51 class51) {
        super.method1761(class51);
        class51.method298("Size", this.method5130() - 1);
        class51.method312("wasOnGround", this.field4560);
    }
    
    @Override
    public void method1760(final Class51 class51) {
        int method319 = class51.method319("Size");
        if (method319 < 0) {
            method319 = 0;
        }
        this.method5129(method319 + 1, false);
        super.method1760(class51);
        this.field4560 = class51.method329("wasOnGround");
    }
    
    public boolean method5131() {
        return this.method5130() <= 1;
    }
    
    public Class6909 method5132() {
        return Class8432.field34630;
    }
    
    @Override
    public boolean method4170() {
        return this.method5130() > 0;
    }
    
    @Override
    public void method1659() {
        this.field4558 += (this.field4557 - this.field4558) * 0.5f;
        this.field4559 = this.field4558;
        super.method1659();
        if (this.onGround && !this.field4560) {
            for (int method5130 = this.method5130(), i = 0; i < method5130 * 8; ++i) {
                final float n = this.rand.nextFloat() * 6.2831855f;
                final float n2 = this.rand.nextFloat() * 0.5f + 0.5f;
                this.world.method6709(this.method5132(), this.getPosX() + MathHelper.sin(n) * method5130 * 0.5f * n2, this.getPosY(), this.getPosZ() + MathHelper.cos(n) * method5130 * 0.5f * n2, 0.0, 0.0, 0.0);
            }
            this.method1695(this.method5138(), this.method2720(), ((this.rand.nextFloat() - this.rand.nextFloat()) * 0.2f + 1.0f) / 0.8f);
            this.field4557 = -0.5f;
        }
        else if (!this.onGround) {
            if (this.field4560) {
                this.field4557 = 1.0f;
            }
        }
        this.field4560 = this.onGround;
        this.method5133();
    }
    
    public void method5133() {
        this.field4557 *= 0.6f;
    }
    
    public int method5134() {
        return this.rand.nextInt(20) + 10;
    }
    
    @Override
    public void method1881() {
        final double method1938 = this.getPosX();
        final double method1939 = this.getPosY();
        final double method1940 = this.getPosZ();
        super.method1881();
        this.setPosition(method1938, method1939, method1940);
    }
    
    @Override
    public void method1880(final DataParameter<?> class8810) {
        if (Class853.field4556.equals(class8810)) {
            this.method1881();
            this.rotationYaw = this.field2953;
            this.field2951 = this.field2953;
            if (this.method1706()) {
                if (this.rand.nextInt(20) == 0) {
                    this.method1717();
                }
            }
        }
        super.method1880(class8810);
    }
    
    @Override
    public EntityType<? extends Class853> getType() {
        return (EntityType<? extends Class853>)super.getType();
    }
    
    @Override
    public void method1652() {
        final int method5130 = this.method5130();
        if (!this.world.isRemote) {
            if (method5130 > 1) {
                if (this.method2664() <= 0.0f) {
                    for (int n = 2 + this.rand.nextInt(3), i = 0; i < n; ++i) {
                        final float n2 = (i % 2 - 0.5f) * method5130 / 4.0f;
                        final float n3 = (i / 2 - 0.5f) * method5130 / 4.0f;
                        final Class853 class853 = (Class853)this.getType().method23371(this.world);
                        if (this.hasCustomName()) {
                            class853.method1872(this.getCustomName());
                        }
                        if (this.method4194()) {
                            class853.method4190();
                        }
                        class853.method1851(this.method1850());
                        class853.method5129(method5130 / 2, true);
                        class853.method1730(this.getPosX() + n2, this.getPosY() + 0.5, this.getPosZ() + n3, this.rand.nextFloat() * 360.0f, 0.0f);
                        this.world.method6886(class853);
                    }
                }
            }
        }
        super.method1652();
    }
    
    @Override
    public void method1737(final Entity class399) {
        super.method1737(class399);
        if (class399 instanceof Class786) {
            if (this.method5136()) {
                this.method5135((LivingEntity)class399);
            }
        }
    }
    
    @Override
    public void method1736(final Class512 class512) {
        if (this.method5136()) {
            this.method5135(class512);
        }
    }
    
    public void method5135(final LivingEntity class511) {
        if (this.method1768()) {
            final int method5130 = this.method5130();
            if (this.method1734(class511) < 0.6 * method5130 * 0.6 * method5130) {
                if (this.method2747(class511)) {
                    if (class511.attackEntityFrom(DamageSource.method25693(this), this.method5137())) {
                        this.method1695(Class8520.field35577, 1.0f, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2f + 1.0f);
                        this.method1900(this, class511);
                    }
                }
            }
        }
    }
    
    @Override
    public float method2789(final Pose class290, final EntitySize class291) {
        return 0.625f * class291.field34098;
    }
    
    public boolean method5136() {
        return !this.method5131() && this.method2749();
    }
    
    public float method5137() {
        return (float)this.method2710(Class8107.field33410).method23950();
    }
    
    @Override
    public Class7795 method2683(final DamageSource class7929) {
        return this.method5131() ? Class8520.field35591 : Class8520.field35579;
    }
    
    @Override
    public Class7795 method2684() {
        return this.method5131() ? Class8520.field35590 : Class8520.field35578;
    }
    
    public Class7795 method5138() {
        return this.method5131() ? Class8520.field35593 : Class8520.field35581;
    }
    
    @Override
    public Class1932 method4161() {
        return (this.method5130() != 1) ? Class9020.field38063 : this.getType().method23368();
    }
    
    public static boolean method5139(final EntityType<Class853> class7499, final Class1851 class7500, final Class2101 class7501, final BlockPos class7502, final Random random) {
        if (class7500.method6764().method29570() == Class9505.field40893 && random.nextInt(4) != 1) {
            return false;
        }
        if (class7500.method6954() != Class2113.field12290) {
            if (class7500.method6959(class7502) == Class7102.field27638) {
                if (class7502.getY() > 50) {
                    if (class7502.getY() < 70) {
                        if (random.nextFloat() < 0.5f) {
                            if (random.nextFloat() < class7500.method6951()) {
                                if (class7500.method6969(class7502) <= random.nextInt(8)) {
                                    return Class759.method4178(class7499, class7500, class7501, class7502, random);
                                }
                            }
                        }
                    }
                }
            }
            final Class7859 class7503 = new Class7859(class7502);
            final boolean b = Class2317.method9442(class7503.field32290, class7503.field32291, class7500.method6753(), 987234911L).nextInt(10) == 0;
            if (random.nextInt(10) == 0) {
                if (b) {
                    if (class7502.getY() < 40) {
                        return Class759.method4178(class7499, class7500, class7501, class7502, random);
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public float method2720() {
        return 0.4f * this.method5130();
    }
    
    @Override
    public int method4173() {
        return 0;
    }
    
    public boolean method5140() {
        return this.method5130() > 0;
    }
    
    @Override
    public void method2725() {
        final Vec3d method1935 = this.getMotion();
        this.setMotion(method1935.x, this.method2724(), method1935.z);
        this.isAirBorne = true;
    }
    
    @Nullable
    @Override
    public Class5496 method4188(final Class1851 class1851, final Class9592 class1852, final Class2101 class1853, final Class5496 class1854, final Class51 class1855) {
        int nextInt = this.rand.nextInt(3);
        if (nextInt < 2) {
            if (this.rand.nextFloat() < 0.5f * class1852.method35975()) {
                ++nextInt;
            }
        }
        this.method5129(1 << nextInt, true);
        return super.method4188(class1851, class1852, class1853, class1854, class1855);
    }
    
    public Class7795 method5141() {
        return this.method5131() ? Class8520.field35592 : Class8520.field35580;
    }
    
    @Override
    public EntitySize method1933(final Pose class290) {
        return super.method1933(class290).method27561(0.255f * this.method5130());
    }
    
    static {
        field4556 = EntityDataManager.method33564(Class853.class, Class7709.field30654);
    }
}
