// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public abstract class Class419 extends Entity
{
    public LivingEntity field2527;
    private int field2528;
    private int field2529;
    public double field2530;
    public double field2531;
    public double field2532;
    
    public Class419(final EntityType<? extends Class419> class7499, final World class7500) {
        super(class7499, class7500);
    }
    
    public Class419(final EntityType<? extends Class419> class7499, final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final World class7500) {
        this(class7499, class7500);
        this.method1730(n, n2, n3, this.rotationYaw, this.rotationPitch);
        this.setPosition(n, n2, n3);
        final double n7 = MathHelper.sqrt(n4 * n4 + n5 * n5 + n6 * n6);
        this.field2530 = n4 / n7 * 0.1;
        this.field2531 = n5 / n7 * 0.1;
        this.field2532 = n6 / n7 * 0.1;
    }
    
    public Class419(final EntityType<? extends Class419> class7499, final LivingEntity field2527, double n, double n2, double n3, final World class7500) {
        this(class7499, class7500);
        this.field2527 = field2527;
        this.method1730(field2527.getPosX(), field2527.getPosY(), field2527.getPosZ(), field2527.rotationYaw, field2527.rotationPitch);
        this.method1657();
        this.method1936(Vec3d.ZERO);
        n += this.rand.nextGaussian() * 0.4;
        n2 += this.rand.nextGaussian() * 0.4;
        n3 += this.rand.nextGaussian() * 0.4;
        final double n4 = MathHelper.sqrt(n * n + n2 * n2 + n3 * n3);
        this.field2530 = n / n4 * 0.1;
        this.field2531 = n2 / n4 * 0.1;
        this.field2532 = n3 / n4 * 0.1;
    }
    
    @Override
    public void method1649() {
    }
    
    @Override
    public boolean method1753(final double n) {
        double v = this.getBoundingBox().getAverageEdgeLength() * 4.0;
        if (Double.isNaN(v)) {
            v = 4.0;
        }
        final double n2 = v * 64.0;
        return n < n2 * n2;
    }
    
    @Override
    public void method1659() {
        Label_0010: {
            if (!this.world.isRemote) {
                if (this.field2527 == null || !this.field2527.removed) {
                    if (this.world.method6971(new BlockPos(this))) {
                        break Label_0010;
                    }
                }
                this.method1652();
                return;
            }
        }
        super.method1659();
        if (this.method2033()) {
            this.setFire(1);
        }
        ++this.field2529;
        final RayTraceResult method23092 = Class7476.method23092(this, true, this.field2529 >= 25, this.field2527, RayTraceContext.BlockMode.COLLIDER);
        if (method23092.getType() != RayTraceResult.Type.MISS) {
            this.method2032(method23092);
        }
        final Vec3d method23093 = this.getMotion();
        final double n = this.getPosX() + method23093.x;
        final double n2 = this.getPosY() + method23093.y;
        final double n3 = this.getPosZ() + method23093.z;
        Class7476.method23099(this, 0.2f);
        float method23094 = this.method2035();
        if (this.method1706()) {
            for (int i = 0; i < 4; ++i) {
                this.world.method6709(Class8432.field34601, n - method23093.x * 0.25, n2 - method23093.y * 0.25, n3 - method23093.z * 0.25, method23093.x, method23093.y, method23093.z);
            }
            method23094 = 0.8f;
        }
        this.method1936(method23093.add(this.field2530, this.field2531, this.field2532).scale(method23094));
        this.world.method6709(this.method2034(), n, n2 + 0.5, n3, 0.0, 0.0, 0.0);
        this.setPosition(n, n2, n3);
    }
    
    public boolean method2033() {
        return true;
    }
    
    public IParticleData method2034() {
        return Class8432.field34639;
    }
    
    public float method2035() {
        return 0.95f;
    }
    
    public void method2032(final RayTraceResult class7006) {
        if (class7006.getType() == RayTraceResult.Type.BLOCK) {
            final BlockRayTraceResult class7007 = (BlockRayTraceResult)class7006;
            final Class7096 method6701 = this.world.getBlockState(class7007.getPos());
            method6701.method21760(this.world, method6701, class7007, this);
        }
    }
    
    @Override
    public void method1761(final CompoundNBT class51) {
        final Vec3d method1935 = this.getMotion();
        class51.put("direction", this.method1762(method1935.x, method1935.y, method1935.z));
        class51.put("power", this.method1762(this.field2530, this.field2531, this.field2532));
        class51.putInt("life", this.field2528);
    }
    
    @Override
    public void method1760(final CompoundNBT class51) {
        if (class51.contains("power", 9)) {
            final ListNBT method328 = class51.getList("power", 6);
            if (method328.size() == 3) {
                this.field2530 = method328.method351(0);
                this.field2531 = method328.method351(1);
                this.field2532 = method328.method351(2);
            }
        }
        this.field2528 = class51.getInt("life");
        if (class51.contains("direction", 9) && class51.getList("direction", 6).size() == 3) {
            final ListNBT method329 = class51.getList("direction", 6);
            this.setMotion(method329.method351(0), method329.method351(1), method329.method351(2));
        }
        else {
            this.method1652();
        }
    }
    
    @Override
    public boolean method1749() {
        return true;
    }
    
    @Override
    public float method1790() {
        return 1.0f;
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource class7929, final float n) {
        if (this.method1849(class7929)) {
            return false;
        }
        this.method1739();
        if (class7929.method25714() == null) {
            return false;
        }
        final Vec3d method1791 = class7929.method25714().method1791();
        this.method1936(method1791);
        this.field2530 = method1791.x * 0.1;
        this.field2531 = method1791.y * 0.1;
        this.field2532 = method1791.z * 0.1;
        if (class7929.method25714() instanceof LivingEntity) {
            this.field2527 = (LivingEntity)class7929.method25714();
        }
        return true;
    }
    
    @Override
    public float method1726() {
        return 1.0f;
    }
    
    @Override
    public IPacket<?> method1932() {
        return new Class4339(this.getEntityId(), this.getUniqueID(), this.getPosX(), this.getPosY(), this.getPosZ(), this.rotationPitch, this.rotationYaw, this.getType(), (this.field2527 != null) ? this.field2527.getEntityId() : 0, new Vec3d(this.field2530, this.field2531, this.field2532));
    }
}
