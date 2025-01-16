// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;

public class Class535 extends Screen
{
    private String field3190;
    private int field3191;
    public Class576 field3192;
    private String field3193;
    private Class6823 field3194;
    
    public Class535(final String field3193) {
        super(NarratorChatListener.EMPTY);
        this.field3190 = "";
        this.field3191 = -1;
        this.field3193 = "";
        this.field3193 = field3193;
    }
    
    @Override
    public void init() {
        this.minecraft.field4651.method22505(true);
        this.field3191 = this.minecraft.field4647.method3807().method3765().size();
        (this.field3192 = new Class578(this, this.font, 4, this.height - 12, this.width - 4, 12, Class8822.method30773("chat.editBox", new Object[0]))).method3397(256);
        this.field3192.method3401(false);
        this.field3192.method3377(this.field3193);
        this.field3192.method3374(this::method3089);
        this.children.add(this.field3192);
        (this.field3194 = new Class6823(this.minecraft, this, this.field3192, this.font, false, false, 1, 10, true, -805306368)).method20890();
        this.method3476(this.field3192);
    }
    
    @Override
    public void method2970(final Minecraft class869, final int n, final int n2) {
        final String method3378 = this.field3192.method3378();
        this.init(class869, n, n2);
        this.method3091(method3378);
        this.field3194.method20890();
    }
    
    @Override
    public void removed() {
        this.minecraft.field4651.method22505(false);
        this.minecraft.field4647.method3807().method3767();
    }
    
    @Override
    public void tick() {
        this.field3192.method3376();
    }
    
    private void method3089(final String s) {
        this.field3194.method20885(!this.field3192.method3378().equals(this.field3193));
        this.field3194.method20890();
    }
    
    @Override
    public boolean keyPressed(final int n, final int n2, final int n3) {
        if (this.field3194.method20886(n, n2, n3)) {
            return true;
        }
        if (super.keyPressed(n, n2, n3)) {
            return true;
        }
        if (n == 256) {
            this.minecraft.method5244(null);
            return true;
        }
        if (n == 257 || n == 335) {
            final String trim = this.field3192.method3378().trim();
            if (!trim.isEmpty()) {
                this.method3036(trim);
            }
            this.minecraft.method5244(null);
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
            this.minecraft.field4647.method3807().method3768(this.minecraft.field4647.method3807().method3777() - 1);
            return true;
        }
        if (n != 267) {
            return false;
        }
        this.minecraft.field4647.method3807().method3768(-this.minecraft.field4647.method3807().method3777() + 1);
        return true;
    }
    
    @Override
    public boolean mouseScrolled(final double n, final double n2, double n3) {
        if (n3 > 1.0) {
            n3 = 1.0;
        }
        if (n3 < -1.0) {
            n3 = -1.0;
        }
        if (!this.field3194.method20887(n3)) {
            if (!Screen.method3047()) {
                n3 *= 7.0;
            }
            this.minecraft.field4647.method3807().method3768(n3);
            return true;
        }
        return true;
    }
    
    @Override
    public boolean mouseClicked(final double n, final double n2, final int n3) {
        if (!this.field3194.method20888((int)n, (int)n2, n3)) {
            if (n3 == 0) {
                final ITextComponent method3769 = this.minecraft.field4647.method3807().method3769(n, n2);
                if (method3769 != null) {
                    if (this.method3035(method3769)) {
                        return true;
                    }
                }
            }
            return this.field3192.mouseClicked(n, n2, n3) || super.mouseClicked(n, n2, n3);
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
        final int size = this.minecraft.field4647.method3807().method3765().size();
        final int method35651 = MathHelper.method35651(n2, 0, size);
        if (method35651 != this.field3191) {
            if (method35651 != size) {
                if (this.field3191 == size) {
                    this.field3190 = this.field3192.method3378();
                }
                this.field3192.method3377(this.minecraft.field4647.method3807().method3765().get(method35651));
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
        this.setFocused(this.field3192);
        this.field3192.method3395(true);
        Class565.method3293(2, this.height - 14, this.width - 2, this.height - 2, this.minecraft.field4648.method17116(Integer.MIN_VALUE));
        this.field3192.method2975(n, n2, n3);
        this.field3194.method20897(n, n2);
        final ITextComponent method3769 = this.minecraft.field4647.method3807().method3769(n, n2);
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
