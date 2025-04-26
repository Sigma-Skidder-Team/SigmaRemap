// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.io.IOException;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientFonts;
import com.mentalfrostbyte.jello.util.system.network.ImageUtil;
import org.lwjgl.opengl.GL11;
import slick2d.Texture;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class Class4847 extends Class4841
{
    public int field20767;
    public List<Class7015> field20768;
    public int field20769;
    public boolean field20770;
    private Texture field20771;
    
    public Class4847(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4) {
        super(customGuiScreen, s, n, n2, n3, n4, false);
        this.field20768 = new ArrayList<Class7015>();
        this.field20769 = 0;
        this.field20770 = true;
        this.setListening(false);
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
        if (this.field20492) {
            if (this.field20769 <= 0) {
                if (n2 >= this.method14281() + this.method14278() / 2) {
                    ((Class4901)this.field20475).method14717(false);
                    this.field20768.add(new Class7015(this, false));
                }
                else {
                    ((Class4901)this.field20475).method14717(true);
                    this.field20768.add(new Class7015(this, true));
                }
                if (this.field20769 != 0) {
                    this.field20769 = 14;
                }
                else {
                    this.field20769 = 3;
                }
            }
        }
        --this.field20769;
        if (!this.field20492) {
            this.field20769 = -1;
        }
    }
    
    public void finalize() throws Throwable {
        try {
            if (this.field20771 != null) {
                Client.getInstance().addTexture(this.field20771);
            }
        }
        finally {
            super.finalize();
        }
    }
    
    @Override
    public void draw(final float n) {
        final Iterator<Class7015> iterator = this.field20768.iterator();
        final int n2 = 8;
        try {
            if (this.field20770) {
                final java.awt.image.BufferedImage method20833 = ImageUtil.method20833(this.method14280(), this.method14281(), this.field20480, this.field20481, 3, 10, true);
                this.field20767 = ColorUtils.method19110(new Color(method20833.getRGB(6, 7)), new Color(method20833.getRGB(6, 22))).getRGB();
                this.field20767 = ColorUtils.method19121(this.field20767, 0.25f);
                if (this.field20771 != null) {
                    this.field20771.release();
                }
                this.field20771 = BufferedImageUtil.getTexture("blur", method20833);
                this.field20770 = false;
            }
            if (this.field20771 != null) {
                RenderUtil.method26913((float)(this.x + n2), (float)(this.y + n2), (float)(this.field20480 - n2 * 2), (float)(this.field20481 - n2 * 2), 20.0f, n * 0.5f);
                RenderUtil.method26913((float)(this.x + n2), (float)(this.y + n2), (float)(this.field20480 - n2 * 2), (float)(this.field20481 - n2 * 2), 14.0f, n);
                GL11.glPushMatrix();
                RenderUtil.method26926();
                RenderUtil.method26924((float)this.x, (float)this.y, (float)this.field20480, (float)this.field20481, 8.0f, ClientColors.LIGHT_GREYISH_BLUE.color);
                RenderUtil.method26927(Class2225.field13694);
                RenderUtil.method26898((float)(this.x - 1), (float)(this.y - 1), (float)(this.field20480 + 2), (float)(this.field20481 + 2), this.field20771, ClientColors.LIGHT_GREYISH_BLUE.color);
                while (iterator.hasNext()) {
                    final Class7015 class7015 = iterator.next();
                    final int n3 = this.field20481 / 2;
                    final int n4 = this.y + (class7015.field27351 ? 0 : n3);
                    final int n5 = this.field20480 / 2;
                    RenderUtil.method26871(this.x, n4, this.x + this.field20480, n4 + n3, true);
                    RenderUtil.method26886((float)(this.x + n5), (float)(n4 + this.field20481 / 4), (n5 * 2 - 4) * class7015.field27350 + 4.0f, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, (1.0f - class7015.field27350 * (0.5f + class7015.field27350 * 0.5f)) * 0.4f));
                    RenderUtil.endScissor();
                    class7015.field27350 = Math.min(class7015.field27350 + 3.0f / Minecraft.method5338(), 1.0f);
                    if (class7015.field27350 == 1.0f) {
                        iterator.remove();
                    }
                }
                RenderUtil.method26928();
                RenderUtil.method26925((float)this.x, (float)this.y, (float)this.field20480, (float)this.field20481, 6.0f, ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.3f));
                GL11.glPopMatrix();
                RenderUtil.drawString(ClientFonts.JelloMedium20, (float)(this.x + 14), (float)(this.y + 8), "+", ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, 0.8f));
                RenderUtil.method26874((float)(this.x + 16), (float)(this.y + 65), 8.0f, 2.0f, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, 0.8f));
            }
        }
        catch (final IOException ex) {}
        super.draw(n);
    }
}
