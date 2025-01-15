// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3273 extends Class3167
{
    private double field15765;
    private float field15766;
    private int field15767;
    private int field15768;
    
    public Class3273() {
        super(Class8013.field32990, "OldAAC", "Speed for old version of AAC");
        this.method9881(new Class4999("Auto Jump", "Automatically jumps for you.", true));
    }
    
    @Override
    public void method9897() {
    }
    
    @Override
    public void method9879() {
        this.field15768 = ((Class9463.method35173().method35194().method29228() <= 0) ? 1 : 0);
        this.field15765 = Class7482.method23136();
        this.field15766 = Class7482.method23144()[0];
    }
    
    @Class6753
    public void method10316(final Class5717 class5717) {
        if (this.method9906()) {
            if (!Class3273.field15514.field4684.field2404) {
                if (Class6430.method19114()) {
                    if (Class3348.field15956 >= 7) {
                        ++this.field15767;
                        if (this.field15767 == 1) {
                            if (this.field15768 != 1) {
                                if (this.field15768 == 2) {
                                    this.field15765 = 0.362;
                                }
                            }
                            else {
                                this.field15765 = 0.306;
                            }
                        }
                        if (Class3273.field15514.field4684.field2405) {
                            this.field15765 = Class7482.method23136();
                        }
                        this.field15766 = Class7482.method23153(class5717, this.field15765, Class7482.method23144()[0], this.field15766, 45.0f);
                    }
                }
            }
            else if (this.method9883("Auto Jump") && Class6430.method19114()) {
                this.field15767 = 0;
                Class3273.field15514.field4684.method2725();
                class5717.method16973(Class3273.field15514.field4684.method1935().x);
                class5717.method16975(Class3273.field15514.field4684.method1935().y);
                class5717.method16977(Class3273.field15514.field4684.method1935().z);
            }
            else if (class5717.method16974() != 0.4 + Class7482.method23140() * 0.1) {
                this.field15768 = 0;
            }
            else {
                Class7482.method23149(class5717, this.field15765);
            }
        }
    }
    
    @Class6753
    public void method10317(final Class5722 class5722) {
        if (this.method9906()) {
            if (this.field15768 < 2) {
                ++this.field15768;
            }
            if (this.field15768 != 1) {
                if (this.field15768 == 2) {
                    this.field15765 = 0.6;
                }
            }
            else {
                this.field15765 = 0.5;
            }
            this.field15766 = Class7482.method23144()[0];
            class5722.method16996(this.field15765);
            class5722.method16995(0.4 + Class7482.method23140() * 0.1);
            this.field15767 = 0;
        }
    }
    
    @Class6753
    public void method10318(final Class5723 class5723) {
        if (this.method9906()) {
            if (class5723.method16998() instanceof Class4328) {
                this.field15768 = 0;
                this.field15765 = Class7482.method23136();
            }
        }
    }
}
