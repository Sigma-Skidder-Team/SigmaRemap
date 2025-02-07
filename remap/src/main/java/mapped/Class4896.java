// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.ClientFonts;

import java.util.Date;

public class Class4896 extends Class4841
{
    public float field20937;
    public Class8799 field20938;
    public Date field20939;
    public int field20940;
    public Date field20941;
    public Class4893 field20942;
    
    public Class4896(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final Class8799 field20938, final int field20939) {
        super(customGuiScreen, s, n, n2, n3, n4, false);
        this.addToList(this.field20942 = new Class4893(this, "delete", 200, 20, 20, 20));
        this.field20942.doThis((class4803, n) -> {
            this.field20939 = new Date();
            this.method14517();
        });
        this.field20938 = field20938;
        this.field20940 = field20939;
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
    }
    
    public void method14703() {
        this.method14279(0);
        this.field20941 = new Date();
    }
    
    @Override
    public void draw(final float n) {
        if (this.field20941 != null) {
            final float method25030 = Class7791.method25030(Animation.method35860(this.field20941, 150.0f), 0.0f, 1.0f, 1.0f);
            this.method14279((int)(55.0f * method25030));
            if (method25030 == 1.0f) {
                this.field20941 = null;
            }
        }
        if (this.field20939 != null) {
            final float method25031 = Class7791.method25030(Animation.method35860(this.field20939, 180.0f), 0.0f, 1.0f, 1.0f);
            this.method14279((int)(55.0f * (1.0f - method25031)));
            if (method25031 == 1.0f) {
                this.field20939 = null;
            }
        }
        RenderUtil.method26871(this.x, this.y, this.x + this.field20480, this.y + this.field20481, true);
        RenderUtil.drawString(ClientFonts.Regular20, (float)(this.x + 25), this.y + this.field20481 / 2.0f - 17.5f, this.field20938.method30702(), ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.6f * n));
        RenderUtil.drawString(ClientFonts.JelloLight12, (float)(this.x + 25), this.y + this.field20481 / 2.0f + 7.5f, this.field20938.method30703(), ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.6f * n));
        this.field20942.method14275((int)(this.field20481 / 2.0f - 7.5f));
        super.draw(n);
        RenderUtil.endScissor();
    }
}
