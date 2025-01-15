// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class Class769 extends Class770 implements Class768
{
    private static String[] field4158;
    private int field4159;
    private final Vec3d[][] field4160;
    
    public Class769(final EntityType<? extends Class769> class7499, final World class7500) {
        super(class7499, class7500);
        this.field4108 = 5;
        this.field4160 = new Vec3d[2][4];
        for (int i = 0; i < 4; ++i) {
            this.field4160[0][i] = Vec3d.ZERO;
            this.field4160[1][i] = Vec3d.ZERO;
        }
    }
    
    @Override
    public void method4142() {
        super.method4142();
        this.field4114.method22062(0, new Class3490(this));
        this.field4114.method22062(1, new Class3511(this));
        this.field4114.method22062(4, new Class3536(this, null));
        this.field4114.method22062(5, new Class3535(this, null));
        this.field4114.method22062(6, new Class3626<Object>(this, 0.5, 20, 15.0f));
        this.field4114.method22062(8, new Class3514(this, 0.6));
        this.field4114.method22062(9, new Class3628(this, Class512.class, 3.0f, 1.0f));
        this.field4114.method22062(10, new Class3628(this, Class759.class, 8.0f));
        this.field4115.method22062(1, new Class3547(this, (Class<?>[])new Class[] { Class776.class }).method11100((Class<?>[])new Class[0]));
        this.field4115.method22062(2, new Class3555<Object>(this, Class512.class, true).method11099(300));
        this.field4115.method22062(3, new Class3555<Object>(this, Class819.class, false).method11099(300));
        this.field4115.method22062(3, new Class3555<Object>(this, Class786.class, false).method11099(300));
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2710(Class8107.field33408).method23941(0.5);
        this.method2710(Class8107.field33406).method23941(18.0);
        this.method2710(Class8107.field33405).method23941(32.0);
    }
    
    @Override
    public Class5496 method4188(final Class1851 class1851, final Class9592 class1852, final Class2101 class1853, final Class5496 class1854, final Class51 class1855) {
        this.method1803(Class2215.field13600, new ItemStack(Class7739.field31279));
        return super.method4188(class1851, class1852, class1853, class1854, class1855);
    }
    
    @Override
    public void method1649() {
        super.method1649();
    }
    
    @Override
    public AxisAlignedBB method1887() {
        return this.method1886().method18495(3.0, 0.0, 3.0);
    }
    
    @Override
    public void method2736() {
        super.method2736();
        if (this.world.field10067) {
            if (this.method1823()) {
                --this.field4159;
                if (this.field4159 < 0) {
                    this.field4159 = 0;
                }
                if (this.field2938 != 1 && this.ticksExisted % 1200 != 0) {
                    if (this.field2938 == this.field2939 - 1) {
                        this.field4159 = 3;
                        for (int i = 0; i < 4; ++i) {
                            this.field4160[0][i] = this.field4160[1][i];
                            this.field4160[1][i] = new Vec3d(0.0, 0.0, 0.0);
                        }
                    }
                }
                else {
                    this.field4159 = 3;
                    for (int j = 0; j < 4; ++j) {
                        this.field4160[0][j] = this.field4160[1][j];
                        this.field4160[1][j] = new Vec3d((-6.0f + this.rand.nextInt(13)) * 0.5, Math.max(0, this.rand.nextInt(6) - 4), (-6.0f + this.rand.nextInt(13)) * 0.5);
                    }
                    for (int k = 0; k < 16; ++k) {
                        this.world.method6709(Class8432.field34602, this.method1940(0.5), this.method1943(), this.method1946(0.5), 0.0, 0.0, 0.0);
                    }
                    this.world.method6708(this.getPosX(), this.getPosY(), this.getPosZ(), Class8520.field35308, this.method1922(), 1.0f, 1.0f, false);
                }
            }
        }
    }
    
    @Override
    public Class7795 method4260() {
        return Class8520.field35304;
    }
    
    public Vec3d[] method4261(final float n) {
        if (this.field4159 > 0) {
            final double pow = Math.pow((this.field4159 - n) / 3.0f, 0.25);
            final Vec3d[] array = new Vec3d[4];
            for (int i = 0; i < 4; ++i) {
                array[i] = this.field4160[1][i].scale(1.0 - pow).add(this.field4160[0][i].scale(pow));
            }
            return array;
        }
        return this.field4160[1];
    }
    
    @Override
    public boolean method1826(final Entity class399) {
        return super.method1826(class399) || (class399 instanceof LivingEntity && ((LivingEntity)class399).method2712() == Class6363.field25463 && this.getTeam() == null && class399.getTeam() == null);
    }
    
    @Override
    public Class7795 method4160() {
        return Class8520.field35304;
    }
    
    @Override
    public Class7795 method2684() {
        return Class8520.field35306;
    }
    
    @Override
    public Class7795 method2683(final DamageSource class7929) {
        return Class8520.field35307;
    }
    
    @Override
    public Class7795 method4262() {
        return Class8520.field35305;
    }
    
    @Override
    public void method4263(final int n, final boolean b) {
    }
    
    @Override
    public void method4252(final LivingEntity class511, final float n) {
        final Class402 method23101 = Class7476.method23101(this, this.method2790(this.method2715(Class7476.method23100(this, Class7739.field31279))), n);
        final double n2 = class511.getPosX() - this.getPosX();
        final double n3 = class511.method1942(0.3333333333333333) - method23101.getPosY();
        final double n4 = class511.getPosZ() - this.getPosZ();
        method23101.method1958(n2, n3 + MathHelper.sqrt(n2 * n2 + n4 * n4) * 0.20000000298023224, n4, 1.6f, (float)(14 - this.world.method6954().method8235() * 4));
        this.method1695(Class8520.field35575, 1.0f, 1.0f / (this.method2633().nextFloat() * 0.4f + 0.8f));
        this.world.method6886(method23101);
    }
    
    @Override
    public Class259 method4264() {
        if (!this.method4265()) {
            return this.method4216() ? Class259.field1237 : Class259.field1234;
        }
        return Class259.field1236;
    }
}
