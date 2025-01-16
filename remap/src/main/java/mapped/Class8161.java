// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

public class Class8161
{
    private final Minecraft field33604;
    private boolean field33605;
    private boolean field33606;
    private boolean field33607;
    private double field33608;
    private double field33609;
    private int field33610;
    private int field33611;
    private boolean field33612;
    private int field33613;
    private double field33614;
    private final Class7995 field33615;
    private final Class7995 field33616;
    private double field33617;
    private double field33618;
    private double field33619;
    private double field33620;
    private boolean field33621;
    
    public Class8161(final Minecraft field33604) {
        this.field33611 = -1;
        this.field33612 = true;
        this.field33615 = new Class7995();
        this.field33616 = new Class7995();
        this.field33620 = Double.MIN_VALUE;
        this.field33604 = field33604;
    }
    
    private void method26952(final long n, int n2, final int n3, final int n4) {
        if (Class9463.method35173().method35193().method32154() == null) {
            if (this.field33604.field4700 == null) {
                if (n3 != 1 && n3 != 2) {
                    if (n3 == 0) {
                        final Class5715 class5715 = new Class5715(n2);
                        Class9463.method35173().method35188().method21097(class5715);
                        if (class5715.method16962()) {
                            return;
                        }
                    }
                }
                else {
                    if (n2 > 1) {
                        Class8004.method26199(n2);
                    }
                    final Class5752 class5716 = new Class5752(n2, n3 == 2, null);
                    Class9463.method35173().method35188().method21097(class5716);
                    if (class5716.method16962()) {
                        return;
                    }
                }
            }
            if (n == this.field33604.method5332().method7690()) {
                final boolean field33605 = n3 == 1;
                if (Minecraft.field4623) {
                    if (n2 == 0) {
                        if (!field33605) {
                            if (this.field33610 > 0) {
                                n2 = 1;
                                --this.field33610;
                            }
                        }
                        else if ((n4 & 0x2) == 0x2) {
                            n2 = 1;
                            ++this.field33610;
                        }
                    }
                }
                final int field33606 = n2;
                if (!field33605) {
                    if (this.field33611 != -1) {
                        if (this.field33604.field4648.field23429 && --this.field33613 > 0) {
                            return;
                        }
                        this.field33611 = -1;
                    }
                }
                else {
                    if (this.field33604.field4648.field23429 && this.field33613++ > 0) {
                        return;
                    }
                    this.field33611 = field33606;
                    this.field33614 = Class9491.method35321();
                }
                final boolean[] array = { false };
                if (this.field33604.field4701 == null) {
                    if (this.field33604.field4700 != null) {
                        final double n5 = this.field33608 * this.field33604.method5332().method7696() / this.field33604.method5332().method7694();
                        final double n6 = this.field33609 * this.field33604.method5332().method7697() / this.field33604.method5332().method7695();
                        if (!field33605) {
                            Screen.method3053(() -> array2[0] = this.field33604.field4700.mouseReleased(n7, n8, n9), "mouseReleased event handler", this.field33604.field4700.getClass().getCanonicalName());
                        }
                        else {
                            Screen.method3053(() -> array3[0] = this.field33604.field4700.mouseClicked(n10, n11, n12), "mouseClicked event handler", this.field33604.field4700.getClass().getCanonicalName());
                        }
                    }
                    else if (!this.field33621) {
                        if (field33605) {
                            this.method26963();
                        }
                    }
                }
                if (!array[0]) {
                    if (this.field33604.field4700 == null || this.field33604.field4700.field3155) {
                        if (this.field33604.field4701 == null) {
                            if (field33606 != 0) {
                                if (field33606 != 2) {
                                    if (field33606 == 1) {
                                        this.field33607 = field33605;
                                    }
                                }
                                else {
                                    this.field33606 = field33605;
                                }
                            }
                            else {
                                this.field33605 = field33605;
                            }
                            Class350.method1052(Class2136.field12469.method8289(field33606), field33605);
                            if (field33605) {
                                if (this.field33604.field4684.isSpectator() && field33606 == 2) {
                                    this.field33604.field4647.method3810().method3329();
                                }
                                else {
                                    Class350.method1051(Class2136.field12469.method8289(field33606));
                                }
                            }
                        }
                    }
                }
            }
            return;
        }
        Class9463.method35173().method35193().method32130(n2, n3);
    }
    
    private void method26953(final long n, final double n2, final double d) {
        if (Class9463.method35173().method35193().method32154() != null) {
            Class9463.method35173().method35193().method32129(n2, d);
            return;
        }
        final Class5720 class5720 = new Class5720(d);
        Class9463.method35173().method35188().method21097(class5720);
        if (!class5720.method16962()) {
            if (n == Minecraft.method5277().method5332().method7690()) {
                final double d2 = (this.field33604.field4648.field23423 ? Math.signum(d) : d) * this.field33604.field4648.field23411;
                if (this.field33604.field4701 == null) {
                    if (this.field33604.field4700 == null) {
                        if (this.field33604.field4684 != null) {
                            if (this.field33619 != 0.0) {
                                if (Math.signum(d2) != Math.signum(this.field33619)) {
                                    this.field33619 = 0.0;
                                }
                            }
                            this.field33619 += d2;
                            final float n3 = (float)(int)this.field33619;
                            if (n3 == 0.0f) {
                                return;
                            }
                            this.field33619 -= n3;
                            if (!this.field33604.field4684.isSpectator()) {
                                this.field33604.field4684.field3006.method2356(n3);
                            }
                            else if (!this.field33604.field4647.method3810().method3327()) {
                                this.field33604.field4684.field3025.method21426(MathHelper.clamp(this.field33604.field4684.field3025.method21425() + n3 * 0.005f, 0.0f, 0.2f));
                            }
                            else {
                                this.field33604.field4647.method3810().method3328(-n3);
                            }
                        }
                    }
                    else {
                        this.field33604.field4700.mouseScrolled(this.field33608 * this.field33604.method5332().method7696() / this.field33604.method5332().method7694(), this.field33609 * this.field33604.method5332().method7697() / this.field33604.method5332().method7695(), d2);
                    }
                }
            }
        }
    }
    
