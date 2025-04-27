// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.UUID;

public class Class400 extends Entity implements Class401
{
    public Class815 field2466;
    private CompoundNBT field2467;
    
    public Class400(final EntityType<? extends Class400> class7499, final World class7500) {
        super(class7499, class7500);
    }
    
    public Class400(final World class1847, final Class815 field2466) {
        this(EntityType.field28997, class1847);
        this.field2466 = field2466;
        this.setPosition(field2466.getPosX() - (field2466.method1930() + 1.0f) * 0.5 * MathHelper.sin(field2466.field2951 * 0.017453292f), field2466.method1944() - 0.10000000149011612, field2466.getPosZ() + (field2466.method1930() + 1.0f) * 0.5 * MathHelper.cos(field2466.field2951 * 0.017453292f));
    }
    
    public Class400(final World class1847, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        this(EntityType.field28997, class1847);
        this.setPosition(n, n2, n3);
        for (int i = 0; i < 7; ++i) {
            final double n7 = 0.4 + 0.1 * i;
            class1847.addParticle(Class8432.field34641, n, n2, n3, n4 * n7, n5, n6 * n7);
        }
        this.setMotion(n4, n5, n6);
    }
    
    @Override
    public void method1659() {
        super.method1659();
        if (this.field2467 != null) {
            this.method1960();
        }
        final Vec3d method1935 = this.getMotion();
        final RayTraceResult method1936 = Class7476.method23093(this, this.getBoundingBox().expand(method1935).intersect(1.0), class399 -> !class399.isSpectator() && class399 != this.field2466, RayTraceContext.BlockMode.OUTLINE, true);
        if (method1936 != null) {
            this.method1959(method1936);
        }
        final double n = this.getPosX() + method1935.x;
        final double n2 = this.getPosY() + method1935.y;
        final double n3 = this.getPosZ() + method1935.z;
        final float method1937 = MathHelper.sqrt(Entity.horizontalMag(method1935));
        this.rotationYaw = (float)(MathHelper.method35693(method1935.x, method1935.z) * 57.2957763671875);
        this.rotationPitch = (float)(MathHelper.method35693(method1935.y, method1937) * 57.2957763671875);
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
        if (this.world.isMaterialInBB(this.getBoundingBox(), Material.AIR)) {
            if (!this.method1711()) {
                this.method1936(method1935.scale(0.9900000095367432));
                if (!this.method1698()) {
                    this.method1936(this.getMotion().add(0.0, -0.05999999865889549, 0.0));
                }
                this.setPosition(n, n2, n3);
            }
            else {
                this.method1652();
            }
        }
        else {
            this.method1652();
        }
    }
    
    @Override
    public void method1797(final double n, final double n2, final double n3) {
        this.setMotion(n, n2, n3);
        if (this.prevRotationPitch == 0.0f) {
            if (this.prevRotationYaw == 0.0f) {
                this.rotationPitch = (float)(MathHelper.method35693(n2, MathHelper.sqrt(n * n + n3 * n3)) * 57.2957763671875);
                this.rotationYaw = (float)(MathHelper.method35693(n, n3) * 57.2957763671875);
                this.prevRotationPitch = this.rotationPitch;
                this.prevRotationYaw = this.rotationYaw;
                this.method1730(this.getPosX(), this.getPosY(), this.getPosZ(), this.rotationYaw, this.rotationPitch);
            }
        }
    }
    
    @Override
    public void method1958(final double n, final double n2, final double n3, final float n4, final float n5) {
        final Vec3d method16748 = new Vec3d(n, n2, n3).normalize().add(this.rand.nextGaussian() * 0.007499999832361937 * n5, this.rand.nextGaussian() * 0.007499999832361937 * n5, this.rand.nextGaussian() * 0.007499999832361937 * n5).scale(n4);
        this.method1936(method16748);
        final float method16749 = MathHelper.sqrt(Entity.horizontalMag(method16748));
        this.rotationYaw = (float)(MathHelper.method35693(method16748.x, n3) * 57.2957763671875);
        this.rotationPitch = (float)(MathHelper.method35693(method16748.y, method16749) * 57.2957763671875);
        this.prevRotationYaw = this.rotationYaw;
        this.prevRotationPitch = this.rotationPitch;
    }
    
    public void method1959(final RayTraceResult class7006) {
        final RayTraceResult.Type method21449 = class7006.getType();
        if (method21449 == RayTraceResult.Type.ENTITY && this.field2466 != null) {
            ((EntityRayTraceResult)class7006).getEntity().attackEntityFrom(DamageSource.method25694(this, this.field2466).method25706(), 1.0f);
        }
        else if (method21449 == RayTraceResult.Type.BLOCK) {
            if (!this.world.isRemote) {
                this.method1652();
            }
        }
    }
    
    @Override
    public void method1649() {
    }
    
    @Override
    public void method1760(final CompoundNBT class51) {
        if (class51.contains("Owner", 10)) {
            this.field2467 = class51.getCompound("Owner");
        }
    }
    
    @Override
    public void method1761(final CompoundNBT class51) {
        if (this.field2466 != null) {
            final CompoundNBT class52 = new CompoundNBT();
            class52.putUniqueId("OwnerUUID", this.field2466.getUniqueID());
            class51.put("Owner", class52);
        }
    }
    
    private void method1960() {
        if (this.field2467 != null) {
            if (this.field2467.hasUniqueId("OwnerUUID")) {
                final UUID method301 = this.field2467.getUniqueId("OwnerUUID");
                for (final Class815 field2466 : this.world.method7128((Class<? extends Class815>)Class815.class, this.getBoundingBox().intersect(15.0))) {
                    if (!field2466.getUniqueID().equals(method301)) {
                        continue;
                    }
                    this.field2466 = field2466;
                    break;
                }
            }
        }
        this.field2467 = null;
    }
    
    @Override
    public IPacket<?> method1932() {
        return new Class4339(this);
    }
}
