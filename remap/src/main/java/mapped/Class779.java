// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.function.Predicate;

public class Class779 extends Class776
{
    private static final Predicate<Entity> field4185;
    private int field4186;
    private int field4187;
    private int field4188;
    
    public Class779(final EntityType<? extends Class779> class7499, final World class7500) {
        super(class7499, class7500);
        this.stepHeight = 1.0f;
        this.field4108 = 20;
    }
    
    @Override
    public void method4142() {
        super.method4142();
        this.field4114.method22062(0, new Class3490(this));
        this.field4114.method22062(4, new Class3582(this));
        this.field4114.method22062(5, new Class3517(this, 0.4));
        this.field4114.method22062(6, new Class3628(this, PlayerEntity.class, 6.0f));
        this.field4114.method22062(10, new Class3628(this, Class759.class, 8.0f));
        this.field4115.method22062(2, new Class3547(this, new Class[] { Class776.class }).method11100(new Class[0]));
        this.field4115.method22062(3, new Class3555<Object>(this, PlayerEntity.class, true));
        this.field4115.method22062(4, new Class3555<Object>(this, Class819.class, true));
        this.field4115.method22062(4, new Class3555<Object>(this, Class786.class, true));
    }
    
    @Override
    public void method4159() {
        final boolean b = !(this.method1907() instanceof Class759) || this.method1907().getType().method23383(Class8039.field33100);
        final boolean b2 = !(this.method1920() instanceof Class423);
        this.field4114.method22070(Class2139.field12580, b);
        this.field4114.method22070(Class2139.field12582, b && b2);
        this.field4114.method22070(Class2139.field12581, b);
        this.field4114.method22070(Class2139.field12583, b);
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2710(Class8107.field33405).method23941(100.0);
        this.method2710(Class8107.field33408).method23941(0.3);
        this.method2710(Class8107.field33407).method23941(0.5);
        this.method2710(Class8107.field33410).method23941(12.0);
        this.method2710(Class8107.field33411).method23941(1.5);
        this.method2710(Class8107.field33406).method23941(32.0);
    }
    
    @Override
    public void method1761(final CompoundNBT class51) {
        super.method1761(class51);
        class51.putInt("AttackTick", this.field4186);
        class51.putInt("StunTick", this.field4187);
        class51.putInt("RoarTick", this.field4188);
    }
    
    @Override
    public void method1760(final CompoundNBT class51) {
        super.method1760(class51);
        this.field4186 = class51.getInt("AttackTick");
        this.field4187 = class51.getInt("StunTick");
        this.field4188 = class51.getInt("RoarTick");
    }
    
    @Override
    public Class7795 method4260() {
        return Class8520.field35298;
    }
    
    @Override
    public Class7746 method4143(final World class1847) {
        return new Class7748(this, class1847);
    }
    
    @Override
    public int method4174() {
        return 45;
    }
    
    @Override
    public double method1777() {
        return 2.1;
    }
    
    @Override
    public boolean method4189() {
        return !this.method4214() && this.method1907() instanceof LivingEntity;
    }
    
    @Nullable
    @Override
    public Entity method1907() {
        return this.method1908().isEmpty() ? null : this.method1908().get(0);
    }
    
    @Override
    public void method2736() {
        super.method2736();
        if (this.isAlive()) {
            if (!this.method2722()) {
                this.method2710(Class8107.field33408).method23941(MathHelper.lerp(0.1, this.method2710(Class8107.field33408).method23940(), (this.method4152() == null) ? 0.3 : 0.35));
            }
            else {
                this.method2710(Class8107.field33408).method23941(0.0);
            }
            if (this.collidedHorizontally) {
                if (this.world.method6765().method31216(Class8878.field37316)) {
                    boolean b = false;
                    final AxisAlignedBB method18496 = this.getBoundingBox().intersect(0.2);
                    for (final BlockPos class354 : BlockPos.getAllInBoxMutable(MathHelper.floor(method18496.minX), MathHelper.floor(method18496.minY), MathHelper.floor(method18496.minZ), MathHelper.floor(method18496.maxX), MathHelper.floor(method18496.maxY), MathHelper.floor(method18496.maxZ))) {
                        if (!(this.world.getBlockState(class354).method21696() instanceof Class3972)) {
                            continue;
                        }
                        b = (this.world.method6691(class354, true, this) || b);
                    }
                    if (!b) {
                        if (this.onGround) {
                            this.method2725();
                        }
                    }
                }
            }
            if (this.field4188 > 0) {
                --this.field4188;
                if (this.field4188 == 10) {
                    this.method4322();
                }
            }
            if (this.field4186 > 0) {
                --this.field4186;
            }
            if (this.field4187 > 0) {
                --this.field4187;
                this.method4321();
                if (this.field4187 == 0) {
                    this.method1695(Class8520.field35303, 1.0f, 1.0f);
                    this.field4188 = 20;
                }
            }
        }
    }
    
