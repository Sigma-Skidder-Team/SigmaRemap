// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientAssets;
import com.mentalfrostbyte.jello.ClientFonts;
import slick2d.Texture;
import slick2d.TrueTypeFont;

import java.io.IOException;
import javax.imageio.ImageIO;
import java.net.MalformedURLException;
import java.net.URL;

public class Class4910 extends Class4825
{
    public static Class6523 field21004;
    public URL field21005;
    public java.awt.image.BufferedImage field21006;
    public boolean field21007;
    private Texture field21008;
    private Texture field21009;
    private Class9572 field21010;
    
    public void finalize() throws Throwable {
        try {
            if (this.field21008 != null) {
                Client.getInstance().method35182(this.field21008);
            }
            if (this.field21009 != null) {
                Client.getInstance().method35182(this.field21009);
            }
        }
        finally {
            super.finalize();
        }
    }
    
    public Class4910(final Class4803 class4803, final int n, final int n2, final int n3, final int n4, final Class8681 class4804) {
        super(class4803, class4804.field36486, n, n2, n3, n4, Class4910.field21004, class4804.field36487, false);
        this.field21005 = null;
        this.field21007 = false;
        URL field21005 = null;
        try {
            field21005 = new URL(class4804.field36488);
        }
        catch (final MalformedURLException ex) {
            ex.printStackTrace();
        }
        this.field21005 = field21005;
        this.field21010 = new Class9572(125, 125);
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        final boolean b = this.method14308() && this.method14267().method14267().method14236(n, n2);
        this.field21010.changeDirection(b ? Direction.BACKWARDS : Direction.FORWARDS);
        if (b) {
            Client.getInstance().method35193().method32133(Class9000.field37990);
        }
        super.method14200(n, n2);
    }
    
    public boolean method14750() {
        if (this.method14267() != null) {
            if (this.method14267().method14267() != null) {
                final Class4803 method14267 = this.method14267().method14267();
                if (method14267 instanceof Class4817) {
                    final Class4817 class4817 = (Class4817)method14267;
                    final int n = class4817.method14392() + class4817.method14278() + this.method14278();
                    final int n2 = class4817.method14392() - this.method14278();
                    return this.method14274() <= n && this.method14274() >= n2;
                }
            }
        }
        return true;
    }
    
    @Override
    public void draw(final float n) {
        if (!this.method14750()) {
            if (this.field21008 != null) {
                this.field21008.method24923();
                this.field21008 = null;
            }
            if (this.field21009 != null) {
                this.field21009.method24923();
                this.field21009 = null;
            }
            return;
        }
        if (this.method14750() && !this.field21007) {
            this.field21007 = true;
            new Thread(() -> {
                try {
                    ImageIO.read(this.field21005);
                    final java.awt.image.BufferedImage field40311;
                    if (field40311.getHeight() != field40311.getWidth()) {
                        if (this.method14314().contains("[NCS Release]")) {
                            this.field21006 = field40311.getSubimage(1, 3, 170, 170);
                        }
                        else {
                            this.field21006 = field40311.getSubimage(70, 0, 180, 180);
                        }
                    }
                    else {
                        this.field21006 = field40311;
                    }
                }
                catch (final NumberFormatException | IOException ex3) {
                    ((Throwable)ex3).printStackTrace();
                }
                return;
            }).start();
        }
        final float method35858 = this.field21010.calcPercent();
        final float n2 = (float)Math.round(this.method14272() + 15 - 5.0f * method35858);
        final float n3 = (float)Math.round(this.method14274() + 15 - 5.0f * method35858);
        final float n4 = (float)Math.round(this.method14276() - 30 + 10.0f * method35858);
        final float n5 = (float)Math.round(this.method14276() - 30 + 10.0f * method35858);
        RenderUtil.method26913(this.method14272() + 15 - 5.0f * method35858, this.method14274() + 15 - 5.0f * method35858, this.method14276() - 30 + 10.0f * method35858, this.method14276() - 30 + 10.0f * method35858, 20.0f, n);
        if (this.field21008 != null || this.field21006 != null) {
            if (this.field21008 == null) {
                try {
                    if (this.field21008 != null) {
                        this.field21008.method24923();
                    }
                    this.field21008 = Class9399.method34928("picture", this.field21006);
                }
                catch (final IOException ex) {
                    ex.printStackTrace();
                }
            }
            if (this.field21009 == null && method35858 > 0.0f) {
                try {
                    if (this.field21009 != null) {
                        this.field21009.method24923();
                    }
                    this.field21009 = Class9399.method34928("picture", BufferedImage.method20826(this.field21006, 14));
                }
                catch (final IOException ex2) {
                    ex2.printStackTrace();
                }
            }
            else if (method35858 == 0.0f && this.field21009 != null) {
                this.field21009 = null;
            }
            RenderUtil.method26899(n2, n3, n4, n5, this.field21008, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, n * (1.0f - method35858)));
            if (this.field21009 != null) {
                RenderUtil.method26899(n2, n3, n4, n5, this.field21009, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, method35858 * n));
            }
        }
        else {
            RenderUtil.method26899(n2, n3, n4, n5, ClientAssets.artwork, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, n * (1.0f - method35858)));
            if (this.field21009 != null) {
                RenderUtil.method26899(n2, n3, n4, n5, ClientAssets.artwork, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, method35858 * n));
            }
        }
        int n6 = 50;
        if (this.method14309()) {
            n6 = 40;
        }
        final float n7 = 0.5f + method35858 / 2.0f;
        RenderUtil.method26899(this.method14272() + this.method14276() / 2 - n6 / 2 * n7, this.method14274() + this.method14276() / 2 - n6 / 2 * n7, n6 * n7, n6 * n7, ClientAssets.play, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, method35858 * n));
        final TrueTypeFont field40310 = ClientFonts.JelloLight12;
        if (this.field20495 != null) {
            RenderUtil.method26865(this);
            final String[] split = this.method14314().replaceAll("\\(.*\\)", "").replaceAll("\\[.*\\]", "").split(" - ");
            if (split.length > 1) {
                RenderUtil.drawString(field40310, (float)(this.method14272() + (this.method14276() - field40310.getWidth(split[1])) / 2), (float)(this.method14274() + this.method14276() - 2), split[1], ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, n));
                RenderUtil.drawString(field40310, (float)(this.method14272() + (this.method14276() - field40310.getWidth(split[0])) / 2), (float)(this.method14274() + this.method14276() - 2 + 13), split[0], ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, n));
            }
            else {
                RenderUtil.drawString(field40310, (float)(this.method14272() + (this.method14276() - field40310.getWidth(split[0])) / 2), (float)(this.method14274() + this.method14276() - 2 + 6), split[0], ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, n));
            }
            RenderUtil.method26872();
        }
    }
    
    static {
        Class4910.field21004 = new Class6523(ClientColors.field1273.color, ClientColors.field1273.color, ClientColors.field1273.color, ClientColors.field1273.color, Class2056.field11734, Class2056.field11738);
    }
}
