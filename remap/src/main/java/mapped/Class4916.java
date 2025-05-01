// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.awt.geom.AffineTransform;
import javax.imageio.ImageIO;
import java.io.ByteArrayInputStream;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientAssets;
import com.mentalfrostbyte.jello.ClientFonts;
import com.mentalfrostbyte.jello.util.system.network.ImageUtil;
import org.apache.commons.codec.binary.Base64;
import java.util.Date;
import org.lwjgl.opengl.GL11;
import org.newdawn.slick.Texture;

import java.io.IOException;

public class Class4916 extends Class4825
{
    public Class8848 field21025;
    public ServerData field21026;
    public Texture field21027;
    public Texture field21028;
    private java.awt.image.BufferedImage field21029;
    private final Animation field21030;
    
    public Class4916(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final Class8848 field21025) {
        super(customGuiScreen, s, n, n2, n3, n4, false);
        this.field21025 = null;
        this.field21026 = null;
        this.field21027 = null;
        this.field21028 = null;
        this.field21025 = field21025;
        this.field21026 = field21025.method30982();
        this.field21030 = new Animation(200, 200, Direction.FORWARDS);
    }
    
    protected void finalize() throws Throwable {
        try {
            if (this.field21028 != null) {
                Client.getInstance().addTexture(this.field21028);
            }
            if (this.field21027 != null) {
                Client.getInstance().addTexture(this.field21027);
            }
        }
        finally {
            super.finalize();
        }
    }
    
