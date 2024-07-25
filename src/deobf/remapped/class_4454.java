package remapped;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;
import javax.imageio.ImageIO;

public class class_4454 {
   private static class_7450[] field_21700 = null;
   private static int field_21703 = 0;
   private static int field_21702 = 0;

   public static void method_20648() {
      field_21700 = null;
   }

   public static void method_20646() {
      field_21700 = null;
      field_21703 = 0;
      class_8169[] var2 = class_3111.method_14347();
      field_21700 = method_20645(var2);
      method_20652();
   }

   public static void method_20652() {
      if (field_21700 != null && class_3111.method_14385()) {
         int var2 = 0;

         for (int var3 = 0; var3 < field_21700.length; var3++) {
            class_7450 var4 = field_21700[var3];
            var4.method_33897();
            if (var4.method_33902()) {
               var2++;
            }
         }

         int var5 = class_3111.method_14327().field_9657.method_20022();
         if (var5 != field_21702) {
            field_21703 = var2;
            field_21702 = var5;
         }

         if (class_153.method_611()) {
            class_153.method_610();
         }
      } else {
         field_21703 = 0;
      }
   }

   private static class_7450[] method_20645(class_8169[] var0) {
      ArrayList var3 = new ArrayList();

      for (int var4 = 0; var4 < var0.length; var4++) {
         class_8169 var5 = var0[var4];
         class_7450[] var6 = method_20644(var5);
         if (var6 != null) {
            var3.addAll(Arrays.asList(var6));
         }
      }

      return var3.<class_7450>toArray(new class_7450[var3.size()]);
   }

   private static class_7450[] method_20644(class_8169 var0) {
      String[] var3 = class_9654.method_44543(var0, "optifine/anim/", ".properties", (String[])null);
      if (var3.length <= 0) {
         return null;
      } else {
         ArrayList var4 = new ArrayList();

         for (int var5 = 0; var5 < var3.length; var5++) {
            String var6 = var3[var5];
            class_3111.method_14277("Texture animation: " + var6);

            try {
               Identifier var7 = new Identifier(var6);
               InputStream var8 = var0.method_37466(class_3168.field_15844, var7);
               class_8407 var9 = new class_8407();
               var9.load(var8);
               var8.close();
               class_7450 var10 = method_20649(var9, var7);
               if (var10 != null) {
                  Identifier var11 = new Identifier(var10.method_33898());
                  if (!class_3111.method_14364(var0, var11)) {
                     class_3111.method_14277("Skipped: " + var6 + ", target texture not loaded from same resource pack");
                  } else {
                     var4.add(var10);
                  }
               }
            } catch (FileNotFoundException var12) {
               class_3111.method_14317("File not found: " + var12.getMessage());
            } catch (IOException var13) {
               var13.printStackTrace();
            }
         }

         return var4.<class_7450>toArray(new class_7450[var4.size()]);
      }
   }

