package mapped;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;

public class Class8052 {
   private static Class8736[] field34582 = new Class8736[0];

   public static void method27654() {
      field34582 = new Class8736[0];
      if (Class7944.method26916()) {
         String var2 = "optifine/natural.properties";

         try {
            ResourceLocation var3 = new ResourceLocation(var2);
            if (!Class7944.method26866(var3)) {
               Class7944.method26810("NaturalTextures: configuration \"" + var2 + "\" not found");
               return;
            }

            boolean var4 = Class7944.method26872(var3);
            InputStream var5 = Class7944.method26863(var3);
            ArrayList<Class8736> var6 = new ArrayList(256);
            String var7 = Class7944.method26925(var5);
            var5.close();
            String[] var8 = Class7944.method26903(var7, "\n\r");
            if (var4) {
               Class7944.method26810("Natural Textures: Parsing default configuration \"" + var2 + "\"");
               Class7944.method26810("Natural Textures: Valid only for textures from default resource pack");
            } else {
               Class7944.method26810("Natural Textures: Parsing configuration \"" + var2 + "\"");
            }

            int var9 = 0;
            AtlasTexture var10 = Class8684.method31267();

            for (int var11 = 0; var11 < var8.length; var11++) {
               String var12 = var8[var11].trim();
               if (!var12.startsWith("#")) {
                  String[] var13 = Class7944.method26903(var12, "=");
                  if (var13.length != 2) {
                     Class7944.method26811("Natural Textures: Invalid \"" + var2 + "\" line: " + var12);
                  } else {
                     String var14 = var13[0].trim();
                     String var15 = var13[1].trim();
                     TextureAtlasSprite var16 = var10.method1106("minecraft:block/" + var14);
                     if (var16 == null) {
                        Class7944.method26811("Natural Textures: Texture not found: \"" + var2 + "\" line: " + var12);
                     } else {
                        int var17 = var16.method7475();
                        if (var17 < 0) {
                           Class7944.method26811("Natural Textures: Invalid \"" + var2 + "\" line: " + var12);
                        } else {
                           if (var4 && !Class7944.method26872(new ResourceLocation("textures/block/" + var14 + ".png"))) {
                              return;
                           }

                           Class8736 var18 = new Class8736(var15);
                           if (var18.method31523()) {
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

            field34582 = var6.toArray(new Class8736[var6.size()]);
            if (var9 > 0) {
               Class7944.method26810("NaturalTextures: " + var9);
            }
         } catch (FileNotFoundException var19) {
            Class7944.method26811("NaturalTextures: configuration \"" + var2 + "\" not found");
            return;
         } catch (Exception var20) {
            var20.printStackTrace();
         }
      }
   }

   public static Class8557 method27655(BlockPos var0, Class8557 var1) {
      TextureAtlasSprite var4 = var1.method30516();
      if (var4 != null) {
         Class8736 var5 = method27656(var4);
         if (var5 != null) {
            int var6 = Class9619.method37451(var1.method30514());
            int var7 = Class7944.method26934(var0, var6);
            int var8 = 0;
            boolean var9 = false;
            if (var5.field39386 > 1) {
               var8 = var7 & 3;
            }

            if (var5.field39386 == 2) {
               var8 = var8 / 2 * 2;
            }

            if (var5.field39387) {
               var9 = (var7 & 4) != 0;
            }

            return var5.method31524(var1, var8, var9);
         } else {
            return var1;
         }
      } else {
         return var1;
      }
   }

   public static Class8736 method27656(TextureAtlasSprite var0) {
      if (!(var0 instanceof TextureAtlasSprite)) {
         return null;
      } else {
         int var3 = var0.method7475();
         return var3 >= 0 && var3 < field34582.length ? field34582[var3] : null;
      }
   }
}
