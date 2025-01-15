// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;

public class Class535 extends Class527
{
    private String field3190;
    private int field3191;
    public Class576 field3192;
    private String field3193;
    private Class6823 field3194;
    
    public Class535(final String field3193) {
        super(Class7895.field32402);
        this.field3190 = "";
        this.field3191 = -1;
        this.field3193 = "";
        this.field3193 = field3193;
    }
    
    @Override
    public void method2969() {
        this.field3150.field4651.method22505(true);
        this.field3191 = this.field3150.field4647.method3807().method3765().size();
        (this.field3192 = new Class578(this, this.field3156, 4, this.field3153 - 12, this.field3152 - 4, 12, Class8822.method30773("chat.editBox", new Object[0]))).method3397(256);
        this.field3192.method3401(false);
        this.field3192.method3377(this.field3193);
        this.field3192.method3374(this::method3089);
        this.field3149.add(this.field3192);
        (this.field3194 = new Class6823(this.field3150, this, this.field3192, this.field3156, false, false, 1, 10, true, -805306368)).method20890();
        this.method3476(this.field3192);
    }
    
    @Override
    public void method2970(final Class869 class869, final int n, final int n2) {
        final String method3378 = this.field3192.method3378();
        this.method3038(class869, n, n2);
        this.method3091(method3378);
        this.field3194.method20890();
    }
    
    @Override
    public void method2971() {
        this.field3150.field4651.method22505(false);
        this.field3150.field4647.method3807().method3767();
    }
    
    @Override
    public void method2992() {
        this.field3192.method3376();
    }
    
    private void method3089(final String s) {
        this.field3194.method20885(!this.field3192.method3378().equals(this.field3193));
        this.field3194.method20890();
    }
    
    @Override
    public boolean method2972(final int n, final int n2, final int n3) {
        if (this.field3194.method20886(n, n2, n3)) {
            return true;
        }
        if (super.method2972(n, n2, n3)) {
            return true;
        }
        if (n == 256) {
            this.field3150.method5244(null);
            return true;
        }
        if (n == 257 || n == 335) {
            final String trim = this.field3192.method3378().trim();
            if (!trim.isEmpty()) {
                this.method3036(trim);
            }
            this.field3150.method5244(null);
            return true;
        }
        if (n == 265) {
            this.method3090(-1);
            return true;
        }
        if (n == 264) {
            this.method3090(1);
            return true;
        }
        if (n == 266) {
            this.field3150.field4647.method3807().method3768(this.field3150.field4647.method3807().method3777() - 1);
            return true;
        }
        if (n != 267) {
            return false;
        }
        this.field3150.field4647.method3807().method3768(-this.field3150.field4647.method3807().method3777() + 1);
        return true;
    }
    
    @Override
    public boolean method3012(final double n, final double n2, double n3) {
        if (n3 > 1.0) {
            n3 = 1.0;
        }
        if (n3 < -1.0) {
            n3 = -1.0;
        }
        if (!this.field3194.method20887(n3)) {
            if (!Class527.method3047()) {
                n3 *= 7.0;
            }
            this.field3150.field4647.method3807().method3768(n3);
            return true;
        }
        return true;
    }
    
    @Override
    public boolean method2982(final double n, final double n2, final int n3) {
        if (!this.field3194.method20888((int)n, (int)n2, n3)) {
            if (n3 == 0) {
                final ITextComponent method3769 = this.field3150.field4647.method3807().method3769(n, n2);
                if (method3769 != null) {
                    if (this.method3035(method3769)) {
                        return true;
                    }
                }
            }
            return this.field3192.method2982(n, n2, n3) || super.method2982(n, n2, n3);
        }
        return true;
    }
    
    @Override
    public void method3034(final String s, final boolean b) {
        if (!b) {
            this.field3192.method3381(s);
        }
        else {
            this.field3192.method3377(s);
        }
    }
    
    public void method3090(final int n) {
        final int n2 = this.field3191 + n;
        final int size = this.field3150.field4647.method3807().method3765().size();
        final int method35651 = MathHelper.method35651(n2, 0, size);
        if (method35651 != this.field3191) {
            if (method35651 != size) {
                if (this.field3191 == size) {
                    this.field3190 = this.field3192.method3378();
                }
                this.field3192.method3377(this.field3150.field4647.method3807().method3765().get(method35651));
                this.field3194.method20885(false);
                this.field3191 = method35651;
            }
            else {
                this.field3191 = size;
                this.field3192.method3377(this.field3190);
            }
        }
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.method3470(this.field3192);
        this.field3192.method3395(true);
        Class565.method3293(2, this.field3153 - 14, this.field3152 - 2, this.field3153 - 2, this.field3150.field4648.method17116(Integer.MIN_VALUE));
        this.field3192.method2975(n, n2, n3);
        this.field3194.method20897(n, n2);
        final ITextComponent method3769 = this.field3150.field4647.method3807().method3769(n, n2);
        if (method3769 != null) {
            if (method3769.getStyle().method30411() != null) {
                this.method3033(method3769, n, n2);
            }
        }
        super.method2975(n, n2, n3);
    }
    
    @Override
    public boolean method2991() {
        return false;
    }
    
    private void method3091(final String s) {
        this.field3192.method3377(s);
    }
}
