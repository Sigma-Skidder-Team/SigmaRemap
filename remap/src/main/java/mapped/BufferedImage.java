// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.awt.geom.AffineTransform;
import java.awt.Color;
import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.BufferUtils;
import java.awt.image.Kernel;
import java.awt.image.ConvolveOp;

public class BufferedImage
{
    private static String[] field26745;
    
    public static java.awt.image.BufferedImage method20826(final java.awt.image.BufferedImage bufferedImage, final int n) {
        if (bufferedImage == null) {
            return bufferedImage;
        }
        if (bufferedImage.getWidth() <= n + n) {
            return bufferedImage;
        }
        if (bufferedImage.getHeight() > n + n) {
            final ConvolveOp convolveOp = new ConvolveOp(method20829((float)n));
            return method20828(convolveOp.filter(method20828(convolveOp.filter(bufferedImage, null)), null)).getSubimage(n, n, bufferedImage.getWidth() - n - n, bufferedImage.getHeight() - n - n);
        }
        return bufferedImage;
    }
    
    public static java.awt.image.BufferedImage method20827(final java.awt.image.BufferedImage bufferedImage, final int n) {
        if (bufferedImage != null) {
            final ConvolveOp convolveOp = new ConvolveOp(method20829((float)n), 1, null);
            final int width = bufferedImage.getWidth();
            final int height = bufferedImage.getHeight();
            final java.awt.image.BufferedImage bufferedImage2 = new java.awt.image.BufferedImage(height + n * 2, width + n * 2, bufferedImage.getType());
            for (int i = 0; i < width; ++i) {
                for (int j = 0; j < height; ++j) {
                    bufferedImage2.setRGB(i + n, j + n / 2, bufferedImage.getRGB(i, j));
                }
            }
            return method20828(convolveOp.filter(method20828(convolveOp.filter(bufferedImage2, null)), null)).getSubimage(n, n, bufferedImage2.getWidth() - n - n, bufferedImage2.getHeight() - n - n);
        }
        return bufferedImage;
    }
    
    public static java.awt.image.BufferedImage method20828(final java.awt.image.BufferedImage bufferedImage) {
        final int width = bufferedImage.getWidth();
        final int height = bufferedImage.getHeight();
        final java.awt.image.BufferedImage bufferedImage2 = new java.awt.image.BufferedImage(height, width, bufferedImage.getType());
        for (int i = 0; i < width; ++i) {
            for (int j = 0; j < height; ++j) {
                bufferedImage2.setRGB(height - 1 - j, width - 1 - i, bufferedImage.getRGB(i, j));
            }
        }
        return bufferedImage2;
    }
    
    public static Kernel method20829(final float n) {
        final int n2 = (int)Math.ceil(n);
        final int width = n2 * 2 + 1;
        final float[] data = new float[width];
        final float n3 = n / 3.0f;
        final float n4 = 2.0f * n3 * n3;
        final float n5 = (float)Math.sqrt((float)(6.283185307179586 * n3));
        final float n6 = n * n;
        float n7 = 0.0f;
        int n8 = 0;
        for (int i = -n2; i <= n2; ++i) {
            final float n9 = (float)(i * i);
            if (n9 <= n6) {
                data[n8] = (float)Math.exp(-n9 / n4) / n5;
            }
            else {
                data[n8] = 0.0f;
            }
            n7 += data[n8];
            ++n8;
        }
        for (int j = 0; j < width; ++j) {
            final float[] array = data;
            final int n10 = j;
            array[n10] /= n7;
        }
        return new Kernel(width, 1, data);
    }
    
    public static java.awt.image.BufferedImage method20830(int n, int n2, int n3, int n4, int n5, final int n6, final int n7, final boolean b) {
        final int n8 = 4;
        n2 *= (int)Class9000.field37993;
        n *= (int)Class9000.field37993;
        n3 *= (int)Class9000.field37993;
        n4 *= (int)Class9000.field37993;
        n5 *= (int)Class9000.field37993;
        n2 = Minecraft.method5277().window.method7693() - n2 - n4;
        if (n5 <= 0) {
            n5 = 1;
        }
        final ByteBuffer byteBuffer = BufferUtils.createByteBuffer(n3 * n4 * n8);
        GL11.glReadPixels(n, n2, n3, n4, 6408, 5121, byteBuffer);
        final java.awt.image.BufferedImage bufferedImage = new java.awt.image.BufferedImage(n3 / n5, n4 / n5, 1);
        for (int i = n5 / 2; i < n3; i += n5) {
            for (int j = n5 / 2; j < n4; j += n5) {
                if (i / n5 < n3 / n5) {
                    if (j / n5 < n4 / n5) {
                        final int n9 = (i + n3 * j) * n8;
                        bufferedImage.setRGB(i / n5, n4 / n5 - (j / n5 + 1), 0xFF000000 | (byteBuffer.get(n9) & 0xFF) << 16 | (byteBuffer.get(n9 + 1) & 0xFF) << 8 | (byteBuffer.get(n9 + 2) & 0xFF));
                    }
                }
            }
        }
        if (n6 <= 1) {
            return bufferedImage;
        }
        if (!b) {
            return method20826(method20834(bufferedImage, n6, n7), n6);
        }
        return method20826(method20835(bufferedImage, n6), n6);
    }
    