    @Override
    public void draw(final float partialTicks) {
        this.translate();
        float n2 = Class7707.method24584(this.field21030.calcPercent(), 0.0f, 1.0f, 1.0f);
        final float method25029 = Class7791.method25029(this.field21030.calcPercent(), 0.0f, 1.0f, 1.0f);
        if (this.method14308()) {
            this.field21030.changeDirection(Direction.BACKWARDS);
        }
        else if (Math.abs(n2 - method25029) < 0.7) {
            this.field21030.changeDirection(Direction.FORWARDS);
        }
        if (this.method14281() + this.method14291() < Minecraft.getInstance().window.method7695() - 36 && this.method14281() + this.method14291() > 52) {
            if (this.field21026 != null && this.field21028 == null) {
                try {
                    final java.awt.image.BufferedImage method25030 = method14759(this.field21026.method35869());
                    if (method25030 != null) {
                        this.field21027 = BufferedImageUtil.getTexture("servericon", method25030);
                        this.field21028 = BufferedImageUtil.getTexture("servericon", ImageUtil.applyBlur(ImageUtil.method20836(method14760(method25030, 2.5, 2.5), 0.0f, 1.1f, 0.0f), 25));
                    }
                }
                catch (final IOException ex) {
                    ex.printStackTrace();
                }
            }
            RenderUtil.method26865(this);
            RenderUtil.method26876((float)this.x, (float)this.y, (float)(this.x + this.field20480), (float)(this.y + this.field20481), ClientColors.LIGHT_GREYISH_BLUE.color);
            GL11.glTexParameteri(3553, 10241, 9728);
            GL11.glPushMatrix();
            final int n3 = this.field20480 / 2;
            final int n4 = this.field20481 / 2;
            if (this.field21030.getDirection() == Direction.FORWARDS) {
                n2 = Class7791.method25029(this.field21030.calcPercent(), 0.0f, 1.0f, 1.0f);
            }
            GL11.glTranslatef((float)(this.method14272() + n3), (float)(this.method14274() + n4), 0.0f);
            GL11.glScaled(1.0 + 0.4 * n2, 1.0 + 0.4 * n2, 0.0);
            GL11.glTranslatef((float)(-this.method14272() - n3), (float)(-this.method14274() - n4), 0.0f);
            if (this.field21028 != null) {
                RenderUtil.drawImage((float)this.x, (float)(this.y - (this.field20480 - this.field20481) / 2), (float)this.field20480, (float)this.field20480, this.field21028, AllUtils.applyAlpha(AllUtils.method19120(ClientColors.LIGHT_GREYISH_BLUE.color, ClientColors.DEEP_TEAL.color, 0.7f), 0.8f));
            }
            GL11.glPopMatrix();
            RenderUtil.endScissor();
            RenderUtil.method26876((float)this.x, (float)this.y, (float)(this.x + this.field20480), (float)(this.y + this.field20481), AllUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.3f + 0.3f * this.field21030.calcPercent()));
        }
        if (this.field21025 == null) {
            return;
        }
        if (this.field21026 == null) {
            return;
        }
        this.method14757();
        this.method14758();
        ClientAssets.shout.bind();
        ClientAssets.shout.bind();
        super.draw(partialTicks);
    }
    
    public void method14757() {
        GL11.glPushMatrix();
        float n = Class7707.method24584(this.field21030.calcPercent(), 0.0f, 1.0f, 1.0f);
        if (this.field21030.getDirection() == Direction.FORWARDS) {
            n = Class7791.method25029(this.field21030.calcPercent(), 0.0f, 1.0f, 1.0f);
        }
        GL11.glTranslatef((float)(this.method14272() + 44), (float)(this.method14274() + 44), 0.0f);
        GL11.glScaled(1.0 + 0.1 * n, 1.0 + 0.1 * n, 0.0);
        GL11.glTranslatef((float)(-this.method14272() - 44), (float)(-this.method14274() - 44), 0.0f);
        if (this.field21027 == null) {
            Minecraft.getInstance().method5290().method5849(new ResourceLocation("textures/misc/unknown_server.png"));
            RenderUtil.method26907((float)(this.x + 12), (float)(this.y + 12), 64.0f, 64.0f, ClientColors.LIGHT_GREYISH_BLUE.color, 0.0f, 0.0f, 64.0f, 64.0f);
        }
        else {
            RenderUtil.method26900((float)(this.x + 12), (float)(this.y + 12), 64.0f, 64.0f, this.field21027, ClientColors.LIGHT_GREYISH_BLUE.color, true);
        }
        GL11.glPopMatrix();
        ClientAssets.shout.bind();
        ClientAssets.shout.bind();
    }
    
    public void method14758() {
        final long n = this.field21025.method30981().getTime() - new Date().getTime();
        final int i = (int)(n / 1000L) % 60;
        final int j = (int)(n / 60000L % 60L);
        final int k = (int)(n / 3600000L % 24L);
        final int l = (int)(n / 86400000L);
        RenderUtil.method26870(this.method14280() + this.method14289(), this.method14281() + this.method14291(), this.method14280() + this.method14289() + this.field20480, this.method14281() + this.method14291() + this.field20481);
        GL11.glPushMatrix();
        float n2 = Class7707.method24584(this.field21030.calcPercent(), 0.0f, 1.0f, 1.0f);
        if (this.field21030.getDirection() == Direction.FORWARDS) {
            n2 = Class7791.method25029(this.field21030.calcPercent(), 0.0f, 1.0f, 1.0f);
        }
        GL11.glTranslatef((float)(this.method14272() + 76), (float)(this.method14274() + 44), 0.0f);
        GL11.glScaled(1.0 - 0.1 * n2, 1.0 - 0.1 * n2, 0.0);
        GL11.glTranslatef((float)(-this.method14272() - 76), (float)(-this.method14274() - 44), 0.0f);
        RenderUtil.drawString(ClientFonts.JelloMedium25, (float)(this.x + 94), (float)(this.y + 16), this.field21026.field41612.equals("Minecraft Server") ? (this.field21026.field41613.substring(0, 1).toUpperCase() + this.field21026.field41613.substring(1)) : this.field21026.field41612, AllUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, 0.9f));
        final int n3 = 94;
        final int n4 = 46;
        if (this.field21025.method30981().getTime() != 9223372036854775806L) {
            if (n > 0L && this.field21025.method30981().getTime() != Long.MAX_VALUE) {
                RenderUtil.drawString(ClientFonts.JelloLight18, (float)(this.x + n3), (float)(this.y + n4), "Unban: " + l + " days, " + k + "h " + j + "m " + i + "s", AllUtils.method19120(ClientColors.DEEP_TEAL.color, ClientColors.LIGHT_GREYISH_BLUE.color, 0.2f));
            }
            else if (this.field21025.method30981().getTime() != Long.MAX_VALUE) {
                RenderUtil.drawString(ClientFonts.JelloLight18, (float)(this.x + n3), (float)(this.y + n4), "Unbanned!", AllUtils.method19120(ClientColors.DARK_SLATE_GREY.color, ClientColors.LIGHT_GREYISH_BLUE.color, 0.3f));
            }
            else {
                RenderUtil.drawString(ClientFonts.JelloLight18, (float)(this.x + n3), (float)(this.y + n4), "Permanently banned!", AllUtils.method19120(ClientColors.PALE_YELLOW.color, ClientColors.LIGHT_GREYISH_BLUE.color, 0.3f));
            }
        }
        else {
            RenderUtil.drawString(ClientFonts.JelloLight18, (float)(this.x + n3), (float)(this.y + n4), "Compromised ban (unbannable)!", AllUtils.method19120(ClientColors.DARK_OLIVE.color, ClientColors.LIGHT_GREYISH_BLUE.color, 0.3f));
        }
        GL11.glPopMatrix();
        RenderUtil.endScissor();
    }
    
    public static java.awt.image.BufferedImage method14759(final String s) {
        if (s == null) {
            return null;
        }
        if (!Base64.isBase64(s)) {
            return null;
        }
        try {
            return ImageIO.read(new ByteArrayInputStream(Base64.decodeBase64(s)));
        }
        catch (final IOException ex) {
            return null;
        }
    }
    
    public static java.awt.image.BufferedImage method14760(final java.awt.image.BufferedImage bufferedImage, final double sx, final double sy) {
        java.awt.image.BufferedImage bufferedImage2 = null;
        if (bufferedImage != null) {
            bufferedImage2 = new java.awt.image.BufferedImage((int)(bufferedImage.getWidth() * sx), (int)(bufferedImage.getHeight() * sy), bufferedImage.getType());
            bufferedImage2.createGraphics().drawRenderedImage(bufferedImage, AffineTransform.getScaleInstance(sx, sy));
        }
        return bufferedImage2;
    }
    
    @Override
    public boolean method14211(final int n, final int n2, final int n3) {
        return false;
    }
}
