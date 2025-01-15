// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Collections;
import java.util.Collection;

public class Class425 extends Entity
{
    private static String[] field2582;
    private static final Class8810<Integer> field2583;
    private boolean field2584;
    private int field2585;
    private final Class512 field2586;
    private int field2587;
    private int field2588;
    private int field2589;
    private int field2590;
    private float field2591;
    public Entity field2592;
    private Class2064 field2593;
    private final int field2594;
    private final int field2595;
    
    private Class425(final Class1847 class1847, final Class512 field2586, final int b, final int b2) {
        super(Class7499.field29059, class1847);
        this.field2593 = Class2064.field11816;
        this.field2447 = true;
        this.field2586 = field2586;
        this.field2586.field3036 = this;
        this.field2594 = Math.max(0, b);
        this.field2595 = Math.max(0, b2);
    }
    
    public Class425(final Class1847 class1847, final Class512 class1848, final double n, final double n2, final double n3) {
        this(class1847, class1848, 0, 0);
        this.method1656(n, n2, n3);
        this.field2392 = this.getPosX();
        this.field2393 = this.getPosY();
        this.field2394 = this.getPosZ();
    }
    
    public Class425(final Class512 class512, final Class1847 class513, final int n, final int n2) {
        this(class513, class512, n, n2);
        final float field2400 = this.field2586.field2400;
        final float field2401 = this.field2586.field2399;
        final float method35639 = MathHelper.cos(-field2401 * 0.017453292f - 3.1415927f);
        final float method35640 = MathHelper.sin(-field2401 * 0.017453292f - 3.1415927f);
        final float n3 = -MathHelper.cos(-field2400 * 0.017453292f);
        final float method35641 = MathHelper.sin(-field2400 * 0.017453292f);
        this.method1730(this.field2586.getPosX() - method35640 * 0.3, this.field2586.method1944(), this.field2586.getPosZ() - method35639 * 0.3, field2401, field2400);
        final Vec3d class514 = new Vec3d(-method35640, MathHelper.clamp(-(method35641 / n3), -5.0f, 5.0f), -method35639);
        final double method35642 = class514.length();
        final Vec3d method35643 = class514.mul(0.6 / method35642 + 0.5 + this.field2423.nextGaussian() * 0.0045, 0.6 / method35642 + 0.5 + this.field2423.nextGaussian() * 0.0045, 0.6 / method35642 + 0.5 + this.field2423.nextGaussian() * 0.0045);
        this.method1936(method35643);
        this.field2399 = (float)(MathHelper.method35693(method35643.x, method35643.z) * 57.2957763671875);
        this.field2400 = (float)(MathHelper.method35693(method35643.y, MathHelper.sqrt(Entity.method1680(method35643))) * 57.2957763671875);
        this.field2401 = this.field2399;
        this.field2402 = this.field2400;
    }
    
    @Override
    public void method1649() {
        this.method1650().method33565(Class425.field2583, 0);
    }
    
    @Override
    public void method1880(final Class8810<?> class8810) {
        if (Class425.field2583.equals(class8810)) {
            final int intValue = this.method1650().method33568(Class425.field2583);
            this.field2592 = ((intValue <= 0) ? null : this.field2391.method6741(intValue - 1));
        }
        super.method1880(class8810);
    }
    
    @Override
    public boolean method1753(final double n) {
        return n < 4096.0;
    }
    
    @Override
    public void method1788(final double n, final double n2, final double n3, final float n4, final float n5, final int n6, final boolean b) {
    }
    
