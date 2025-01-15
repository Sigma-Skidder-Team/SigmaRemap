// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3205 extends Class3167
{
    private int field15632;
    private int field15633;
    private double field15634;
    private double field15635;
    private boolean field15636;
    
    public Class3205() {
        super(Class8013.field32990, "ViperMC", "A fly for ViperMC");
        this.method9881(new Class4996("Speed", "Fly speed", 4.0f, Float.class, 0.2f, 6.0f, 0.1f));
    }
    
    @Override
    public void method9879() {
        this.field15634 = Class3205.field15514.field4684.field2396;
        this.field15632 = 0;
        if (!Class3205.field15514.field4648.field23440.method1056()) {
            if (!Class3205.field15514.field4648.field23440.method1056()) {
                this.field15636 = false;
            }
        }
        else {
            Class3205.field15514.field4648.field23440.field2162 = false;
            this.field15636 = true;
        }
    }
    
    @Override
    public void method9897() {
        Class7482.method23151(0.0);
        if (Class3205.field15514.field4684.method1935().y > 0.0) {
            Class6430.method19155(-0.0789);
        }
    }
    
    @Class6753
    private void method10056(final Class5752 class5752) {
        if (this.method9906()) {
            if (class5752.method17061() == Class3205.field15514.field4648.field23440.field2161.field32860) {
                class5752.method16961(true);
                this.field15636 = true;
            }
        }
    }
    
    @Class6753
    private void method10057(final Class5715 class5715) {
        if (this.method9906()) {
            if (class5715.method16963() == Class3205.field15514.field4648.field23440.field2161.field32860) {
                class5715.method16961(true);
                this.field15636 = false;
            }
        }
    }
    
    @Class6753
    @Class6759
    public void method10058(final Class5717 class5717) {
        if (this.method9906()) {
            final double n = this.method9886("Speed");
            if (this.field15632 <= 0) {
                if (this.field15632 != -1) {
                    if (this.field15632 == 0) {
                        if (!Class3205.field15514.field4648.field23439.method1056()) {
                            if (class5717.method16974() > 0.0) {
                                class5717.method16975(-Class7482.method23141());
                            }
                        }
                        Class6430.method19155(class5717.method16974());
                        Class7482.method23149(class5717, Class7482.method23136());
                    }
                }
                else {
                    if (!Class3205.field15514.field4648.field23439.method1056()) {
                        class5717.method16975((this.field15636 && !Class6430.method19160(Class3205.field15514.field4684, 0.01f)) ? (-n / 2.0) : Class7482.method23141());
                        this.field15635 = this.field15634;
                        this.field15634 = ((this.field15636 && !Class6430.method19160(Class3205.field15514.field4684, 0.01f)) ? (Class3205.field15514.field4684.field2396 + class5717.method16974()) : this.field15634);
                    }
                    else {
                        class5717.method16975(this.field15636 ? Class7482.method23141() : (n / 2.0));
                        this.field15635 = this.field15634;
                        this.field15634 = (this.field15636 ? this.field15634 : (Class3205.field15514.field4684.field2396 + class5717.method16974()));
                    }
                    Class6430.method19155(class5717.method16974());
                    Class7482.method23149(class5717, n);
                }
            }
            else {
                class5717.method16975(0.0);
                Class7482.method23149(class5717, 0.0);
            }
        }
    }
    
    @Class6753
    public void method10059(final Class5744 class5744) {
        if (this.method9906() && class5744.method17046()) {
            ++this.field15632;
            if (this.field15632 != 2) {
                if (this.field15632 > 2) {
                    if (this.field15632 >= 20 && this.field15632 % 20 == 0) {
                        class5744.method17037(-150.0 - Math.random() * 150.0);
                        this.field15633 += 2;
                    }
                    else {
                        class5744.method16961(true);
                    }
                }
            }
            else {
                class5744.method17037(-150.0 - Math.random() * 150.0);
                this.field15633 += 2;
            }
            class5744.method17045(true);
            class5744.method17033(true);
        }
    }
    
    @Class6753
    public void method10060(final Class5723 class5723) {
        if (this.method9906()) {
            final Class4252 method16998 = class5723.method16998();
            if (!(method16998 instanceof Class4328)) {
                if (method16998 instanceof Class4378) {
                    final String method16999 = ((Class4378)method16998).method13164().method8461();
                    if (this.field15633 > 0) {
                        if (method16999.contains("Now leaving: §") || method16999.contains("Now entering: §")) {
                            --this.field15633;
                            class5723.method16961(true);
                        }
                    }
                }
            }
            else {
                final Class4328 class5724 = (Class4328)method16998;
                if (this.field15632 >= 1) {
                    this.field15632 = -1;
                }
                this.field15635 = this.field15634;
                this.field15634 = class5724.field19378;
                class5724.field19380 = Class3205.field15514.field4684.field2399;
                class5724.field19381 = Class3205.field15514.field4684.field2400;
            }
        }
    }
    
    @Class6753
    public void method10061(final Class5721 class5721) {
        if (this.method9906()) {
            final Class4252 method16990 = class5721.method16990();
            if (method16990 instanceof Class4353) {
                final Class4353 class5722 = (Class4353)method16990;
                if (this.field15632 == -1) {
                    class5722.field19504 = true;
                }
            }
        }
    }
    
    @Class6753
    public void method10062(final Class5741 class5741) {
        if (this.method9906()) {
            final double n = this.field15634 - this.field15635;
            final double field15634 = this.field15634;
            Class3205.field15514.field4684.field2396 = field15634;
            Class3205.field15514.field4684.field2418 = field15634;
            Class3205.field15514.field4684.field3019 = field15634;
            Class3205.field15514.field4684.field2393 = field15634;
        }
    }
}
