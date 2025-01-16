// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.HashSet;

import com.google.common.collect.Sets;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

import java.util.EnumSet;

public class Class3640<T extends Class776> extends Class3446
{
    private static String[] field16888;
    private final T field16889;
    
    public Class3640(final T field16889) {
        this.field16889 = field16889;
        this.method11019(EnumSet.of(Class2139.field12580));
    }
    
    @Override
    public boolean method11013() {
        if (this.field16889.method4152() == null) {
            if (!this.field16889.isBeingRidden()) {
                if (this.field16889.method4293()) {
                    if (!this.field16889.method4292().method30618()) {
                        if (!((Class1849)this.field16889.world).method6922(new BlockPos(this.field16889))) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public boolean method11017() {
        if (this.field16889.method4293()) {
            if (!this.field16889.method4292().method30618()) {
                if (this.field16889.world instanceof Class1849) {
                    if (!((Class1849)this.field16889.world).method6922(new BlockPos(this.field16889))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public void method11016() {
        if (this.field16889.method4293()) {
            final Class8792 method4292 = this.field16889.method4292();
            if (this.field16889.ticksExisted % 20 == 0) {
                this.method11169(method4292);
            }
            if (!this.field16889.method4346()) {
                final Vec3d method4293 = Class7775.method24905(this.field16889, 15, 4, new Vec3d(method4292.method30658()));
                if (method4293 != null) {
                    this.field16889.method4150().method24724(method4293.x, method4293.y, method4293.z, 1.0);
                }
            }
        }
    }
    
    private void method11169(final Class8792 class8792) {
        if (class8792.method30663()) {
            final HashSet hashSet = Sets.newHashSet();
            hashSet.addAll(this.field16889.world.method6739((Class<? extends Entity>)Class776.class, this.field16889.getBoundingBox().intersect(16.0), class8794 -> !class8794.method4293() && Class6357.method18927(class8794, class8793)));
            final Iterator iterator = hashSet.iterator();
            while (iterator.hasNext()) {
                class8792.method30644(class8792.method30626(), (Class776)iterator.next(), null, true);
            }
        }
    }
}
