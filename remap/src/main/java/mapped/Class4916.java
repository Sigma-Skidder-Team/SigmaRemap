// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.awt.geom.AffineTransform;
import javax.imageio.ImageIO;
import java.io.ByteArrayInputStream;
import org.apache.commons.codec.binary.Base64;
import java.util.Date;
import org.lwjgl.opengl.GL11;
import java.io.IOException;
import java.awt.image.BufferedImage;

public class Class4916 extends Class4825
{
    public Class8848 field21025;
    public Class9575 field21026;
    public Class7776 field21027;
    public Class7776 field21028;
    private BufferedImage field21029;
    private Class9572 field21030;
    
    public Class4916(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final Class8848 field21025) {
        super(class4803, s, n, n2, n3, n4, false);
        this.field21025 = null;
        this.field21026 = null;
        this.field21027 = null;
        this.field21028 = null;
        this.field21025 = field21025;
        this.field21026 = field21025.method30982();
        this.field21030 = new Class9572(200, 200, Class2186.field12965);
    }
    
    public void finalize() throws Throwable {
        try {
            if (this.field21028 != null) {
                Class9463.method35173().method35182(this.field21028);
            }
            if (this.field21027 != null) {
                Class9463.method35173().method35182(this.field21027);
            }
        }
        finally {
            super.finalize();
        }
    }
    
    @Override
    public void method14205(final float n) {
        this.method14228();
        float n2 = Class7707.method24584(this.field21030.method35858(), 0.0f, 1.0f, 1.0f);
        final float method25029 = Class7791.method25029(this.field21030.method35858(), 0.0f, 1.0f, 1.0f);
        if (this.method14308()) {
            this.field21030.method35855(Class2186.field12964);
        }
        else if (Math.abs(n2 - method25029) < 0.7) {
            this.field21030.method35855(Class2186.field12965);
        }
        if (this.method14281() + this.method14291() < Class869.method5277().field4632.method7695() - 36 && this.method14281() + this.method14291() > 52) {
            if (this.field21026 != null && this.field21028 == null) {
                try {
                    final BufferedImage method25030 = method14759(this.field21026.method35869());
                    if (method25030 != null) {
                        this.field21027 = Class9399.method34928("servericon", method25030);
                        this.field21028 = Class9399.method34928("servericon", Class6804.method20826(Class6804.method20836(method14760(method25030, 2.5, 2.5), 0.0f, 1.1f, 0.0f), 25));
                    }
                }
                catch (final IOException ex) {
                    ex.printStackTrace();
                }
            }
            Class8154.method26865(this);
            Class8154.method26876((float)this.field20478, (float)this.field20479, (float)(this.field20478 + this.field20480), (float)(this.field20479 + this.field20481), Class265.field1278.field1292);
            GL11.glTexParameteri(3553, 10241, 9728);
            GL11.glPushMatrix();
            final int n3 = this.field20480 / 2;
            final int n4 = this.field20481 / 2;
            if (this.field21030.method35857() == Class2186.field12965) {
                n2 = Class7791.method25029(this.field21030.method35858(), 0.0f, 1.0f, 1.0f);
            }
            GL11.glTranslatef((float)(this.method14272() + n3), (float)(this.method14274() + n4), 0.0f);
            GL11.glScaled(1.0 + 0.4 * n2, 1.0 + 0.4 * n2, 0.0);
            GL11.glTranslatef((float)(-this.method14272() - n3), (float)(-this.method14274() - n4), 0.0f);
            if (this.field21028 != null) {
                Class8154.method26899((float)this.field20478, (float)(this.field20479 - (this.field20480 - this.field20481) / 2), (float)this.field20480, (float)this.field20480, this.field21028, Class6430.method19118(Class6430.method19120(Class265.field1278.field1292, Class265.field1273.field1292, 0.7f), 0.8f));
            }
            GL11.glPopMatrix();
            Class8154.method26872();
            Class8154.method26876((float)this.field20478, (float)this.field20479, (float)(this.field20478 + this.field20480), (float)(this.field20479 + this.field20481), Class6430.method19118(Class265.field1273.field1292, 0.3f + 0.3f * this.field21030.method35858()));
        }
        if (this.field21025 == null) {
            return;
        }
        if (this.field21026 == null) {
            return;
        }
        this.method14757();
        this.method14758();
        Class7853.field32188.method24916();
        Class7853.field32188.method24916();
        super.method14205(n);
    }
    
