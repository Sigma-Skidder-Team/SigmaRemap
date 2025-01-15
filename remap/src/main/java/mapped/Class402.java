// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.util.Arrays;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

import java.util.UUID;
import java.util.Optional;

public abstract class Class402 extends Entity implements Class401
{
    private static final Class8810<Byte> field2468;
    public static final Class8810<Optional<UUID>> field2469;
    private static final Class8810<Byte> field2470;
    private Class7096 field2471;
    public boolean field2472;
    public int field2473;
    public Class2151 field2474;
    public int field2475;
    public UUID field2476;
    private int field2477;
    private int field2478;
    private double field2479;
    private int field2480;
    private Class7795 field2481;
    private IntOpenHashSet field2482;
    private List<Entity> field2483;
    
    public Class402(final Class7499<? extends Class402> class7499, final Class1847 class7500) {
        super(class7499, class7500);
        this.field2474 = Class2151.field12782;
        this.field2479 = 2.0;
        this.field2481 = this.method1968();
    }
    
    public Class402(final Class7499<? extends Class402> class7499, final double n, final double n2, final double n3, final Class1847 class7500) {
        this(class7499, class7500);
        this.method1656(n, n2, n3);
    }
    
    public Class402(final Class7499<? extends Class402> class7499, final Class511 class7500, final Class1847 class7501) {
        this(class7499, class7500.getPosX(), class7500.method1944() - 0.10000000149011612, class7500.getPosZ(), class7501);
        this.method1972(class7500);
        if (class7500 instanceof Class512) {
            this.field2474 = Class2151.field12783;
        }
    }
    
    public void method1962(final Class7795 field2481) {
        this.field2481 = field2481;
    }
    
    @Override
    public boolean method1753(final double n) {
        double v = this.method1886().method18507() * 10.0;
        if (Double.isNaN(v)) {
            v = 1.0;
        }
        final double n2 = v * 64.0 * method1869();
        return n < n2 * n2;
    }
    
    @Override
    public void method1649() {
        this.field2432.method33565(Class402.field2468, (Byte)0);
        this.field2432.method33565(Class402.field2469, Optional.empty());
        this.field2432.method33565(Class402.field2470, (Byte)0);
    }
    
    public void method1963(final Entity class399, final float n, final float n2, final float n3, final float n4, final float n5) {
        this.method1958(-MathHelper.sin(n2 * 0.017453292f) * MathHelper.cos(n * 0.017453292f), -MathHelper.sin(n * 0.017453292f), MathHelper.cos(n2 * 0.017453292f) * MathHelper.cos(n * 0.017453292f), n4, n5);
        this.method1936(this.method1935().add(class399.method1935().x, class399.field2404 ? 0.0 : class399.method1935().y, class399.method1935().z));
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
        this.field2477 = 0;
    }
    
