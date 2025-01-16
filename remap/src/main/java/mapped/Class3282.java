// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

public class Class3282 extends Class3167
{
    private int field15787;
    private double field15788;
    private double field15789;
    private float field15790;
    
    public Class3282() {
        super(Class8013.field32990, "Spider", "Step for Spider");
        this.method9881(new Class4999("AAC", "Bypass for AAC", false));
    }
    
    @Override
    public void method9879() {
        this.field15787 = 0;
    }
    
    @Class6753
    @Class6759
    private void method10362(final Class5745 class5745) {
        if (!this.method9906() || class5745.method16962()) {
            return;
        }
        final double method17049 = class5745.method17049();
        final Class2166 method17050 = ((Class3265)this.method9914()).method10299(class5745);
        if (method17050 == Class2166.field12884) {
            class5745.method16961(true);
            return;
        }
        if (method17050 != Class2166.field12885) {
            if (!Class7482.method23142()) {
                if (method17049 >= 0.625) {
                    this.field15789 = method17049;
                    double method17051 = Class7482.method23141();
                    if (method17049 < 1.1) {
                        method17051 *= method17049;
                    }
                    class5745.method17050((method17051 <= 0.42) ? method17051 : 0.4199998);
                    this.field15790 = Class7482.method23144()[0] - 90.0f;
                    this.field15787 = 1;
                    this.field15788 = Class3282.field15514.player.posY;
                    class5745.method17049();
                }
            }
        }
    }
    
    @Class6753
    private void method10363(final Class5744 class5744) {
        if (this.method9906()) {
            if (Class3282.field15514.player != null) {
                if (class5744.method17046()) {
                    if (this.field15787 != 1) {
                        if (this.field15787 == 3) {
                            final Class3167 method21551 = Class9463.method35173().method35189().method21551(Class3261.class);
                            if (method21551.method9906() && method21551.method9887("Type").equals("NoGround")) {
                                class5744.method17037(class5744.method17036() + 1.0E-14);
                            }
                            else {
                                class5744.method17045(true);
                            }
                        }
                    }
                    else {
                        class5744.method17045(false);
                    }
                }
            }
        }
    }
    
    @Class6753
    private void method10364(final Class5717 class5717) {
        if (this.method9906() && Class3282.field15514.player != null) {
            if (this.field15787 != 1) {
                if (this.field15787 != 2) {
                    if (this.field15787 == 3) {
                        if (!Class6430.method19160(Class3282.field15514.player, 0.001f)) {
                            Class7482.method23149(class5717, 0.25);
                        }
                        else {
                            class5717.method16975(-0.078);
                            Class7482.method23149(class5717, this.method9883("AAC") ? 0.301 : Class7482.method23136());
                        }
                        if (!Class6430.method19114()) {
                            Class7482.method23149(class5717, 0.0);
                        }
                        this.field15787 = 0;
                    }
                }
                else {
                    class5717.method16975(this.field15788 + this.field15789 - Class3282.field15514.player.posY);
                    final double n = this.method9883("AAC") ? 0.301 : Class7482.method23136();
                    final float n2 = this.field15790 * 0.017453292f;
                    class5717.method16973(-MathHelper.sin(n2) * n);
                    class5717.method16977(MathHelper.cos(n2) * n);
                    ++this.field15787;
                }
            }
            else {
                double method23141 = Class7482.method23141();
                if (this.field15789 < 1.1) {
                    method23141 *= this.field15789;
                }
                class5717.method16975(((method23141 <= 0.42) ? method23141 : 0.4199998) * 0.797);
                Class7482.method23149(class5717, 0.0);
                ++this.field15787;
            }
        }
    }
    
    @Class6753
    private void method10365(final Class5738 class5738) {
        if (this.method9906() && Class3282.field15514.player != null) {
            if (!class5738.method17027()) {
                Class3282.field15514.player.stepHeight = 1.07f;
            }
            else {
                Class3282.field15514.player.stepHeight = 0.5f;
            }
        }
    }
}
