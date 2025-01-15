// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3233 extends Class3167
{
    private boolean field15704;
    private double field15705;
    private double field15706;
    private double field15707;
    
    public Class3233() {
        super(Class8013.field32990, "Mineplex", "Highjump for Mineplex");
        this.method9881(new Class4996("Motion", "Highjump motion", 1.1f, Float.class, 0.42f, 5.0f, 0.05f));
        this.method9881(new Class4999("Disable", "Disable on landing.", true));
        this.method9881(new Class4999("Fake fly", "Am i flying ?", false));
    }
    
    @Override
    public void method9879() {
        this.field15704 = false;
    }
    
    @Class6753
    public void method10200(final Class5738 class5738) {
        if (this.method9906() && Class3233.field15514.field4684.field2404) {
            class5738.method17026(true);
        }
    }
    
    @Class6753
    public void method10201(final Class5717 class5717) {
        if (this.method9906()) {
            if (this.field15704) {
                if (Class3233.field15514.field4684.field2396 + 0.42 < this.field15707) {
                    this.method9914().method9910();
                }
            }
            if (!Class3233.field15514.field4684.field2404) {
                if (this.field15704) {
                    Class7482.method23149(class5717, this.field15705 = Math.max(this.field15705, 0.499));
                    this.field15705 -= 0.007;
                    double n = 0.5;
                    if (this.method9886("Motion") > 3.0f) {
                        n -= 0.8;
                    }
                    if (Math.abs(class5717.method16974()) < n && Math.abs(this.field15706) < n) {
                        class5717.method16975(this.field15706 -= 0.04000000000001);
                        Class6430.method19155(class5717.method16974());
                    }
                    else {
                        this.field15706 = class5717.method16974();
                    }
                }
            }
        }
    }
    
    @Class6753
    public void method10202(final Class5747 class5747) {
        if (this.method9906()) {
            if (Class3233.field15514.field4684.field2404) {
                if (this.field15704) {
                    this.field15704 = !this.field15704;
                    Class7482.method23151(0.0);
                    if (this.method9883("Disable")) {
                        this.method9914().method9910();
                    }
                    return;
                }
                final double field2395 = Class3233.field15514.field4684.field2395;
                final double field2396 = Class3233.field15514.field4684.field2397;
                final double field2397 = Class3233.field15514.field4684.field2396;
                final double n = Class3233.field15514.field4684.field4085.field24722;
                final double n2 = Class3233.field15514.field4684.field4085.field24721;
                final float field2398 = Class3233.field15514.field4684.field2399;
                final double n3 = 0.1;
                final double n4 = field2395 + (n * 0.45 * Math.cos(Math.toRadians(field2398 + 90.0f)) + n2 * 0.45 * Math.sin(Math.toRadians(field2398 + 90.0f))) * n3;
                final double n5 = field2396 + (n * 0.45 * Math.sin(Math.toRadians(field2398 + 90.0f)) - n2 * 0.45 * Math.cos(Math.toRadians(field2398 + 90.0f))) * n3;
                final Class6221 class5748 = new Class6221(n4 - 0.3, field2397 - 1.0, n5 - 0.3, n4 + 0.3, field2397 + 2.0, n5 + 0.3);
                if (Class3233.field15514.field4683.method6981(Class3233.field15514.field4684, class5748).count() == 0L) {
                    final double method10205 = this.method10205(class5748);
                    if (method10205 != 11.0) {
                        final double field2399 = Class3233.field15514.field4684.field2396;
                        final double n6 = 312.7;
                        final Class4354 class5749 = new Class4354(n4, field2399 - method10205, n6, true);
                        Class3233.field15514.method5269().method17292(new Class4354(n4, field2399, n6, true));
                        Class3233.field15514.method5269().method17292(class5749);
                        this.field15707 = field2399 + 0.42;
                        Class3233.field15514.field4684.method1656(n4, field2399, n6);
                        this.field15706 = this.method9886("Motion");
                        this.field15705 = 0.81;
                    }
                }
            }
        }
    }
    
    @Class6753
    public void method10203(final Class5723 class5723) {
        if (this.method9906()) {
            if (class5723.method16998() instanceof Class4328) {
                this.method9914().method9910();
            }
        }
    }
    
    @Class6753
    public void method10204(final Class5741 class5741) {
        if (this.method9906()) {
            if (this.field15704) {
                if (Class3233.field15514.field4684.field2396 >= this.field15707) {
                    if (this.method9883("Fake fly")) {
                        Class3233.field15514.field4684.field2396 = this.field15707;
                        Class3233.field15514.field4684.field2418 = this.field15707;
                        Class3233.field15514.field4684.field3019 = this.field15707;
                        Class3233.field15514.field4684.field2393 = this.field15707;
                        if (Class7482.method23148()) {
                            Class3233.field15514.field4684.field3013 = 0.099999994f;
                        }
                    }
                }
            }
        }
    }
    
    public double method10205(final Class6221 class6221) {
        double n = 6.0;
        class6221.method18499(0.0, -n, 0.0);
        while (true) {
            final Class6221 method18499 = class6221.method18499(0.0, -n, 0.0);
            if (Class3233.field15514.field4683.method6981(Class3233.field15514.field4684, method18499).count() == 0L) {
                return n;
            }
            n -= 0.5;
            if (Class3233.field15514.field4683.method6981(Class3233.field15514.field4684, method18499).count() != 0L && n > 3.0) {
                continue;
            }
            return 11.0;
        }
    }
}