    @Override
    public void method1788(final double n, final double n2, final double n3, final float n4, final float n5, final int n6, final boolean b) {
        this.method1656(n, n2, n3);
        this.method1655(n4, n5);
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
                this.field2477 = 0;
            }
        }
    }
    
    @Override
    public void method1659() {
        super.method1659();
        final boolean method1987 = this.method1987();
        final Vec3d method1988 = this.method1935();
        if (this.field2402 == 0.0f) {
            if (this.field2401 == 0.0f) {
                final float method1989 = MathHelper.sqrt(Entity.method1680(method1988));
                this.field2399 = (float)(MathHelper.method35693(method1988.x, method1988.z) * 57.2957763671875);
                this.field2400 = (float)(MathHelper.method35693(method1988.y, method1989) * 57.2957763671875);
                this.field2401 = this.field2399;
                this.field2402 = this.field2400;
            }
        }
        final BlockPos class354 = new BlockPos(this);
        final Class7096 method1990 = this.field2391.method6701(class354);
        if (!method1990.method21706()) {
            if (!method1987) {
                final Class7702 method1991 = method1990.method21727(this.field2391, class354);
                if (!method1991.method24540()) {
                    final Vec3d method1992 = this.method1934();
                    final Iterator<AxisAlignedBB> iterator = method1991.method24545().iterator();
                    while (iterator.hasNext()) {
                        if (!iterator.next().method18500(class354).method18505(method1992)) {
                            continue;
                        }
                        this.field2472 = true;
                        break;
                    }
                }
            }
        }
        if (this.field2475 > 0) {
            --this.field2475;
        }
        if (this.method1709()) {
            this.method1667();
        }
        if (this.field2472 && !method1987) {
            if (this.field2471 != method1990 && this.field2391.method6976(this.method1886().method18496(0.06))) {
                this.field2472 = false;
                this.method1936(method1988.mul(this.field2423.nextFloat() * 0.2f, this.field2423.nextFloat() * 0.2f, this.field2423.nextFloat() * 0.2f));
                this.field2477 = 0;
                this.field2478 = 0;
            }
            else if (!this.field2391.field10067) {
                this.method1964();
            }
            ++this.field2473;
        }
        else {
            this.field2473 = 0;
            ++this.field2478;
            final Vec3d method1993 = this.method1934();
            Vec3d class355 = method1993.add(method1988);
            Class7006 method1994 = this.field2391.method6987(new Class8478(method1993, class355, Class2040.field11632, Class2191.field13325, this));
            if (method1994.method21449() != Class2165.field12880) {
                class355 = method1994.method21451();
            }
            while (!this.field2410) {
                Class7007 method1995 = this.method1971(method1993, class355);
                if (method1995 != null) {
                    method1994 = method1995;
                }
                if (method1994 != null) {
                    if (method1994.method21449() == Class2165.field12882) {
                        final Entity method1996 = ((Class7007)method1994).method21452();
                        final Entity method1997 = this.method1973();
                        if (method1996 instanceof Class512) {
                            if (method1997 instanceof Class512) {
                                if (!((Class512)method1997).method2826((Class512)method1996)) {
                                    method1994 = null;
                                    method1995 = null;
                                }
                            }
                        }
                    }
                }
                if (method1994 != null) {
                    if (!method1987) {
                        this.method1965(method1994);
                        this.field2448 = true;
                    }
                }
                if (method1995 == null) {
                    break;
                }
                if (this.method1983() <= 0) {
                    break;
                }
                method1994 = null;
            }
            final Vec3d method1998 = this.method1935();
            final double field22770 = method1998.x;
            final double field22771 = method1998.y;
            final double field22772 = method1998.z;
            if (this.method1981()) {
                for (int i = 0; i < 4; ++i) {
                    this.field2391.method6709(Class8432.field34603, this.getPosX() + field22770 * i / 4.0, this.getPosY() + field22771 * i / 4.0, this.getPosZ() + field22772 * i / 4.0, -field22770, -field22771 + 0.2, -field22772);
                }
            }
            final double n = this.getPosX() + field22770;
            final double n2 = this.getPosY() + field22771;
            final double n3 = this.getPosZ() + field22772;
            final float method1999 = MathHelper.sqrt(Entity.method1680(method1998));
            if (!method1987) {
                this.field2399 = (float)(MathHelper.method35693(field22770, field22772) * 57.2957763671875);
            }
            else {
                this.field2399 = (float)(MathHelper.method35693(-field22770, -field22772) * 57.2957763671875);
            }
            this.field2400 = (float)(MathHelper.method35693(field22771, method1999) * 57.2957763671875);
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
            float method2000 = 0.99f;
            if (this.method1706()) {
                for (int j = 0; j < 4; ++j) {
                    this.field2391.method6709(Class8432.field34601, n - field22770 * 0.25, n2 - field22771 * 0.25, n3 - field22772 * 0.25, field22770, field22771, field22772);
                }
                method2000 = this.method1985();
            }
            this.method1936(method1998.scale(method2000));
            if (!this.method1698()) {
                if (!method1987) {
                    final Vec3d method2001 = this.method1935();
                    this.method1937(method2001.x, method2001.y - 0.05000000074505806, method2001.z);
                }
            }
            this.method1656(n, n2, n3);
            this.method1689();
        }
    }
    
    public void method1964() {
        ++this.field2477;
        if (this.field2477 >= 1200) {
            this.method1652();
        }
    }
    
    public void method1965(final Class7006 class7006) {
        final Class2165 method21449 = class7006.method21449();
        if (method21449 != Class2165.field12882) {
            if (method21449 == Class2165.field12881) {
                final Class7005 class7007 = (Class7005)class7006;
                final Class7096 method21450 = this.field2391.method6701(class7007.method21447());
                this.field2471 = method21450;
                final Vec3d method21451 = class7007.method21451().subtract(this.getPosX(), this.getPosY(), this.getPosZ());
                this.method1936(method21451);
                final Vec3d method21452 = method21451.normalize().scale(0.05000000074505806);
                this.method1948(this.getPosX() - method21452.x, this.getPosY() - method21452.y, this.getPosZ() - method21452.z);
                this.method1695(this.method1969(), 1.0f, 1.2f / (this.field2423.nextFloat() * 0.2f + 0.9f));
                this.field2472 = true;
                this.field2475 = 7;
                this.method1978(false);
                this.method1979((byte)0);
                this.method1962(Class8520.field34991);
                this.method1988(false);
                this.method1966();
                method21450.method21760(this.field2391, method21450, class7007, this);
            }
        }
        else {
            this.method1967((Class7007)class7006);
        }
    }
    
    private void method1966() {
        if (this.field2483 != null) {
            this.field2483.clear();
        }
        if (this.field2482 != null) {
            this.field2482.clear();
        }
    }
    
    public void method1967(final Class7007 class7007) {
        final Entity method21452 = class7007.method21452();
        int method21453 = MathHelper.method35650(Math.max((float)this.method1935().length() * this.field2479, 0.0));
        if (this.method1983() > 0) {
            if (this.field2482 == null) {
                this.field2482 = new IntOpenHashSet(5);
            }
            if (this.field2483 == null) {
                this.field2483 = Lists.newArrayListWithCapacity(5);
            }
            if (this.field2482.size() >= this.method1983() + 1) {
                this.method1652();
                return;
            }
            this.field2482.add(method21452.method1643());
        }
        if (this.method1981()) {
            method21453 += this.field2423.nextInt(method21453 / 2 + 2);
        }
        final Entity method21454 = this.method1973();
        Class7929 class7008;
        if (method21454 != null) {
            class7008 = Class7929.method25696(this, method21454);
            if (method21454 instanceof Class511) {
                ((Class511)method21454).method2639(method21452);
            }
        }
        else {
            class7008 = Class7929.method25696(this, this);
        }
        final boolean b = method21452.method1642() == Class7499.field28977;
        final int method21455 = method21452.method1666();
        if (this.method1804()) {
            if (!b) {
                method21452.method1664(5);
            }
        }
        if (!method21452.method1740(class7008, (float)method21453)) {
            method21452.method1665(method21455);
            this.method1936(this.method1935().scale(-0.1));
            this.field2399 += 180.0f;
            this.field2401 += 180.0f;
            this.field2478 = 0;
            if (!this.field2391.field10067) {
                if (this.method1935().lengthSquared() < 1.0E-7) {
                    if (this.field2474 == Class2151.field12783) {
                        this.method1767(this.method1974(), 0.1f);
                    }
                    this.method1652();
                }
            }
        }
        else {
            if (b) {
                return;
            }
            if (method21452 instanceof Class511) {
                final Class511 class7009 = (Class511)method21452;
                if (!this.field2391.field10067) {
                    if (this.method1983() <= 0) {
                        class7009.method2703(class7009.method2702() + 1);
                    }
                }
                if (this.field2480 > 0) {
                    final Vec3d method21456 = this.method1935().mul(1.0, 0.0, 1.0).normalize().scale(this.field2480 * 0.6);
                    if (method21456.lengthSquared() > 0.0) {
                        class7009.method1738(method21456.x, 0.1, method21456.z);
                    }
                }
                if (!this.field2391.field10067) {
                    if (method21454 instanceof Class511) {
                        Class8742.method30204(class7009, method21454);
                        Class8742.method30205((Class511)method21454, class7009);
                    }
                }
                this.method1970(class7009);
                if (method21454 != null) {
                    if (class7009 != method21454) {
                        if (class7009 instanceof Class512) {
                            if (method21454 instanceof Class513) {
                                ((Class513)method21454).field3039.method17469(new Class4306(6, 0.0f));
                            }
                        }
                    }
                }
                if (!method21452.method1768()) {
                    if (this.field2483 != null) {
                        this.field2483.add(class7009);
                    }
                }
                if (!this.field2391.field10067) {
                    if (method21454 instanceof Class513) {
                        final Class513 class7010 = (Class513)method21454;
                        if (this.field2483 != null && this.method1982()) {
                            Class7770.field31807.method13831(class7010, this.field2483, this.field2483.size());
                        }
                        else if (!method21452.method1768()) {
                            if (this.method1982()) {
                                Class7770.field31807.method13831(class7010, Arrays.asList(method21452), 0);
                            }
                        }
                    }
                }
            }
            this.method1695(this.field2481, 1.0f, 1.2f / (this.field2423.nextFloat() * 0.2f + 0.9f));
            if (this.method1983() <= 0) {
                this.method1652();
            }
        }
    }
    
    public Class7795 method1968() {
        return Class8520.field34991;
    }
    
    public final Class7795 method1969() {
        return this.field2481;
    }
    
    public void method1970(final Class511 class511) {
    }
    
    @Nullable
    public Class7007 method1971(final Vec3d class5487, final Vec3d class5488) {
        return Class7476.method23094(this.field2391, this, class5487, class5488, this.method1886().method18493(this.method1935()).method18496(1.0), class5489 -> {
            final boolean b;
            if (!class5489.method1639()) {
                if (!(!class5489.method1768())) {
                    if (!(!class5489.method1749())) {
                        if (class5489 != this.method1973() || this.field2478 >= 5) {
                            if (this.field2482 == null || !this.field2482.contains(class5489.method1643())) {
                                return b;
                            }
                        }
                    }
                }
            }
            return b;
        });
    }
    
    @Override
    public void method1761(final Class51 class51) {
        class51.method297("life", (short)this.field2477);
        if (this.field2471 != null) {
            class51.method295("inBlockState", Class9346.method34649(this.field2471));
        }
        class51.method296("shake", (byte)this.field2475);
        class51.method312("inGround", this.field2472);
        class51.method296("pickup", (byte)this.field2474.ordinal());
        class51.method305("damage", this.field2479);
        class51.method312("crit", this.method1981());
        class51.method296("PierceLevel", this.method1983());
        if (this.field2476 != null) {
            class51.method300("OwnerUUID", this.field2476);
        }
        class51.method306("SoundEvent", Class90.field205.method503(this.field2481).toString());
        class51.method312("ShotFromCrossbow", this.method1982());
    }
    
    @Override
    public void method1760(final Class51 class51) {
        this.field2477 = class51.method318("life");
        if (class51.method316("inBlockState", 10)) {
            this.field2471 = Class9346.method34647(class51.method327("inBlockState"));
        }
        this.field2475 = (class51.method317("shake") & 0xFF);
        this.field2472 = class51.method329("inGround");
        if (class51.method316("damage", 99)) {
            this.field2479 = class51.method322("damage");
        }
        if (!class51.method316("pickup", 99)) {
            if (class51.method316("player", 99)) {
                this.field2474 = (class51.method329("player") ? Class2151.field12783 : Class2151.field12782);
            }
        }
        else {
            this.field2474 = Class2151.method8320(class51.method317("pickup"));
        }
        this.method1978(class51.method329("crit"));
        this.method1979(class51.method317("PierceLevel"));
        if (class51.method302("OwnerUUID")) {
            this.field2476 = class51.method301("OwnerUUID");
        }
        if (class51.method316("SoundEvent", 8)) {
            this.field2481 = Class90.field205.method506(new Class1932(class51.method323("SoundEvent"))).orElse(this.method1968());
        }
        this.method1988(class51.method329("ShotFromCrossbow"));
    }
    
    public void method1972(final Entity class399) {
        this.field2476 = ((class399 != null) ? class399.method1865() : null);
        if (class399 instanceof Class512) {
            this.field2474 = (((Class512)class399).field3025.field27304 ? Class2151.field12784 : Class2151.field12783);
        }
    }
    
    @Nullable
    public Entity method1973() {
        return (this.field2476 != null && this.field2391 instanceof Class1849) ? ((Class1849)this.field2391).method6914(this.field2476) : null;
    }
    
    @Override
    public void method1736(final Class512 class512) {
        if (!this.field2391.field10067) {
            if (this.field2472 || this.method1987()) {
                if (this.field2475 <= 0) {
                    int n = 0;
                    Label_0122: {
                        if (this.field2474 != Class2151.field12783) {
                            if (this.field2474 != Class2151.field12784 || !class512.field3025.field27304) {
                                if (!this.method1987() || this.method1973().method1865() != class512.method1865()) {
                                    n = 0;
                                    break Label_0122;
                                }
                            }
                        }
                        n = 1;
                    }
                    int n2 = n;
                    if (this.field2474 == Class2151.field12783) {
                        if (!class512.field3006.method2362(this.method1974())) {
                            n2 = 0;
                        }
                    }
                    if (n2 != 0) {
                        class512.method2746(this, 1);
                        this.method1652();
                    }
                }
            }
        }
    }
    
    public abstract Class8321 method1974();
    
    @Override
    public boolean method1700() {
        return false;
    }
    
    public void method1975(final double field2479) {
        this.field2479 = field2479;
    }
    
    public double method1976() {
        return this.field2479;
    }
    
    public void method1977(final int field2480) {
        this.field2480 = field2480;
    }
    
    @Override
    public boolean method1847() {
        return false;
    }
    
    @Override
    public float method1890(final Class290 class290, final Class8295 class291) {
        return 0.0f;
    }
    
    public void method1978(final boolean b) {
        this.method1980(1, b);
    }
    
    public void method1979(final byte b) {
        this.field2432.method33569(Class402.field2470, b);
    }
    
    private void method1980(final int n, final boolean b) {
        final byte byteValue = this.field2432.method33568(Class402.field2468);
        if (!b) {
            this.field2432.method33569(Class402.field2468, (byte)(byteValue & ~n));
        }
        else {
            this.field2432.method33569(Class402.field2468, (byte)(byteValue | n));
        }
    }
    
    public boolean method1981() {
        this.field2432.method33568(Class402.field2468).byteValue();
        return false;
    }
    
    public boolean method1982() {
        this.field2432.method33568(Class402.field2468).byteValue();
        return false;
    }
    
    public byte method1983() {
        return this.field2432.method33568(Class402.field2470);
    }
    
    public void method1984(final Class511 class511, final float n) {
        final int method30206 = Class8742.method30206(Class7882.field32369, class511);
        final int method30207 = Class8742.method30206(Class7882.field32370, class511);
        this.method1975(n * 2.0f + this.field2423.nextGaussian() * 0.25 + this.field2391.method6954().method8235() * 0.11f);
        if (method30206 > 0) {
            this.method1975(this.method1976() + method30206 * 0.5 + 0.5);
        }
        if (method30207 > 0) {
            this.method1977(method30207);
        }
        if (Class8742.method30206(Class7882.field32371, class511) > 0) {
            this.method1664(100);
        }
    }
    
    public float method1985() {
        return 0.6f;
    }
    
    public void method1986(final boolean field2421) {
        this.method1980(2, this.field2421 = field2421);
    }
    
    public boolean method1987() {
        if (this.field2391.field10067) {
            return (this.field2432.method33568(Class402.field2468) & 0x2) != 0x0;
        }
        return this.field2421;
    }
    
    public void method1988(final boolean b) {
        this.method1980(4, b);
    }
    
    @Override
    public Class4252<?> method1932() {
        final Entity method1973 = this.method1973();
        return new Class4339(this, (method1973 != null) ? method1973.method1643() : 0);
    }
    
    static {
        field2468 = Class9184.method33564(Class402.class, Class7709.field30653);
        field2469 = Class9184.method33564(Class402.class, Class7709.field30667);
        field2470 = Class9184.method33564(Class402.class, Class7709.field30653);
    }
}
