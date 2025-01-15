// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Vector3f;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class Class4711 extends Class4710<Class754, Class5860<Class754>>
{
    public Class4711(final Class8551 class8551) {
        this(class8551, false);
    }
    
    public Class4711(final Class8551 class8551, final boolean b) {
        super(class8551, new Class5860(0.0f, b), 0.5f);
        this.method13978((Class1799<Class754, Class5860<Class754>>)new Class1835((Class4778<Class511, Class5853>)this, new Class5853(0.5f), new Class5853(1.0f)));
        this.method13978(new Class1823<Class754, Class5860<Class754>>(this));
        this.method13978(new Class1821<Class754, Class5860<Class754>>(this));
        this.method13978(new Class1842(this));
        this.method13978(new Class1819(this));
        this.method13978(new Class1831<Class754, Class5860<Class754>>(this));
        this.method13978(new Class1801<Class754, Class5860<Class754>>(this));
        this.method13978((Class1799<Class754, Class5860<Class754>>)new Class1817((Class4778<Class512, Class5860<Class512>>)this));
        this.method13978((Class1799<Class754, Class5860<Class754>>)new Class1815((Class4778<Class511, Class5860<Class511>>)this));
        this.method13978(new Class1822<Class754, Class5860<Class754>>(this));
    }
    
    public void method13993(final Class754 class754, final float n, final float n2, final Class7351 class755, final Class7807 class756, final int n3) {
        this.method13995(class754);
        super.method13980(class754, n, n2, class755, class756, n3);
    }
    
    public Vec3d method13994(final Class754 class754, final float n) {
        return class754.method1814() ? new Vec3d(0.0, -0.125, 0.0) : super.method13955((T)class754, n);
    }
    
    private void method13995(final Class754 class754) {
        final Class5860 class755 = ((Class4710<T, Class5860>)this).method13979();
        if (!class754.method1639()) {
            final Class8321 method2713 = class754.method2713();
            final Class8321 method2714 = class754.method2714();
            class755.method17584(true);
            class755.field23994.field25187 = class754.method2895(Class189.field616);
            class755.field24026.field25187 = class754.method2895(Class189.field611);
            class755.field24024.field25187 = class754.method2895(Class189.field614);
            class755.field24025.field25187 = class754.method2895(Class189.field615);
            class755.field24022.field25187 = class754.method2895(Class189.field612);
            class755.field24023.field25187 = class754.method2895(Class189.field613);
            class755.field24002 = class754.method1814();
            final Class2036 method2715 = this.method13996(class754, method2713, method2714, Class316.field1877);
            final Class2036 method2716 = this.method13996(class754, method2713, method2714, Class316.field1878);
            if (class754.method2755() != Class2226.field13698) {
                class755.field24001 = method2716;
                class755.field24000 = method2715;
            }
            else {
                class755.field24001 = method2715;
                class755.field24000 = method2716;
            }
        }
        else {
            class755.method17584(false);
            class755.field23993.field25187 = true;
            class755.field23994.field25187 = true;
        }
    }
    
    private Class2036 method13996(final Class754 class754, final Class8321 class755, final Class8321 class756, final Class316 class757) {
        Class2036 class758 = Class2036.field11607;
        final Class8321 class759 = (class757 != Class316.field1877) ? class756 : class755;
        if (!class759.method27620()) {
            class758 = Class2036.field11608;
            if (class754.method2767() <= 0) {
                final boolean b = class755.method27622() == Class7739.field31611;
                final boolean method12296 = Class4086.method12296(class755);
                final boolean b2 = class756.method27622() == Class7739.field31611;
                final boolean method12297 = Class4086.method12296(class756);
                if (b) {
                    if (method12296) {
                        class758 = Class2036.field11613;
                    }
                }
                if (b2) {
                    if (method12297) {
                        if (class755.method27622().method11725(class755) == Class1992.field11154) {
                            class758 = Class2036.field11613;
                        }
                    }
                }
            }
            else {
                final Class1992 method12298 = class759.method27653();
                if (method12298 != Class1992.field11157) {
                    if (method12298 != Class1992.field11158) {
                        if (method12298 != Class1992.field11159) {
                            if (method12298 == Class1992.field11160) {
                                if (class757 == class754.method2757()) {
                                    class758 = Class2036.field11612;
                                }
                            }
                        }
                        else {
                            class758 = Class2036.field11611;
                        }
                    }
                    else {
                        class758 = Class2036.field11610;
                    }
                }
                else {
                    class758 = Class2036.field11609;
                }
            }
        }
        return class758;
    }
    
    public Class1932 method13997(final Class754 class754) {
        return class754.method4097();
    }
    
    public void method13998(final Class754 class754, final Class7351 class755, final float n) {
        class755.method22565(0.9375f, 0.9375f, 0.9375f);
    }
    
    public void method13999(final Class754 class754, final String s, final Class7351 class755, final Class7807 class756, final int n) {
        final double method28715 = this.field20283.method28715(class754);
        class755.method22567();
        if (method28715 < 100.0) {
            final Class6516 method28716 = class754.method2890();
            final Class9290 method28717 = method28716.method19644(2);
            if (method28717 != null) {
                super.method13958((T)class754, method28716.method19636(class754.method1867(), method28717).method23969() + " " + method28717.method34314().method8461(), class755, class756, n);
                class755.method22564(0.0, 0.25874999165534973, 0.0);
            }
        }
        super.method13958((T)class754, s, class755, class756, n);
        class755.method22568();
    }
    
    public void method14000(final Class7351 class7351, final Class7807 class7352, final int n, final Class754 class7353) {
        this.method14002(class7351, class7352, n, class7353, ((Class5860)this.field20301).field23996, ((Class5860)this.field20301).field24023);
    }
    
    public void method14001(final Class7351 class7351, final Class7807 class7352, final int n, final Class754 class7353) {
        this.method14002(class7351, class7352, n, class7353, ((Class5860)this.field20301).field23997, ((Class5860)this.field20301).field24022);
    }
    
    private void method14002(final Class7351 class7351, final Class7807 class7352, final int n, final Class754 class7353, final Class6300 class7354, final Class6300 class7355) {
        final Class5860 class7356 = ((Class4710<T, Class5860>)this).method13979();
        this.method13995(class7353);
        class7356.field23955 = 0.0f;
        class7356.field24002 = false;
        class7356.method17580(class7353, class7356.field24003 = 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        class7354.field25183 = 0.0f;
        class7354.method18643(class7351, class7352.method25214(Class6332.method18767(class7353.method4097())), n, Class1904.field10335);
        class7355.field25183 = 0.0f;
        class7355.method18643(class7351, class7352.method25214(Class6332.method18773(class7353.method4097())), n, Class1904.field10335);
    }
    
    public void method14003(final Class754 class754, final Class7351 class755, final float n, final float n2, final float n3) {
        final float method2623 = class754.method2623(n3);
        if (!class754.method2773()) {
            if (method2623 <= 0.0f) {
                super.method13985(class754, class755, n, n2, n3);
            }
            else {
                super.method13985(class754, class755, n, n2, n3);
                class755.method22566(Vector3f.XP.rotationDegrees(MathHelper.method35700(method2623, 0.0f, class754.method1706() ? (-90.0f - class754.field2400) : -90.0f)));
                if (class754.method1818()) {
                    class755.method22564(0.0, -1.0, 0.30000001192092896);
                }
            }
        }
        else {
            super.method13985(class754, class755, n, n2, n3);
            final float n4 = class754.method2774() + n3;
            final float method2624 = MathHelper.clamp(n4 * n4 / 100.0f, 0.0f, 1.0f);
            if (!class754.method2744()) {
                class755.method22566(Vector3f.XP.rotationDegrees(method2624 * (-90.0f - class754.field2400)));
            }
            final Vec3d method2625 = class754.method1741(n3);
            final Vec3d method2626 = class754.method1935();
            final double method2627 = Entity.method1680(method2626);
            final double method2628 = Entity.method1680(method2625);
            if (method2627 > 0.0) {
                if (method2628 > 0.0) {
                    class755.method22566(Vector3f.YP.rotation((float)(Math.signum(method2626.x * method2625.z - method2626.z * method2625.x) * Math.acos((method2626.x * method2625.x + method2626.z * method2625.z) / (Math.sqrt(method2627) * Math.sqrt(method2628))))));
                }
            }
        }
    }
}