    @Override
    public void method1659() {
        super.method1659();
        if (this.field2586 != null) {
            if (this.field2391.field10067 || !this.method2072()) {
                if (this.field2584) {
                    ++this.field2585;
                    if (this.field2585 >= 1200) {
                        this.method1652();
                        return;
                    }
                }
                float method21782 = 0.0f;
                final BlockPos class354 = new BlockPos(this);
                final Class7099 method21783 = this.field2391.method6702(class354);
                if (method21783.method21793(Class7324.field28319)) {
                    method21782 = method21783.method21782(this.field2391, class354);
                }
                Label_0094: {
                    if (this.field2593 != Class2064.field11816) {
                        if (this.field2593 == Class2064.field11817) {
                            if (this.field2592 != null) {
                                if (!this.field2592.field2410) {
                                    this.method1656(this.field2592.getPosX(), this.field2592.method1942(0.8), this.field2592.getPosZ());
                                }
                                else {
                                    this.field2592 = null;
                                    this.field2593 = Class2064.field11816;
                                }
                            }
                            return;
                        }
                        if (this.field2593 == Class2064.field11818) {
                            final Vec3d method21784 = this.method1935();
                            double n = this.getPosY() + method21784.y - class354.getY() - method21782;
                            if (Math.abs(n) < 0.01) {
                                n += Math.signum(n) * 0.1;
                            }
                            this.method1937(method21784.x * 0.9, method21784.y - n * this.field2423.nextFloat() * 0.2, method21784.z * 0.9);
                            if (!this.field2391.field10067) {
                                if (method21782 > 0.0f) {
                                    this.method2076(class354);
                                }
                            }
                        }
                    }
                    else {
                        if (this.field2592 != null) {
                            this.method1936(Vec3d.ZERO);
                            this.field2593 = Class2064.field11817;
                            return;
                        }
                        if (method21782 > 0.0f) {
                            this.method1936(this.method1935().mul(0.3, 0.2, 0.3));
                            this.field2593 = Class2064.field11818;
                            return;
                        }
                        if (!this.field2391.field10067) {
                            this.method2074();
                        }
                        if (!this.field2584) {
                            if (!this.field2404) {
                                if (!this.field2405) {
                                    ++this.field2587;
                                    break Label_0094;
                                }
                            }
                        }
                        this.field2587 = 0;
                        this.method1936(Vec3d.ZERO);
                    }
                }
                if (!method21783.method21793(Class7324.field28319)) {
                    this.method1936(this.method1935().add(0.0, -0.03, 0.0));
                }
                this.method1671(Class2160.field12826, this.method1935());
                this.method2073();
                this.method1936(this.method1935().scale(0.92));
                this.method1657();
            }
        }
        else {
            this.method1652();
        }
    }
    
    private boolean method2072() {
        final Class8321 method2713 = this.field2586.method2713();
        final Class8321 method2714 = this.field2586.method2714();
        final boolean b = method2713.method27622() == Class7739.field31376;
        final boolean b2 = method2714.method27622() == Class7739.field31376;
        if (!this.field2586.field2410) {
            if (this.field2586.method1768()) {
                if (b || b2) {
                    if (this.method1734(this.field2586) <= 1024.0) {
                        return false;
                    }
                }
            }
        }
        this.method1652();
        return true;
    }
    
    private void method2073() {
        final Vec3d method1935 = this.method1935();
        final float method1936 = MathHelper.sqrt(Entity.method1680(method1935));
        this.field2399 = (float)(MathHelper.method35693(method1935.x, method1935.z) * 57.2957763671875);
        this.field2400 = (float)(MathHelper.method35693(method1935.y, method1936) * 57.2957763671875);
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
    }
    
    private void method2074() {
        final Class7006 method23093 = Class7476.method23093(this, this.method1886().method18493(this.method1935()).method18496(1.0), class399 -> {
            final boolean b;
            if (!class399.method1639()) {
                if (class399.method1749() || class399 instanceof Class427) {
                    if (class399 != this.field2586 || this.field2587 >= 5) {
                        return b;
                    }
                }
            }
            return b;
        }, Class2040.field11632, true);
        if (method23093.method21449() != Class2165.field12880) {
            if (method23093.method21449() != Class2165.field12882) {
                this.field2584 = true;
            }
            else {
                this.field2592 = ((Class7007)method23093).method21452();
                this.method2075();
            }
        }
    }
    
    private void method2075() {
        this.method1650().method33569(Class425.field2583, this.field2592.method1643() + 1);
    }
    
