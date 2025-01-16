// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.time.temporal.ChronoField;
import java.time.LocalDate;
import java.util.Random;
import javax.annotation.Nullable;

public class Class856 extends Class855
{
    private static final DataParameter<Byte> field4562;
    private static final Class7843 field4563;
    private BlockPos field4564;
    
    public Class856(final EntityType<? extends Class856> class7499, final World class7500) {
        super(class7499, class7500);
        this.method5145(true);
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.dataManager.register(Class856.field4562, (Byte)0);
    }
    
    @Override
    public float method2720() {
        return 0.1f;
    }
    
    @Override
    public float method2721() {
        return super.method2721() * 0.95f;
    }
    
    @Nullable
    @Override
    public Class7795 method4160() {
        return (this.method5144() && this.rand.nextInt(4) != 0) ? null : Class8520.field35005;
    }
    
    @Override
    public Class7795 method2683(final DamageSource class7929) {
        return Class8520.field35007;
    }
    
    @Override
    public Class7795 method2684() {
        return Class8520.field35006;
    }
    
    @Override
    public boolean method1750() {
        return false;
    }
    
    @Override
    public void method2741(final Entity class399) {
    }
    
    @Override
    public void method2739() {
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2710(Class8107.field33405).method23941(6.0);
    }
    
    public boolean method5144() {
        return (this.dataManager.get(Class856.field4562) & 0x1) != 0x0;
    }
    
    public void method5145(final boolean b) {
        final byte byteValue = this.dataManager.get(Class856.field4562);
        if (!b) {
            this.dataManager.set(Class856.field4562, (byte)(byteValue & 0xFFFFFFFE));
        }
        else {
            this.dataManager.set(Class856.field4562, (byte)(byteValue | 0x1));
        }
    }
    
    @Override
    public void method1659() {
        super.method1659();
        if (!this.method5144()) {
            this.method1936(this.getMotion().mul(1.0, 0.6, 1.0));
        }
        else {
            this.method1936(Vec3d.ZERO);
            this.method1948(this.getPosX(), MathHelper.floor(this.getPosY()) + 1.0 - this.method1931(), this.getPosZ());
        }
    }
    
    @Override
    public void method4172() {
        super.method4172();
        final BlockPos class354 = new BlockPos(this);
        final BlockPos method1137 = class354.method1137();
        if (!this.method5144()) {
            if (this.field4564 != null) {
                if (!this.world.method6961(this.field4564) || this.field4564.getY() < 1) {
                    this.field4564 = null;
                }
            }
            Label_0319: {
                if (this.field4564 != null) {
                    if (this.rand.nextInt(30) != 0) {
                        if (!this.field4564.withinDistance(this.method1934(), 2.0)) {
                            break Label_0319;
                        }
                    }
                }
                this.field4564 = new BlockPos(this.getPosX() + this.rand.nextInt(7) - this.rand.nextInt(7), this.getPosY() + this.rand.nextInt(6) - 2.0, this.getPosZ() + this.rand.nextInt(7) - this.rand.nextInt(7));
            }
            final double d = this.field4564.getX() + 0.5 - this.getPosX();
            final double d2 = this.field4564.getY() + 0.1 - this.getPosY();
            final double d3 = this.field4564.getZ() + 0.5 - this.getPosZ();
            final Vec3d method1138 = this.getMotion();
            final Vec3d method1139 = method1138.add((Math.signum(d) * 0.5 - method1138.x) * 0.10000000149011612, (Math.signum(d2) * 0.699999988079071 - method1138.y) * 0.10000000149011612, (Math.signum(d3) * 0.5 - method1138.z) * 0.10000000149011612);
            this.method1936(method1139);
            final float method1140 = MathHelper.method35668((float)(MathHelper.method35693(method1139.z, method1139.x) * 57.2957763671875) - 90.0f - this.rotationYaw);
            this.field2970 = 0.5f;
            this.rotationYaw += method1140;
            if (this.rand.nextInt(100) == 0) {
                if (this.world.getBlockState(method1137).method21713(this.world, method1137)) {
                    this.method5145(true);
                }
            }
        }
        else if (!this.world.getBlockState(method1137).method21713(this.world, class354)) {
            this.method5145(false);
            this.world.method6839(null, 1025, class354, 0);
        }
        else {
            if (this.rand.nextInt(200) == 0) {
                this.field2953 = (float)this.rand.nextInt(360);
            }
            if (this.world.method7135(Class856.field4563, this) != null) {
                this.method5145(false);
                this.world.method6839(null, 1025, class354, 0);
            }
        }
    }
    
    @Override
    public boolean method1700() {
        return false;
    }
    
    @Override
    public boolean method1705(final float n, final float n2) {
        return false;
    }
    
    @Override
    public void method1701(final double n, final boolean b, final BlockState class7096, final BlockPos class7097) {
    }
    
    @Override
    public boolean method1861() {
        return true;
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource class7929, final float n) {
        if (!this.method1849(class7929)) {
            if (!this.world.isRemote) {
                if (this.method5144()) {
                    this.method5145(false);
                }
            }
            return super.attackEntityFrom(class7929, n);
        }
        return false;
    }
    
    @Override
    public void method1760(final CompoundNBT class51) {
        super.method1760(class51);
        this.dataManager.set(Class856.field4562, class51.getByte("BatFlags"));
    }
    
    @Override
    public void method1761(final CompoundNBT class51) {
        super.method1761(class51);
        class51.putByte("BatFlags", this.dataManager.get(Class856.field4562));
    }
    
    public static boolean method5146(final EntityType<Class856> class7499, final Class1851 class7500, final Class2101 class7501, final BlockPos class7502, final Random random) {
        if (class7502.getY() < class7500.method6743()) {
            final int method6969 = class7500.method6969(class7502);
            int bound = 4;
            if (!method5147()) {
                if (random.nextBoolean()) {
                    return false;
                }
            }
            else {
                bound = 7;
            }
            return method6969 <= random.nextInt(bound) && Class759.method4178(class7499, class7500, class7501, class7502, random);
        }
        return false;
    }
    
    private static boolean method5147() {
        final LocalDate now = LocalDate.now();
        final int value = now.get(ChronoField.DAY_OF_MONTH);
        final int value2 = now.get(ChronoField.MONTH_OF_YEAR);
        return (value2 == 10 && value >= 20) || (value2 == 11 && value <= 3);
    }
    
    @Override
    public float method2789(final Pose class290, final EntitySize class291) {
        return class291.field34098 / 2.0f;
    }
    
    static {
        field4562 = EntityDataManager.method33564(Class856.class, Class7709.field30653);
        field4563 = new Class7843().method25337(4.0).method25339();
    }
}
