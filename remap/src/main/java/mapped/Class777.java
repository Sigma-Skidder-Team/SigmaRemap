// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

import java.util.Random;
import javax.annotation.Nullable;

public abstract class Class777 extends Class763
{
    private BlockPos field4176;
    private boolean field4177;
    private boolean field4178;
    
    public Class777(final EntityType<? extends Class777> class7499, final World class7500) {
        super(class7499, class7500);
    }
    
    @Override
    public void method4142() {
        super.method4142();
        this.field4114.method22062(4, new Class3465<Object>(this, 0.7, 0.595));
    }
    
    @Override
    public void method1761(final CompoundNBT class51) {
        super.method1761(class51);
        if (this.field4176 != null) {
            class51.put("PatrolTarget", Class9346.method34646(this.field4176));
        }
        class51.putBoolean("PatrolLeader", this.field4177);
        class51.putBoolean("Patrolling", this.field4178);
    }
    
    @Override
    public void method1760(final CompoundNBT class51) {
        super.method1760(class51);
        if (class51.contains("PatrolTarget")) {
            this.field4176 = Class9346.method34645(class51.getCompound("PatrolTarget"));
        }
        this.field4177 = class51.getBoolean("PatrolLeader");
        this.field4178 = class51.getBoolean("Patrolling");
    }
    
    @Override
    public double method1776() {
        return -0.45;
    }
    
    public boolean method4308() {
        return true;
    }
    
    @Nullable
    @Override
    public Class5496 method4188(final Class1851 class1851, final Class9592 class1852, final Class2101 class1853, final Class5496 class1854, final CompoundNBT class1855) {
        if (class1853 != Class2101.field12189) {
            if (class1853 != Class2101.field12181) {
                if (class1853 != Class2101.field12177) {
                    if (this.rand.nextFloat() < 0.06f) {
                        if (this.method4308()) {
                            this.field4177 = true;
                        }
                    }
                }
            }
        }
        if (this.method4314()) {
            this.method1803(Class2215.field13605, Class8792.method30651());
            this.method4191(Class2215.field13605, 2.0f);
        }
        if (class1853 == Class2101.field12189) {
            this.field4178 = true;
        }
        return super.method4188(class1851, class1852, class1853, class1854, class1855);
    }
    
    public static boolean method4309(final EntityType<? extends Class777> class7499, final Class1851 class7500, final Class2101 class7501, final BlockPos class7502, final Random random) {
        return class7500.method6992(Class237.field912, class7502) <= 8 && Class763.method4231(class7499, class7500, class7501, class7502, random);
    }
    
    @Override
    public boolean method4168(final double n) {
        return !this.field4178 || n > 16384.0;
    }
    
    public void method4310(final BlockPos field4176) {
        this.field4176 = field4176;
        this.field4178 = true;
    }
    
    public BlockPos method4311() {
        return this.field4176;
    }
    
    public boolean method4312() {
        return this.field4176 != null;
    }
    
    public void method4313(final boolean field4177) {
        this.field4177 = field4177;
        this.field4178 = true;
    }
    
    public boolean method4314() {
        return this.field4177;
    }
    
    public boolean method4290() {
        return true;
    }
    
    public void method4315() {
        this.field4176 = new BlockPos(this).add(-500 + this.rand.nextInt(1000), 0, -500 + this.rand.nextInt(1000));
        this.field4178 = true;
    }
    
    public boolean method4316() {
        return this.field4178;
    }
    
    public void method4317(final boolean field4178) {
        this.field4178 = field4178;
    }
}
