package remapped;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class class_7849 {
   private static String[] field_39773;

   public static BufferedImage method_35510(BufferedImage var0, int var1) {
      if (var0 != null) {
         if (var0.getWidth() > var1 + var1) {
            if (var0.getHeight() > var1 + var1) {
               ConvolveOp var4 = new ConvolveOp(method_35505((float)var1));
               BufferedImage var5 = var4.filter(var0, null);
               var5 = var4.filter(method_35511(var5), null);
               var5 = method_35511(var5);
               return var5.getSubimage(var1, var1, var0.getWidth() - var1 - var1, var0.getHeight() - var1 - var1);
            } else {
               return var0;
            }
         } else {
            return var0;
         }
      } else {
         return var0;
      }
   }

   public static BufferedImage method_35500(BufferedImage var0, int var1) {
      if (var0 == null) {
         return var0;
      } else {
         ConvolveOp var4 = new ConvolveOp(method_35505((float)var1), 1, null);
         int var5 = var0.getWidth();
         int var6 = var0.getHeight();
         BufferedImage var7 = new BufferedImage(var6 + var1 * 2, var5 + var1 * 2, var0.getType());

         for (int var8 = 0; var8 < var5; var8++) {
            for (int var9 = 0; var9 < var6; var9++) {
               var7.setRGB(var8 + var1, var9 + var1 / 2, var0.getRGB(var8, var9));
            }
         }

         BufferedImage var10 = var4.filter(var7, null);
         var10 = var4.filter(method_35511(var10), null);
         var10 = method_35511(var10);
         return var10.getSubimage(var1, var1, var7.getWidth() - var1 - var1, var7.getHeight() - var1 - var1);
      }
   }

   public static BufferedImage method_35511(BufferedImage var0) {
      int var3 = var0.getWidth();
      int var4 = var0.getHeight();
      BufferedImage var5 = new BufferedImage(var4, var3, var0.getType());

      for (int var6 = 0; var6 < var3; var6++) {
         for (int var7 = 0; var7 < var4; var7++) {
            var5.setRGB(var4 - 1 - var7, var3 - 1 - var6, var0.getRGB(var6, var7));
         }
      }

      return var5;
   }

   public static Kernel method_35505(float var0) {
      int var3 = (int)Math.ceil((double)var0);
      int var4 = var3 * 2 + 1;
      float[] var5 = new float[var4];
      float var6 = var0 / 3.0F;
      float var7 = 2.0F * var6 * var6;
      float var8 = (float)((Math.PI * 2) * (double)var6);
      float var9 = (float)Math.sqrt((double)var8);
      float var10 = var0 * var0;
      float var11 = 0.0F;
      int var12 = 0;

      for (int var13 = -var3; var13 <= var3; var13++) {
         float var14 = (float)(var13 * var13);
         if (!(var14 > var10)) {
            var5[var12] = (float)Math.exp((double)(-var14 / var7)) / var9;
         } else {
            var5[var12] = 0.0F;
         }

         var11 += var5[var12];
         var12++;
      }

      for (int var15 = 0; var15 < var4; var15++) {
         var5[var15] /= var11;
      }

      return new Kernel(var4, 1, var5);
   }

   public static BufferedImage method_35508(int var0, int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      byte var10 = 4;
      var1 = (int)((float)var1 * class_6763.field_34898);
      var0 = (int)((float)var0 * class_6763.field_34898);
      var2 = (int)((float)var2 * class_6763.field_34898);
      var3 = (int)((float)var3 * class_6763.field_34898);
      var4 = (int)((float)var4 * class_6763.field_34898);
      var1 = class_1893.method_8510().field_9602.method_43198() - var1 - var3;
      if (var4 <= 0) {
         var4 = 1;
      }

      ByteBuffer var11 = BufferUtils.createByteBuffer(var2 * var3 * var10);
      GL11.glReadPixels(var0, var1, var2, var3, 6408, 5121, var11);
      BufferedImage var12 = new BufferedImage(var2 / var4, var3 / var4, 1);

      for (int var13 = var4 / 2; var13 < var2; var13 += var4) {
         for (int var14 = var4 / 2; var14 < var3; var14 += var4) {
            if (var13 / var4 < var2 / var4 && var14 / var4 < var3 / var4) {
               int var15 = (var13 + var2 * var14) * var10;
               int var16 = var11.get(var15) & 255;
               int var17 = var11.get(var15 + 1) & 255;
               int var18 = var11.get(var15 + 2) & 255;
               var12.setRGB(var13 / var4, var3 / var4 - (var14 / var4 + 1), 0xFF000000 | var16 << 16 | var17 << 8 | var18);
            }
         }
      }

      if (var5 <= 1) {
         return var12;
      } else {
         return !var7 ? method_35510(method_35503(var12, var5, var6), var5) : method_35510(method_35502(var12, var5), var5);
      }
   }

   public static BufferedImage method_35506(int var0, int var1, int var2, int var3, int var4, int var5) {
      return method_35508(var0, var1, var2, var3, var4, var5, class_1255.field_6929.field_6917, false);
   }

   public static BufferedImage method_35507(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      return method_35508(var0, var1, var2, var3, var4, var5, var6, false);
   }

   public static BufferedImage method_35509(int var0, int var1, int var2, int var3, int var4, int var5, boolean var6) {
      return method_35508(var0, var1, var2, var3, var4, var5, class_1255.field_6929.field_6917, var6);
   }

   public static BufferedImage method_35503(BufferedImage var0, int var1, int var2) {
      int var5 = var0.getWidth() + var1 * 2;
      int var6 = var0.getHeight() + var1 * 2;
      BufferedImage var7 = new BufferedImage(var5, var6, var0.getType());
      if (var2 != class_1255.field_6929.field_6917) {
         for (int var8 = 0; var8 < var5; var8++) {
            for (int var9 = 0; var9 < var6; var9++) {
               var7.setRGB(var8, var9, var2);
            }
         }
      }

      for (int var10 = 0; var10 < var0.getWidth(); var10++) {
         for (int var11 = 0; var11 < var0.getHeight(); var11++) {
            var7.setRGB(var1 + var10, var1 + var11, var0.getRGB(var10, var11));
         }
      }

      return var7;
   }

   public static BufferedImage method_35502(BufferedImage var0, int var1) {
      int var4 = var0.getWidth() + var1 * 2;
      int var5 = var0.getHeight() + var1 * 2;
      BufferedImage var6 = method_35512(var0, (double)((float)var4 / (float)var0.getWidth()), (double)((float)var5 / (float)var0.getHeight()));

      for (int var7 = 0; var7 < var0.getWidth(); var7++) {
         for (int var8 = 0; var8 < var0.getHeight(); var8++) {
            var6.setRGB(var1 + var7, var1 + var8, var0.getRGB(var7, var8));
         }
      }

      return var6;
   }

   public static BufferedImage method_35501(BufferedImage var0, float var1, float var2, float var3) {
      int var6 = var0.getWidth();
      int var7 = var0.getHeight();

      for (int var8 = 0; var8 < var7; var8++) {
         for (int var9 = 0; var9 < var6; var9++) {
            int var10 = var0.getRGB(var9, var8);
            int var11 = var10 >> 16 & 0xFF;
            int var12 = var10 >> 8 & 0xFF;
            int var13 = var10 & 0xFF;
            float[] var14 = Color.RGBtoHSB(var11, var12, var13, null);
            float var15 = Math.max(0.0F, Math.min(1.0F, var14[0] + var1));
            float var16 = Math.max(0.0F, Math.min(1.0F, var14[1] * var2));
            float var17 = Math.max(0.0F, Math.min(1.0F, var14[2] + var3));
            int var18 = Color.HSBtoRGB(var15, var16, var17);
            var0.setRGB(var9, var8, var18);
         }
      }

      return var0;
   }

   public static BufferedImage method_35512(BufferedImage var0, double var1, double var3) {
      BufferedImage var7 = null;
      if (var0 != null) {
         int var8 = (int)((double)var0.getHeight() * var3);
         int var9 = (int)((double)var0.getWidth() * var1);
         var7 = new BufferedImage(var9, var8, var0.getType());
         Graphics2D var10 = var7.createGraphics();
         AffineTransform var11 = AffineTransform.getScaleInstance(var1, var3);
         var10.drawRenderedImage(var0, var11);
      }

      return var7;
   }
}
