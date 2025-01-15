// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

public class Class3207 extends Class3167
{
    private int field15643;
    private int field15644;
    private boolean field15645;
    
    public Class3207() {
        super(Class8013.field32990, "AGC", "A fly for AntiGamingChair");
    }
    
    @Override
    public void method9879() {
        this.field15643 = 0;
        if (!Class3207.field15514.field4648.field23440.method1056()) {
            this.field15645 = false;
        }
        else {
            Class3207.field15514.field4648.field23440.field2162 = false;
            this.field15645 = true;
        }
        this.field15644 = 1;
    }
    
    @Class6753
    private void method10079(final Class5752 class5752) {
        if (this.method9906()) {
            if (class5752.method17061() == Class3207.field15514.field4648.field23440.field2161.field32860) {
                class5752.method16961(true);
                this.field15645 = true;
            }
        }
    }
    
    @Class6753
    private void method10080(final Class5715 class5715) {
        if (this.method9906()) {
            if (class5715.method16963() == Class3207.field15514.field4648.field23440.field2161.field32860) {
                class5715.method16961(true);
                this.field15645 = false;
            }
        }
    }
    
    @Override
    public void method9897() {
        Class7482.method23151(0.0);
        if (Class3207.field15514.field4684.method1935().field22771 > 0.0) {
            Class6430.method19155(-0.0789);
        }
    }
    
    @Class6753
    @Class6759
    public void method10081(final Class5717 class5717) {
        if (this.method9906()) {
            if (this.field15643 <= ((this.field15644 != 3) ? this.field15644 : 1) - 2) {
                if (this.field15643 == -1) {
                    class5717.method16975((this.field15644 != 3) ? 0.001 : 0.095);
                    if (this.field15644 != 3) {
                        Class7482.method23149(class5717, 0.32);
                    }
                    Class6430.method19155(class5717.method16974());
                }
            }
            else {
                class5717.method16975(0.0);
                Class7482.method23149(class5717, 0.0);
            }
        }
    }
    
    @Class6753
    public void method10082(final Class5744 class5744) {
        if (this.method9906() && class5744.method17046()) {
            ++this.field15643;
            if (this.field15643 != ((this.field15644 != 3) ? this.field15644 : 1)) {
                if (this.field15643 > ((this.field15644 != 3) ? this.field15644 : 1)) {
                    if (this.field15643 % 20 != 0) {
                        class5744.method16961(true);
                    }
                    else {
                        class5744.method17037(this.method10084() - 1.0E-4);
                        class5744.method17033(true);
                        class5744.method17045(true);
                    }
                }
            }
            else {
                class5744.method17037(this.method10084() - 1.0E-4);
                class5744.method17045(true);
                class5744.method17033(true);
                this.field15644 = (this.field15645 ? (Class3207.field15514.field4648.field23439.method1056() ? 1 : 2) : (Class3207.field15514.field4648.field23439.method1056() ? 3 : 1));
            }
        }
    }
    
    @Class6753
    public void method10083(final Class5723 class5723) {
        if (this.method9906()) {
            final Class4252 method16998 = class5723.method16998();
            if (method16998 instanceof Class4328) {
                final Class4328 class5724 = (Class4328)method16998;
                if (this.field15643 >= ((this.field15644 != 3) ? this.field15644 : 1)) {
                    this.field15643 = -1;
                }
                class5724.field19380 = Class3207.field15514.field4684.field2399;
                class5724.field19381 = Class3207.field15514.field4684.field2400;
            }
        }
    }
    
    private double method10084() {
        if (Class3207.field15514.field4684.method1895().field22771 < 1.0) {
            return -1.0;
        }
        if (!Class3207.field15514.field4684.field2404) {
            final Iterator<Object> iterator = Class3207.field15514.field4683.method6981(Class3207.field15514.field4684, Class3207.field15514.field4684.field2403.method18494(0.0, -Class3207.field15514.field4684.method1934().field22771, 0.0)).iterator();
            double field25077 = -1.0;
            Class354 class354 = null;
            while (iterator.hasNext()) {
                final Class7702 class355 = iterator.next();
                if (class355.method24537().field25077 <= field25077) {
                    continue;
                }
                field25077 = class355.method24537().field25077;
                class354 = new Class354(class355.method24537().field25073, class355.method24537().field25074, class355.method24537().field25075);
            }
            if (class354 != null) {
                if (Class3207.field15514.field4683.method6701(class354).method21696() instanceof Class4030) {
                    field25077 = (int)field25077 - 1.0E-4;
                }
            }
            return field25077;
        }
        return Class3207.field15514.field4684.field2396;
    }
}
