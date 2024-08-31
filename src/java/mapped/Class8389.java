package mapped;

import net.minecraft.client.GameSettings;
import net.minecraft.util.ResourceLocation;

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

public class Class8389 {
   private static Class9200[] field35971 = null;
   private static int field35972 = 0;
   private static int field35973 = 0;

   public static void method29392() {
      field35971 = null;
   }

   public static void method29393() {
      field35971 = null;
      field35972 = 0;
      IResourcePack[] var2 = Class7944.method26869();
      field35971 = method29395(var2);
      method29394();
   }

   public static void method29394() {
      if (field35971 != null && Class7944.method26905()) {
         int var2 = 0;

         for (int var3 = 0; var3 < field35971.length; var3++) {
            Class9200 var4 = field35971[var3];
            var4.method34482();
            if (var4.method34488()) {
               var2++;
            }
         }

         int var5 = Class7944.method26860().worldRenderer.method935();
         if (var5 != field35973) {
            field35972 = var2;
            field35973 = var5;
         }

         if (SmartAnimations.isActive()) {
            SmartAnimations.method14221();
         }
      } else {
         field35972 = 0;
      }
   }

   private static Class9200[] method29395(IResourcePack[] var0) {
      ArrayList<Class9200> var3 = new ArrayList();

      for (int var4 = 0; var4 < var0.length; var4++) {
         IResourcePack var5 = var0[var4];
         Class9200[] var6 = method29396(var5);
         if (var6 != null) {
            var3.addAll(Arrays.asList(var6));
         }
      }

      return var3.toArray(new Class9200[var3.size()]);
   }

   private static Class9200[] method29396(IResourcePack var0) {
      String[] var3 = Class9772.method38438(var0, "optifine/anim/", ".properties", (String[])null);
      if (var3.length <= 0) {
         return null;
      } else {
         ArrayList<Class9200> var4 = new ArrayList();

         for (int var5 = 0; var5 < var3.length; var5++) {
            String var6 = var3[var5];
            Class7944.method26810("Texture animation: " + var6);

            try {
               ResourceLocation var7 = new ResourceLocation(var6);
               InputStream var8 = var0.getResourceStream(ResourcePackType.CLIENT_RESOURCES, var7);
               Class20 var9 = new Class20();
               var9.load(var8);
               var8.close();
               Class9200 var10 = method29397(var9, var7);
               if (var10 != null) {
                  ResourceLocation var11 = new ResourceLocation(var10.method34486());
                  if (!Class7944.method26868(var0, var11)) {
                     Class7944.method26810("Skipped: " + var6 + ", target texture not loaded from same resource pack");
                  } else {
                     var4.add(var10);
                  }
               }
            } catch (FileNotFoundException var12) {
               Class7944.method26811("File not found: " + var12.getMessage());
            } catch (IOException var13) {
               var13.printStackTrace();
            }
         }

         return var4.toArray(new Class9200[var4.size()]);
      }
   }

   private static Class9200 method29397(Properties var0, ResourceLocation var1) {
      String var4 = var0.getProperty("from");
      String var5 = var0.getProperty("to");
      int var6 = Class7944.method26899(var0.getProperty("x"), -1);
      int var7 = Class7944.method26899(var0.getProperty("y"), -1);
      int var8 = Class7944.method26899(var0.getProperty("w"), -1);
      int var9 = Class7944.method26899(var0.getProperty("h"), -1);
      if (var4 == null || var5 == null) {
         Class7944.method26811("TextureAnimation: Source or target texture not specified");
         return null;
      } else if (var6 >= 0 && var7 >= 0 && var8 >= 0 && var9 >= 0) {
         var4 = var4.trim();
         var5 = var5.trim();
         String var10 = Class8684.method31275(var1.getPath());
         var4 = Class8684.method31274(var4, var10);
         var5 = Class8684.method31274(var5, var10);
         byte[] var11 = method29398(var4, var8);
         if (var11 == null) {
            Class7944.method26811("TextureAnimation: Source texture not found: " + var5);
            return null;
         } else {
            int var12 = var11.length / 4;
            int var13 = var12 / (var8 * var9);
            int var14 = var13 * var8 * var9;
            if (var12 != var14) {
               Class7944.method26811(
                  "TextureAnimation: Source texture has invalid number of frames: " + var4 + ", frames: " + (float)var12 / (float)(var8 * var9)
               );
               return null;
            } else {
               ResourceLocation var15 = new ResourceLocation(var5);

               try {
                  InputStream var16 = Class7944.method26863(var15);
                  if (var16 == null) {
                     Class7944.method26811("TextureAnimation: Target texture not found: " + var5);
                     return null;
                  } else {
                     BufferedImage var17 = method29400(var16);
                     if (var6 + var8 <= var17.getWidth() && var7 + var9 <= var17.getHeight()) {
                        return new Class9200(var4, var11, var5, var15, var6, var7, var8, var9, var0);
                     } else {
                        Class7944.method26811("TextureAnimation: Animation coordinates are outside the target texture: " + var5);
                        return null;
                     }
                  }
               } catch (IOException var18) {
                  Class7944.method26811("TextureAnimation: Target texture not found: " + var5);
                  return null;
               }
            }
         }
      } else {
         Class7944.method26811("TextureAnimation: Invalid coordinates");
         return null;
      }
   }

   private static byte[] method29398(String var0, int var1) {
      byte[] var4 = method29399(var0, var1);
      if (var4 == null) {
         var4 = method29399("/anim" + var0, var1);
      }

      return var4;
   }

   private static byte[] method29399(String var0, int var1) {
      GameSettings var4 = Class7944.method26928();

      try {
         ResourceLocation var5 = new ResourceLocation(var0);
         InputStream var6 = Class7944.method26863(var5);
         if (var6 == null) {
            return null;
         } else {
            BufferedImage var7 = method29400(var6);
            var6.close();
            if (var7 == null) {
               return null;
            } else {
               if (var1 > 0 && var7.getWidth() != var1) {
                  double var8 = (double)(var7.getHeight() / var7.getWidth());
                  int var10 = (int)((double)var1 * var8);
                  var7 = method29401(var7, var1, var10);
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

   private static BufferedImage method29400(InputStream var0) throws IOException {
      BufferedImage var3 = ImageIO.read(var0);
      var0.close();
      return var3;
   }

   private static BufferedImage method29401(BufferedImage var0, int var1, int var2) {
      BufferedImage var5 = new BufferedImage(var1, var2, 2);
      Graphics2D var6 = var5.createGraphics();
      var6.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
      var6.drawImage(var0, 0, 0, var1, var2, (ImageObserver)null);
      return var5;
   }

   public static int method29402() {
      return field35971 != null ? field35971.length : 0;
   }

   public static int method29403() {
      return field35972;
   }
}
