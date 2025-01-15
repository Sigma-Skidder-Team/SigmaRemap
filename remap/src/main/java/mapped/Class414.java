// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

import javax.annotation.Nullable;
import java.util.UUID;

public abstract class Class414 extends Entity implements Class401
{
    private int field2512;
    private int field2513;
    private int field2514;
    public boolean field2515;
    public int field2516;
    public Class511 field2517;
    private UUID field2518;
    private Entity field2519;
    private int field2520;
    
    public Class414(final Class7499<? extends Class414> class7499, final Class1847 class7500) {
        super(class7499, class7500);
        this.field2512 = -1;
        this.field2513 = -1;
        this.field2514 = -1;
    }
    
    public Class414(final Class7499<? extends Class414> class7499, final double n, final double n2, final double n3, final Class1847 class7500) {
        this(class7499, class7500);
        this.method1656(n, n2, n3);
    }
    
    public Class414(final Class7499<? extends Class414> class7499, final Class511 field2517, final Class1847 class7500) {
        this(class7499, field2517.getPosX(), field2517.method1944() - 0.10000000149011612, field2517.getPosZ(), class7500);
        this.field2517 = field2517;
        this.field2518 = field2517.method1865();
    }
    
    @Override
    public boolean method1753(final double n) {
        double v = this.method1886().method18507() * 4.0;
        if (Double.isNaN(v)) {
            v = 4.0;
        }
        final double n2 = v * 64.0;
        return n < n2 * n2;
    }
    
    public void method1963(final Entity class399, final float n, final float n2, final float n3, final float n4, final float n5) {
        this.method1958(-MathHelper.sin(n2 * 0.017453292f) * MathHelper.cos(n * 0.017453292f), -MathHelper.sin((n + n3) * 0.017453292f), MathHelper.cos(n2 * 0.017453292f) * MathHelper.cos(n * 0.017453292f), n4, n5);
        final Vec3d method1935 = class399.method1935();
        this.method1936(this.method1935().add(method1935.x, class399.field2404 ? 0.0 : method1935.y, method1935.z));
    }
    
    @Override
    public void method1958(final double n, final double n2, final double n3, final float n4, final float n5) {
        final Vec3d method16748 = new Vec3d(n, n2, n3).normalize().add(this.field2423.nextGaussian() * 0.007499999832361937 * n5, this.field2423.nextGaussian() * 0.007499999832361937 * n5, this.field2423.nextGaussian() * 0.007499999832361937 * n5).scale(n4);
        this.method1936(method16748);
        final float method16749 = MathHelper.sqrt(Entity.method1680(method16748));
        this.field2399 = (float)(MathHelper.method35693(method16748.x, method16748.z) * 57.2957763671875);
        this.field2400 = (float)(MathHelper.method35693(method16748.y, method16749) * 57.2957763671875);
        this.field2401 = this.field2399;
        this.field2402 = this.field2400;
    }
    
