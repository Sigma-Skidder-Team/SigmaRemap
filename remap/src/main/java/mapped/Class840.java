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
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.Random;
import javax.annotation.Nullable;
import java.util.function.Predicate;

public class Class840 extends Class832
{
    private static final DataParameter<BlockPos> field4474;
    private static final DataParameter<Boolean> field4475;
    private static final DataParameter<Integer> field4476;
    private static final Class7843 field4477;
    public static final Predicate<Class427> field4478;
    
    public Class840(final EntityType<? extends Class840> class7499, final World class7500) {
        super(class7499, class7500);
        this.field4110 = new Class6563(this);
        this.field4109 = new Class7730(this, 10);
        this.method4193(true);
    }
    
    @Nullable
    @Override
    public Class5496 method4188(final Class1851 class1851, final Class9592 class1852, final Class2101 class1853, final Class5496 class1854, final CompoundNBT class1855) {
        this.setAir(this.getMaxAir());
        this.rotationPitch = 0.0f;
        return super.method4188(class1851, class1852, class1853, class1854, class1855);
    }
    
    @Override
    public boolean method2622() {
        return false;
    }
    
    @Override
    public void method4951(final int n) {
    }
    
    public void method5002(final BlockPos class354) {
        this.dataManager.set(Class840.field4474, class354);
    }
    
    public BlockPos method5003() {
        return this.dataManager.get(Class840.field4474);
    }
    
    public boolean method5004() {
        return this.dataManager.get(Class840.field4475);
    }
    
    public void method5005(final boolean b) {
        this.dataManager.set(Class840.field4475, b);
    }
    
    public int method5006() {
        return this.dataManager.get(Class840.field4476);
    }
    
    public void method5007(final int i) {
        this.dataManager.set(Class840.field4476, i);
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.dataManager.register(Class840.field4474, BlockPos.ZERO);
        this.dataManager.register(Class840.field4475, false);
        this.dataManager.register(Class840.field4476, 2400);
    }
    
    @Override
    public void method1761(final CompoundNBT class51) {
        super.method1761(class51);
        class51.putInt("TreasurePosX", this.method5003().getX());
        class51.putInt("TreasurePosY", this.method5003().getY());
        class51.putInt("TreasurePosZ", this.method5003().getZ());
        class51.putBoolean("GotFish", this.method5004());
        class51.putInt("Moistness", this.method5006());
    }
    
    @Override
    public void method1760(final CompoundNBT class51) {
        this.method5002(new BlockPos(class51.getInt("TreasurePosX"), class51.getInt("TreasurePosY"), class51.getInt("TreasurePosZ")));
        super.method1760(class51);
        this.method5005(class51.getBoolean("GotFish"));
        this.method5007(class51.getInt("Moistness"));
    }
    
    @Override
    public void method4142() {
        this.field4114.method22062(0, new Class3509(this));
        this.field4114.method22062(0, new Class3600(this));
        this.field4114.method22062(1, new Class3616(this));
        this.field4114.method22062(2, new Class3615(this, 4.0));
        this.field4114.method22062(4, new Class3515(this, 1.0, 10));
        this.field4114.method22062(4, new Class3503(this));
        this.field4114.method22062(5, new Class3628(this, PlayerEntity.class, 6.0f));
        this.field4114.method22062(5, new Class3594(this, 10));
        this.field4114.method22062(6, new Class3574(this, 1.2000000476837158, true));
        this.field4114.method22062(8, new Class3477(this, null));
        this.field4114.method22062(8, new Class3603(this));
        this.field4114.method22062(9, new Class3448<Object>(this, Class844.class, 8.0f, 1.0, 1.0));
        this.field4115.method22062(1, new Class3547(this, (Class<?>[])new Class[] { Class844.class }).method11100((Class<?>[])new Class[0]));
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2710(Class8107.field33405).method23941(10.0);
        this.method2710(Class8107.field33408).method23941(1.2000000476837158);
        this.method2711().method20873(Class8107.field33410);
        this.method2710(Class8107.field33410).method23941(3.0);
    }
    
    @Override
    public Class7746 method4143(final World class1847) {
        return new Class7752(this, class1847);
    }
    
    @Override
    public boolean method2734(final Entity class399) {
        final boolean method1740 = class399.attackEntityFrom(DamageSource.method25693(this), (float)(int)this.method2710(Class8107.field33410).method23950());
        if (method1740) {
            this.method1900(this, class399);
            this.method1695(Class8520.field35118, 1.0f, 1.0f);
        }
        return method1740;
    }
    
    @Override
    public int getMaxAir() {
        return 4800;
    }
    
    @Override
    public int method2630(final int n) {
        return this.getMaxAir();
    }
    
    @Override
    public float method2789(final Pose class290, final EntitySize class291) {
        return 0.3f;
    }
    
    @Override
    public int method4173() {
        return 1;
    }
    
    @Override
    public int method4174() {
        return 1;
    }
    
    @Override
    public boolean method1781(final Entity class399) {
        return true;
    }
    
    @Override
    public boolean method2779(final ItemStack class8321) {
        final Class2215 method4185 = Class759.method4185(class8321);
        return this.method2718(method4185).method27620() && method4185 == Class2215.field13600 && super.method2779(class8321);
    }
    
