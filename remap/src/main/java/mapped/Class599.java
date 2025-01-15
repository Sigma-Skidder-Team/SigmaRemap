// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

import java.util.Collections;
import java.util.List;

public abstract class Class599 extends Class598 implements Class563
{
    public static final int field3510 = -1;
    public static final int field3511 = -2;
    public final Class869 field3512;
    public int field3513;
    public int field3514;
    public int field3515;
    public int field3516;
    public int field3517;
    public int field3518;
    public final int field3519;
    public boolean field3520;
    public int field3521;
    public double field3522;
    public boolean field3523;
    public boolean field3524;
    public boolean field3525;
    public int field3526;
    private boolean field3527;
    
    public Class599(final Class869 field3512, final int n, final int field3513, final int field3514, final int field3515, final int field3516) {
        this.field3520 = true;
        this.field3521 = -2;
        this.field3523 = true;
        this.field3524 = true;
        this.field3512 = field3512;
        this.field3513 = n;
        this.field3514 = field3513;
        this.field3515 = field3514;
        this.field3516 = field3515;
        this.field3519 = field3516;
        this.field3518 = 0;
        this.field3517 = n;
    }
    
    public void method3480(final int n, final int field3514, final int field3515, final int field3516) {
        this.field3513 = n;
        this.field3514 = field3514;
        this.field3515 = field3515;
        this.field3516 = field3516;
        this.field3518 = 0;
        this.field3517 = n;
    }
    
    public void method3481(final boolean field3524) {
        this.field3524 = field3524;
    }
    
    public void method3482(final boolean field3525, final int field3526) {
        this.field3525 = field3525;
        this.field3526 = field3526;
        if (!field3525) {
            this.field3526 = 0;
        }
    }
    
    public void method3483(final boolean field3523) {
        this.field3523 = field3523;
    }
    
    public boolean method3484() {
        return this.field3523;
    }
    
    public abstract int method3485();
    
    @Override
    public List<? extends Class574> method3040() {
        return Collections.emptyList();
    }
    
    public boolean method3486(final int n, final int n2, final double n3, final double n4) {
        return true;
    }
    
    public abstract boolean method3487(final int p0);
    
    public int method3488() {
        return this.method3485() * this.field3519 + this.field3526;
    }
    
    public abstract void method3489();
    
    public void method3490(final int n, final int n2, final int n3, final float n4) {
    }
    
    public abstract void method3491(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5, final float p6);
    
    public void method3492(final int n, final int n2, final Class7392 class7392) {
    }
    
    public void method3493(final int n, final int n2) {
    }
    
    public void method3494(final int n, final int n2) {
    }
    
