// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL11;
import slick2d.Renderer;
import slick2d.Texture;

import java.io.IOException;
import java.awt.image.BufferedImage;

public class Class9399
{
    private static String[] field40306;
    
    public static Texture method34928(final String s, final BufferedImage bufferedImage) throws IOException {
        return method34930(s, bufferedImage, 3553, 6408, 9729, 9729);
    }
    
    public static Texture method34929(final String s, final BufferedImage bufferedImage, final int n) throws IOException {
        return method34930(s, bufferedImage, 3553, 6408, n, n);
    }
    
    public static Texture method34930(final String s, final BufferedImage bufferedImage, final int n, final int n2, final int n3, final int n4) throws IOException {
        final Class5338 class5338 = new Class5338();
        final int method24221 = Class7649.method24221();
        final Class7777 class5339 = new Class7777(s, n, method24221);
        Renderer.get().method19265(3553);
        Renderer.get().method19258(n, method24221);
        class5339.method24933(bufferedImage.getWidth());
        class5339.method24932(bufferedImage.getHeight());
        int n5;
        if (!bufferedImage.getColorModel().hasAlpha()) {
            n5 = 6407;
        }
        else {
            n5 = 6408;
        }
        final ByteBuffer method24222 = class5338.method16494(bufferedImage, false, false, null);
        class5339.method24934(class5338.method16482());
        class5339.method24935(class5338.method16483());
        class5339.method24929(class5338.method16480() == 32);
        if (n == 3553) {
            Renderer.get().method19289(n, 10241, n3);
            Renderer.get().method19289(n, 10240, n4);
            if (!Renderer.get().method19299()) {
                Renderer.get().method19289(3553, 10242, 10496);
                Renderer.get().method19289(3553, 10243, 10496);
            }
            else {
                Renderer.get().method19289(3553, 10242, 34627);
                Renderer.get().method19289(3553, 10243, 34627);
            }
        }
        GL11.glPixelStorei(3312, 0);
        GL11.glPixelStorei(3313, 0);
        GL11.glPixelStorei(3314, 0);
        GL11.glPixelStorei(3315, 0);
        GL11.glPixelStorei(3316, 0);
        GL11.glPixelStorei(3317, 4);
        Renderer.get().method19297(n, 0, n2, class5339.getTextureWidth(), class5339.getTextureHeight(), 0, n5, 5121, method24222);
        return class5339;
    }
    
    private static void method34931(final BufferedImage bufferedImage, final int x, final int y, final int w, final int h, final int n, final int n2) {
        bufferedImage.getGraphics().drawImage(bufferedImage.getSubimage(x, y, w, h), x + n, y + n2, null);
    }
}
