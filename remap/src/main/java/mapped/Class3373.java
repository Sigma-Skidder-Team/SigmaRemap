// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3373 extends Class3167
{
    private int field16046;
    private boolean field16047;
    
    public Class3373() {
        super(Class8013.field32990, "LibreCraft", "A fly for LibreCraft");
        this.method9881(new Class4996("Speed", "Fly speed", 4.0f, Float.class, 0.3f, 10.0f, 0.1f));
    }
    
    @Override
    public void method9879() {
        this.field16046 = 0;
        if (!Class3373.field15514.field4648.field23440.method1056()) {
            if (!Class3373.field15514.field4648.field23440.method1056()) {
                this.field16047 = false;
            }
        }
        else {
            Class3373.field15514.field4648.field23440.field2162 = false;
            this.field16047 = true;
        }
    }
    
    @Override
    public void method9897() {
        Class7482.method23151(0.0);
        if (Class3373.field15514.field4684.method1935().y > 0.0) {
            Class6430.method19155(-0.0789);
        }
    }
    
    @Class6753
    private void method10733(final Class5752 class5752) {
        if (this.method9906()) {
            if (class5752.method17061() == Class3373.field15514.field4648.field23440.field2161.field32860) {
                class5752.method16961(true);
                this.field16047 = true;
            }
        }
    }
    
    @Class6753
    private void method10734(final Class5715 class5715) {
        if (this.method9906()) {
            if (class5715.method16963() == Class3373.field15514.field4648.field23440.field2161.field32860) {
                class5715.method16961(true);
                this.field16047 = false;
            }
        }
    }
    
    @Class6753
    @Class6759
    public void method10735(final Class5717 class5717) {
        if (this.method9906()) {
            if (this.field16046 <= 0) {
                if (this.field16046 != -1) {
                    if (this.field16046 == 0) {
                        class5717.method16975(0.0);
                        Class6430.method19155(class5717.method16974());
                        Class7482.method23149(class5717, 0.35);
                    }
                }
                else {
                    class5717.method16975(0.299);
                    Class6430.method19155(class5717.method16974());
                    Class7482.method23149(class5717, this.method9886("Speed"));
                }
            }
            else {
                class5717.method16975(0.0);
                Class7482.method23149(class5717, 0.0);
            }
        }
    }
    
    @Class6753
    public void method10736(final Class5744 class5744) {
        if (this.method9906() && class5744.method17046()) {
            ++this.field16046;
            if (this.field16046 != 2) {
                if (this.field16046 > 2) {
                    if (this.field16046 >= 20 && this.field16046 % 20 == 0) {
                        class5744.method17037(0.1);
                    }
                    else {
                        class5744.method16961(true);
                    }
                }
            }
            else {
                class5744.method17037(0.1);
            }
            class5744.method17033(true);
        }
    }
    
    @Class6753
    public void method10737(final Class5723 class5723) {
        if (this.method9906()) {
            final Class4252 method16998 = class5723.method16998();
            if (Class3373.field15514.field4684 != null) {
                if (method16998 instanceof Class4328) {
                    final Class4328 class5724 = (Class4328)method16998;
                    if (this.field16046 >= 1) {
                        this.field16046 = -1;
                    }
                    class5724.field19380 = Class3373.field15514.field4684.field2399;
                    class5724.field19381 = Class3373.field15514.field4684.field2400;
                }
            }
        }
    }
}