    @Override
    public void method4165(final Class427 class427) {
        if (this.method2718(Class2215.field13600).method27620()) {
            final ItemStack method2107 = class427.method2107();
            if (this.method4167(method2107)) {
                this.method1803(Class2215.field13600, method2107);
                this.field4119[Class2215.field13600.getIndex()] = 2.0f;
                this.method2746(class427, method2107.method27690());
                class427.method1652();
            }
        }
    }
    
    @Override
    public void method1659() {
        super.method1659();
        if (!this.method4214()) {
            if (!this.method1710()) {
                this.method5007(this.method5006() - 1);
                if (this.method5006() <= 0) {
                    this.attackEntityFrom(DamageSource.field32582, 1.0f);
                }
                if (this.onGround) {
                    this.method1936(this.getMotion().add((this.rand.nextFloat() * 2.0f - 1.0f) * 0.2f, 0.5, (this.rand.nextFloat() * 2.0f - 1.0f) * 0.2f));
                    this.rotationYaw = this.rand.nextFloat() * 360.0f;
                    this.onGround = false;
                    this.isAirBorne = true;
                }
            }
            else {
                this.method5007(2400);
            }
            if (this.world.isRemote) {
                if (this.method1706()) {
                    if (this.getMotion().lengthSquared() > 0.03) {
                        final Vec3d method1741 = this.method1741(0.0f);
                        final float n = MathHelper.cos(this.rotationYaw * 0.017453292f) * 0.3f;
                        final float n2 = MathHelper.sin(this.rotationYaw * 0.017453292f) * 0.3f;
                        final float n3 = 1.2f - this.rand.nextFloat() * 0.7f;
                        for (int i = 0; i < 2; ++i) {
                            this.world.method6709(Class8432.field34652, this.getPosX() - method1741.x * n3 + n, this.getPosY() - method1741.y, this.getPosZ() - method1741.z * n3 + n2, 0.0, 0.0, 0.0);
                            this.world.method6709(Class8432.field34652, this.getPosX() - method1741.x * n3 - n, this.getPosY() - method1741.y, this.getPosZ() - method1741.z * n3 - n2, 0.0, 0.0, 0.0);
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public void method1798(final byte b) {
        if (b != 38) {
            super.method1798(b);
        }
        else {
            this.method5008(Class8432.field34625);
        }
    }
    
    private void method5008(final IParticleData IParticleData) {
        for (int i = 0; i < 7; ++i) {
            this.world.method6709(IParticleData, this.method1940(1.0), this.method1943() + 0.2, this.method1947(1.0), this.rand.nextGaussian() * 0.01, this.rand.nextGaussian() * 0.01, this.rand.nextGaussian() * 0.01);
        }
    }
    
    @Override
    public boolean method4195(final PlayerEntity playerEntity, final Class316 class513) {
        final ItemStack method2715 = playerEntity.method2715(class513);
        if (!method2715.method27620() && method2715.getItem().method11742(Class7855.field32272)) {
            if (!this.world.isRemote) {
                this.method1695(Class8520.field35120, 1.0f, 1.0f);
            }
            this.method5005(true);
            if (!playerEntity.field3025.field27304) {
                method2715.method27693(1);
            }
            return true;
        }
        return super.method4195(playerEntity, class513);
    }
    
    public static boolean method5009(final EntityType<Class840> class7499, final Class1851 class7500, final Class2101 class7501, final BlockPos class7502, final Random random) {
        if (class7502.getY() > 45) {
            if (class7502.getY() < class7500.method6743()) {
                if (class7500.method6959(class7502) != Class7102.field27631 || class7500.method6959(class7502) != Class7102.field27656) {
                    if (class7500.getFluidState(class7502).isTagged(Class7324.field28319)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public Class7795 method2683(final DamageSource class7929) {
        return Class8520.field35121;
    }
    
    @Nullable
    @Override
    public Class7795 method2684() {
        return Class8520.field35119;
    }
    
    @Nullable
    @Override
    public Class7795 method4160() {
        return this.method1706() ? Class8520.field35117 : Class8520.field35116;
    }
    
    @Override
    public Class7795 method1687() {
        return Class8520.field35124;
    }
    
    @Override
    public Class7795 method1686() {
        return Class8520.field35125;
    }
    
    public boolean method5010() {
        final BlockPos method24714 = this.method4150().method24714();
        return method24714 != null && method24714.withinDistance(this.method1934(), 12.0);
    }
    
    @Override
    public void method2729(final Vec3d class5487) {
        if (this.method2749() && this.method1706()) {
            this.method1724(this.method2732(), class5487);
            this.method1671(Class2160.field12826, this.getMotion());
            this.method1936(this.getMotion().scale(0.9));
            if (this.method4152() == null) {
                this.method1936(this.getMotion().add(0.0, -0.005, 0.0));
            }
        }
        else {
            super.method2729(class5487);
        }
    }
    
    @Override
    public boolean method4204(final PlayerEntity playerEntity) {
        return true;
    }
    
    static {
        field4474 = EntityDataManager.method33564(Class840.class, Class7709.field30664);
        field4475 = EntityDataManager.method33564(Class840.class, Class7709.field30661);
        field4476 = EntityDataManager.method33564(Class840.class, Class7709.field30654);
        field4477 = new Class7843().method25337(10.0).method25339().method25338().method25340();
        field4478 = (class427 -> {
            final boolean b;
            if (!class427.method2118()) {
                if (!(!class427.isAlive())) {
                    if (!(!class427.method1706())) {
                        return b;
                    }
                }
            }
            return b;
        });
    }
}
