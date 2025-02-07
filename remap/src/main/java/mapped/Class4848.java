// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import slick2d.TrueTypeFont;

public class Class4848 extends Class4841
{
    private static String[] field20591;
    private float field20772;
    public boolean field20773;
    
    public static float method14534(final float n, final float n2, final float n3) {
        return (n3 - n) / (n2 - n);
    }
    
    public static float method14535(final float n, final float n2, final float n3, final float n4, final int n5) {
        return Math.round((n2 + n * (Math.abs(n3 - n2) / n4) * n4) * Math.pow(10.0, n5)) / (float)Math.pow(10.0, n5);
    }
    
    public Class4848(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4) {
        super(customGuiScreen, s, n, n2, n3, n4, false);
        this.field20773 = false;
        this.method14536();
    }
    
    public Class4848(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final ColorHelper class4804) {
        super(customGuiScreen, s, n, n2, n3, n4, class4804, false);
        this.field20773 = false;
        this.method14536();
    }
    
    public Class4848(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final ColorHelper class4804, final String s2) {
        super(customGuiScreen, s, n, n2, n3, n4, class4804, s2, false);
        this.field20773 = false;
        this.method14536();
    }
    
    public Class4848(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final ColorHelper class4804, final String s2, final TrueTypeFont class4805) {
        super(customGuiScreen, s, n, n2, n3, n4, class4804, s2, class4805, false);
        this.field20773 = false;
        this.method14536();
    }
    
    private void method14536() {
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        final int n3 = this.method14320() - this.method14280();
        if (this.field20773) {
            this.method14539(n3 / (float)this.method14276());
        }
        super.method14200(n, n2);
    }
    
    @Override
    public void draw(final float n) {
        RenderUtil.method26874((float)(this.x + this.field20480), (float)(this.y + 1), 1.0f, (float)(this.field20481 - 2), -8882056);
        RenderUtil.method26874((float)(this.x + 1), (float)this.y, (float)(this.field20480 - 1), (float)this.field20481, -8882056);
        RenderUtil.method26874((float)this.x, (float)(this.y + 1), 1.0f, (float)(this.field20481 - 2), -6250336);
        RenderUtil.method26874((float)(this.x + 1), (float)this.y, this.field20480 * this.field20772 - 1.0f, (float)this.field20481, -6250336);
        this.method14537(Math.round(this.x + this.field20480 * this.field20772) - 2, this.y - 3);
        super.draw(n);
    }
    
    public void method14537(final int n, final int n2) {
        RenderUtil.method26874((float)(n + 1), (float)(n2 + 1), 4.0f, 8.0f, -3618616);
        RenderUtil.method26874((float)(n + 1), (float)(n2 + 1), 1.0f, 1.0f, -4934476);
        RenderUtil.method26874((float)(n + 4), (float)(n2 + 1), 1.0f, 1.0f, -4934476);
        RenderUtil.method26874((float)(n + 1), (float)(n2 + 8), 1.0f, 1.0f, -4934476);
        RenderUtil.method26874((float)(n + 4), (float)(n2 + 8), 1.0f, 1.0f, -4934476);
        RenderUtil.method26874((float)n, (float)(n2 + 1), 1.0f, 8.0f, -4934476);
        RenderUtil.method26874((float)(n + 5), (float)(n2 + 1), 1.0f, 8.0f, -4934476);
        RenderUtil.method26874((float)(n + 1), (float)n2, 4.0f, 1.0f, -4934476);
        RenderUtil.method26874((float)(n + 1), (float)(n2 + 9), 4.0f, 1.0f, -4934476);
    }
    
    @Override
    public boolean method14211(final int n, final int n2, final int n3) {
        this.field20773 = true;
        return super.method14211(n, n2, n3);
    }
    
    @Override
    public void method14233(final int n, final int n2, final int n3) {
        this.field20773 = false;
    }
    
    public float method14538() {
        return this.field20772;
    }
    
    public void method14539(final float n) {
        this.method14540(n, true);
    }
    
    public void method14540(float min, final boolean b) {
        min = Math.min(Math.max(min, 0.0f), 1.0f);
        final float field20772 = this.field20772;
        this.field20772 = min;
        if (b) {
            if (field20772 != min) {
                this.method14517();
            }
        }
    }
}
