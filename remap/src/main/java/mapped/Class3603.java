// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

import java.util.Iterator;
import java.util.List;

public class Class3603 extends Class3446
{
    private static String[] field16779;
    private int field16780;
    private final Class787 field16781;
    private LivingEntity field16782;
    private Class2155 field16783;
    
    public Class3603(final Class787 field16781) {
        this.field16781 = field16781;
    }
    
    @Override
    public boolean method11013() {
        final List<Class423> method7128 = this.field16781.world.method7128(Class423.class, this.field16781.getBoundingBox().intersect(5.0));
        int n = 0;
        final Iterator<Class423> iterator = method7128.iterator();
        while (iterator.hasNext()) {
            final Entity method7129 = iterator.next().method1907();
            if (method7129 instanceof LivingEntity && (MathHelper.method35647(((LivingEntity)method7129).field2968) > 0.0f || MathHelper.method35647(((LivingEntity)method7129).field2970) > 0.0f)) {
                n = 1;
                break;
            }
        }
        if (this.field16782 != null) {
            if (MathHelper.method35647(this.field16782.field2968) > 0.0f) {
                return true;
            }
            if (MathHelper.method35647(this.field16782.field2970) > 0.0f) {
                return true;
            }
        }
        return n != 0;
    }
    
    @Override
    public boolean method11014() {
        return true;
    }
    
    @Override
    public boolean method11017() {
        if (this.field16782 != null) {
            if (this.field16782.isPassenger()) {
                return MathHelper.method35647(this.field16782.field2968) > 0.0f || MathHelper.method35647(this.field16782.field2970) > 0.0f;
            }
        }
        return false;
    }
    
    @Override
    public void method11015() {
        for (final Class423 class423 : this.field16781.world.method7128((Class<? extends Class423>)Class423.class, this.field16781.getBoundingBox().intersect(5.0))) {
            if (class423.method1907() != null && class423.method1907() instanceof LivingEntity) {
                this.field16782 = (LivingEntity)class423.method1907();
                break;
            }
        }
        this.field16780 = 0;
        this.field16783 = Class2155.field12800;
    }
    
    @Override
    public void method11018() {
        this.field16782 = null;
    }
    
    @Override
    public void method11016() {
        final boolean b = MathHelper.method35647(this.field16782.field2968) > 0.0f || MathHelper.method35647(this.field16782.field2970) > 0.0f;
        this.field16781.method1724((this.field16783 != Class2155.field12801) ? 0.135f : (b ? 0.17999999f : 0.0f), new Vec3d(this.field16781.field2968, this.field16781.field2969, this.field16781.field2970));
        this.field16781.method1671(Class2160.field12826, this.field16781.getMotion());
        final int field16780 = this.field16780 - 1;
        this.field16780 = field16780;
        if (field16780 <= 0) {
            this.field16780 = 10;
            if (this.field16783 != Class2155.field12800) {
                if (this.field16783 == Class2155.field12801) {
                    final BlockPos method1150 = new BlockPos(this.field16782).method1150(this.field16782.method1883(), 10);
                    this.field16781.method4150().method24724(method1150.getX(), method1150.getY() - 1, method1150.getZ(), 1.0);
                    if (this.field16781.method1732(this.field16782) > 12.0f) {
                        this.field16780 = 0;
                        this.field16783 = Class2155.field12800;
                    }
                }
            }
            else {
                final BlockPos method1151 = new BlockPos(this.field16782).method1149(this.field16782.method1882().getOpposite()).add(0, -1, 0);
                this.field16781.method4150().method24724(method1151.getX(), method1151.getY(), method1151.getZ(), 1.0);
                if (this.field16781.method1732(this.field16782) < 4.0f) {
                    this.field16780 = 0;
                    this.field16783 = Class2155.field12801;
                }
            }
        }
    }
}