    private void method2076(final BlockPos class354) {
        final Class1849 class355 = (Class1849)this.field2391;
        int n = 1;
        final BlockPos method1137 = class354.method1137();
        if (this.field2423.nextFloat() < 0.25f) {
            if (this.field2391.method6772(method1137)) {
                ++n;
            }
        }
        if (this.field2423.nextFloat() < 0.5f) {
            if (!this.field2391.method6994(method1137)) {
                --n;
            }
        }
        if (this.field2588 <= 0) {
            if (this.field2590 <= 0) {
                if (this.field2589 <= 0) {
                    this.field2589 = MathHelper.method35658(this.field2423, 100, 600);
                    this.field2589 -= this.field2595 * 20 * 5;
                }
                else {
                    this.field2589 -= n;
                    float n2 = 0.15f;
                    if (this.field2589 >= 20) {
                        if (this.field2589 >= 40) {
                            if (this.field2589 < 60) {
                                n2 += (float)((60 - this.field2589) * 0.01);
                            }
                        }
                        else {
                            n2 += (float)((40 - this.field2589) * 0.02);
                        }
                    }
                    else {
                        n2 += (float)((20 - this.field2589) * 0.05);
                    }
                    if (this.field2423.nextFloat() < n2) {
                        final float n3 = MathHelper.method35659(this.field2423, 0.0f, 360.0f) * 0.017453292f;
                        final float method1138 = MathHelper.method35659(this.field2423, 25.0f, 60.0f);
                        final double n4 = this.getPosX() + MathHelper.sin(n3) * method1138 * 0.1f;
                        final double n5 = MathHelper.floor(this.getPosY()) + 1.0f;
                        final double n6 = this.getPosZ() + MathHelper.cos(n3) * method1138 * 0.1f;
                        if (class355.method6701(new BlockPos(n4, n5 - 1.0, n6)).method21696() == Class7521.field29173) {
                            class355.method6911(Class8432.field34646, n4, n5, n6, 2 + this.field2423.nextInt(2), 0.10000000149011612, 0.0, 0.10000000149011612, 0.0);
                        }
                    }
                    if (this.field2589 <= 0) {
                        this.field2591 = MathHelper.method35659(this.field2423, 0.0f, 360.0f);
                        this.field2590 = MathHelper.method35658(this.field2423, 20, 80);
                    }
                }
            }
            else {
                this.field2590 -= n;
                if (this.field2590 <= 0) {
                    final Vec3d method1139 = this.method1935();
                    this.method1937(method1139.x, -0.4f * MathHelper.method35659(this.field2423, 0.6f, 1.0f), method1139.z);
                    this.method1695(Class8520.field35037, 0.25f, 1.0f + (this.field2423.nextFloat() - this.field2423.nextFloat()) * 0.4f);
                    final double n7 = this.getPosY() + 0.5;
                    class355.method6911(Class8432.field34601, this.getPosX(), n7, this.getPosZ(), (int)(1.0f + this.method1930() * 20.0f), this.method1930(), 0.0, this.method1930(), 0.20000000298023224);
                    class355.method6911(Class8432.field34622, this.getPosX(), n7, this.getPosZ(), (int)(1.0f + this.method1930() * 20.0f), this.method1930(), 0.0, this.method1930(), 0.20000000298023224);
                    this.field2588 = MathHelper.method35658(this.field2423, 20, 40);
                }
                else {
                    this.field2591 += (float)(this.field2423.nextGaussian() * 4.0);
                    final float n8 = this.field2591 * 0.017453292f;
                    final float method1140 = MathHelper.sin(n8);
                    final float method1141 = MathHelper.cos(n8);
                    final double n9 = this.getPosX() + method1140 * this.field2590 * 0.1f;
                    final double n10 = MathHelper.floor(this.getPosY()) + 1.0f;
                    final double n11 = this.getPosZ() + method1141 * this.field2590 * 0.1f;
                    if (class355.method6701(new BlockPos(n9, n10 - 1.0, n11)).method21696() == Class7521.field29173) {
                        if (this.field2423.nextFloat() < 0.15f) {
                            class355.method6911(Class8432.field34601, n9, n10 - 0.10000000149011612, n11, 1, method1140, 0.1, method1141, 0.0);
                        }
                        final float n12 = method1140 * 0.04f;
                        final float n13 = method1141 * 0.04f;
                        class355.method6911(Class8432.field34622, n9, n10, n11, 0, n13, 0.01, -n12, 1.0);
                        class355.method6911(Class8432.field34622, n9, n10, n11, 0, -n13, 0.01, n12, 1.0);
                    }
                }
            }
        }
        else {
            --this.field2588;
            if (this.field2588 > 0) {
                this.method1936(this.method1935().add(0.0, -0.2 * this.field2423.nextFloat() * this.field2423.nextFloat(), 0.0));
            }
            else {
                this.field2589 = 0;
                this.field2590 = 0;
            }
        }
    }
    
