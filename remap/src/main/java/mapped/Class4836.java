// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.ClientAssets;
import com.mentalfrostbyte.jello.ClientFonts;
import slick2d.Texture;

import java.awt.image.BufferedImage;

public class Class4836 extends Class4825
{
    public Class7971 field20723;
    private BufferedImage field20724;
    private Texture field20725;
    private float field20726;
    private LoadingIndicator field20727;
    private boolean field20728;
    private float field20729;
    private int field20730;
    private int field20731;
    private int field20732;
    
    public Class4836(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final Class7971 field20723) {
        super(customGuiScreen, s, n, n2, n3, n4, false);
        this.field20723 = null;
        this.field20726 = 0.0f;
        this.field20728 = false;
        this.field20729 = 0.0f;
        this.field20730 = 0;
        this.field20731 = 0;
        this.field20732 = ColorUtils.method19120(ClientColors.LIGHT_GREYISH_BLUE.color, ClientColors.DEEP_TEAL.color, 20.0f);
        this.field20723 = field20723;
        this.addToList(this.field20727 = new LoadingIndicator(this, "loading", n3 - 50, 35, 30, 30));
        this.field20727.method14305(false);
    }
    
    public void method14505(final boolean b) {
        this.method14506(b, false);
    }
    
    public void method14506(final boolean field20728, final boolean b) {
        this.field20728 = field20728;
        if (b) {
            this.field20726 = 1.0f;
        }
    }
    
    public boolean method14507() {
        return this.field20728;
    }
    
    @Override
    public void draw(final float n) {
        this.method14228();
        this.field20726 += (float)(this.field20728 ? 0.2 : -0.2);
        this.field20726 = Math.min(1.0f, Math.max(0.0f, this.field20726));
        this.field20732 = ColorUtils.method19120(ClientColors.LIGHT_GREYISH_BLUE.color, ClientColors.DEEP_TEAL.color, 2.0f);
        Label_0141: {
            if (!this.field20728) {
                if (!this.method14309()) {
                    if (!this.method14308()) {
                        break Label_0141;
                    }
                }
            }
            RenderUtil.method26876((float)this.x, (float)this.y, (float)(this.x + this.field20480), (float)(this.y + this.field20481), ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, 0.05f));
        }
        if (!this.method14309()) {
            if (this.method14308() && this.field20728) {
                RenderUtil.method26879((float)this.x, (float)this.y, (float)(this.x + this.field20480), (float)(this.y + this.field20481), 2, ColorUtils.applyAlpha(ClientColors.MID_GREY.color, 0.5f));
            }
            else if (!this.method14308()) {
                if (this.field20728) {
                    RenderUtil.method26879((float)this.x, (float)this.y, (float)(this.x + this.field20480), (float)(this.y + this.field20481), 2, ColorUtils.applyAlpha(ClientColors.MID_GREY.color, 0.3f));
                }
            }
            else {
                RenderUtil.method26879((float)this.x, (float)this.y, (float)(this.x + this.field20480), (float)(this.y + this.field20481), 2, ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.3f));
            }
        }
        else {
            RenderUtil.method26879((float)this.x, (float)this.y, (float)(this.x + this.field20480), (float)(this.y + this.field20481), 2, ColorUtils.applyAlpha(ClientColors.MID_GREY.color, 0.65f));
        }
        RenderUtil.method26871(this.x, this.y, this.x + this.field20480, this.y + this.field20481, true);
        if (this.field20723 != null) {
            this.method14509();
            RenderUtil.endScissor();
            if (this.field20726 > 0.0f) {
                if (this.field20481 > 55) {
                    RenderUtil.drawImage((float)(this.x + this.method14276()), this.y + 26 * this.field20481 / 100.0f, 18.0f * this.field20726 * this.field20481 / 100.0f, 47 * this.field20481 / 100.0f, ClientAssets.select, this.method14309() ? this.field20732 : ClientColors.LIGHT_GREYISH_BLUE.color);
                }
            }
            super.draw(n);
        }
    }
    
    public void method14508() {
        RenderUtil.method26900((float)(this.x + 13), (float)(this.y + 13), 75.0f, 75.0f, this.field20723.method25899(), ClientColors.LIGHT_GREYISH_BLUE.color, true);
        RenderUtil.method26914((float)(this.x + 13), (float)(this.y + 13), 75.0f, 75.0f, 20.0f, 1.0f);
        RenderUtil.drawImage((float)(this.x + 1), (float)this.y, 100.0f, 100.0f, ClientAssets.cercle, this.method14309() ? this.field20732 : ClientColors.LIGHT_GREYISH_BLUE.color);
    }
    
    public void method14509() {
        String s = this.field20723.method25889();
        if (s.equals("Unknown name")) {
            s = this.field20723.method25888();
        }
        RenderUtil.method26890(ClientFonts.Default, (float)(this.x + this.field20480 / 2), (float)(this.y + 20), s, ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.4f), Class2056.field11738, Class2056.field11738);
        RenderUtil.method26890(ClientFonts.Default, (float)(this.x + this.field20480 / 2), (float)(this.y + 18), s, ClientColors.LIGHT_GREYISH_BLUE.color, Class2056.field11738, Class2056.field11738);
        if (!this.field20723.method25912()) {
            RenderUtil.method26891(ClientFonts.Default, (float)(this.x + this.field20480 / 2), (float)(this.y + 32), this.field20723.method25892().replaceAll(".", "*"), -8355712, Class2056.field11738, Class2056.field11735, true);
        }
        else {
            RenderUtil.method26891(ClientFonts.Default, (float)(this.x + this.field20480 / 2), (float)(this.y + 29), "Cracked", ClientColors.PALE_YELLOW.color, Class2056.field11738, Class2056.field11735, true);
        }
    }
    
    public void method14510(final int n) {
        this.field20730 = n;
        this.field20731 = n;
    }
    
    public void method14511(final boolean b) {
        this.field20727.method14305(b);
    }
}