    @Override
    public void method1797(final double n, final double n2, final double n3) {
        this.method1937(n, n2, n3);
        if (this.field2402 == 0.0f) {
            if (this.field2401 == 0.0f) {
                final float method35641 = MathHelper.sqrt(n * n + n3 * n3);
                this.field2399 = (float)(MathHelper.method35693(n, n3) * 57.2957763671875);
                this.field2400 = (float)(MathHelper.method35693(n2, method35641) * 57.2957763671875);
                this.field2401 = this.field2399;
                this.field2402 = this.field2400;
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
            this.method1936(this.method1935().mul(this.field2423.nextFloat() * 0.2f, this.field2423.nextFloat() * 0.2f, this.field2423.nextFloat() * 0.2f));
        }
        final AxisAlignedBB method18496 = this.method1886().method18493(this.method1935()).method18496(1.0);
        for (final Entity field2519 : this.field2391.method6737(this, method18496, class399 -> !class399.method1639() && class399.method1749())) {
            if (field2519 == this.field2519) {
                ++this.field2520;
                break;
            }
            if (this.field2517 == null) {
                continue;
            }
            if (this.field2424 >= 2) {
                continue;
            }
            if (this.field2519 != null) {
                continue;
            }
            this.field2519 = field2519;
            this.field2520 = 3;
            break;
        }
        final Class7006 method18497 = Class7476.method23093(this, method18496, class400 -> {
            final boolean b;
            if (!class400.method1639()) {
                if (!(!class400.method1749())) {
                    if (class400 != this.field2519) {
                        return b;
                    }
                }
            }
            return b;
        }, Class2040.field11633, true);
        if (this.field2519 != null) {
            if (this.field2520-- <= 0) {
                this.field2519 = null;
            }
        }
        if (method18497.method21449() != Class2165.field12880) {
            if (method18497.method21449() == Class2165.field12881 && this.field2391.method6701(((Class7005)method18497).method21447()).method21696() == Class7521.field29341) {
                this.method1794(((Class7005)method18497).method21447());
            }
            else {
                this.method2016(method18497);
            }
        }
        final Vec3d method18498 = this.method1935();
        final double n = this.getPosX() + method18498.x;
        final double n2 = this.getPosY() + method18498.y;
        final double n3 = this.getPosZ() + method18498.z;
        final float method18499 = MathHelper.sqrt(Entity.method1680(method18498));
        this.field2399 = (float)(MathHelper.method35693(method18498.x, method18498.z) * 57.2957763671875);
        this.field2400 = (float)(MathHelper.method35693(method18498.y, method18499) * 57.2957763671875);
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
        float n4;
        if (!this.method1706()) {
            n4 = 0.99f;
        }
        else {
            for (int i = 0; i < 4; ++i) {
                this.field2391.method6709(Class8432.field34601, n - method18498.x * 0.25, n2 - method18498.y * 0.25, n3 - method18498.z * 0.25, method18498.x, method18498.y, method18498.z);
            }
            n4 = 0.8f;
        }
        this.method1936(method18498.scale(n4));
        if (!this.method1698()) {
            final Vec3d method18500 = this.method1935();
            this.method1937(method18500.x, method18500.y - this.method2018(), method18500.z);
        }
        this.method1656(n, n2, n3);
    }
    
    public float method2018() {
        return 0.03f;
    }
    
    public abstract void method2016(final Class7006 p0);
    
    @Override
    public void method1761(final Class51 class51) {
        class51.method298("xTile", this.field2512);
        class51.method298("yTile", this.field2513);
        class51.method298("zTile", this.field2514);
        class51.method296("shake", (byte)this.field2516);
        class51.method312("inGround", this.field2515);
        if (this.field2518 != null) {
            class51.method295("owner", Class9346.method34643(this.field2518));
        }
    }
    
    @Override
    public void method1760(final Class51 class51) {
        this.field2512 = class51.method319("xTile");
        this.field2513 = class51.method319("yTile");
        this.field2514 = class51.method319("zTile");
        this.field2516 = (class51.method317("shake") & 0xFF);
        this.field2515 = class51.method329("inGround");
        this.field2517 = null;
        if (class51.method316("owner", 10)) {
            this.field2518 = Class9346.method34644(class51.method327("owner"));
        }
    }
    
    @Nullable
    public Class511 method2019() {
        if (this.field2517 == null || this.field2517.field2410) {
            if (this.field2518 != null) {
                if (this.field2391 instanceof Class1849) {
                    final Entity method6914 = ((Class1849)this.field2391).method6914(this.field2518);
                    if (!(method6914 instanceof Class511)) {
                        this.field2517 = null;
                    }
                    else {
                        this.field2517 = (Class511)method6914;
                    }
                }
            }
        }
        return this.field2517;
    }
    
    @Override
    public Class4252<?> method1932() {
        return new Class4339(this);
    }
}
