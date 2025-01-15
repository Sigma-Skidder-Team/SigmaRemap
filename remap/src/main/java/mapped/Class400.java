// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

import java.util.UUID;

public class Class400 extends Entity implements Class401
{
    public Class815 field2466;
    private Class51 field2467;
    
    public Class400(final EntityType<? extends Class400> class7499, final Class1847 class7500) {
        super(class7499, class7500);
    }
    
    public Class400(final Class1847 class1847, final Class815 field2466) {
        this(EntityType.field28997, class1847);
        this.field2466 = field2466;
        this.method1656(field2466.getPosX() - (field2466.method1930() + 1.0f) * 0.5 * MathHelper.sin(field2466.field2951 * 0.017453292f), field2466.method1944() - 0.10000000149011612, field2466.getPosZ() + (field2466.method1930() + 1.0f) * 0.5 * MathHelper.cos(field2466.field2951 * 0.017453292f));
    }
    
    public Class400(final Class1847 class1847, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        this(EntityType.field28997, class1847);
        this.method1656(n, n2, n3);
        for (int i = 0; i < 7; ++i) {
            final double n7 = 0.4 + 0.1 * i;
            class1847.method6709(Class8432.field34641, n, n2, n3, n4 * n7, n5, n6 * n7);
        }
        this.method1937(n4, n5, n6);
    }
    
    @Override
    public void method1659() {
        super.method1659();
        if (this.field2467 != null) {
            this.method1960();
        }
        final Vec3d method1935 = this.method1935();
        final Class7006 method1936 = Class7476.method23093(this, this.method1886().method18493(method1935).method18496(1.0), class399 -> !class399.method1639() && class399 != this.field2466, Class2040.field11633, true);
        if (method1936 != null) {
            this.method1959(method1936);
        }
        final double n = this.getPosX() + method1935.x;
        final double n2 = this.getPosY() + method1935.y;
        final double n3 = this.getPosZ() + method1935.z;
        final float method1937 = MathHelper.sqrt(Entity.method1680(method1935));
        this.field2399 = (float)(MathHelper.method35693(method1935.x, method1935.z) * 57.2957763671875);
        this.field2400 = (float)(MathHelper.method35693(method1935.y, method1937) * 57.2957763671875);
        while (this.field2400 - this.field2402 < -180.0f) {
            this.field2402 -= 360.0f;
        }
        while (this.field2400 - this.field2402 >= 180.0f) {
            this.field2402 += 360.0f;
        }
        while (this.field2399 - this.field2401 < -180.0f) {
            this.field2401 -= 360.0f;
        }
        while (this.field2399 - this.field2401 >= 180.0f) {
            this.field2401 += 360.0f;
        }
        this.field2400 = MathHelper.method35700(0.2f, this.field2402, this.field2400);
        this.field2399 = MathHelper.method35700(0.2f, this.field2401, this.field2399);
        if (this.field2391.method6721(this.method1886(), Class8059.field33153)) {
            if (!this.method1711()) {
                this.method1936(method1935.scale(0.9900000095367432));
                if (!this.method1698()) {
                    this.method1936(this.method1935().add(0.0, -0.05999999865889549, 0.0));
                }
                this.method1656(n, n2, n3);
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
        this.method1937(n, n2, n3);
        if (this.field2402 == 0.0f) {
            if (this.field2401 == 0.0f) {
                this.field2400 = (float)(MathHelper.method35693(n2, MathHelper.sqrt(n * n + n3 * n3)) * 57.2957763671875);
                this.field2399 = (float)(MathHelper.method35693(n, n3) * 57.2957763671875);
                this.field2402 = this.field2400;
                this.field2401 = this.field2399;
                this.method1730(this.getPosX(), this.getPosY(), this.getPosZ(), this.field2399, this.field2400);
            }
        }
    }
    
    @Override
    public void method1958(final double n, final double n2, final double n3, final float n4, final float n5) {
        final Vec3d method16748 = new Vec3d(n, n2, n3).normalize().add(this.field2423.nextGaussian() * 0.007499999832361937 * n5, this.field2423.nextGaussian() * 0.007499999832361937 * n5, this.field2423.nextGaussian() * 0.007499999832361937 * n5).scale(n4);
        this.method1936(method16748);
        final float method16749 = MathHelper.sqrt(Entity.method1680(method16748));
        this.field2399 = (float)(MathHelper.method35693(method16748.x, n3) * 57.2957763671875);
        this.field2400 = (float)(MathHelper.method35693(method16748.y, method16749) * 57.2957763671875);
        this.field2401 = this.field2399;
        this.field2402 = this.field2400;
    }
    
    public void method1959(final Class7006 class7006) {
        final Class2165 method21449 = class7006.method21449();
        if (method21449 == Class2165.field12882 && this.field2466 != null) {
            ((Class7007)class7006).method21452().method1740(Class7929.method25694(this, this.field2466).method25706(), 1.0f);
        }
        else if (method21449 == Class2165.field12881) {
            if (!this.field2391.field10067) {
                this.method1652();
            }
        }
    }
    
    @Override
    public void method1649() {
    }
    
    @Override
    public void method1760(final Class51 class51) {
        if (class51.method316("Owner", 10)) {
            this.field2467 = class51.method327("Owner");
        }
    }
    
    @Override
    public void method1761(final Class51 class51) {
        if (this.field2466 != null) {
            final Class51 class52 = new Class51();
            class52.method300("OwnerUUID", this.field2466.method1865());
            class51.method295("Owner", class52);
        }
    }
    
    private void method1960() {
        if (this.field2467 != null) {
            if (this.field2467.method302("OwnerUUID")) {
                final UUID method301 = this.field2467.method301("OwnerUUID");
                for (final Class815 field2466 : this.field2391.method7128((Class<? extends Class815>)Class815.class, this.method1886().method18496(15.0))) {
                    if (!field2466.method1865().equals(method301)) {
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
    public Class4252<?> method1932() {
        return new Class4339(this);
    }
}
