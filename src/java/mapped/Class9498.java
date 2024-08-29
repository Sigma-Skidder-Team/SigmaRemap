package mapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class Class9498 {
   private static JsonParser field44204 = new JsonParser();
   public static final String field44205 = "type";
   public static final String field44206 = "textureSize";
   public static final String field44207 = "usePlayerTexture";
   public static final String field44208 = "models";
   public static final String field44209 = "id";
   public static final String field44210 = "baseId";
   public static final String field44211 = "type";
   public static final String field44212 = "texture";
   public static final String field44213 = "textureSize";
   public static final String field44214 = "attachTo";
   public static final String field44215 = "invertAxis";
   public static final String field44216 = "mirrorTexture";
   public static final String field44217 = "translate";
   public static final String field44218 = "rotate";
   public static final String field44219 = "scale";
   public static final String field44220 = "boxes";
   public static final String field44221 = "sprites";
   public static final String field44222 = "submodel";
   public static final String field44223 = "submodels";
   public static final String field44224 = "textureOffset";
   public static final String field44225 = "coordinates";
   public static final String field44226 = "sizeAdd";
   public static final String field44227 = "uvDown";
   public static final String field44228 = "uvUp";
   public static final String field44229 = "uvNorth";
   public static final String field44230 = "uvSouth";
   public static final String field44231 = "uvWest";
   public static final String field44232 = "uvEast";
   public static final String field44233 = "uvFront";
   public static final String field44234 = "uvBack";
   public static final String field44235 = "uvLeft";
   public static final String field44236 = "uvRight";
   public static final String field44237 = "PlayerItem";
   public static final String field44238 = "ModelBox";

   private Class9498() {
   }

   public static Class7078 method36687(JsonObject var0) {
      String var3 = Class9664.method37717(var0, "type");
      if (!Class7944.equals(var3, "PlayerItem")) {
         throw new JsonParseException("Unknown model type: " + var3);
      } else {
         int[] var4 = Class9664.method37721(var0.get("textureSize"), 2);
         method36688(var4, "Missing texture size");
         Dimension var5 = new Dimension(var4[0], var4[1]);
         boolean var6 = Class9664.method37716(var0, "usePlayerTexture", false);
         JsonArray var7 = (JsonArray)var0.get("models");
         method36688(var7, "Missing elements");
         HashMap var8 = new HashMap();
         ArrayList<Class7954> var9 = new ArrayList();
         new ArrayList();

         for (int var10 = 0; var10 < var7.size(); var10++) {
            JsonObject var11 = (JsonObject)var7.get(var10);
            String var12 = Class9664.method37717(var11, "baseId");
            if (var12 != null) {
               JsonObject var13 = (JsonObject)var8.get(var12);
               if (var13 == null) {
                  Class7944.method26811("BaseID not found: " + var12);
                  continue;
               }

               for (Entry var15 : var13.entrySet()) {
                  if (!var11.has((String)var15.getKey())) {
                     var11.add((String)var15.getKey(), (JsonElement)var15.getValue());
                  }
               }
            }

            String var17 = Class9664.method37717(var11, "id");
            if (var17 != null) {
               if (var8.containsKey(var17)) {
                  Class7944.method26811("Duplicate model ID: " + var17);
               } else {
                  var8.put(var17, var11);
               }
            }

            Class7954 var18 = method36691(var11, var5);
            if (var18 != null) {
               var9.add(var18);
            }
         }

         Class7954[] var16 = var9.toArray(new Class7954[var9.size()]);
         return new Class7078(var5, var6, var16);
      }
   }

   private static void method36688(Object var0, String var1) {
      if (var0 == null) {
         throw new JsonParseException(var1);
      }
   }

   private static ResourceLocation method36689(String var0) {
      int var3 = var0.indexOf(58);
      if (var3 >= 0) {
         String var4 = var0.substring(0, var3);
         String var5 = var0.substring(var3 + 1);
         return new ResourceLocation(var4, var5);
      } else {
         return new ResourceLocation(var0);
      }
   }

   private static int method36690(String var0) {
      if (var0 != null) {
         if (!var0.equals("body")) {
            if (!var0.equals("head")) {
               if (!var0.equals("leftArm")) {
                  if (!var0.equals("rightArm")) {
                     if (!var0.equals("leftLeg")) {
                        if (!var0.equals("rightLeg")) {
                           if (!var0.equals("cape")) {
                              Class7944.method26811("Unknown attachModel: " + var0);
                              return 0;
                           } else {
                              return 6;
                           }
                        } else {
                           return 5;
                        }
                     } else {
                        return 4;
                     }
                  } else {
                     return 3;
                  }
               } else {
                  return 2;
               }
            } else {
               return 1;
            }
         } else {
            return 0;
         }
      } else {
         return 0;
      }
   }

   public static Class7954 method36691(JsonObject var0, Dimension var1) {
      String var4 = Class9664.method37717(var0, "type");
      if (Class7944.equals(var4, "ModelBox")) {
         String var5 = Class9664.method37717(var0, "attachTo");
         int var6 = method36690(var5);
         Class2847 var7 = new Class2847(RenderType::getEntityCutoutNoCull);
         var7.field17604 = var1.width;
         var7.field17605 = var1.height;
         Class7219 var8 = method36692(var0, var7, (int[])null, (String)null);
         return new Class7954(var6, var8);
      } else {
         Class7944.method26811("Unknown model type: " + var4);
         return null;
      }
   }

   public static Class7219 method36692(JsonObject var0, Class2828 var1, int[] var2, String var3) {
      Class7219 var6 = new Class7219(var1);
      String var7 = Class9664.method37717(var0, "id");
      var6.method22690(var7);
      float var8 = Class9664.method37715(var0, "scale", 1.0F);
      var6.field31044 = var8;
      var6.field31045 = var8;
      var6.field31046 = var8;
      String var9 = Class9664.method37717(var0, "texture");
      if (var9 != null) {
         var6.method22688(Class8331.method29214(var3, var9, ".png"));
      }

      int[] var10 = Class9664.method37721(var0.get("textureSize"), 2);
      if (var10 == null) {
         var10 = var2;
      }

      if (var10 != null) {
         var6.method22684(var10[0], var10[1]);
      }

      String var11 = Class9664.method37718(var0, "invertAxis", "").toLowerCase();
      boolean var12 = var11.contains("x");
      boolean var13 = var11.contains("y");
      boolean var14 = var11.contains("z");
      float[] var15 = Class9664.method37720(var0.get("translate"), 3, new float[3]);
      if (var12) {
         var15[0] = -var15[0];
      }

      if (var13) {
         var15[1] = -var15[1];
      }

      if (var14) {
         var15[2] = -var15[2];
      }

      float[] var16 = Class9664.method37720(var0.get("rotate"), 3, new float[3]);

      for (int var17 = 0; var17 < var16.length; var17++) {
         var16[var17] = var16[var17] / 180.0F * MathHelper.field45210;
      }

      if (var12) {
         var16[0] = -var16[0];
      }

      if (var13) {
         var16[1] = -var16[1];
      }

      if (var14) {
         var16[2] = -var16[2];
      }

      var6.method22679(var15[0], var15[1], var15[2]);
      var6.field31035 = var16[0];
      var6.field31036 = var16[1];
      var6.field31037 = var16[2];
      String var28 = Class9664.method37718(var0, "mirrorTexture", "").toLowerCase();
      boolean var18 = var28.contains("u");
      boolean var19 = var28.contains("v");
      if (var18) {
         var6.field31038 = true;
      }

      if (var19) {
         var6.field31043 = true;
      }

      JsonArray var20 = var0.getAsJsonArray("boxes");
      if (var20 != null) {
         for (int var21 = 0; var21 < var20.size(); var21++) {
            JsonObject var22 = var20.get(var21).getAsJsonObject();
            int[] var23 = Class9664.method37721(var22.get("textureOffset"), 2);
            int[][] var24 = method36693(var22);
            if (var23 == null && var24 == null) {
               throw new JsonParseException("Texture offset not specified");
            }

            float[] var25 = Class9664.method37719(var22.get("coordinates"), 6);
            if (var25 == null) {
               throw new JsonParseException("Coordinates not specified");
            }

            if (var12) {
               var25[0] = -var25[0] - var25[3];
            }

            if (var13) {
               var25[1] = -var25[1] - var25[4];
            }

            if (var14) {
               var25[2] = -var25[2] - var25[5];
            }

            float var26 = Class9664.method37715(var22, "sizeAdd", 0.0F);
            if (var24 == null) {
               var6.method22671(var23[0], var23[1]);
               var6.method22675(var25[0], var25[1], var25[2], (float)((int)var25[3]), (float)((int)var25[4]), (float)((int)var25[5]), var26);
            } else {
               var6.method22691(var24, var25[0], var25[1], var25[2], var25[3], var25[4], var25[5], var26);
            }
         }
      }

      JsonArray var29 = var0.getAsJsonArray("sprites");
      if (var29 != null) {
         for (int var30 = 0; var30 < var29.size(); var30++) {
            JsonObject var32 = var29.get(var30).getAsJsonObject();
            int[] var35 = Class9664.method37721(var32.get("textureOffset"), 2);
            if (var35 == null) {
               throw new JsonParseException("Texture offset not specified");
            }

            float[] var37 = Class9664.method37719(var32.get("coordinates"), 6);
            if (var37 == null) {
               throw new JsonParseException("Coordinates not specified");
            }

            if (var12) {
               var37[0] = -var37[0] - var37[3];
            }

            if (var13) {
               var37[1] = -var37[1] - var37[4];
            }

            if (var14) {
               var37[2] = -var37[2] - var37[5];
            }

            float var39 = Class9664.method37715(var32, "sizeAdd", 0.0F);
            var6.method22671(var35[0], var35[1]);
            var6.method22686(var37[0], var37[1], var37[2], (int)var37[3], (int)var37[4], (int)var37[5], var39);
         }
      }

      JsonObject var31 = (JsonObject)var0.get("submodel");
      if (var31 != null) {
         Class7219 var33 = method36692(var31, var1, var10, var3);
         var6.method22670(var33);
      }

      JsonArray var34 = (JsonArray)var0.get("submodels");
      if (var34 != null) {
         for (int var36 = 0; var36 < var34.size(); var36++) {
            JsonObject var38 = (JsonObject)var34.get(var36);
            Class7219 var40 = method36692(var38, var1, var10, var3);
            if (var40.method22689() != null) {
               Class7219 var27 = var6.method22693(var40.method22689());
               if (var27 != null) {
                  Class7944.method26811("Duplicate model ID: " + var40.method22689());
               }
            }

            var6.method22670(var40);
         }
      }

      return var6;
   }

   private static int[][] method36693(JsonObject var0) {
      int[][] var3 = new int[][]{
         Class9664.method37721(var0.get("uvDown"), 4),
         Class9664.method37721(var0.get("uvUp"), 4),
         Class9664.method37721(var0.get("uvNorth"), 4),
         Class9664.method37721(var0.get("uvSouth"), 4),
         Class9664.method37721(var0.get("uvWest"), 4),
         Class9664.method37721(var0.get("uvEast"), 4)
      };
      if (var3[2] == null) {
         var3[2] = Class9664.method37721(var0.get("uvFront"), 4);
      }

      if (var3[3] == null) {
         var3[3] = Class9664.method37721(var0.get("uvBack"), 4);
      }

      if (var3[4] == null) {
         var3[4] = Class9664.method37721(var0.get("uvLeft"), 4);
      }

      if (var3[5] == null) {
         var3[5] = Class9664.method37721(var0.get("uvRight"), 4);
      }

      boolean var4 = false;

      for (int var5 = 0; var5 < var3.length; var5++) {
         if (var3[var5] != null) {
            var4 = true;
         }
      }

      return var4 ? var3 : (int[][])null;
   }
}
