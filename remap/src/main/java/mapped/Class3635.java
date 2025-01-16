// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Vec3d;

import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Class3635 extends Class3634
{
    private static String[] field16872;
    public final /* synthetic */ Class851 field16871;
    
    private Class3635(final Class851 field16871) {
        this.field16871 = field16871;
        super(field16871);
    }
    
    @Override
    public boolean method11013() {
        return this.field16871.method4152() != null && Class851.method5091(this.field16871) == Class2129.field12431;
    }
    
    @Override
    public boolean method11017() {
        final LivingEntity method4152 = this.field16871.method4152();
        if (method4152 == null) {
            return false;
        }
        if (!method4152.method1768()) {
            return false;
        }
        if (method4152 instanceof PlayerEntity && (((PlayerEntity)method4152).isSpectator() || ((PlayerEntity)method4152).method2889())) {
            return false;
        }
        if (this.method11013()) {
            if (this.field16871.ticksExisted % 20 == 0) {
                final List<Entity> method4153 = this.field16871.world.method6739((Class<? extends Entity>)Class800.class, this.field16871.getBoundingBox().method18496(16.0), (Predicate<? super Entity>)Class9170.field38845);
                if (!method4153.isEmpty()) {
                    final Iterator iterator = method4153.iterator();
                    while (iterator.hasNext()) {
                        ((Class800)iterator.next()).method4615();
                    }
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    @Override
    public void method11015() {
    }
    
    @Override
    public void method11018() {
        this.field16871.method4153(null);
        Class851.method5103(this.field16871, Class2129.field12430);
    }
    
    @Override
    public void method11016() {
        final LivingEntity method4152 = this.field16871.method4152();
        Class851.method5102(this.field16871, new Vec3d(method4152.getPosX(), method4152.method1942(0.5), method4152.getPosZ()));
        if (!this.field16871.getBoundingBox().method18496(0.20000000298023224).method18502(method4152.getBoundingBox())) {
            if (this.field16871.collidedHorizontally || this.field16871.field2938 > 0) {
                Class851.method5103(this.field16871, Class2129.field12430);
            }
        }
        else {
            this.field16871.method2734(method4152);
            Class851.method5103(this.field16871, Class2129.field12430);
            this.field16871.world.method6955(1039, new BlockPos(this.field16871), 0);
        }
    }
}
