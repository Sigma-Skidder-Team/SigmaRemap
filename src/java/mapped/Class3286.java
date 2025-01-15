// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3286 extends Class3167
{
    private int field15795;
    private int field15796;
    private double field15797;
    private double field15798;
    private boolean field15799;
    
    public Class3286() {
        super(Class8013.field32990, "VeltPvP", "A fly for VeltPvP");
        this.method9881(new Class4996("Speed", "Fly speed", 4.0f, Float.class, 0.2f, 5.0f, 0.1f));
    }
    
    @Override
    public void method9879() {
        this.field15797 = Class3286.field15514.field4684.field2396;
        this.field15795 = 0;
        if (!Class3286.field15514.field4648.field23440.method1056()) {
            if (!Class3286.field15514.field4648.field23440.method1056()) {
                this.field15799 = false;
            }
        }
        else {
            Class3286.field15514.field4648.field23440.field2162 = false;
            this.field15799 = true;
        }
    }
    
    @Override
    public void method9897() {
        Class7482.method23151(0.0);
        if (Class3286.field15514.field4684.method1935().field22771 > 0.0) {
            Class6430.method19155(-0.0789);
        }
    }
    
    @Class6753
    private void method10381(final Class5752 class5752) {
        if (this.method9906()) {
            if (class5752.method17061() == Class3286.field15514.field4648.field23440.field2161.field32860) {
                class5752.method16961(true);
                this.field15799 = true;
            }
        }
    }
    
    @Class6753
    private void method10382(final Class5715 class5715) {
        if (this.method9906()) {
            if (class5715.method16963() == Class3286.field15514.field4648.field23440.field2161.field32860) {
                class5715.method16961(true);
                this.field15799 = false;
            }
        }
    }
    
    @Class6753
    @Class6759
    public void method10383(final Class5717 class5717) {
        if (this.method9906()) {
            final double n = this.method9886("Speed");
            if (this.field15795 <= 0) {
                if (this.field15795 != -1) {
                    if (this.field15795 == 0) {
                        if (!Class3286.field15514.field4648.field23439.method1056()) {
                            if (class5717.method16974() > 0.0) {
                                class5717.method16975(-Class7482.method23141());
                            }
                        }
                        Class6430.method19155(class5717.method16974());
                        Class7482.method23149(class5717, n - 0.1);
                    }
                }
                else {
                    if (!Class3286.field15514.field4648.field23439.method1056()) {
                        class5717.method16975(this.field15799 ? (-n / 2.0) : Class7482.method23141());
                    }
                    else {
                        class5717.method16975(this.field15799 ? Class7482.method23141() : (n / 2.0));
                        this.field15798 = this.field15797;
                        this.field15797 = (this.field15799 ? this.field15797 : (Class3286.field15514.field4684.field2396 + class5717.method16974()));
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
    public void method10384(final Class5744 class5744) {
        if (this.method9906() && class5744.method17046()) {
            ++this.field15795;
            if (this.field15795 != 2) {
                if (this.field15795 > 2) {
                    if (this.field15795 >= 20 && this.field15795 % 20 == 0) {
                        class5744.method17037(-(150.0 + Math.random() * 150.0));
                        this.field15796 += 2;
                    }
                    else {
                        class5744.method16961(true);
                    }
                }
            }
            else {
                class5744.method17037(-(150.0 + Math.random() * 150.0));
                this.field15796 += 2;
            }
            class5744.method17033(true);
        }
    }
    
    @Class6753
    public void method10385(final Class5723 class5723) {
        if (this.method9906()) {
            final Class4252 method16998 = class5723.method16998();
            if (!(method16998 instanceof Class4328)) {
                if (method16998 instanceof Class4378) {
                    final String method16999 = ((Class4378)method16998).method13164().method8461();
                    if (this.field15796 > 0) {
                        if (method16999.contains("Now leaving: §") || method16999.contains("Now entering: §")) {
                            --this.field15796;
                            class5723.method16961(true);
                        }
                    }
                }
            }
            else {
                final Class4328 class5724 = (Class4328)method16998;
                if (this.field15795 >= 1) {
                    this.field15795 = -1;
                }
                this.field15798 = this.field15797;
                this.field15797 = class5724.field19378;
            }
        }
    }
    
    @Class6753
    public void method10386(final Class5721 class5721) {
        if (this.method9906()) {
            final Class4252 method16990 = class5721.method16990();
            if (method16990 instanceof Class4353) {
                final Class4353 class5722 = (Class4353)method16990;
                if (this.field15795 == -1) {
                    class5722.field19504 = true;
                }
            }
        }
    }
    
    @Class6753
    public void method10387(final Class5741 class5741) {
        if (this.method9906()) {
            final double field15797 = this.field15797;
            Class3286.field15514.field4684.field2396 = field15797;
            Class3286.field15514.field4684.field2418 = field15797;
            Class3286.field15514.field4684.field3019 = field15797;
            Class3286.field15514.field4684.field2393 = field15797;
        }
    }
}
