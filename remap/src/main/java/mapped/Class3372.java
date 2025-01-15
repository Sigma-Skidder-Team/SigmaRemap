// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3372 extends Class3167
{
    private double field16040;
    private double field16041;
    private int field16042;
    private int field16043;
    private int field16044;
    private boolean field16045;
    
    public Class3372() {
        super(Class8013.field32990, "Mineplex", "Mineplex longjump.");
    }
    
    @Override
    public void method9897() {
        Class7482.method23151(Class7482.method23136() * 0.7);
    }
    
    @Override
    public void method9879() {
        this.field16045 = true;
        this.field16042 = -1;
        this.field16043 = 0;
        this.field16044 = 0;
    }
    
    @Class6753
    public void method10729(final Class5744 class5744) {
        if (this.method9906()) {
            if (class5744.method17046()) {
                if (this.field16042 >= 0) {
                    class5744.method17033(true);
                }
            }
        }
    }
    
    @Class6753
    public void method10730(final Class5717 class5717) {
        if (this.method9906() && Class3372.field15514.field4684 != null) {
            if (!Class3372.field15514.field4684.field2404) {
                if (this.field16042 >= 0) {
                    if (this.field16045) {
                        if (!Class6430.method19114()) {
                            this.field16045 = !this.field16045;
                            this.field16040 = 0.5;
                            this.field16043 = 1;
                        }
                    }
                    ++this.field16042;
                    this.field16041 -= 0.04000000000001;
                    if (this.field16042 <= 22) {
                        if (this.field16042 == 10) {
                            if (this.field16045) {
                                this.field16041 = -0.005;
                            }
                        }
                    }
                    else {
                        this.field16041 -= 0.02;
                    }
                    if (this.field16042 > 6) {
                        if (!Class6430.method19114()) {
                            this.field16041 -= 0.05;
                        }
                    }
                    if (Class3372.field15514.field4684.field2405) {
                        this.field16040 = 0.35;
                        this.field16043 = 1;
                    }
                    if (Class3372.field15514.field4684.field2406) {
                        this.field16041 = -0.078;
                        this.field16042 = 23;
                    }
                    this.field16040 -= 0.01;
                    if (this.field16040 < 0.3) {
                        this.field16040 = 0.3;
                    }
                    Class7482.method23149(class5717, this.field16040);
                    class5717.method16975(this.field16041);
                }
            }
            else {
                if (this.field16044 > 1) {
                    this.field16043 = 0;
                }
                else {
                    ++this.field16044;
                }
                if (this.field16042 > 0) {
                    this.field16042 = -1;
                    if (this.method9914().method9883("Auto Disable")) {
                        this.method9914().method9910();
                        return;
                    }
                }
                this.field16045 = Class6430.method19114();
                final BlockPos class5718 = new BlockPos(Class3372.field15514.field4684.field2395, Class3372.field15514.field4684.field2396 - 0.4, Class3372.field15514.field4684.field2397);
                if (Class6430.method19114()) {
                    if ((this.method9914().method9883("BorderJump") && !Class4609.method13708(class5718)) || this.method9914().method9883("Auto Jump")) {
                        Class3372.field15514.field4684.method2725();
                        class5717.method16975(Class3372.field15514.field4684.method1935().field22771);
                        Class7482.method23149(class5717, 0.0);
                    }
                }
            }
        }
    }
    
    @Class6753
    public void method10731(final Class5722 class5722) {
        if (this.method9906() && Class3372.field15514.field4684 != null) {
            this.field16040 = 0.81 + this.field16043 * 0.095;
            if (Class3372.field15514.field4684.field2396 != (int)Class3372.field15514.field4684.field2396) {
                this.field16040 = 0.52;
                this.field16043 = 1;
            }
            this.field16044 = 0;
            this.field16041 = 0.4299999;
            if (this.field16043 < 2) {
                ++this.field16043;
            }
            this.field16042 = 0;
            class5722.method16996(0.0);
            class5722.method16995(this.field16041);
        }
    }
    
    @Class6753
    public void method10732(final Class5723 class5723) {
        if (this.method9906() && Class3372.field15514.field4684 != null) {
            if (class5723.method16998() instanceof Class4328) {
                this.field16042 = -1;
                this.field16043 = 0;
            }
        }
    }
}
