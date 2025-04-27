// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.List;

public class Class495 extends TileEntity implements Class439
{
    private static String[] field2841;
    private long field2842;
    public int field2843;
    public boolean field2844;
    public Direction field2845;
    private List<LivingEntity> field2846;
    private boolean field2847;
    private int field2848;
    
    public Class495() {
        super(Class5412.field22570);
    }
    
    @Override
    public boolean method2200(final int n, final int n2) {
        if (n != 1) {
            return super.method2200(n, n2);
        }
        this.method2512();
        this.field2848 = 0;
        this.field2845 = Direction.byIndex(n2);
        this.field2843 = 0;
        return this.field2844 = true;
    }
    
    @Override
    public void method2229() {
        if (this.field2844) {
            ++this.field2843;
        }
        if (this.field2843 >= 50) {
            this.field2844 = false;
            this.field2843 = 0;
        }
        if (this.field2843 >= 5) {
            if (this.field2848 == 0) {
                if (this.method2513()) {
                    this.field2847 = true;
                    this.method2510();
                }
            }
        }
        if (this.field2847) {
            if (this.field2848 >= 40) {
                this.method2514(this.field2656);
                this.method2515(this.field2656);
                this.field2847 = false;
            }
            else {
                ++this.field2848;
            }
        }
    }
    
    private void method2510() {
        this.field2656.method6705(null, this.getPos(), Class8520.field35026, Class286.field1582, 1.0f, 1.0f);
    }
    
    public void method2511(final Direction field2845) {
        final BlockPos method2193 = this.getPos();
        this.field2845 = field2845;
        if (!this.field2844) {
            this.field2844 = true;
        }
        else {
            this.field2843 = 0;
        }
        this.field2656.method6763(method2193, this.method2194().getBlock(), 1, field2845.getIndex());
    }
    
    private void method2512() {
        final BlockPos method2193 = this.getPos();
        if (this.field2656.method6754() > this.field2842 + 60L || this.field2846 == null) {
            this.field2842 = this.field2656.method6754();
            this.field2846 = (List<LivingEntity>)this.field2656.method7128((Class<? extends Entity>) LivingEntity.class, new AxisAlignedBB(method2193).intersect(48.0));
        }
        if (!this.field2656.isRemote) {
            for (final LivingEntity class511 : this.field2846) {
                if (!class511.isAlive()) {
                    continue;
                }
                if (class511.removed) {
                    continue;
                }
                if (!method2193.withinDistance(class511.method1934(), 32.0)) {
                    continue;
                }
                class511.method2618().method1196(Class8233.field33821, this.field2656.method6754());
            }
        }
    }
    
    private boolean method2513() {
        final BlockPos method2193 = this.getPos();
        for (final LivingEntity class511 : this.field2846) {
            if (!class511.isAlive()) {
                continue;
            }
            if (class511.removed) {
                continue;
            }
            if (!method2193.withinDistance(class511.method1934(), 32.0)) {
                continue;
            }
            if (!class511.getType().method23383(Class8039.field33100)) {
                continue;
            }
            return true;
        }
        return false;
    }
    
    private void method2514(final World class1847) {
        if (!class1847.isRemote) {
            this.field2846.stream().filter((Predicate<? super Object>)this::method2516).forEach((Consumer<? super Object>)this::method2517);
        }
    }
    
    private void method2515(final World class1847) {
        if (class1847.isRemote) {
            this.getPos();
            this.field2846.stream().filter((Predicate<? super Object>)this::method2516).forEach(class1850 -> {
                final Object o = (int)this.field2846.stream().filter(p1 -> {}).count();
                final Object o2 = new AtomicInteger(16700985);
                MathHelper.sqrt((class1850.getPosX() - class1848.method1074()) * (class1850.getPosX() - class1848.method1074()) + (class1850.getPosZ() - class1848.method1076()) * (class1850.getPosZ() - class1848.method1076()));
                final float n3;
                final double n2 = class1848.method1074() + 0.5f + 1.0f / n3 * (class1850.getPosX() - class1848.method1074());
                final double n4 = class1848.method1076() + 0.5f + 1.0f / n3 * (class1850.getPosZ() - class1848.method1076());
                MathHelper.method35651((n - 21) / -2, 3, 15);
                int i = 0;
                final int n5;
                while (i < n5) {
                    atomicInteger.addAndGet(5);
                    class1849.method6709(Class8432.field34617, n2, class1848.method1075() + 0.5f, n4, (atomicInteger.get() >> 16 & 0xFF) / 255.0, (atomicInteger.get() >> 8 & 0xFF) / 255.0, (atomicInteger.get() & 0xFF) / 255.0);
                    ++i;
                }
            });
        }
    }
    
    private boolean method2516(final LivingEntity class511) {
        if (class511.isAlive()) {
            if (!class511.removed) {
                if (this.getPos().withinDistance(class511.method1934(), 48.0)) {
                    if (class511.getType().method23383(Class8039.field33100)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    private void method2517(final LivingEntity class511) {
        class511.method2655(new Class1948(Class9439.field40497, 60));
    }
}
