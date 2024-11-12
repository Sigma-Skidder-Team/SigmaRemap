package mapped;

import org.newdawn.slick.Color;

import java.awt.Point;
import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.ComponentColorModel;
import java.awt.image.DataBufferByte;
import java.awt.image.PixelInterleavedSampleModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import javax.imageio.ImageIO;

public class Class8580 implements Class8579 {
   private static String[] field38593;

   @Override
   public void method30661(Image var1, String var2, OutputStream var3, boolean var4) throws IOException {
      int var7 = 4 * var1.method23558() * var1.method23559();
      if (!var4) {
         var7 = 3 * var1.method23558() * var1.method23559();
      }

      ByteBuffer var8 = ByteBuffer.allocate(var7);

      for (int var9 = 0; var9 < var1.method23559(); var9++) {
         for (int var11 = 0; var11 < var1.method23558(); var11++) {
            Color var13 = var1.method23567(var11, var9);
            var8.put((byte)((int)(var13.r * 255.0F)));
            var8.put((byte)((int)(var13.g * 255.0F)));
            var8.put((byte)((int)(var13.b * 255.0F)));
            if (var4) {
               var8.put((byte)((int)(var13.a * 255.0F)));
            }
         }
      }

      DataBufferByte var15 = new DataBufferByte(var8.array(), var7);
      ComponentColorModel var12;
      PixelInterleavedSampleModel var18;
      if (!var4) {
         int[] var10 = new int[]{0, 1, 2};
         var18 = new PixelInterleavedSampleModel(0, var1.method23558(), var1.method23559(), 3, 3 * var1.method23558(), var10);
         var12 = new ComponentColorModel(ColorSpace.getInstance(1000), new int[]{8, 8, 8, 0}, false, false, 1, 0);
      } else {
         int[] var16 = new int[]{0, 1, 2, 3};
         var18 = new PixelInterleavedSampleModel(0, var1.method23558(), var1.method23559(), 4, 4 * var1.method23558(), var16);
         var12 = new ComponentColorModel(ColorSpace.getInstance(1000), new int[]{8, 8, 8, 8}, true, false, 3, 0);
      }

      WritableRaster var17 = Raster.createWritableRaster(var18, var15, new Point(0, 0));
      BufferedImage var14 = new BufferedImage(var12, var17, false, null);
      ImageIO.write(var14, var2, var3);
   }
}