    public int method3495(final double n, final double n2) {
        final int n3 = this.field3518 + this.field3513 / 2 - this.method3505() / 2;
        final int n4 = this.field3518 + this.field3513 / 2 + this.method3505() / 2;
        final int n5 = MathHelper.floor(n2 - this.field3515) - this.field3526 + (int)this.field3522 - 4;
        final int n6 = n5 / this.field3519;
        if (n < this.method3508()) {
            if (n >= n3) {
                if (n <= n4) {
                    if (n6 >= 0) {
                        if (n5 >= 0) {
                            if (n6 < this.method3485()) {
                                return n6;
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }
    
    public void method3496() {
        this.field3522 = MathHelper.clamp(this.field3522, 0.0, this.method3497());
    }
    
    public int method3497() {
        return Math.max(0, this.method3488() - (this.field3516 - this.field3515 - 4));
    }
    
    public void method3498(final int n) {
        this.field3522 = n * this.field3519 + this.field3519 / 2 - (this.field3516 - this.field3515) / 2;
        this.method3496();
    }
    
    public int method3499() {
        return (int)this.field3522;
    }
    
    public boolean method3500(final double n, final double n2) {
        if (n2 >= this.field3515) {
            if (n2 <= this.field3516) {
                if (n >= this.field3518) {
                    if (n <= this.field3517) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public int method3501() {
        return (int)this.field3522 - this.field3514 - this.field3526;
    }
    
    public void method3502(final int n) {
        this.field3522 += n;
        this.method3496();
        this.field3521 = -2;
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        if (this.field3523) {
            this.method3489();
            final int method3508 = this.method3508();
            final int n4 = method3508 + 6;
            this.method3496();
            final Class7392 method3509 = Class7392.method22694();
            final Class4148 method3510 = method3509.method22696();
            this.field3512.method5290().method5849(Class565.field3361);
            Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
            method3510.method12390(7, Class9237.field39619);
            method3510.method12432(this.field3518, this.field3516, 0.0).method12391(this.field3518 / 32.0f, (this.field3516 + (int)this.field3522) / 32.0f).method12399(32, 32, 32, 255).method12397();
            method3510.method12432(this.field3517, this.field3516, 0.0).method12391(this.field3517 / 32.0f, (this.field3516 + (int)this.field3522) / 32.0f).method12399(32, 32, 32, 255).method12397();
            method3510.method12432(this.field3517, this.field3515, 0.0).method12391(this.field3517 / 32.0f, (this.field3515 + (int)this.field3522) / 32.0f).method12399(32, 32, 32, 255).method12397();
            method3510.method12432(this.field3518, this.field3515, 0.0).method12391(this.field3518 / 32.0f, (this.field3515 + (int)this.field3522) / 32.0f).method12399(32, 32, 32, 255).method12397();
            method3509.method22695();
            final int n5 = this.field3518 + this.field3513 / 2 - this.method3505() / 2 + 2;
            final int n6 = this.field3515 + 4 - (int)this.field3522;
            if (this.field3525) {
                this.method3492(n5, n6, method3509);
            }
            this.method3506(n5, n6, n, n2, n3);
            Class8726.method30007();
            this.method3509(0, this.field3515, 255, 255);
            this.method3509(this.field3516, this.field3514, 255, 255);
            Class8726.method30011();
            Class8726.method30015(Class2050.field11693, Class2135.field12460, Class2050.field11696, Class2135.field12455);
            Class8726.method29998();
            Class8726.method30045(7425);
            Class8726.method30041();
            method3510.method12390(7, Class9237.field39619);
            method3510.method12432(this.field3518, this.field3515 + 4, 0.0).method12391(0.0f, 1.0f).method12399(0, 0, 0, 0).method12397();
            method3510.method12432(this.field3517, this.field3515 + 4, 0.0).method12391(1.0f, 1.0f).method12399(0, 0, 0, 0).method12397();
            method3510.method12432(this.field3517, this.field3515, 0.0).method12391(1.0f, 0.0f).method12399(0, 0, 0, 255).method12397();
            method3510.method12432(this.field3518, this.field3515, 0.0).method12391(0.0f, 0.0f).method12399(0, 0, 0, 255).method12397();
            method3509.method22695();
            method3510.method12390(7, Class9237.field39619);
            method3510.method12432(this.field3518, this.field3516, 0.0).method12391(0.0f, 1.0f).method12399(0, 0, 0, 255).method12397();
            method3510.method12432(this.field3517, this.field3516, 0.0).method12391(1.0f, 1.0f).method12399(0, 0, 0, 255).method12397();
            method3510.method12432(this.field3517, this.field3516 - 4, 0.0).method12391(1.0f, 0.0f).method12399(0, 0, 0, 0).method12397();
            method3510.method12432(this.field3518, this.field3516 - 4, 0.0).method12391(0.0f, 0.0f).method12399(0, 0, 0, 0).method12397();
            method3509.method22695();
            final int method3511 = this.method3497();
            if (method3511 > 0) {
                final int method3512 = MathHelper.method35651((int)((this.field3516 - this.field3515) * (this.field3516 - this.field3515) / (float)this.method3488()), 32, this.field3516 - this.field3515 - 8);
                int field3515 = (int)this.field3522 * (this.field3516 - this.field3515 - method3512) / method3511 + this.field3515;
                if (field3515 < this.field3515) {
                    field3515 = this.field3515;
                }
                method3510.method12390(7, Class9237.field39619);
                method3510.method12432(method3508, this.field3516, 0.0).method12391(0.0f, 1.0f).method12399(0, 0, 0, 255).method12397();
                method3510.method12432(n4, this.field3516, 0.0).method12391(1.0f, 1.0f).method12399(0, 0, 0, 255).method12397();
                method3510.method12432(n4, this.field3515, 0.0).method12391(1.0f, 0.0f).method12399(0, 0, 0, 255).method12397();
                method3510.method12432(method3508, this.field3515, 0.0).method12391(0.0f, 0.0f).method12399(0, 0, 0, 255).method12397();
                method3509.method22695();
                method3510.method12390(7, Class9237.field39619);
                method3510.method12432(method3508, field3515 + method3512, 0.0).method12391(0.0f, 1.0f).method12399(128, 128, 128, 255).method12397();
                method3510.method12432(n4, field3515 + method3512, 0.0).method12391(1.0f, 1.0f).method12399(128, 128, 128, 255).method12397();
                method3510.method12432(n4, field3515, 0.0).method12391(1.0f, 0.0f).method12399(128, 128, 128, 255).method12397();
                method3510.method12432(method3508, field3515, 0.0).method12391(0.0f, 0.0f).method12399(128, 128, 128, 255).method12397();
                method3509.method22695();
                method3510.method12390(7, Class9237.field39619);
                method3510.method12432(method3508, field3515 + method3512 - 1, 0.0).method12391(0.0f, 1.0f).method12399(192, 192, 192, 255).method12397();
                method3510.method12432(n4 - 1, field3515 + method3512 - 1, 0.0).method12391(1.0f, 1.0f).method12399(192, 192, 192, 255).method12397();
                method3510.method12432(n4 - 1, field3515, 0.0).method12391(1.0f, 0.0f).method12399(192, 192, 192, 255).method12397();
                method3510.method12432(method3508, field3515, 0.0).method12391(0.0f, 0.0f).method12399(192, 192, 192, 255).method12397();
                method3509.method22695();
            }
            this.method3494(n, n2);
            Class8726.method30040();
            Class8726.method30045(7424);
            Class8726.method29999();
            Class8726.method30012();
        }
    }
    
    public void method3503(final double n, final double n2, final int n3) {
        boolean field3527 = false;
        Label_0043: {
            if (n3 == 0) {
                if (n >= this.method3508()) {
                    if (n < this.method3508() + 6) {
                        field3527 = true;
                        break Label_0043;
                    }
                }
            }
            field3527 = false;
        }
        this.field3527 = field3527;
    }
    
    @Override
    public boolean method2982(final double n, final double n2, final int n3) {
        this.method3503(n, n2, n3);
        if (!this.method3484() || !this.method3500(n, n2)) {
            return false;
        }
        final int method3495 = this.method3495(n, n2);
        if (method3495 == -1 && n3 == 0) {
            this.method3493((int)(n - (this.field3518 + this.field3513 / 2 - this.method3505() / 2)), (int)(n2 - this.field3515) + (int)this.field3522 - 4);
            return true;
        }
        if (method3495 != -1 && this.method3486(method3495, n3, n, n2)) {
            if (this.method3040().size() > method3495) {
                this.method3470((Class574)this.method3040().get(method3495));
            }
            this.method3469(true);
            return true;
        }
        return this.field3527;
    }
    
    @Override
    public boolean method2985(final double n, final double n2, final int n3) {
        if (this.method3471() != null) {
            this.method3471().method2985(n, n2, n3);
        }
        return false;
    }
    
    @Override
    public boolean method2984(final double n, final double n2, final int n3, final double n4, final double n5) {
        if (!super.method2984(n, n2, n3, n4, n5)) {
            if (this.method3484()) {
                if (n3 == 0) {
                    if (this.field3527) {
                        if (n2 >= this.field3515) {
                            if (n2 <= this.field3516) {
                                double n6 = this.method3497();
                                if (n6 < 1.0) {
                                    n6 = 1.0;
                                }
                                double n7 = n6 / (this.field3516 - this.field3515 - MathHelper.method35651((int)((this.field3516 - this.field3515) * (this.field3516 - this.field3515) / (float)this.method3488()), 32, this.field3516 - this.field3515 - 8));
                                if (n7 < 1.0) {
                                    n7 = 1.0;
                                }
                                this.field3522 += n5 * n7;
                                this.method3496();
                            }
                            else {
                                this.field3522 = this.method3497();
                            }
                        }
                        else {
                            this.field3522 = 0.0;
                        }
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public boolean method3012(final double n, final double n2, final double n3) {
        if (this.method3484()) {
            this.field3522 -= n3 * this.field3519 / 2.0;
            return true;
        }
        return false;
    }
    
    @Override
    public boolean method2972(final int n, final int n2, final int n3) {
        if (!this.method3484()) {
            return false;
        }
        if (super.method2972(n, n2, n3)) {
            return true;
        }
        if (n == 264) {
            this.method3504(1);
            return true;
        }
        if (n != 265) {
            return false;
        }
        this.method3504(-1);
        return true;
    }
    
    public void method3504(final int n) {
    }
    
    @Override
    public boolean method3004(final char c, final int n) {
        return this.method3484() && super.method3004(c, n);
    }
    
    @Override
    public boolean method3055(final double n, final double n2) {
        return this.method3500(n, n2);
    }
    
    public int method3505() {
        return 220;
    }
    
    public void method3506(final int n, final int n2, final int n3, final int n4, final float n5) {
        final int method3485 = this.method3485();
        final Class7392 method3486 = Class7392.method22694();
        final Class4148 method3487 = method3486.method22696();
        for (int i = 0; i < method3485; ++i) {
            final int n6 = n2 + i * this.field3519 + this.field3526;
            final int n7 = this.field3519 - 4;
            if (n6 > this.field3516 || n6 + n7 < this.field3515) {
                this.method3490(i, n, n6, n5);
            }
            if (this.field3524) {
                if (this.method3487(i)) {
                    final int n8 = this.field3518 + this.field3513 / 2 - this.method3505() / 2;
                    final int n9 = this.field3518 + this.field3513 / 2 + this.method3505() / 2;
                    Class8726.method30041();
                    final float n10 = this.method3507() ? 1.0f : 0.5f;
                    Class8726.method30068(n10, n10, n10, 1.0f);
                    method3487.method12390(7, Class9237.field39614);
                    method3487.method12432(n8, n6 + n7 + 2, 0.0).method12397();
                    method3487.method12432(n9, n6 + n7 + 2, 0.0).method12397();
                    method3487.method12432(n9, n6 - 2, 0.0).method12397();
                    method3487.method12432(n8, n6 - 2, 0.0).method12397();
                    method3486.method22695();
                    Class8726.method30068(0.0f, 0.0f, 0.0f, 1.0f);
                    method3487.method12390(7, Class9237.field39614);
                    method3487.method12432(n8 + 1, n6 + n7 + 1, 0.0).method12397();
                    method3487.method12432(n9 - 1, n6 + n7 + 1, 0.0).method12397();
                    method3487.method12432(n9 - 1, n6 - 1, 0.0).method12397();
                    method3487.method12432(n8 + 1, n6 - 1, 0.0).method12397();
                    method3486.method22695();
                    Class8726.method30040();
                }
            }
            this.method3491(i, n, n6, n7, n3, n4, n5);
        }
    }
    
    public boolean method3507() {
        return false;
    }
    
    public int method3508() {
        return this.field3513 / 2 + 124;
    }
    
    public void method3509(final int n, final int n2, final int n3, final int n4) {
        final Class7392 method22694 = Class7392.method22694();
        final Class4148 method22695 = method22694.method22696();
        this.field3512.method5290().method5849(Class565.field3361);
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        method22695.method12390(7, Class9237.field39619);
        method22695.method12432(this.field3518, n2, 0.0).method12391(0.0f, n2 / 32.0f).method12399(64, 64, 64, n4).method12397();
        method22695.method12432(this.field3518 + this.field3513, n2, 0.0).method12391(this.field3513 / 32.0f, n2 / 32.0f).method12399(64, 64, 64, n4).method12397();
        method22695.method12432(this.field3518 + this.field3513, n, 0.0).method12391(this.field3513 / 32.0f, n / 32.0f).method12399(64, 64, 64, n3).method12397();
        method22695.method12432(this.field3518, n, 0.0).method12391(0.0f, n / 32.0f).method12399(64, 64, 64, n3).method12397();
        method22694.method22695();
    }
    
    public void method3510(final int field3518) {
        this.field3518 = field3518;
        this.field3517 = field3518 + this.field3513;
    }
    
    public int method3511() {
        return this.field3519;
    }
}