    public void method26954(final long n) {
        Class8341.method27800(n, (n, n2, n3) -> this.field33604.execute(() -> this.method26955(n4, n5, n6)), (n, n2, n3, n4) -> this.field33604.execute(() -> this.method26952(n5, n6, n7, n8)), (n, n2, n3) -> this.field33604.execute(() -> this.method26953(n4, n5, n6)));
    }
    
    private void method26955(final long n, final double n9, final double n11) {
        if (n == Minecraft.method5277().method5332().method7690()) {
            if (this.field33612) {
                this.field33608 = n9;
                this.field33609 = n11;
                this.field33612 = false;
            }
            final Screen field4700 = this.field33604.field4700;
            if (field4700 != null) {
                if (this.field33604.field4701 == null) {
                    final double n4 = n9 * this.field33604.method5332().method7696() / this.field33604.method5332().method7694();
                    final double n5 = n11 * this.field33604.method5332().method7697() / this.field33604.method5332().method7695();
                    Screen.method3053(() -> class574.method3372(n6, n7), "mouseMoved event handler", field4700.getClass().getCanonicalName());
                    if (this.field33611 != -1) {
                        if (this.field33614 > 0.0) {
                            Screen.method3053(() -> {
                                final Object o = (n9 - this.field33608) * this.field33604.method5332().method7696() / this.field33604.method5332().method7694();
                                final Object o2 = (n11 - this.field33609) * this.field33604.method5332().method7697() / this.field33604.method5332().method7695();
                                class575.method2984(n8, n10, this.field33611, n12, n13);
                                return;
                            }, "mouseDragged event handler", field4700.getClass().getCanonicalName());
                        }
                    }
                }
            }
            this.field33604.method5327().startSection("mouse");
            if (this.method26962()) {
                if (this.field33604.method5320()) {
                    this.field33617 += n9 - this.field33608;
                    this.field33618 += n11 - this.field33609;
                }
            }
            this.method26956();
            this.field33608 = n9;
            this.field33609 = n11;
            this.field33604.method5327().endSection();
        }
    }
    
    public void method26956() {
        final double method35321 = Class9491.method35321();
        final double n = method35321 - this.field33620;
        this.field33620 = method35321;
        if (this.method26962() && this.field33604.method5320()) {
            final double n2 = this.field33604.field4648.field23381 * 0.6000000238418579 + 0.20000000298023224;
            final double n3 = n2 * n2 * n2 * 8.0;
            double n4;
            double n5;
            if (!this.field33604.field4648.field23470) {
                this.field33615.method26161();
                this.field33616.method26161();
                n4 = this.field33617 * n3;
                n5 = this.field33618 * n3;
            }
            else {
                final double method35322 = this.field33615.method26160(this.field33617 * n3, n * n3);
                final double method35323 = this.field33616.method26160(this.field33618 * n3, n * n3);
                n4 = method35322;
                n5 = method35323;
            }
            this.field33617 = 0.0;
            this.field33618 = 0.0;
            int n6 = 1;
            if (this.field33604.field4648.field23422) {
                n6 = -1;
            }
            this.field33604.method5319().method32918(n4, n5);
            if (this.field33604.field4684 != null) {
                this.field33604.field4684.method1658(n4, n5 * n6);
            }
        }
        else {
            this.field33617 = 0.0;
            this.field33618 = 0.0;
        }
    }
    
    public boolean method26957() {
        return this.field33605;
    }
    
    public boolean method26958() {
        return this.field33607;
    }
    
    public double method26959() {
        return this.field33608;
    }
    
    public double method26960() {
        return this.field33609;
    }
    
    public void method26961() {
        this.field33612 = true;
    }
    
    public boolean method26962() {
        return this.field33621;
    }
    
    public void method26963() {
        if (this.field33604.method5320()) {
            if (!this.field33621) {
                if (!Minecraft.field4623) {
                    Class350.method1053();
                }
                this.field33621 = true;
                this.field33608 = this.field33604.method5332().method7694() / 2;
                this.field33609 = this.field33604.method5332().method7695() / 2;
                Class8341.method27801(this.field33604.method5332().method7690(), 212995, this.field33608, this.field33609);
                this.field33604.method5244(null);
                this.field33604.field4693 = 10000;
                this.field33612 = true;
            }
        }
    }
    
    public void method26964() {
        if (this.field33621) {
            this.field33621 = false;
            this.field33608 = this.field33604.method5332().method7694() / 2;
            this.field33609 = this.field33604.method5332().method7695() / 2;
            Class8341.method27801(this.field33604.method5332().method7690(), 212993, this.field33608, this.field33609);
        }
    }
}
