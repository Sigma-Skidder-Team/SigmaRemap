// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class Class842 extends Class763
{
    private int field4489;
    private boolean field4490;
    
    public Class842(final EntityType<? extends Class842> class7499, final World class7500) {
        super(class7499, class7500);
        this.field4108 = 3;
    }
    
    @Override
    public void method4142() {
        this.field4114.method22062(1, new Class3490(this));
        this.field4114.method22062(2, new Class3574(this, 1.0, false));
        this.field4114.method22062(3, new Class3517(this, 1.0));
        this.field4114.method22062(7, new Class3628(this, PlayerEntity.class, 8.0f));
        this.field4114.method22062(8, new Class3503(this));
        this.field4115.method22062(1, new Class3547(this, (Class<?>[])new Class[0]).method11100((Class<?>[])new Class[0]));
        this.field4115.method22062(2, new Class3555<Object>(this, PlayerEntity.class, true));
    }
    
    @Override
    public float method2789(final Pose class290, final EntitySize class291) {
        return 0.1f;
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2710(Class8107.field33405).method23941(8.0);
        this.method2710(Class8107.field33408).method23941(0.25);
        this.method2710(Class8107.field33410).method23941(2.0);
    }
    
    @Override
    public boolean method1700() {
        return false;
    }
    
    @Override
    public Class7795 method4160() {
        return Class8520.field35168;
    }
    
    @Override
    public Class7795 method2683(final DamageSource class7929) {
        return Class8520.field35170;
    }
    
    @Override
    public Class7795 method2684() {
        return Class8520.field35169;
    }
    
    @Override
    public void method1691(final BlockPos class354, final BlockState class355) {
        this.method1695(Class8520.field35171, 0.15f, 1.0f);
    }
    
    @Override
    public void method1760(final CompoundNBT class51) {
        super.method1760(class51);
        this.field4489 = class51.getInt("Lifetime");
        this.field4490 = class51.getBoolean("PlayerSpawned");
    }
    
    @Override
    public void method1761(final CompoundNBT class51) {
        super.method1761(class51);
        class51.putInt("Lifetime", this.field4489);
        class51.putBoolean("PlayerSpawned", this.field4490);
    }
    
    @Override
    public void method1659() {
        this.field2951 = this.rotationYaw;
        super.method1659();
    }
    
    @Override
    public void method1846(final float field2399) {
        super.method1846(this.rotationYaw = field2399);
    }
    
    @Override
    public double method1776() {
        return 0.1;
    }
    
    public boolean method5033() {
        return this.field4490;
    }
    
    public void method5034(final boolean field4490) {
        this.field4490 = field4490;
    }
    
    @Override
    public void method2736() {
        super.method2736();
        if (!this.world.isRemote) {
            if (!this.method4194()) {
                ++this.field4489;
            }
            if (this.field4489 >= 2400) {
                this.method1652();
            }
        }
        else {
            for (int i = 0; i < 2; ++i) {
                this.world.method6709(Class8432.field34637, this.method1940(0.5), this.method1943(), this.method1947(0.5), (this.rand.nextDouble() - 0.5) * 2.0, -this.rand.nextDouble(), (this.rand.nextDouble() - 0.5) * 2.0);
            }
        }
    }
    
    public static boolean method5035(final EntityType<Class842> class7499, final Class1851 class7500, final Class2101 class7501, final BlockPos class7502, final Random random) {
        return Class763.method4231(class7499, class7500, class7501, class7502, random) && class7500.method7132(class7502.getX() + 0.5, class7502.getY() + 0.5, class7502.getZ() + 0.5, 5.0, true) == null;
    }
    
    @Override
    public Class6363 method2712() {
        return Class6363.field25462;
    }
}
