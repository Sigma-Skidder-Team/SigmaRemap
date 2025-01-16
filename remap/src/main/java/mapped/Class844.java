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

import java.util.Random;
import javax.annotation.Nullable;
import java.util.EnumSet;

public class Class844 extends Class763
{
    private static String[] field4496;
    private static final DataParameter<Boolean> field4497;
    private static final DataParameter<Integer> field4498;
    public float field4499;
    public float field4500;
    public float field4501;
    public float field4502;
    public float field4503;
    private LivingEntity field4504;
    private int field4505;
    private boolean field4506;
    public Class3514 field4507;
    
    public Class844(final EntityType<? extends Class844> class7499, final World class7500) {
        super(class7499, class7500);
        this.field4108 = 10;
        this.method4145(Class257.field1211, 0.0f);
        this.field4110 = new Class6573(this);
        this.field4499 = this.rand.nextFloat();
        this.field4500 = this.field4499;
    }
    
    @Override
    public void method4142() {
        final Class3489 class3489 = new Class3489(this, 1.0);
        this.field4507 = new Class3514(this, 1.0, 80);
        this.field4114.method22062(4, new Class3624(this));
        this.field4114.method22062(5, class3489);
        this.field4114.method22062(7, this.field4507);
        this.field4114.method22062(8, new Class3628(this, PlayerEntity.class, 8.0f));
        this.field4114.method22062(8, new Class3628(this, Class844.class, 12.0f, 0.01f));
        this.field4114.method22062(9, new Class3503(this));
        this.field4507.method11019(EnumSet.of(Class2139.field12580, Class2139.field12581));
        class3489.method11019(EnumSet.of(Class2139.field12580, Class2139.field12581));
        this.field4115.method22062(1, new Class3555<Object>(this, LivingEntity.class, 10, true, false, new Class121(this)));
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2710(Class8107.field33410).method23941(6.0);
        this.method2710(Class8107.field33408).method23941(0.5);
        this.method2710(Class8107.field33406).method23941(16.0);
        this.method2710(Class8107.field33405).method23941(30.0);
    }
    
    @Override
    public Class7746 method4143(final World class1847) {
        return new Class7752(this, class1847);
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.dataManager.register(Class844.field4497, false);
        this.dataManager.register(Class844.field4498, 0);
    }
    
    @Override
    public boolean method2622() {
        return true;
    }
    
    @Override
    public Class6363 method2712() {
        return Class6363.field25464;
    }
    
    public boolean method5054() {
        return this.dataManager.get(Class844.field4497);
    }
    
    private void method5055(final boolean b) {
        this.dataManager.set(Class844.field4497, b);
    }
    
    public int method5056() {
        return 80;
    }
    
    private void method5057(final int i) {
        this.dataManager.set(Class844.field4498, i);
    }
    
    public boolean method5058() {
        return this.dataManager.get(Class844.field4498) != 0;
    }
    
    @Nullable
    public LivingEntity method5059() {
        if (!this.method5058()) {
            return null;
        }
        if (!this.world.isRemote) {
            return this.method4152();
        }
        if (this.field4504 != null) {
            return this.field4504;
        }
        final Entity method6741 = this.world.getEntityByID(this.dataManager.get(Class844.field4498));
        if (!(method6741 instanceof LivingEntity)) {
            return null;
        }
        return this.field4504 = (LivingEntity)method6741;
    }
    
    @Override
    public void method1880(final DataParameter<?> class8810) {
        super.method1880(class8810);
        if (Class844.field4498.equals(class8810)) {
            this.field4505 = 0;
            this.field4504 = null;
        }
    }
    
    @Override
    public int method4155() {
        return 160;
    }
    
    @Override
    public Class7795 method4160() {
        return this.method1711() ? Class8520.field35256 : Class8520.field35257;
    }
    
    @Override
    public Class7795 method2683(final DamageSource class7929) {
        return this.method1711() ? Class8520.field35262 : Class8520.field35263;
    }
    
    @Override
    public Class7795 method2684() {
        return this.method1711() ? Class8520.field35259 : Class8520.field35260;
    }
    
    @Override
    public boolean method1700() {
        return false;
    }
    
    @Override
    public float method2789(final Pose class290, final EntitySize class291) {
        return class291.field34098 * 0.5f;
    }
    
    @Override
    public float method4228(final BlockPos class354, final Class1852 class355) {
        return class355.method6702(class354).method21793(Class7324.field28319) ? (10.0f + class355.method6963(class354) - 0.5f) : super.method4228(class354, class355);
    }
    