    public static java.awt.image.BufferedImage method20831(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        return method20830(n, n2, n3, n4, n5, n6, ClientColors.field1273.color, false);
    }
    
    public static java.awt.image.BufferedImage method20832(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        return method20830(n, n2, n3, n4, n5, n6, n7, false);
    }
    
    public static java.awt.image.BufferedImage method20833(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final boolean b) {
        return method20830(n, n2, n3, n4, n5, n6, ClientColors.field1273.color, b);
    }
    
    public static java.awt.image.BufferedImage method20834(final java.awt.image.BufferedImage bufferedImage, final int n, final int rgb) {
        final int width = bufferedImage.getWidth() + n * 2;
        final int height = bufferedImage.getHeight() + n * 2;
        final java.awt.image.BufferedImage bufferedImage2 = new java.awt.image.BufferedImage(width, height, bufferedImage.getType());
        if (rgb != ClientColors.field1273.color) {
            for (int i = 0; i < width; ++i) {
                for (int j = 0; j < height; ++j) {
                    bufferedImage2.setRGB(i, j, rgb);
                }
            }
        }
        for (int k = 0; k < bufferedImage.getWidth(); ++k) {
            for (int l = 0; l < bufferedImage.getHeight(); ++l) {
                bufferedImage2.setRGB(n + k, n + l, bufferedImage.getRGB(k, l));
            }
        }
        return bufferedImage2;
    }
    
    public static java.awt.image.BufferedImage method20835(final java.awt.image.BufferedImage bufferedImage, final int n) {
        final java.awt.image.BufferedImage method20837 = method20837(bufferedImage, (bufferedImage.getWidth() + n * 2) / (float)bufferedImage.getWidth(), (bufferedImage.getHeight() + n * 2) / (float)bufferedImage.getHeight());
        for (int i = 0; i < bufferedImage.getWidth(); ++i) {
            for (int j = 0; j < bufferedImage.getHeight(); ++j) {
                method20837.setRGB(n + i, n + j, bufferedImage.getRGB(i, j));
            }
        }
        return method20837;
    }
    
    public static java.awt.image.BufferedImage method20836(final java.awt.image.BufferedImage bufferedImage, final float n, final float n2, final float n3) {
        final int width = bufferedImage.getWidth();
        for (int height = bufferedImage.getHeight(), i = 0; i < height; ++i) {
            for (int j = 0; j < width; ++j) {
                final int rgb = bufferedImage.getRGB(j, i);
                final float[] rgBtoHSB = Color.RGBtoHSB(rgb >> 16 & 0xFF, rgb >> 8 & 0xFF, rgb & 0xFF, null);
                bufferedImage.setRGB(j, i, Color.HSBtoRGB(Math.max(0.0f, Math.min(1.0f, rgBtoHSB[0] + n)), Math.max(0.0f, Math.min(1.0f, rgBtoHSB[1] * n2)), Math.max(0.0f, Math.min(1.0f, rgBtoHSB[2] + n3))));
            }
        }
        return bufferedImage;
    }
    
    public static java.awt.image.BufferedImage method20837(final java.awt.image.BufferedImage bufferedImage, final double sx, final double sy) {
        java.awt.image.BufferedImage bufferedImage2 = null;
        if (bufferedImage != null) {
            bufferedImage2 = new java.awt.image.BufferedImage((int)(bufferedImage.getWidth() * sx), (int)(bufferedImage.getHeight() * sy), bufferedImage.getType());
            bufferedImage2.createGraphics().drawRenderedImage(bufferedImage, AffineTransform.getScaleInstance(sx, sy));
        }
        return bufferedImage2;
    }
}