    private void method4321() {
        if (this.rand.nextInt(6) == 0) {
            this.world.addParticle(Class8432.field34617, this.getPosX() - this.method1930() * Math.sin(this.field2951 * 0.017453292f) + (this.rand.nextDouble() * 0.6 - 0.3), this.getPosY() + this.method1931() - 0.3, this.getPosZ() + this.method1930() * Math.cos(this.field2951 * 0.017453292f) + (this.rand.nextDouble() * 0.6 - 0.3), 0.4980392156862745, 0.5137254901960784, 0.5725490196078431);
        }
    }
    
    @Override
    public boolean method2722() {
        if (!super.method2722()) {
            if (this.field4186 <= 0) {
                if (this.field4187 <= 0) {
                    return this.field4188 > 0;
                }
            }
        }
        return true;
    }
    
    @Override
    public boolean method2747(final Entity class399) {
        return this.field4187 <= 0 && this.field4188 <= 0 && super.method2747(class399);
    }
    
    @Override
    public void method2667(final LivingEntity class511) {
        if (this.field4188 == 0) {
            if (this.rand.nextDouble() >= 0.5) {
                this.method4323(class511);
            }
            else {
                this.field4187 = 40;
                this.method1695(Class8520.field35302, 1.0f, 1.0f);
                this.world.method6761(this, (byte)39);
                class511.method1737(this);
            }
            class511.velocityChanged = true;
        }
    }
    
    private void method4322() {
        if (this.isAlive()) {
            for (final Entity class399 : this.world.method6739((Class<? extends Entity>) LivingEntity.class, this.getBoundingBox().intersect(4.0), (Predicate<? super Entity>)Class779.field4185)) {
                if (!(class399 instanceof Class772)) {
                    class399.attackEntityFrom(DamageSource.method25693(this), 6.0f);
                }
                this.method4323(class399);
            }
            final Vec3d method18517 = this.getBoundingBox().getCenter();
            for (int i = 0; i < 40; ++i) {
                this.world.addParticle(Class8432.field34636, method18517.x, method18517.y, method18517.z, this.rand.nextGaussian() * 0.2, this.rand.nextGaussian() * 0.2, this.rand.nextGaussian() * 0.2);
            }
        }
    }
    
    private void method4323(final Entity class399) {
        final double n = class399.getPosX() - this.getPosX();
        final double n2 = class399.getPosZ() - this.getPosZ();
        final double max = Math.max(n * n + n2 * n2, 0.001);
        class399.method1738(n / max * 4.0, 0.2, n2 / max * 4.0);
    }
    
    @Override
    public void method1798(final byte b) {
        if (b != 4) {
            if (b == 39) {
                this.field4187 = 40;
            }
        }
        else {
            this.field4186 = 10;
            this.method1695(Class8520.field35297, 1.0f, 1.0f);
        }
        super.method1798(b);
    }
    
    public int method4324() {
        return this.field4186;
    }
    
    public int method4325() {
        return this.field4187;
    }
    
    public int method4326() {
        return this.field4188;
    }
    
    @Override
    public boolean method2734(final Entity class399) {
        this.field4186 = 10;
        this.world.method6761(this, (byte)4);
        this.method1695(Class8520.field35297, 1.0f, 1.0f);
        return super.method2734(class399);
    }
    
    @Nullable
    @Override
    public Class7795 method4160() {
        return Class8520.field35296;
    }
    
    @Override
    public Class7795 method2683(final DamageSource class7929) {
        return Class8520.field35300;
    }
    
    @Override
    public Class7795 method2684() {
        return Class8520.field35299;
    }
    
    @Override
    public void method1691(final BlockPos class354, final Class7096 class355) {
        this.method1695(Class8520.field35301, 0.15f, 1.0f);
    }
    
    @Override
    public boolean method4180(final Class1852 class1852) {
        return !class1852.method6968(this.getBoundingBox());
    }
    
    @Override
    public void method4263(final int n, final boolean b) {
    }
    
    @Override
    public boolean method4308() {
        return false;
    }
    
    static {
        field4185 = (class399 -> class399.isAlive() && !(class399 instanceof Class779));
    }
}
