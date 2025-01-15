// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3290 extends Class3167
{
    private int field15847;
    private int field15848;
    private double field15849;
    
    public Class3290() {
        super(Class8013.field32990, "NCP", "Speed for NCP");
        this.method9881(new Class4999("Auto Jump", "Automatically jumps for you.", true));
    }
    
    @Override
    public void method9879() {
        this.field15848 = 1;
        final double field22770 = Class3290.field15514.field4684.method1935().field22770;
        final double field22771 = Class3290.field15514.field4684.method1935().field22772;
        this.field15849 = Math.sqrt(field22770 * field22770 + field22771 * field22771);
    }
    
    @Class6753
    public void method10412(final Class5744 class5744) {
        if (this.method9906()) {
            if (Class3290.field15514.field4684 != null) {
                if (!Class3295.method10433()) {
                    if (!Class9463.method35173().method35189().method21551(Class3259.class).method9906()) {
                        if (class5744.method17046()) {
                            if (Class3256.field15748 > 1) {
                                final double n = Class3290.field15514.field4684.field2395 - Class3290.field15514.field4684.field4074;
                                final double n2 = Class3290.field15514.field4684.field2397 - Class3290.field15514.field4684.field4076;
                                if (this.field15847 != 0) {
                                    this.field15849 = Math.sqrt(n * n + n2 * n2);
                                }
                                else {
                                    this.field15849 *= 0.67 + Math.random() * 1.0E-10;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    @Class6753
    public void method10413(final Class5717 class5717) {
        if (!this.method9906() || Class3290.field15514.field4684 == null) {
            return;
        }
        if (!Class3295.method10433() && !Class3290.field15514.field4684.method1706()) {
            if (this.field15848 < 2) {
                ++this.field15848;
            }
            if (!Class3290.field15514.field4684.field2404) {
                if (this.field15847 >= 0) {
                    ++this.field15847;
                    double n = this.field15849;
                    if (this.field15847 > 1) {
                        n = Math.max(Class7482.method23137(), this.field15849 - (0.004 - Class7482.method23137() * 0.003) - Math.random() * 1.0E-10);
                    }
                    Class7482.method23149(class5717, n);
                    if (class5717.method16974() >= -0.008744698139753596 && class5717.method16974() <= -0.008724698139753597) {
                        class5717.method16975(0.001);
                    }
                    else if (class5717.method16974() >= -0.07743000150680542) {
                        if (class5717.method16974() <= -0.07741000150680542) {
                            class5717.method16975(class5717.method16974() - 0.01);
                        }
                    }
                }
            }
            else if (this.field15848 > 1) {
                if ((this.method9883("Auto Jump") && Class6430.method19114()) || Class3290.field15514.field4648.field23439.method1056()) {
                    this.field15847 = 0;
                    Class3290.field15514.field4684.method2725();
                    class5717.method16973(Class3290.field15514.field4684.method1935().field22770);
                    class5717.method16975(Class3290.field15514.field4684.method1935().field22771);
                    class5717.method16977(Class3290.field15514.field4684.method1935().field22772);
                }
            }
            return;
        }
        this.field15847 = -1;
    }
    
    @Class6753
    @Class6759
    public void method10414(final Class5722 class5722) {
        if (!this.method9906() || Class3295.method10433()) {
            return;
        }
        if (this.field15847 != 0) {
            class5722.method16961(true);
        }
        if (Class3290.field15514.field4648.field23439.method1056() && Class9463.method35173().method35189().method21551(Class3260.class).method9906()) {
            return;
        }
        double b = 0.56 + Class7482.method23139() * 0.1;
        class5722.method16995(0.407 + Class7482.method23140() * 0.1 + Math.random() * 1.0E-5);
        if (Class3256.field15748 < 2) {
            b /= 2.5;
        }
        final double max = Math.max(Class7482.method23137(), b);
        class5722.method16996(max);
        this.field15849 = max;
    }
    
    @Class6753
    public void method10415(final Class5745 class5745) {
        if (this.method9906() && class5745.method17049() >= 0.9) {
            this.field15848 = 0;
        }
    }
}
