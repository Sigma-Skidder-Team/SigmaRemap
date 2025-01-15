// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3365 extends Class3355
{
    private int field16023;
    private Class7617 field16024;
    private boolean field16025;
    
    public Class3365() {
        super("Cubecraft2", "A fly for 1.9+ cubecraft", Class8013.field32990);
        this.field16024 = new Class7617();
    }
    
    @Override
    public void method9879() {
        this.field16023 = 0;
        if (!Class3365.field15514.field4648.field23440.method1056()) {
            this.field16025 = false;
        }
        else {
            Class3365.field15514.field4648.field23440.field2162 = false;
            this.field16025 = true;
        }
        if (Class6430.method19148()) {
            if (Class9367.method34762() == Class7906.field32452.method25613()) {
                Class9463.method35173().method35197().method25776(new Class6224("Cubecraft2 fly", "This fly was made for 1.9+ only"));
            }
        }
    }
    
    @Override
    public void method9897() {
        Class7482.method23151(0.2);
        Class6430.method19155(-0.0789);
        if (Class6430.method19160(Class3365.field15514.field4684, 0.001f)) {
            Class7482.method23151(0.0);
            Class6430.method19155(-0.0789);
        }
        else {
            final double field2395 = Class3365.field15514.field4684.posX;
            final double field2396 = Class3365.field15514.field4684.posY;
            Class3365.field15514.method5269().method17292(new Class4354(field2395, -150.0, Class3365.field15514.field4684.posZ, false));
            Class7482.method23151(0.0);
            Class6430.method19155(0.0);
            this.field16023 = -3;
            this.field16024.method23934();
            this.field16024.method23932();
        }
    }
    
    @Class6753
    private void method10692(final Class5752 class5752) {
        if (this.method9906()) {
            if (class5752.method17061() == Class3365.field15514.field4648.field23440.field2161.field32860) {
                class5752.method16961(true);
                this.field16025 = true;
            }
        }
    }
    
    @Class6753
    private void method10693(final Class5715 class5715) {
        if (this.method9906()) {
            if (class5715.method16963() == Class3365.field15514.field4648.field23440.field2161.field32860) {
                class5715.method16961(true);
                this.field16025 = false;
            }
        }
    }
    
    @Class6753
    @Class6759
    public void method10694(final Class5717 class5717) {
        if (this.method9906()) {
            ++this.field16023;
            if (this.field16023 != 1) {
                if (this.field16023 != 2) {
                    class5717.method16975(0.0);
                    Class7482.method23149(class5717, 0.0);
                }
                else {
                    class5717.method16975(-9.999999999E-5);
                    Class7482.method23149(class5717, 0.28);
                }
            }
            else {
                class5717.method16975(Class3365.field15514.field4648.field23439.method1056() ? (this.field16025 ? 1.0E-4 : 0.99) : (this.field16025 ? -0.99 : 1.0E-4));
                Class7482.method23149(class5717, 2.4);
            }
            Class6430.method19155(class5717.method16974());
            return;
        }
        if (this.field16023 < 0) {
            if (this.field16023 != -3) {
                if (this.field16023 != -2) {
                    if (this.field16023 == -1) {
                        ++this.field16023;
                        class5717.method16975(-0.4);
                        Class7482.method23149(class5717, 0.0);
                    }
                }
                else {
                    class5717.method16975(0.4);
                    ++this.field16023;
                    Class7482.method23149(class5717, 0.0);
                }
            }
            else {
                if (this.field16024.method23935() > 1000L) {
                    ++this.field16023;
                    this.field16024.method23934();
                    this.field16024.method23933();
                }
                class5717.method16975(0.0);
                Class7482.method23149(class5717, 0.0);
            }
        }
    }
    
    @Class6753
    public void method10695(final Class5744 class5744) {
        if (this.field16023 == -3) {
            class5744.method16961(true);
        }
        if (this.method9906() && class5744.method17046()) {
            class5744.method17033(true);
            class5744.method17045(true);
            if (this.field16023 != 3) {
                if (this.field16023 > 3) {
                    class5744.method16961(true);
                }
            }
            else {
                class5744.method17037(-150.0);
            }
        }
    }
    
    @Class6753
    public void method10696(final Class5723 class5723) {
        if (!this.method9906() && this.field16023 >= 0) {
            return;
        }
        final IPacket method16998 = class5723.method16998();
        if (method16998 instanceof Class4328) {
            final Class4328 class5724 = (Class4328)method16998;
            class5724.field19380 = Class3365.field15514.field4684.rotationYaw;
            class5724.field19381 = Class3365.field15514.field4684.rotationPitch;
            if (this.field16023 != -3) {
                this.field16023 = 0;
            }
            else {
                ++this.field16023;
            }
        }
    }
}
