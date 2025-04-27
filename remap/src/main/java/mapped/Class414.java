// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.UUID;

public abstract class Class414 extends Entity implements Class401
{
    private int field2512;
    private int field2513;
    private int field2514;
    public boolean field2515;
    public int field2516;
    public LivingEntity field2517;
    private UUID field2518;
    private Entity field2519;
    private int field2520;
    
    public Class414(final EntityType<? extends Class414> class7499, final World class7500) {
        super(class7499, class7500);
        this.field2512 = -1;
        this.field2513 = -1;
        this.field2514 = -1;
    }
    
    public Class414(final EntityType<? extends Class414> class7499, final double n, final double n2, final double n3, final World class7500) {
        this(class7499, class7500);
        this.setPosition(n, n2, n3);
    }
    
    public Class414(final EntityType<? extends Class414> class7499, final LivingEntity field2517, final World class7500) {
        this(class7499, field2517.getPosX(), field2517.method1944() - 0.10000000149011612, field2517.getPosZ(), class7500);
        this.field2517 = field2517;
        this.field2518 = field2517.method1865();
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
    
    public void method1963(final Entity class399, final float n, final float n2, final float n3, final float n4, final float n5) {
        this.method1958(-MathHelper.sin(n2 * 0.017453292f) * MathHelper.cos(n * 0.017453292f), -MathHelper.sin((n + n3) * 0.017453292f), MathHelper.cos(n2 * 0.017453292f) * MathHelper.cos(n * 0.017453292f), n4, n5);
        final Vec3d method1935 = class399.getMotion();
        this.method1936(this.getMotion().add(method1935.x, class399.onGround ? 0.0 : method1935.y, method1935.z));
    }
    
    @Override
    public void method1958(final double n, final double n2, final double n3, final float n4, final float n5) {
        final Vec3d method16748 = new Vec3d(n, n2, n3).normalize().add(this.rand.nextGaussian() * 0.007499999832361937 * n5, this.rand.nextGaussian() * 0.007499999832361937 * n5, this.rand.nextGaussian() * 0.007499999832361937 * n5).scale(n4);
        this.method1936(method16748);
        final float method16749 = MathHelper.sqrt(Entity.horizontalMag(method16748));
        this.rotationYaw = (float)(MathHelper.method35693(method16748.x, method16748.z) * 57.2957763671875);
        this.rotationPitch = (float)(MathHelper.method35693(method16748.y, method16749) * 57.2957763671875);
        this.prevRotationYaw = this.rotationYaw;
        this.prevRotationPitch = this.rotationPitch;
    }
    
    @Override
    public void method1797(final double n, final double n2, final double n3) {
        this.setMotion(n, n2, n3);
        if (this.prevRotationPitch == 0.0f) {
            if (this.prevRotationYaw == 0.0f) {
                final float method35641 = MathHelper.sqrt(n * n + n3 * n3);
                this.rotationYaw = (float)(MathHelper.method35693(n, n3) * 57.2957763671875);
                this.rotationPitch = (float)(MathHelper.method35693(n2, method35641) * 57.2957763671875);
                this.prevRotationYaw = this.rotationYaw;
                this.prevRotationPitch = this.rotationPitch;
            }
        }
    }
    
    @Override
    public void method1659() {
        super.method1659();
        if (this.field2516 > 0) {
            --this.field2516;
        }
        if (this.field2515) {
            this.field2515 = false;
            this.method1936(this.getMotion().mul(this.rand.nextFloat() * 0.2f, this.rand.nextFloat() * 0.2f, this.rand.nextFloat() * 0.2f));
        }
        final AxisAlignedBB method18496 = this.getBoundingBox().expand(this.getMotion()).intersect(1.0);
        for (final Entity field2519 : this.world.method6737(this, method18496, class399 -> !class399.isSpectator() && class399.method1749())) {
            if (field2519 == this.field2519) {
                ++this.field2520;
                break;
            }
            if (this.field2517 == null) {
                continue;
            }
            if (this.ticksExisted >= 2) {
                continue;
            }
            if (this.field2519 != null) {
                continue;
            }
            this.field2519 = field2519;
            this.field2520 = 3;
            break;
        }
        final RayTraceResult method18497 = Class7476.method23093(this, method18496, class400 -> {
            final boolean b;
            if (!class400.isSpectator()) {
                if (class400.method1749()) {
                    if (class400 != this.field2519) {
                        return b;
                    }
                }
            }
            return b;
        }, RayTraceContext.BlockMode.OUTLINE, true);
        if (this.field2519 != null) {
            if (this.field2520-- <= 0) {
                this.field2519 = null;
            }
        }
        if (method18497.getType() != RayTraceResult.Type.MISS) {
            if (method18497.getType() == RayTraceResult.Type.BLOCK && this.world.getBlockState(((BlockRayTraceResult)method18497).getPos()).method21696() == Blocks.field29341) {
                this.method1794(((BlockRayTraceResult)method18497).getPos());
            }
            else {
                this.method2016(method18497);
            }
        }
        final Vec3d method18498 = this.getMotion();
        final double n = this.getPosX() + method18498.x;
        final double n2 = this.getPosY() + method18498.y;
        final double n3 = this.getPosZ() + method18498.z;
        final float method18499 = MathHelper.sqrt(Entity.horizontalMag(method18498));
        this.rotationYaw = (float)(MathHelper.method35693(method18498.x, method18498.z) * 57.2957763671875);
        this.rotationPitch = (float)(MathHelper.method35693(method18498.y, method18499) * 57.2957763671875);
        while (this.rotationPitch - this.prevRotationPitch < -180.0f) {
            this.prevRotationPitch -= 360.0f;
        }
        while (this.rotationPitch - this.prevRotationPitch >= 180.0f) {
            this.prevRotationPitch += 360.0f;
        }
        while (this.rotationYaw - this.prevRotationYaw < -180.0f) {
            this.prevRotationYaw -= 360.0f;
        }
        while (this.rotationYaw - this.prevRotationYaw >= 180.0f) {
            this.prevRotationYaw += 360.0f;
        }
        this.rotationPitch = MathHelper.method35700(0.2f, this.prevRotationPitch, this.rotationPitch);
        this.rotationYaw = MathHelper.method35700(0.2f, this.prevRotationYaw, this.rotationYaw);
        float n4;
        if (!this.method1706()) {
            n4 = 0.99f;
        }
        else {
            for (int i = 0; i < 4; ++i) {
                this.world.method6709(Class8432.field34601, n - method18498.x * 0.25, n2 - method18498.y * 0.25, n3 - method18498.z * 0.25, method18498.x, method18498.y, method18498.z);
            }
            n4 = 0.8f;
        }
        this.method1936(method18498.scale(n4));
        if (!this.method1698()) {
            final Vec3d method18500 = this.getMotion();
            this.setMotion(method18500.x, method18500.y - this.method2018(), method18500.z);
        }
        this.setPosition(n, n2, n3);
    }
    
    public float method2018() {
        return 0.03f;
    }
    
    public abstract void method2016(final RayTraceResult p0);
    
    @Override
    public void method1761(final CompoundNBT class51) {
        class51.putInt("xTile", this.field2512);
        class51.putInt("yTile", this.field2513);
        class51.putInt("zTile", this.field2514);
        class51.putByte("shake", (byte)this.field2516);
        class51.putBoolean("inGround", this.field2515);
        if (this.field2518 != null) {
            class51.put("owner", Class9346.method34643(this.field2518));
        }
    }
    
    @Override
    public void method1760(final CompoundNBT class51) {
        this.field2512 = class51.getInt("xTile");
        this.field2513 = class51.getInt("yTile");
        this.field2514 = class51.getInt("zTile");
        this.field2516 = (class51.getByte("shake") & 0xFF);
        this.field2515 = class51.getBoolean("inGround");
        this.field2517 = null;
        if (class51.contains("owner", 10)) {
            this.field2518 = Class9346.method34644(class51.getCompound("owner"));
        }
    }
    
    @Nullable
    public LivingEntity method2019() {
        if (this.field2517 == null || this.field2517.removed) {
            if (this.field2518 != null) {
                if (this.world instanceof Class1849) {
                    final Entity method6914 = ((Class1849)this.world).method6914(this.field2518);
                    if (!(method6914 instanceof LivingEntity)) {
                        this.field2517 = null;
                    }
                    else {
                        this.field2517 = (LivingEntity)method6914;
                    }
                }
            }
        }
        return this.field2517;
    }
    
    @Override
    public IPacket<?> method1932() {
        return new Class4339(this);
    }
}
