// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

public class Class3342 extends Class3167
{
    private double field15946;
    private boolean field15947;
    private boolean field15948;
    
    public Class3342() {
        super(Class8013.field32990, "Spartan", "A fly for Spartan anticheat");
        this.method9881(new Class4999("Ground Spoof", "Send on ground packets", true));
    }
    
    @Override
    public void method9879() {
        this.field15947 = false;
        this.field15946 = -10.0;
        if (!Class3342.field15514.field4648.field23440.method1056()) {
            this.field15948 = false;
        }
        else {
            Class3342.field15514.field4648.field23440.field2162 = false;
            this.field15948 = true;
        }
    }
    
    @Class6753
    private void method10575(final Class5752 class5752) {
        if (this.method9906()) {
            if (class5752.method17061() == Class3342.field15514.field4648.field23440.field2161.field32860) {
                class5752.method16961(true);
                this.field15948 = true;
            }
        }
    }
    
    @Class6753
    private void method10576(final Class5715 class5715) {
        if (this.method9906()) {
            if (class5715.method16963() == Class3342.field15514.field4648.field23440.field2161.field32860) {
                class5715.method16961(true);
                this.field15948 = false;
            }
        }
    }
    
    @Class6753
    public void method10577(final Class5744 class5744) {
        if (this.method9906()) {
            if (class5744.method17046()) {
                if (this.method9883("Ground Spoof")) {
                    if (this.field15947) {
                        this.field15947 = !this.field15947;
                        class5744.method17045(true);
                    }
                }
            }
        }
    }
    
    @Class6753
    public void method10578(final Class5717 class5717) {
        if (this.method9906()) {
            if (!Class3342.field15514.field4684.field2404 && !Class6430.method19160(Class3342.field15514.field4684, 0.001f)) {
                if (class5717.method16974() < 0.0) {
                    if (this.field15946 != Class3342.field15514.field4684.field2396) {
                        if (Class3342.field15514.field4684.field2396 + class5717.method16974() < this.field15946) {
                            this.field15947 = true;
                            final int method10579 = this.method10579();
                            if (method10579 >= 0) {
                                Class3342.field15514.method5269().method17292(new Class4321(method10579));
                            }
                            if (method10579 >= 0 || Class3342.field15514.field4684.method2715(Class316.field1877).method27622() instanceof Class4036) {
                                Class3342.field15514.method5269().method17292(new Class4329(Class316.field1877, new Class7005(Class3342.field15514.field4684.method1934().method16744(0.0, -2.0, 0.0), Direction.UP, Class3342.field15514.field4684.method1894().method1134(0, -2, 0), false)));
                            }
                            if (method10579 >= 0) {
                                Class3342.field15514.method5269().method17292(new Class4321(Class3342.field15514.field4684.field3006.field2743));
                            }
                            class5717.method16975(this.field15946 - Class3342.field15514.field4684.field2396);
                        }
                    }
                    else {
                        Class3342.field15514.field4684.method2725();
                        class5717.method16975(Class3342.field15514.field4684.method1935().field22771);
                        this.field15946 = (Class3342.field15514.field4648.field23439.method1056() ? (this.field15948 ? Class3342.field15514.field4684.field2396 : (Class3342.field15514.field4684.field2396 + 1.0)) : (this.field15948 ? (Class3342.field15514.field4684.field2396 - 1.0) : Class3342.field15514.field4684.field2396));
                        Class7482.method23149(class5717, 0.35);
                    }
                }
            }
            else {
                Class3342.field15514.field4684.method2725();
                class5717.method16975(Class3342.field15514.field4684.method1935().field22771);
                Class7482.method23149(class5717, 0.35);
                this.field15946 = (Class3342.field15514.field4648.field23439.method1056() ? (this.field15948 ? Class3342.field15514.field4684.field2396 : (Class3342.field15514.field4684.field2396 + 1.0)) : (this.field15948 ? (Class3342.field15514.field4684.field2396 - 1.0) : Class3342.field15514.field4684.field2396));
            }
            Class6430.method19154(class5717.method16972());
            Class6430.method19155(class5717.method16974());
            Class6430.method19156(class5717.method16976());
        }
    }
    
    public int method10579() {
        for (int i = 36; i < 45; ++i) {
            if (Class3342.field15514.field4684.field3008.method10878(i).method20054() && Class3342.field15514.field4684.field3008.method10878(i).method20053().method27622() instanceof Class4036) {
                if (i - 36 == Class3342.field15514.field4684.field3006.field2743) {
                    i = 34;
                }
                return i - 36;
            }
        }
        return -1;
    }
}