   private static class_7450 method_20649(Properties var0, Identifier var1) {
      String var4 = var0.getProperty("from");
      String var5 = var0.getProperty("to");
      int var6 = class_3111.method_14361(var0.getProperty("x"), -1);
      int var7 = class_3111.method_14361(var0.getProperty("y"), -1);
      int var8 = class_3111.method_14361(var0.getProperty("w"), -1);
      int var9 = class_3111.method_14361(var0.getProperty("h"), -1);
      if (var4 == null || var5 == null) {
         class_3111.method_14317("TextureAnimation: Source or target texture not specified");
         return null;
      } else if (var6 >= 0 && var7 >= 0 && var8 >= 0 && var9 >= 0) {
         var4 = var4.trim();
         var5 = var5.trim();
         String var10 = class_5525.method_25091(var1.method_21456());
         var4 = class_5525.method_25096(var4, var10);
         var5 = class_5525.method_25096(var5, var10);
         byte[] var11 = method_20655(var4, var8);
         if (var11 == null) {
            class_3111.method_14317("TextureAnimation: Source texture not found: " + var5);
            return null;
         } else {
            int var12 = var11.length / 4;
            int var13 = var12 / (var8 * var9);
            int var14 = var13 * var8 * var9;
            if (var12 != var14) {
               class_3111.method_14317(
                  "TextureAnimation: Source texture has invalid number of frames: " + var4 + ", frames: " + (float)var12 / (float)(var8 * var9)
               );
               return null;
            } else {
               Identifier var15 = new Identifier(var5);

               try {
                  InputStream var16 = class_3111.method_14374(var15);
                  if (var16 == null) {
                     class_3111.method_14317("TextureAnimation: Target texture not found: " + var5);
                     return null;
                  } else {
                     BufferedImage var17 = method_20653(var16);
                     if (var6 + var8 <= var17.getWidth() && var7 + var9 <= var17.getHeight()) {
                        return new class_7450(var4, var11, var5, var15, var6, var7, var8, var9, var0);
                     } else {
                        class_3111.method_14317("TextureAnimation: Animation coordinates are outside the target texture: " + var5);
                        return null;
                     }
                  }
               } catch (IOException var18) {
                  class_3111.method_14317("TextureAnimation: Target texture not found: " + var5);
                  return null;
               }
            }
         }
      } else {
         class_3111.method_14317("TextureAnimation: Invalid coordinates");
         return null;
      }
   }

   private static byte[] method_20655(String var0, int var1) {
      byte[] var4 = method_20650(var0, var1);
      if (var4 == null) {
         var4 = method_20650("/anim" + var0, var1);
      }

      return var4;
   }

   private static byte[] method_20650(String var0, int var1) {
      class_8881 var4 = class_3111.method_14310();

      try {
         Identifier var5 = new Identifier(var0);
         InputStream var6 = class_3111.method_14374(var5);
         if (var6 == null) {
            return null;
         } else {
            BufferedImage var7 = method_20653(var6);
            var6.close();
            if (var7 == null) {
               return null;
            } else {
               if (var1 > 0 && var7.getWidth() != var1) {
                  double var8 = (double)(var7.getHeight() / var7.getWidth());
                  int var10 = (int)((double)var1 * var8);
                  var7 = method_20654(var7, var1, var10);
               }

               int var11 = var7.getWidth();
               int var12 = var7.getHeight();
               int[] var21 = new int[var11 * var12];
               byte[] var13 = new byte[var11 * var12 * 4];
               var7.getRGB(0, 0, var11, var12, var21, 0, var11);

               for (int var14 = 0; var14 < var21.length; var14++) {
                  int var15 = var21[var14] >> 24 & 0xFF;
                  int var16 = var21[var14] >> 16 & 0xFF;
                  int var17 = var21[var14] >> 8 & 0xFF;
                  int var18 = var21[var14] & 0xFF;
                  var13[var14 * 4 + 0] = (byte)var16;
                  var13[var14 * 4 + 1] = (byte)var17;
                  var13[var14 * 4 + 2] = (byte)var18;
                  var13[var14 * 4 + 3] = (byte)var15;
               }

               return var13;
            }
         }
      } catch (FileNotFoundException var19) {
         return null;
      } catch (Exception var20) {
         var20.printStackTrace();
         return null;
      }
   }

   private static BufferedImage method_20653(InputStream var0) throws IOException {
      BufferedImage var3 = ImageIO.read(var0);
      var0.close();
      return var3;
   }

   private static BufferedImage method_20654(BufferedImage var0, int var1, int var2) {
      BufferedImage var5 = new BufferedImage(var1, var2, 2);
      Graphics2D var6 = var5.createGraphics();
      var6.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
      var6.drawImage(var0, 0, 0, var1, var2, (ImageObserver)null);
      return var5;
   }

   public static int method_20651() {
      return field_21700 != null ? field_21700.length : 0;
   }

   public static int method_20647() {
      return field_21703;
   }
}
