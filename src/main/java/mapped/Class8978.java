// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.awt.Graphics;
import java.awt.image.DataBufferInt;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.BufferedImage;

public class Class8978
{
    private static String[] field37851;
    private int[] field37852;
    private int field37853;
    private int field37854;
    
    @Nullable
    public BufferedImage method31919(final BufferedImage bufferedImage) {
        if (bufferedImage != null) {
            this.field37853 = 64;
            this.field37854 = 64;
            final BufferedImage bufferedImage2 = new BufferedImage(this.field37853, this.field37854, 2);
            final Graphics graphics = bufferedImage2.getGraphics();
            graphics.drawImage(bufferedImage, 0, 0, null);
            final boolean b = bufferedImage.getHeight() == 32;
            if (b) {
                graphics.setColor(new Color(0, 0, 0, 0));
                graphics.fillRect(0, 32, 64, 32);
                graphics.drawImage(bufferedImage2, 24, 48, 20, 52, 4, 16, 8, 20, null);
                graphics.drawImage(bufferedImage2, 28, 48, 24, 52, 8, 16, 12, 20, null);
                graphics.drawImage(bufferedImage2, 20, 52, 16, 64, 8, 20, 12, 32, null);
                graphics.drawImage(bufferedImage2, 24, 52, 20, 64, 4, 20, 8, 32, null);
                graphics.drawImage(bufferedImage2, 28, 52, 24, 64, 0, 20, 4, 32, null);
                graphics.drawImage(bufferedImage2, 32, 52, 28, 64, 12, 20, 16, 32, null);
                graphics.drawImage(bufferedImage2, 40, 48, 36, 52, 44, 16, 48, 20, null);
                graphics.drawImage(bufferedImage2, 44, 48, 40, 52, 48, 16, 52, 20, null);
                graphics.drawImage(bufferedImage2, 36, 52, 32, 64, 48, 20, 52, 32, null);
                graphics.drawImage(bufferedImage2, 40, 52, 36, 64, 44, 20, 48, 32, null);
                graphics.drawImage(bufferedImage2, 44, 52, 40, 64, 40, 20, 44, 32, null);
                graphics.drawImage(bufferedImage2, 48, 52, 44, 64, 52, 20, 56, 32, null);
            }
            graphics.dispose();
            this.field37852 = ((DataBufferInt)bufferedImage2.getRaster().getDataBuffer()).getData();
            this.method31921(0, 0, 32, 16);
            if (b) {
                this.method31920(32, 0, 64, 32);
            }
            this.method31921(0, 16, 64, 32);
            this.method31921(16, 48, 48, 64);
            return bufferedImage2;
        }
        return null;
    }
    
    private void method31920(final int n, final int n2, final int n3, final int n4) {
        for (int i = n; i < n3; ++i) {
            for (int j = n2; j < n4; ++j) {
                if ((this.field37852[i + j * this.field37853] >> 24 & 0xFF) < 128) {
                    return;
                }
            }
        }
        for (int k = n; k < n3; ++k) {
            for (int l = n2; l < n4; ++l) {
                final int[] field37852 = this.field37852;
                final int n5 = k + l * this.field37853;
                field37852[n5] &= 0xFFFFFF;
            }
        }
    }
    
    private void method31921(final int n, final int n2, final int n3, final int n4) {
        for (int i = n; i < n3; ++i) {
            for (int j = n2; j < n4; ++j) {
                final int[] field37852 = this.field37852;
                final int n5 = i + j * this.field37853;
                field37852[n5] |= 0xFF000000;
            }
        }
    }
}
