// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.ClientAssets;
import com.mentalfrostbyte.jello.ClientFonts;
import slick2d.Texture;

import java.awt.image.BufferedImage;

public class Class4917 extends Class4825
{
    public Class7971 field21031;
    private BufferedImage field21032;
    private Texture field21033;
    private Class4840 field21034;
    private boolean field21035;
    private Class9572 field21036;
    private float field21037;
    public Class9572 field21038;
    private int field21039;
    private int field21040;
    private int field21041;
    
    public Class4917(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final Class7971 field21031) {
        super(class4803, s, n, n2, n3, n4, false);
        this.field21031 = null;
        this.field21035 = false;
        this.field21036 = new Class9572(114, 114, Direction.FORWARDS);
        this.field21037 = 0.0f;
        this.field21038 = new Class9572(300, 300, Direction.FORWARDS);
        this.field21039 = 0;
        this.field21040 = 0;
        this.field21041 = ColorUtils.method19120(ClientColors.LIGHT_GREYISH_BLUE.color, ClientColors.field1273.color, 20.0f);
        this.field21031 = field21031;
        this.addVisualThing(this.field21034 = new Class4840(this, "loading", n3 - 50, 35, 30, 30));
        this.field21034.method14305(false);
    }
    
    public void method14761(final boolean b) {
        this.method14762(b, false);
    }
    
    public void method14762(final boolean b, final boolean b2) {
        this.field21036.changeDirection(b ? Direction.BACKWARDS : Direction.FORWARDS);
        if (b2) {
            this.field21036.method35856(1.0f);
        }
    }
    
    public boolean method14763() {
        return this.field21036.getDirection() == Direction.BACKWARDS;
    }
    
    @Override
    public void draw(final float n) {
        this.method14228();
        this.field21041 = ColorUtils.method19120(ClientColors.LIGHT_GREYISH_BLUE.color, ClientColors.field1273.color, 2.0f);
        final int method14392 = ((Class4817)this.field20475.method14267()).method14392();
        final int max = Math.max(0, this.field20479 - method14392);
        final int max2 = Math.max(0, this.field20481 + Math.min(100, this.field20479 - method14392 - max));
        final float n2 = Math.min(50, max2) / 50.0f;
        final int n3 = this.method14267().method14267().method14278() + this.method14267().method14267().method14281();
        int n4 = 0;
        final int n5 = max + method14392;
        if (n5 - method14392 > n3) {
            ++n4;
            return;
        }
        if (n2 == 0.0f) {
            return;
        }
        RenderUtil.method26917(this.field20478, n5, this.field20480, Math.max(20, max2), ColorUtils.applyAlpha(this.method14309() ? this.field21041 : ClientColors.LIGHT_GREYISH_BLUE.color, n2));
        RenderUtil.method26871(this.field20478, n5, this.field20478 + this.field20480 + 20, n5 + max2, true);
        if (this.field21031 != null) {
            this.method14764();
            this.method14765();
            this.method14766(n2);
            if (this.field21036.calcPercent() > 0.0f) {
                if (max2 > 55) {
                    RenderUtil.method26899((float)(this.field20478 + this.method14276()), n5 + 26 * max2 / 100.0f, 18.0f * this.field21036.calcPercent() * max2 / 100.0f, 47 * max2 / 100.0f, ClientAssets.select, this.method14309() ? this.field21041 : ClientColors.LIGHT_GREYISH_BLUE.color);
                }
            }
            super.draw(n * n2);
            RenderUtil.method26872();
        }
    }
    
    public void method14764() {
        RenderUtil.method26900((float)(this.field20478 + 13), (float)(this.field20479 + 13), 75.0f, 75.0f, this.field21031.method25899(), ClientColors.LIGHT_GREYISH_BLUE.color, true);
        RenderUtil.method26914((float)(this.field20478 + 13), (float)(this.field20479 + 13), 75.0f, 75.0f, 20.0f, 1.0f);
        RenderUtil.method26899((float)(this.field20478 + 1), (float)this.field20479, 100.0f, 100.0f, ClientAssets.cercle, this.method14309() ? this.field21041 : ClientColors.LIGHT_GREYISH_BLUE.color);
    }
    
    public void method14765() {
        if (this.field21031.method25912()) {
            RenderUtil.drawString(ClientFonts.JelloLight25, (float)(this.field20478 + 110), (float)(this.field20479 + 18), this.field21031.method25888(), ClientColors.field1273.color);
            RenderUtil.drawString(ClientFonts.JelloLight14, (float)(this.field20478 + 110), (float)(this.field20479 + 50), "Username: " + this.field21031.method25888(), ClientColors.field1281.color);
            RenderUtil.drawString(ClientFonts.JelloLight14, (float)(this.field20478 + 110), (float)(this.field20479 + 65), "Offline account", ClientColors.field1281.color);
        }
        else {
            RenderUtil.drawString(ClientFonts.JelloLight25, (float)(this.field20478 + 110), (float)(this.field20479 + 18), this.field21031.method25889(), ClientColors.field1273.color);
            RenderUtil.drawString(ClientFonts.JelloLight14, (float)(this.field20478 + 110), (float)(this.field20479 + 50), "Email: " + this.field21031.method25888(), ClientColors.field1281.color);
            RenderUtil.drawString(ClientFonts.JelloLight14, (float)(this.field20478 + 110), (float)(this.field20479 + 65), "Password: " + this.field21031.method25892().replaceAll(".", Character.toString('·')), ClientColors.field1281.color);
        }
    }
    
    public void method14766(final float n) {
        this.field21037 += (this.field21035 ? 0.33333334f : -0.33333334f);
        this.field21037 = Math.min(1.0f, Math.max(0.0f, this.field21037));
        this.field21039 = Math.max(0, this.field21039 - 1);
        final float n2 = (this.field21039 <= 20) ? 20.0f : -20.0f;
        RenderUtil.method26899((float)(this.field20478 + this.field20480 - 45), (float)(this.field20479 + 42), 17.0f, 17.0f, ClientAssets.errors, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, ((this.field21039 >= n2 && this.field21039 <= this.field21040 - n2) ? 1.0f : (this.field21039 % n2 / n2)) * n));
        RenderUtil.method26899((float)(this.field20478 + this.field20480 - 45), (float)(this.field20479 + 45), 17.0f, 13.0f, ClientAssets.active, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, this.field21037 * n));
    }
    
    public void method14767(final boolean field21035) {
        this.field21035 = field21035;
    }
    
    public void method14768(final int n) {
        this.field21039 = n;
        this.field21040 = n;
    }
    
    public void method14769(final boolean b) {
        this.field21034.method14305(b);
    }
}
