package remapped;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;

public class class_3475 {
   private static class_5721[] field_17039 = new class_5721[0];

   public static void method_15968() {
      field_17039 = new class_5721[0];
      if (Config.method_14404()) {
         String var2 = "optifine/natural.properties";

         try {
            Identifier var3 = new Identifier(var2);
            if (!Config.method_14362(var3)) {
               Config.method_14277("NaturalTextures: configuration \"" + var2 + "\" not found");
               return;
            }

            boolean var4 = Config.method_14247(var3);
            InputStream var5 = Config.method_14374(var3);
            ArrayList var6 = new ArrayList(256);
            String var7 = Config.method_14270(var5);
            var5.close();
            String[] var8 = Config.method_14302(var7, "\n\r");
            if (var4) {
               Config.method_14277("Natural Textures: Parsing default configuration \"" + var2 + "\"");
               Config.method_14277("Natural Textures: Valid only for textures from default resource pack");
            } else {
               Config.method_14277("Natural Textures: Parsing configuration \"" + var2 + "\"");
            }

            int var9 = 0;
            class_8359 var10 = class_5525.method_25083();

            for (int var11 = 0; var11 < var8.length; var11++) {
               String var12 = var8[var11].trim();
               if (!var12.startsWith("#")) {
                  String[] var13 = Config.method_14302(var12, "=");
                  if (var13.length != 2) {
                     Config.method_14317("Natural Textures: Invalid \"" + var2 + "\" line: " + var12);
                  } else {
                     String var14 = var13[0].trim();
                     String var15 = var13[1].trim();
                     class_5155 var16 = var10.method_38522("minecraft:block/" + var14);
                     if (var16 == null) {
                        Config.method_14317("Natural Textures: Texture not found: \"" + var2 + "\" line: " + var12);
                     } else {
                        int var17 = var16.method_23624();
                        if (var17 < 0) {
                           Config.method_14317("Natural Textures: Invalid \"" + var2 + "\" line: " + var12);
                        } else {
                           if (var4 && !Config.method_14247(new Identifier("textures/block/" + var14 + ".png"))) {
                              return;
                           }

                           class_5721 var18 = new class_5721(var15);
                           if (var18.method_25879()) {
                              while (var6.size() <= var17) {
                                 var6.add(null);
                              }

                              var6.set(var17, var18);
                              var9++;
                           }
                        }
                     }
                  }
               }
            }

            field_17039 = var6.<class_5721>toArray(new class_5721[var6.size()]);
            if (var9 > 0) {
               Config.method_14277("NaturalTextures: " + var9);
            }
         } catch (FileNotFoundException var19) {
            Config.method_14317("NaturalTextures: configuration \"" + var2 + "\" not found");
            return;
         } catch (Exception var20) {
            var20.printStackTrace();
         }
      }
   }

   public static class_5024 method_15966(class_1331 var0, class_5024 var1) {
      class_5155 var4 = var1.method_23148();
      if (var4 != null) {
         class_5721 var5 = method_15965(var4);
         if (var5 != null) {
            int var6 = class_9049.method_41540(var1.method_23150());
            int var7 = Config.method_14242(var0, var6);
            int var8 = 0;
            boolean var9 = false;
            if (var5.field_28906 > 1) {
               var8 = var7 & 3;
            }

            if (var5.field_28906 == 2) {
               var8 = var8 / 2 * 2;
            }

            if (var5.field_28904) {
               var9 = (var7 & 4) != 0;
            }

            return var5.method_25881(var1, var8, var9);
         } else {
            return var1;
         }
      } else {
         return var1;
      }
   }

   public static class_5721 method_15965(class_5155 var0) {
      if (!(var0 instanceof class_5155)) {
         return null;
      } else {
         int var3 = var0.method_23624();
         return var3 >= 0 && var3 < field_17039.length ? field_17039[var3] : null;
      }
   }
}