    @Override
    public void method1761(final Class51 class51) {
    }
    
    @Override
    public void method1760(final Class51 class51) {
    }
    
    public int method2077(final Class8321 class8321) {
        if (!this.field2391.field10067 && this.field2586 != null) {
            int n = 0;
            if (this.field2592 == null) {
                if (this.field2588 > 0) {
                    final List<Class8321> method34485 = this.field2391.method6679().method1581().method6402(Class9020.field38116).method34485(new Class9098((Class1849)this.field2391).method32877(Class6683.field26367, new BlockPos(this)).method32877(Class6683.field26370, class8321).method32873(this.field2423).method32876(this.field2594 + this.field2586.method2907()).method32883(Class7104.field27714));
                    Class7770.field31804.method13808((Class513)this.field2586, class8321, this, method34485);
                    for (final Class8321 class8322 : method34485) {
                        final Class427 class8323 = new Class427(this.field2391, this.getPosX(), this.getPosY(), this.getPosZ(), class8322);
                        final double n2 = this.field2586.getPosX() - this.getPosX();
                        final double n3 = this.field2586.getPosY() - this.getPosY();
                        final double n4 = this.field2586.getPosZ() - this.getPosZ();
                        class8323.method1937(n2 * 0.1, n3 * 0.1 + Math.sqrt(Math.sqrt(n2 * n2 + n3 * n3 + n4 * n4)) * 0.08, n4 * 0.1);
                        this.field2391.method6886(class8323);
                        this.field2586.field2391.method6886(new Class508(this.field2586.field2391, this.field2586.getPosX(), this.field2586.getPosY() + 0.5, this.field2586.getPosZ() + 0.5, this.field2423.nextInt(6) + 1));
                        if (!class8322.method27622().method11742(Class7855.field32272)) {
                            continue;
                        }
                        this.field2586.method2858(Class8276.field34020, 1);
                    }
                    n = 1;
                }
            }
            else {
                this.method2078();
                Class7770.field31804.method13808((Class513)this.field2586, class8321, this, (Collection<Class8321>)Collections.emptyList());
                this.field2391.method6761(this, (byte)31);
                n = ((this.field2592 instanceof Class427) ? 3 : 5);
            }
            if (this.field2584) {
                n = 2;
            }
            this.method1652();
            return n;
        }
        return 0;
    }
    
    @Override
    public void method1798(final byte b) {
        if (b == 31) {
            if (this.field2391.field10067) {
                if (this.field2592 instanceof Class512) {
                    if (((Class512)this.field2592).method2843()) {
                        this.method2078();
                    }
                }
            }
        }
        super.method1798(b);
    }
    
    public void method2078() {
        if (this.field2586 != null) {
            this.field2592.method1936(this.field2592.method1935().add(new Vec3d(this.field2586.getPosX() - this.getPosX(), this.field2586.getPosY() - this.getPosY(), this.field2586.getPosZ() - this.getPosZ()).scale(0.1)));
        }
    }
    
    @Override
    public boolean method1700() {
        return false;
    }
    
    @Override
    public void method1652() {
        super.method1652();
        if (this.field2586 != null) {
            this.field2586.field3036 = null;
        }
    }
    
    @Nullable
    public Class512 method2079() {
        return this.field2586;
    }
    
    @Override
    public boolean method1855() {
        return false;
    }
    
    @Override
    public Class4252<?> method1932() {
        final Class512 method2079 = this.method2079();
        return new Class4339(this, (method2079 != null) ? method2079.method1643() : this.method1643());
    }
    
    static {
        field2583 = Class9184.method33564(Class425.class, Class7709.field30654);
    }
}
