// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import slick2d.Color;

import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.awt.Point;
import java.awt.image.ComponentColorModel;
import java.awt.color.ColorSpace;
import java.awt.image.PixelInterleavedSampleModel;
import java.awt.image.DataBufferByte;
import java.nio.ByteBuffer;
import java.io.OutputStream;

public class Class8632 implements Class8633
{
    private static String[] field36227;
    
    @Override
    public void method29299(final Class7764 class7764, final String formatName, final OutputStream output, final boolean b) throws IOException {
        int n = 4 * class7764.method24843() * class7764.method24844();
        if (!b) {
            n = 3 * class7764.method24843() * class7764.method24844();
        }
        final ByteBuffer allocate = ByteBuffer.allocate(n);
        for (int i = 0; i < class7764.method24844(); ++i) {
            for (int j = 0; j < class7764.method24843(); ++j) {
                final Color method24855 = class7764.method24855(j, i);
                allocate.put((byte)(method24855.field14368 * 255.0f));
                allocate.put((byte)(method24855.field14369 * 255.0f));
                allocate.put((byte)(method24855.field14370 * 255.0f));
                if (b) {
                    allocate.put((byte)(method24855.field14371 * 255.0f));
                }
            }
        }
        final DataBufferByte db = new DataBufferByte(allocate.array(), n);
        PixelInterleavedSampleModel sm;
        ComponentColorModel cm;
        if (!b) {
            sm = new PixelInterleavedSampleModel(0, class7764.method24843(), class7764.method24844(), 3, 3 * class7764.method24843(), new int[] { 0, 1, 2 });
            cm = new ComponentColorModel(ColorSpace.getInstance(1000), new int[] { 8, 8, 8, 0 }, false, false, 1, 0);
        }
        else {
            sm = new PixelInterleavedSampleModel(0, class7764.method24843(), class7764.method24844(), 4, 4 * class7764.method24843(), new int[] { 0, 1, 2, 3 });
            cm = new ComponentColorModel(ColorSpace.getInstance(1000), new int[] { 8, 8, 8, 8 }, true, false, 3, 0);
        }
        ImageIO.write(new BufferedImage(cm, Raster.createWritableRaster(sm, db, new Point(0, 0)), false, null), formatName, output);
    }
}
