// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

import java.util.OptionalInt;

public class Class406 extends Entity implements Class407, Class401
{
    private static final Class8810<Class8321> field2494;
    private static final Class8810<OptionalInt> field2495;
    private static final Class8810<Boolean> field2496;
    private int field2497;
    private int field2498;
    public Class511 field2499;
    
    public Class406(final Class7499<? extends Class406> class7499, final Class1847 class7500) {
        super(class7499, class7500);
    }
    
    @Override
    public void method1649() {
        this.field2432.method33565(Class406.field2494, Class8321.field34174);
        this.field2432.method33565(Class406.field2495, OptionalInt.empty());
        this.field2432.method33565(Class406.field2496, false);
    }
    
    @Override
    public boolean method1753(final double n) {
        return n < 4096.0 && !this.method2003();
    }
    
    @Override
    public boolean method1752(final double n, final double n2, final double n3) {
        return super.method1752(n, n2, n3) && !this.method2003();
    }
    
    public Class406(final Class1847 class1847, final double n, final double n2, final double n3, final Class8321 class1848) {
        super(Class7499.field28984, class1847);
        this.field2497 = 0;
        this.method1656(n, n2, n3);
        int n4 = 1;
        if (!class1848.method27620()) {
            if (class1848.method27656()) {
                this.field2432.method33569(Class406.field2494, class1848.method27641());
                n4 += class1848.method27659("Fireworks").method317("Flight");
            }
        }
        this.method1937(this.field2423.nextGaussian() * 0.001, 0.05, this.field2423.nextGaussian() * 0.001);
        this.field2498 = 10 * n4 + this.field2423.nextInt(6) + this.field2423.nextInt(7);
    }
    
    public Class406(final Class1847 class1847, final Class8321 class1848, final Class511 field2499) {
        this(class1847, field2499.method1938(), field2499.method1941(), field2499.method1945(), class1848);
        this.field2432.method33569(Class406.field2495, OptionalInt.of(field2499.method1643()));
        this.field2499 = field2499;
    }
    
    public Class406(final Class1847 class1847, final Class8321 class1848, final double n, final double n2, final double n3, final boolean b) {
        this(class1847, n, n2, n3, class1848);
        this.field2432.method33569(Class406.field2496, b);
    }
    
