// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

import java.util.Random;
import java.util.Iterator;
import java.util.List;
import java.util.EnumSet;

public class Class3465<T extends Class777> extends Class3446
{
    private static String[] field16327;
    private final T field16328;
    private final double field16329;
    private final double field16330;
    private long field16331;
    
    public Class3465(final T field16328, final double field16329, final double field16330) {
        this.field16328 = field16328;
        this.field16329 = field16329;
        this.field16330 = field16330;
        this.field16331 = -1L;
        this.method11019(EnumSet.of(Class2139.field12580));
    }
    
    @Override
    public boolean method11013() {
        final boolean b = this.field16328.world.method6754() < this.field16331;
        if (this.field16328.method4316()) {
            if (this.field16328.method4152() == null) {
                if (!this.field16328.isBeingRidden()) {
                    if (this.field16328.method4312()) {
                        return !b;
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public void method11015() {
    }
    
    @Override
    public void method11018() {
    }
    
    @Override
    public void method11016() {
        final boolean method4314 = this.field16328.method4314();
        final Class7746 method4315 = this.field16328.method4150();
        if (method4315.method24731()) {
            final List<Class777> method4316 = this.method11030();
            if (this.field16328.method4316() && method4316.isEmpty()) {
                this.field16328.method4317(false);
            }
            else if (method4314 && this.field16328.method4311().withinDistance(this.field16328.method1934(), 10.0)) {
                this.field16328.method4315();
            }
            else {
                final Vec3d class5487 = new Vec3d(this.field16328.method4311());
                final Vec3d method4317 = this.field16328.method1934();
                final BlockPos method4318 = this.field16328.world.method6958(HeightmapType.field11526, new BlockPos(method4317.subtract(class5487).rotateYaw(90.0f).scale(0.4).add(class5487).subtract(method4317).normalize().scale(10.0).add(method4317)));
                if (method4315.method24724(method4318.getX(), method4318.getY(), method4318.getZ(), method4314 ? this.field16330 : this.field16329)) {
                    if (method4314) {
                        final Iterator iterator = method4316.iterator();
                        while (iterator.hasNext()) {
                            ((Class777)iterator.next()).method4310(method4318);
                        }
                    }
                }
                else {
                    this.method11031();
                    this.field16331 = this.field16328.world.method6754() + 200L;
                }
            }
        }
    }
    
    private List<Class777> method11030() {
        return this.field16328.world.method6739(Class777.class, this.field16328.getBoundingBox().intersect(16.0), class777 -> class777.method4290() && !class777.method1843(this.field16328));
    }
    
    private boolean method11031() {
        final Random method2633 = this.field16328.method2633();
        final BlockPos method2634 = this.field16328.world.method6958(HeightmapType.field11526, new BlockPos(this.field16328).add(-8 + method2633.nextInt(16), 0, -8 + method2633.nextInt(16)));
        return this.field16328.method4150().method24724(method2634.getX(), method2634.getY(), method2634.getZ(), this.field16329);
    }
}