    @Override
    public void method2736() {
        if (this.method1768()) {
            if (this.world.isRemote) {
                this.field4500 = this.field4499;
                if (this.method1706()) {
                    if (!this.method5054()) {
                        this.field4501 += (0.125f - this.field4501) * 0.2f;
                    }
                    else if (this.field4501 >= 0.5f) {
                        this.field4501 += (0.5f - this.field4501) * 0.1f;
                    }
                    else {
                        this.field4501 = 4.0f;
                    }
                }
                else {
                    this.field4501 = 2.0f;
                    final Vec3d method1935 = this.getMotion();
                    if (method1935.y > 0.0) {
                        if (this.field4506) {
                            if (!this.method1696()) {
                                this.world.method6708(this.getPosX(), this.getPosY(), this.getPosZ(), this.method5060(), this.method1922(), 1.0f, 1.0f, false);
                            }
                        }
                    }
                    this.field4506 = (method1935.y < 0.0 && this.world.method6732(new BlockPos(this).method1139(), this));
                }
                this.field4499 += this.field4501;
                this.field4503 = this.field4502;
                if (this.method1711()) {
                    if (!this.method5054()) {
                        this.field4502 += (1.0f - this.field4502) * 0.06f;
                    }
                    else {
                        this.field4502 += (0.0f - this.field4502) * 0.25f;
                    }
                }
                else {
                    this.field4502 = this.rand.nextFloat();
                }
                if (this.method5054()) {
                    if (this.method1706()) {
                        final Vec3d method1936 = this.method1741(0.0f);
                        for (int i = 0; i < 2; ++i) {
                            this.world.method6709(Class8432.field34601, this.method1940(0.5) - method1936.x * 1.5, this.method1943() - method1936.y * 1.5, this.method1947(0.5) - method1936.z * 1.5, 0.0, 0.0, 0.0);
                        }
                    }
                }
                if (this.method5058()) {
                    if (this.field4505 < this.method5056()) {
                        ++this.field4505;
                    }
                    final LivingEntity method1937 = this.method5059();
                    if (method1937 != null) {
                        this.method4147().method24667(method1937, 90.0f, 90.0f);
                        this.method4147().method24665();
                        final double n = this.method5063(0.0f);
                        final double n2 = method1937.getPosX() - this.getPosX();
                        final double n3 = method1937.method1942(0.5) - this.method1944();
                        final double n4 = method1937.getPosZ() - this.getPosZ();
                        final double sqrt = Math.sqrt(n2 * n2 + n3 * n3 + n4 * n4);
                        final double n5 = n2 / sqrt;
                        final double n6 = n3 / sqrt;
                        final double n7 = n4 / sqrt;
                        double nextDouble = this.rand.nextDouble();
                        while (nextDouble < sqrt) {
                            nextDouble += 1.8 - n + this.rand.nextDouble() * (1.7 - n);
                            this.world.method6709(Class8432.field34601, this.getPosX() + n5 * nextDouble, this.method1944() + n6 * nextDouble, this.getPosZ() + n7 * nextDouble, 0.0, 0.0, 0.0);
                        }
                    }
                }
            }
            if (!this.method1711()) {
                if (this.onGround) {
                    this.method1936(this.getMotion().add((this.rand.nextFloat() * 2.0f - 1.0f) * 0.4f, 0.5, (this.rand.nextFloat() * 2.0f - 1.0f) * 0.4f));
                    this.rotationYaw = this.rand.nextFloat() * 360.0f;
                    this.onGround = false;
                    this.isAirBorne = true;
                }
            }
            else {
                this.setAir(300);
            }
            if (this.method5058()) {
                this.rotationYaw = this.field2953;
            }
        }
        super.method2736();
    }
    
    public Class7795 method5060() {
        return Class8520.field35261;
    }
    
    public float method5061(final float n) {
        return MathHelper.method35700(n, this.field4500, this.field4499);
    }
    
    public float method5062(final float n) {
        return MathHelper.method35700(n, this.field4503, this.field4502);
    }
    
    public float method5063(final float n) {
        return (this.field4505 + n) / this.method5056();
    }
    
    @Override
    public boolean method4180(final Class1852 class1852) {
        return class1852.method6975(this);
    }
    
    public static boolean method5064(final EntityType<? extends Class844> class7499, final Class1851 class7500, final Class2101 class7501, final BlockPos class7502, final Random random) {
        if (random.nextInt(20) == 0 || !class7500.method6962(class7502)) {
            if (class7500.method6954() != Class2113.field12290) {
                if (class7501 == Class2101.field12176 || class7500.method6702(class7502).method21793(Class7324.field28319)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource class7929, final float n) {
        if (!this.method5054()) {
            if (!class7929.method25723()) {
                if (class7929.method25713() instanceof LivingEntity) {
                    final LivingEntity class7930 = (LivingEntity)class7929.method25713();
                    if (!class7929.method25707()) {
                        class7930.attackEntityFrom(DamageSource.method25701(this), 2.0f);
                    }
                }
            }
        }
        if (this.field4507 != null) {
            this.field4507.method11072();
        }
        return super.attackEntityFrom(class7929, n);
    }
    
    @Override
    public int method4173() {
        return 180;
    }
    
    @Override
    public void method2729(final Vec3d class5487) {
        if (this.method2749() && this.method1706()) {
            this.method1724(0.1f, class5487);
            this.method1671(Class2160.field12826, this.getMotion());
            this.method1936(this.getMotion().scale(0.9));
            if (!this.method5054()) {
                if (this.method4152() == null) {
                    this.method1936(this.getMotion().add(0.0, -0.005, 0.0));
                }
            }
        }
        else {
            super.method2729(class5487);
        }
    }
    
    static {
        field4497 = EntityDataManager.method33564(Class844.class, Class7709.field30661);
        field4498 = EntityDataManager.method33564(Class844.class, Class7709.field30654);
    }
}
