package mapped;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class Class8862 {
   private static Class7720[][] field40050 = (Class7720[][])null;

   public static void method32260() {
      field40050 = (Class7720[][])null;
   }

   public static void method32261() {
      method32260();
      if (Class7944.method26912()) {
         field40050 = method32262();
      }
   }

   private static Class7720[][] method32262() {
      Class7720[][] var2 = new Class7720[10][0];
      String var3 = "optifine/sky/world";
      int var4 = -1;

      for (int var5 = 0; var5 < var2.length; var5++) {
         String var6 = var3 + var5;
         ArrayList<Class7720> var7 = new ArrayList();

         for (int var8 = 0; var8 < 1000; var8++) {
            String var9 = var6 + "/sky" + var8 + ".properties";
            int var10 = 0;

            try {
               ResourceLocation var11 = new ResourceLocation(var9);
               InputStream var12 = Class7944.method26863(var11);
               if (var12 == null) {
                  if (++var10 > 10) {
                     break;
                  }
               }

               Class20 var13 = new Class20();
               var13.load(var12);
               var12.close();
               Class7944.method26810("CustomSky properties: " + var9);
               String var14 = var8 + ".png";
               Class7720 var15 = new Class7720(var13, var14);
               if (var15.method25511(var9)) {
                  String var16 = Class9402.method35774(var15.field33129, ".png");
                  ResourceLocation var17 = new ResourceLocation(var16);
                  Class290 var18 = Class8684.method31265(var17);
                  if (var18 == null) {
                     Class7944.method26815("CustomSky: Texture not found: " + var17);
                  } else {
                     var15.field33147 = var18.getGlTextureId();
                     var7.add(var15);
                     var12.close();
                  }
               }
            } catch (FileNotFoundException var19) {
               if (++var10 > 10) {
                  break;
               }
            } catch (IOException var20) {
               var20.printStackTrace();
            }
         }

         if (var7.size() > 0) {
            Class7720[] var24 = var7.toArray(new Class7720[var7.size()]);
            var2[var5] = var24;
            var4 = var5;
         }
      }

      if (var4 < 0) {
         return (Class7720[][])null;
      } else {
         int var21 = var4 + 1;
         Class7720[][] var22 = new Class7720[var21][0];

         for (int var23 = 0; var23 < var22.length; var23++) {
            var22[var23] = var2[var23];
         }

         return var22;
      }
   }

   public static void method32263(World var0, TextureManager var1, MatrixStack var2, float var3) {
      if (field40050 != null) {
         int var6 = Class8509.method30144(var0);
         if (var6 >= 0 && var6 < field40050.length) {
            Class7720[] var7 = field40050[var6];
            if (var7 != null) {
               long var8 = var0.method6784();
               int var10 = (int)(var8 % 24000L);
               float var11 = var0.method7001(var3);
               float var12 = var0.method6792(var3);
               float var13 = var0.method6790(var3);
               if (var12 > 0.0F) {
                  var13 /= var12;
               }

               for (int var14 = 0; var14 < var7.length; var14++) {
                  Class7720 var15 = var7[var14];
                  if (var15.method25519(var0, var10)) {
                     var15.method25513(var0, var2, var10, var11, var12, var13);
                  }
               }

               float var16 = 1.0F - var12;
               Class6988.method21639(var16);
            }
         }
      }
   }

   public static boolean method32264(World var0) {
      if (field40050 != null) {
         int var3 = Class8509.method30144(var0);
         if (var3 >= 0 && var3 < field40050.length) {
            Class7720[] var4 = field40050[var3];
            return var4 != null ? var4.length > 0 : false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }
}
