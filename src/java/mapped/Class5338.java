// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.awt.image.ComponentColorModel;
import java.awt.color.ColorSpace;
import java.awt.Graphics;
import java.nio.ByteOrder;
import java.awt.image.DataBufferByte;
import java.awt.image.ImageObserver;
import java.awt.Image;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Hashtable;
import java.awt.Point;
import java.awt.image.Raster;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.io.InputStream;
import java.awt.image.ColorModel;

public class Class5338 implements Class5337
{
    private static final ColorModel field22376;
    private static final ColorModel field22377;
    private int field22378;
    private int field22379;
    private int field22380;
    private int field22381;
    private int field22382;
    private boolean field22383;
    
    public Class5338() {
        this.field22383 = true;
    }
    
    @Override
    public int method16480() {
        return this.field22378;
    }
    
    @Override
    public int method16481() {
        return this.field22379;
    }
    
    @Override
    public int method16482() {
        return this.field22382;
    }
    
    @Override
    public int method16483() {
        return this.field22381;
    }
    
    @Override
    public int method16484() {
        return this.field22380;
    }
    
    @Override
    public ByteBuffer method16491(final InputStream inputStream) throws IOException {
        return this.method16492(inputStream, true, null);
    }
    
    @Override
    public ByteBuffer method16492(final InputStream inputStream, final boolean b, final int[] array) throws IOException {
        return this.method16493(inputStream, b, false, array);
    }
    
    @Override
    public ByteBuffer method16493(final InputStream input, final boolean b, boolean b2, final int[] array) throws IOException {
        if (array != null) {
            b2 = true;
        }
        return this.method16494(ImageIO.read(input), b, b2, array);
    }
    
    public ByteBuffer method16494(final BufferedImage bufferedImage, final boolean b, final boolean b2, final int[] array) {
        int i = 2;
        int j = 2;
        while (i < bufferedImage.getWidth()) {
            i *= 2;
        }
        while (j < bufferedImage.getHeight()) {
            j *= 2;
        }
        this.field22380 = bufferedImage.getWidth();
        this.field22379 = bufferedImage.getHeight();
        this.field22382 = j;
        this.field22381 = i;
        final boolean b3 = bufferedImage.getColorModel().hasAlpha() || b2;
        BufferedImage bufferedImage2;
        if (!b3) {
            this.field22378 = 24;
            bufferedImage2 = new BufferedImage(Class5338.field22377, Raster.createInterleavedRaster(0, i, j, 3, null), false, new Hashtable<Object, Object>());
        }
        else {
            this.field22378 = 32;
            bufferedImage2 = new BufferedImage(Class5338.field22376, Raster.createInterleavedRaster(0, i, j, 4, null), false, new Hashtable<Object, Object>());
        }
        final Graphics2D graphics2D = (Graphics2D)bufferedImage2.getGraphics();
        if (b3) {
            graphics2D.setColor(new Color(0.0f, 0.0f, 0.0f, 0.0f));
            graphics2D.fillRect(0, 0, i, j);
        }
        if (!b) {
            graphics2D.drawImage(bufferedImage, 0, 0, null);
        }
        else {
            graphics2D.scale(1.0, -1.0);
            graphics2D.drawImage(bufferedImage, 0, -this.field22379, null);
        }
        if (this.field22383) {
            if (this.field22379 < j - 1) {
                this.method16495(bufferedImage2, 0, 0, this.field22380, 1, 0, j - 1);
                this.method16495(bufferedImage2, 0, this.field22379 - 1, this.field22380, 1, 0, 1);
            }
            if (this.field22380 < i - 1) {
                this.method16495(bufferedImage2, 0, 0, 1, this.field22379, i - 1, 0);
                this.method16495(bufferedImage2, this.field22380 - 1, 0, 1, this.field22379, 1, 0);
            }
        }
        final byte[] data = ((DataBufferByte)bufferedImage2.getRaster().getDataBuffer()).getData();
        if (array != null) {
            for (int k = 0; k < data.length; k += 4) {
                int n = 1;
                for (int l = 0; l < 3; ++l) {
                    if (((data[k + l] >= 0) ? data[k + l] : (256 + data[k + l])) != array[l]) {
                        n = 0;
                    }
                }
                if (n != 0) {
                    data[k + 3] = 0;
                }
            }
        }
        final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(data.length);
        allocateDirect.order(ByteOrder.nativeOrder());
        allocateDirect.put(data, 0, data.length);
        allocateDirect.flip();
        graphics2D.dispose();
        return allocateDirect;
    }
    
    @Override
    public ByteBuffer method16485() {
        throw new RuntimeException("ImageIOImageData doesn't store it's image.");
    }
    
    private void method16495(final BufferedImage bufferedImage, final int x, final int y, final int w, final int h, final int n, final int n2) {
        bufferedImage.getGraphics().drawImage(bufferedImage.getSubimage(x, y, w, h), x + n, y + n2, null);
    }
    
    @Override
    public void method16490(final boolean field22383) {
        this.field22383 = field22383;
    }
    
    static {
        field22376 = new ComponentColorModel(ColorSpace.getInstance(1000), new int[] { 8, 8, 8, 8 }, true, false, 3, 0);
        field22377 = new ComponentColorModel(ColorSpace.getInstance(1000), new int[] { 8, 8, 8, 0 }, false, false, 1, 0);
    }
}
