// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3346 extends Class3167
{
    private int field15949;
    private double field15950;
    
    public Class3346() {
        super(Class8013.field32990, "NCPSpigot", "A fly for NoCheatPlus");
    }
    
    @Override
    public void method9879() {
        this.field15950 = Class3346.field15514.field4684.field2396;
        this.field15949 = 2;
    }
    
    @Override
    public void method9897() {
        Class7482.method23151(0.0);
        if (Class3346.field15514.field4684.method1935().y > 0.0) {
            Class6430.method19155(-0.0789);
        }
    }
    
    @Class6753
    @Class6759
    public void method10583(final Class5717 class5717) {
        if (this.method9906()) {
            if (this.field15949 <= 1) {
                if (this.field15949 != -1) {
                    if (this.field15949 != 0) {
                        if (this.field15949 == 1) {
                            class5717.method16975(-1.0E-7);
                            Class7482.method23149(class5717, Class7482.method23136());
                            Class6430.method19155(class5717.method16974());
                        }
                    }
                    else {
                        class5717.method16975(-1.0E-7);
                        Class7482.method23149(class5717, Class7482.method23136());
                        Class6430.method19155(class5717.method16974());
                    }
                }
                else {
                    class5717.method16975(0.0);
                    Class6430.method19155(class5717.method16974());
                    Class7482.method23149(class5717, Class7482.method23136());
                }
            }
            else {
                Class7482.method23149(class5717, 0.0);
            }
        }
    }
    
    @Class6753
    public void method10584(final Class5744 class5744) {
        if (this.method9906() && class5744.method17046()) {
            ++this.field15949;
            if (this.field15949 != 3) {
                if (this.field15949 > 3) {
                    if (this.field15949 >= 20) {
                        if (this.field15949 % 20 == 0) {
                            class5744.method17037(-150.0 - Math.random() * 150.0);
                        }
                    }
                }
            }
            else {
                class5744.method17037(-150.0 - Math.random() * 150.0);
            }
            class5744.method17033(true);
        }
    }
    
    @Class6753
    public void method10585(final Class5723 class5723) {
        if (this.method9906()) {
            final Class4252 method16998 = class5723.method16998();
            if (method16998 instanceof Class4328) {
                final Class4328 class5724 = (Class4328)method16998;
                if (this.field15949 >= 1) {
                    this.field15949 = -1;
                }
                this.field15950 = class5724.field19378;
                class5724.field19380 = Class3346.field15514.field4684.field2399;
                class5724.field19381 = Class3346.field15514.field4684.field2400;
            }
        }
    }
    
    @Class6753
    public void method10586(final Class5721 class5721) {
        if (this.method9906()) {
            final Class4252 method16990 = class5721.method16990();
            if (method16990 instanceof Class4353) {
                final Class4353 class5722 = (Class4353)method16990;
                if (this.field15949 == -1) {
                    class5722.field19504 = true;
                }
            }
        }
    }
    
    @Class6753
    public void method10587(final Class5741 class5741) {
        if (this.method9906()) {
            final double field15950 = this.field15950;
            Class3346.field15514.field4684.field2396 = field15950;
            Class3346.field15514.field4684.field2418 = field15950;
            Class3346.field15514.field4684.field3019 = field15950;
            Class3346.field15514.field4684.field2393 = field15950;
        }
    }
}
