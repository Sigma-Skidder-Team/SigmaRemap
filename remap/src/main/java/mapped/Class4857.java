// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.ClientFonts;
import slick2d.TrueTypeFont;

import java.util.Iterator;

public class Class4857 extends Class4841
{
    public final int field20807;
    private float field20808;
    private boolean field20809;
    private boolean field20810;
    
    public Class4857(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final String s2, final int field20807) {
        super(customGuiScreen, s, n, n2, n3, n4, ColorHelper.field25964, s2, false);
        this.field20809 = false;
        this.field20810 = false;
        this.field20807 = field20807;
        this.method14570();
    }
    
    public void method14570() {
        final Iterator<Class8799> iterator = Class4940.method14874().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().method30705() != this.field20807) {
                continue;
            }
            this.field20810 = true;
            return;
        }
        this.field20810 = false;
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
        this.field20808 = Math.max(0.0f, Math.min(1.0f, this.field20808 + 0.2f * ((!this.method14309() && !this.field20809) ? -1 : 1)));
    }
    
    @Override
    public void draw(final float n) {
        RenderUtil.method26924((float)this.x, (float)(this.y + 5), (float)this.field20480, (float)this.field20481, 8.0f, ColorUtils.method19120(-3092272, -2171170, this.field20808));
        RenderUtil.method26924((float)this.x, this.y + 3.0f * this.field20808, (float)this.field20480, (float)this.field20481, 8.0f, -986896);
        TrueTypeFont class7524 = ClientFonts.JelloLight20;
        if (this.field20495.contains("Lock")) {
            RenderUtil.method26888((float)(this.x + 14), this.y + 11 + 3.0f * this.field20808, 10.0f, ColorUtils.applyAlpha(ClientColors.DARK_SLATE_GREY.color, this.field20808));
        }
        if (!this.field20495.equals("Return")) {
            if (!this.field20495.equals("Back")) {
                if (!this.field20495.equals("Meta")) {
                    if (!this.field20495.equals("Menu")) {
                        if (!this.field20495.equals("Space")) {
                            if (this.field20810) {
                                class7524 = ClientFonts.Regular20;
                            }
                            RenderUtil.drawString(class7524, (float)(this.x + (this.field20480 - class7524.getWidth(this.field20495)) / 2), this.y + 19 + 3.0f * this.field20808, this.field20495, ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.4f + (this.field20810 ? 0.2f : 0.0f)));
                        }
                    }
                    else {
                        final int n2 = this.x + 25;
                        final int n3 = this.y + 25 + (int)(3.0f * this.field20808);
                        RenderUtil.method26878((float)n2, (float)n3, (float)(n2 + 14), (float)(n3 + 3), ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.3f + (this.field20810 ? 0.2f : 0.0f)));
                        RenderUtil.method26876((float)n2, (float)(n3 + 4), (float)(n2 + 14), (float)(n3 + 7), ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.3f + (this.field20810 ? 0.2f : 0.0f)));
                        RenderUtil.method26878((float)n2, (float)(n3 + 8), (float)(n2 + 14), (float)(n3 + 11), ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.3f + (this.field20810 ? 0.2f : 0.0f)));
                        RenderUtil.method26878((float)n2, (float)(n3 + 12), (float)(n2 + 14), (float)(n3 + 15), ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.3f + (this.field20810 ? 0.2f : 0.0f)));
                    }
                }
                else {
                    RenderUtil.method26888((float)(this.x + 32), (float)(this.y + 32 + (int)(3.0f * this.field20808)), 14.0f, ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.3f + (this.field20810 ? 0.2f : 0.0f)));
                }
            }
            else {
                final int n4 = this.x + 43;
                final int n5 = this.y + 33 + (int)(3.0f * this.field20808);
                RenderUtil.method26884((float)n4, (float)n5, (float)(n4 + 6), (float)(n5 - 3), (float)(n4 + 6), (float)(n5 + 3), ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.3f + (this.field20810 ? 0.2f : 0.0f)));
                RenderUtil.method26876((float)(n4 + 6), (float)(n5 - 1), (float)(n4 + 27), (float)(n5 + 1), ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.3f + (this.field20810 ? 0.2f : 0.0f)));
            }
        }
        else {
            final int n6 = this.x + 50;
            final int n7 = this.y + 33 + (int)(3.0f * this.field20808);
            RenderUtil.method26884((float)n6, (float)n7, (float)(n6 + 6), (float)(n7 - 3), (float)(n6 + 6), (float)(n7 + 3), ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.3f + (this.field20810 ? 0.2f : 0.0f)));
            RenderUtil.method26876((float)(n6 + 6), (float)(n7 - 1), (float)(n6 + 27), (float)(n7 + 1), ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.3f + (this.field20810 ? 0.2f : 0.0f)));
            RenderUtil.method26876((float)(n6 + 25), (float)(n7 - 8), (float)(n6 + 27), (float)(n7 - 1), ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.3f + (this.field20810 ? 0.2f : 0.0f)));
        }
        super.draw(n);
    }
    
    @Override
    public void method14204(final int n) {
        if (n == this.field20807) {
            this.field20809 = true;
        }
        super.method14204(n);
    }
    
    @Override
    public void method14231(final int n) {
        if (n == this.field20807) {
            this.field20809 = false;
        }
        super.method14231(n);
    }
}