    @Override
    public void method1797(final double n, final double n2, final double n3) {
        this.method1937(n, n2, n3);
        if (this.field2402 == 0.0f) {
            if (this.field2401 == 0.0f) {
                final float method35641 = MathHelper.method35641(n * n + n3 * n3);
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
        if (!this.method2003()) {
            if (!this.method2004()) {
                this.method1936(this.method1935().method16751(1.15, 1.0, 1.15).method16744(0.0, 0.04, 0.0));
            }
            this.method1671(Class2160.field12826, this.method1935());
        }
        else {
            if (this.field2499 == null) {
                this.field2432.method33568(Class406.field2495).ifPresent(n2 -> {
                    this.field2391.method6741(n2);
                    final Class511 class511;
                    if (!(!(class511 instanceof Class511))) {
                        this.field2499 = class511;
                    }
                    return;
                });
            }
            if (this.field2499 != null) {
                if (this.field2499.method2773()) {
                    final Class5487 method1791 = this.field2499.method1791();
                    final Class5487 method1792 = this.field2499.method1935();
                    this.field2499.method1936(method1792.method16744(method1791.field22770 * 0.1 + (method1791.field22770 * 1.5 - method1792.field22770) * 0.5, method1791.field22771 * 0.1 + (method1791.field22771 * 1.5 - method1792.field22771) * 0.5, method1791.field22772 * 0.1 + (method1791.field22772 * 1.5 - method1792.field22772) * 0.5));
                }
                this.method1656(this.field2499.method1938(), this.field2499.method1941(), this.field2499.method1945());
                this.method1936(this.field2499.method1935());
            }
        }
        final Class5487 method1793 = this.method1935();
        final Class7006 method1794 = Class7476.method23093(this, this.method1886().method18493(method1793).method18496(1.0), class512 -> {
            final boolean b;
            if (!class512.method1639()) {
                if (!(!class512.method1768())) {
                    if (!(!class512.method1749())) {
                        return b;
                    }
                }
            }
            return b;
        }, Class2040.field11632, true);
        if (!this.field2421) {
            this.method2000(method1794);
            this.field2448 = true;
        }
        final float method1795 = MathHelper.method35641(Entity.method1680(method1793));
        this.field2399 = (float)(MathHelper.method35693(method1793.field22770, method1793.field22772) * 57.2957763671875);
        this.field2400 = (float)(MathHelper.method35693(method1793.field22771, method1795) * 57.2957763671875);
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
        if (this.field2497 == 0) {
            if (!this.method1696()) {
                this.field2391.method6706(null, this.method1938(), this.method1941(), this.method1945(), Class8520.field35194, Class286.field1586, 3.0f, 1.0f);
            }
        }
        ++this.field2497;
        if (this.field2391.field10067) {
            if (this.field2497 % 2 < 2) {
                this.field2391.method6709(Class8432.field34621, this.method1938(), this.method1941() - 0.3, this.method1945(), this.field2423.nextGaussian() * 0.05, -this.method1935().field22771 * 0.5, this.field2423.nextGaussian() * 0.05);
            }
        }
        if (!this.field2391.field10067) {
            if (this.field2497 > this.field2498) {
                this.method1999();
            }
        }
    }
    
    private void method1999() {
        this.field2391.method6761(this, (byte)17);
        this.method2002();
        this.method1652();
    }
    
    public void method2000(final Class7006 class7006) {
        if (class7006.method21449() == Class2165.field12882 && !this.field2391.field10067) {
            this.method1999();
        }
        else if (this.field2407) {
            BlockPos class7007;
            if (class7006.method21449() != Class2165.field12881) {
                class7007 = new BlockPos(this);
            }
            else {
                class7007 = new BlockPos(((Class7005)class7006).method21447());
            }
            this.field2391.method6701(class7007).method21741(this.field2391, class7007, this);
            if (this.method2001()) {
                this.method1999();
            }
        }
    }
    
    private boolean method2001() {
        final Class8321 class8321 = this.field2432.method33568(Class406.field2494);
        final Class51 class8322 = class8321.method27620() ? null : class8321.method27660("Fireworks");
        final Class52 class8323 = (class8322 == null) ? null : class8322.method328("Explosions", 10);
        return class8323 != null && !class8323.isEmpty();
    }
    
    private void method2002() {
        float n = 0.0f;
        final Class8321 class8321 = this.field2432.method33568(Class406.field2494);
        final Class51 class8322 = class8321.method27620() ? null : class8321.method27660("Fireworks");
        final Class52 class8323 = (class8322 == null) ? null : class8322.method328("Explosions", 10);
        if (class8323 != null) {
            if (!class8323.isEmpty()) {
                n = 5.0f + class8323.size() * 2;
            }
        }
        if (n > 0.0f) {
            if (this.field2499 != null) {
                this.field2499.method1740(Class7929.field32581, 5.0f + class8323.size() * 2);
            }
            final Class5487 method1934 = this.method1934();
            for (final Class511 class8324 : this.field2391.method7128((Class<? extends Class511>)Class511.class, this.method1886().method18496(5.0))) {
                if (class8324 == this.field2499) {
                    continue;
                }
                if (this.method1734(class8324) > 25.0) {
                    continue;
                }
                int n2 = 0;
                for (int i = 0; i < 2; ++i) {
                    if (this.field2391.method6987(new Class8478(method1934, new Class5487(class8324.method1938(), class8324.method1942(0.5 * i), class8324.method1945()), Class2040.field11632, Class2191.field13325, this)).method21449() == Class2165.field12880) {
                        n2 = 1;
                        break;
                    }
                }
                if (n2 == 0) {
                    continue;
                }
                class8324.method1740(Class7929.field32581, n * (float)Math.sqrt((5.0 - this.method1732(class8324)) / 5.0));
            }
        }
    }
    
    private boolean method2003() {
        return this.field2432.method33568(Class406.field2495).isPresent();
    }
    
    public boolean method2004() {
        return this.field2432.method33568(Class406.field2496);
    }
    
    @Override
    public void method1798(final byte b) {
        if (b == 17) {
            if (this.field2391.field10067) {
                if (this.method2001()) {
                    final Class8321 class8321 = this.field2432.method33568(Class406.field2494);
                    final Class51 class8322 = class8321.method27620() ? null : class8321.method27660("Fireworks");
                    final Class5487 method1935 = this.method1935();
                    this.field2391.method6781(this.method1938(), this.method1941(), this.method1945(), method1935.field22770, method1935.field22771, method1935.field22772, class8322);
                }
                else {
                    for (int i = 0; i < this.field2423.nextInt(3) + 2; ++i) {
                        this.field2391.method6709(Class8432.field34636, this.method1938(), this.method1941(), this.method1945(), this.field2423.nextGaussian() * 0.05, 0.005, this.field2423.nextGaussian() * 0.05);
                    }
                }
            }
        }
        super.method1798(b);
    }
    
    @Override
    public void method1761(final Class51 class51) {
        class51.method298("Life", this.field2497);
        class51.method298("LifeTime", this.field2498);
        final Class8321 class52 = this.field2432.method33568(Class406.field2494);
        if (!class52.method27620()) {
            class51.method295("FireworksItem", class52.method27627(new Class51()));
        }
        class51.method312("ShotAtAngle", this.field2432.method33568(Class406.field2496));
    }
    
    @Override
    public void method1760(final Class51 class51) {
        this.field2497 = class51.method319("Life");
        this.field2498 = class51.method319("LifeTime");
        final Class8321 method27619 = Class8321.method27619(class51.method327("FireworksItem"));
        if (!method27619.method27620()) {
            this.field2432.method33569(Class406.field2494, method27619);
        }
        if (class51.method315("ShotAtAngle")) {
            this.field2432.method33569(Class406.field2496, class51.method329("ShotAtAngle"));
        }
    }
    
    @Override
    public Class8321 method2005() {
        final Class8321 class8321 = this.field2432.method33568(Class406.field2494);
        return class8321.method27620() ? new Class8321(Class7739.field31532) : class8321;
    }
    
    @Override
    public boolean method1847() {
        return false;
    }
    
    @Override
    public Class4252<?> method1932() {
        return new Class4339(this);
    }
    
    @Override
    public void method1958(double n, double n2, double n3, final float n4, final float n5) {
        final float method35641 = MathHelper.method35641(n * n + n2 * n2 + n3 * n3);
        n /= method35641;
        n2 /= method35641;
        n3 /= method35641;
        n += this.field2423.nextGaussian() * 0.007499999832361937 * n5;
        n2 += this.field2423.nextGaussian() * 0.007499999832361937 * n5;
        n3 += this.field2423.nextGaussian() * 0.007499999832361937 * n5;
        n *= n4;
        n2 *= n4;
        n3 *= n4;
        this.method1937(n, n2, n3);
    }
    
    static {
        field2494 = Class9184.method33564(Class406.class, Class7709.field30659);
        field2495 = Class9184.method33564(Class406.class, Class7709.field30670);
        field2496 = Class9184.method33564(Class406.class, Class7709.field30661);
    }
}