    public void method14757() {
        GL11.glPushMatrix();
        float n = Class7707.method24584(this.field21030.method35858(), 0.0f, 1.0f, 1.0f);
        if (this.field21030.method35857() == Class2186.field12965) {
            n = Class7791.method25029(this.field21030.method35858(), 0.0f, 1.0f, 1.0f);
        }
        GL11.glTranslatef((float)(this.method14272() + 44), (float)(this.method14274() + 44), 0.0f);
        GL11.glScaled(1.0 + 0.1 * n, 1.0 + 0.1 * n, 0.0);
        GL11.glTranslatef((float)(-this.method14272() - 44), (float)(-this.method14274() - 44), 0.0f);
        if (this.field21027 == null) {
            Class869.method5277().method5290().method5849(new ResourceLocation("textures/misc/unknown_server.png"));
            Class8154.method26907((float)(this.field20478 + 12), (float)(this.field20479 + 12), 64.0f, 64.0f, Class265.field1278.field1292, 0.0f, 0.0f, 64.0f, 64.0f);
        }
        else {
            Class8154.method26900((float)(this.field20478 + 12), (float)(this.field20479 + 12), 64.0f, 64.0f, this.field21027, Class265.field1278.field1292, true);
        }
        GL11.glPopMatrix();
        Class7853.field32188.method24916();
        Class7853.field32188.method24916();
    }
    
    public void method14758() {
        final long n = this.field21025.method30981().getTime() - new Date().getTime();
        final int i = (int)(n / 1000L) % 60;
        final int j = (int)(n / 60000L % 60L);
        final int k = (int)(n / 3600000L % 24L);
        final int l = (int)(n / 86400000L);
        Class8154.method26870(this.method14280() + this.method14289(), this.method14281() + this.method14291(), this.method14280() + this.method14289() + this.field20480, this.method14281() + this.method14291() + this.field20481);
        GL11.glPushMatrix();
        float n2 = Class7707.method24584(this.field21030.method35858(), 0.0f, 1.0f, 1.0f);
        if (this.field21030.method35857() == Class2186.field12965) {
            n2 = Class7791.method25029(this.field21030.method35858(), 0.0f, 1.0f, 1.0f);
        }
        GL11.glTranslatef((float)(this.method14272() + 76), (float)(this.method14274() + 44), 0.0f);
        GL11.glScaled(1.0 - 0.1 * n2, 1.0 - 0.1 * n2, 0.0);
        GL11.glTranslatef((float)(-this.method14272() - 76), (float)(-this.method14274() - 44), 0.0f);
        Class8154.method26889(Class9400.field40324, (float)(this.field20478 + 94), (float)(this.field20479 + 16), this.field21026.field41612.equals("Minecraft Server") ? (this.field21026.field41613.substring(0, 1).toUpperCase() + this.field21026.field41613.substring(1, this.field21026.field41613.length())) : this.field21026.field41612, Class6430.method19118(Class265.field1278.field1292, 0.9f));
        final int n3 = 94;
        final int n4 = 46;
        if (this.field21025.method30981().getTime() != 9223372036854775806L) {
            if (n > 0L && this.field21025.method30981().getTime() != Long.MAX_VALUE) {
                Class8154.method26889(Class9400.field40312, (float)(this.field20478 + n3), (float)(this.field20479 + n4), "Unban: " + l + " days, " + k + "h " + j + "m " + i + "s", Class6430.method19120(Class265.field1273.field1292, Class265.field1278.field1292, 0.2f));
            }
            else if (this.field21025.method30981().getTime() != Long.MAX_VALUE) {
                Class8154.method26889(Class9400.field40312, (float)(this.field20478 + n3), (float)(this.field20479 + n4), "Unbanned!", Class6430.method19120(Class265.field1276.field1292, Class265.field1278.field1292, 0.3f));
            }
            else {
                Class8154.method26889(Class9400.field40312, (float)(this.field20478 + n3), (float)(this.field20479 + n4), "Permanently banned!", Class6430.method19120(Class265.field1283.field1292, Class265.field1278.field1292, 0.3f));
            }
        }
        else {
            Class8154.method26889(Class9400.field40312, (float)(this.field20478 + n3), (float)(this.field20479 + n4), "Compromised ban (unbannable)!", Class6430.method19120(Class265.field1284.field1292, Class265.field1278.field1292, 0.3f));
        }
        GL11.glPopMatrix();
        Class8154.method26872();
    }
    
    public static BufferedImage method14759(final String s) {
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
    
    public static BufferedImage method14760(final BufferedImage bufferedImage, final double sx, final double sy) {
        BufferedImage bufferedImage2 = null;
        if (bufferedImage != null) {
            bufferedImage2 = new BufferedImage((int)(bufferedImage.getWidth() * sx), (int)(bufferedImage.getHeight() * sy), bufferedImage.getType());
            bufferedImage2.createGraphics().drawRenderedImage(bufferedImage, AffineTransform.getScaleInstance(sx, sy));
        }
        return bufferedImage2;
    }
    
    @Override
    public boolean method14211(final int n, final int n2, final int n3) {
        return false;
    }
}
