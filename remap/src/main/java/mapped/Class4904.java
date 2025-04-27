// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.awt.Color;

public class Class4904 extends Panel
{
    private static String[] field20978;
    public float field20979;
    private float field20980;
    private float field20981;
    public boolean field20982;
    
    public Class4904(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final float field20979, final float field20980, final float field20981) {
        super(customGuiScreen, s, n, n2, n3, n4, false);
        this.field20980 = 0.0f;
        this.field20981 = 1.0f;
        this.field20982 = false;
        this.field20979 = field20979;
        this.field20980 = field20980;
        this.field20981 = field20981;
    }
    
    public void method14729(final float field20979) {
        this.field20979 = field20979;
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        if (this.field20982) {
            this.method14731((this.method14320() - this.method14280()) / (float)this.method14276());
            this.method14734(1.0f - (this.method14321() - this.method14281()) / (float)this.method14278());
        }
        super.method14200(n, n2);
    }
    
    @Override
    public void draw(final float n) {
        final int method19118 = ColorUtils.applyAlpha(Color.HSBtoRGB(this.field20979, 0.0f, 1.0f), n);
        final int method19119 = ColorUtils.applyAlpha(Color.HSBtoRGB(this.field20979, 1.0f, 1.0f), n);
        final int method19120 = ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, n);
        RenderUtil.method26865(this);
        RenderUtil.method26882(this.method14272(), this.method14274(), this.method14272() + this.method14276(), this.method14274() + this.method14278(), method19118, method19119, method19119, method19118);
        RenderUtil.method26882(this.method14272(), this.method14274(), this.method14272() + this.method14276(), this.method14274() + this.method14278(), ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.0f), ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.0f), method19120, method19120);
        Class4885.method14626(this.x + Math.round(this.field20480 * this.method14730()), this.y + Math.round(this.field20481 * (1.0f - this.method14733())), Color.HSBtoRGB(this.field20979, this.field20980, this.field20981), n);
        RenderUtil.method26878((float)this.method14272(), (float)this.method14274(), (float)(this.method14272() + this.method14276()), (float)(this.method14274() + this.method14278()), ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.25f * n));
        RenderUtil.endScissor();
        super.draw(n);
    }
    
    @Override
    public boolean method14211(final int n, final int n2, final int n3) {
        this.field20982 = true;
        return super.method14211(n, n2, n3);
    }
    
    @Override
    public void method14233(final int n, final int n2, final int n3) {
        this.field20982 = false;
    }
    
    public float method14730() {
        return this.field20980;
    }
    
    public void method14731(final float n) {
        this.method14732(n, true);
    }
    
    public void method14732(float min, final boolean b) {
        min = Math.min(Math.max(min, 0.0f), 1.0f);
        final float field20980 = this.field20980;
        this.field20980 = min;
        if (b) {
            if (field20980 != min) {
                this.method14517();
            }
        }
    }
    
    public float method14733() {
        return this.field20981;
    }
    
    public void method14734(final float n) {
        this.method14735(n, true);
    }
    
    public void method14735(float min, final boolean b) {
        min = Math.min(Math.max(min, 0.0f), 1.0f);
        final float field20981 = this.field20981;
        this.field20981 = min;
        if (b) {
            if (field20981 != min) {
                this.method14517();
            }
        }
    }
    
    public int method14736() {
        return Color.HSBtoRGB(this.field20979, this.field20980, this.field20981);
    }
}
