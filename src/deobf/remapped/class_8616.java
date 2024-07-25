package remapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class class_8616 {
   private static JsonParser field_44221 = new JsonParser();
   public static final String field_44203 = "type";
   public static final String field_44201 = "textureSize";
   public static final String field_44220 = "usePlayerTexture";
   public static final String field_44199 = "models";
   public static final String field_44195 = "id";
   public static final String field_44217 = "baseId";
   public static final String field_44202 = "type";
   public static final String field_44210 = "texture";
   public static final String field_44192 = "textureSize";
   public static final String field_44222 = "attachTo";
   public static final String field_44213 = "invertAxis";
   public static final String field_44190 = "mirrorTexture";
   public static final String field_44209 = "translate";
   public static final String field_44188 = "rotate";
   public static final String field_44207 = "scale";
   public static final String field_44197 = "boxes";
   public static final String field_44198 = "sprites";
   public static final String field_44208 = "submodel";
   public static final String field_44191 = "submodels";
   public static final String field_44194 = "textureOffset";
   public static final String field_44212 = "coordinates";
   public static final String field_44219 = "sizeAdd";
   public static final String field_44211 = "uvDown";
   public static final String field_44205 = "uvUp";
   public static final String field_44200 = "uvNorth";
   public static final String field_44216 = "uvSouth";
   public static final String field_44214 = "uvWest";
   public static final String field_44193 = "uvEast";
   public static final String field_44223 = "uvFront";
   public static final String field_44189 = "uvBack";
   public static final String field_44206 = "uvLeft";
   public static final String field_44218 = "uvRight";
   public static final String field_44204 = "PlayerItem";
   public static final String field_44196 = "ModelBox";

   private class_8616() {
   }

   public static class_1347 method_39598(JsonObject var0) {
      String var3 = class_9235.method_42595(var0, "type");
      if (!Config.equals(var3, "PlayerItem")) {
         throw new JsonParseException("Unknown model type: " + var3);
      } else {
         int[] var4 = class_9235.method_42601(var0.get("textureSize"), 2);
         method_39604(var4, "Missing texture size");
         Dimension var5 = new Dimension(var4[0], var4[1]);
         boolean var6 = class_9235.method_42600(var0, "usePlayerTexture", false);
         JsonArray var7 = (JsonArray)var0.get("models");
         method_39604(var7, "Missing elements");
         HashMap var8 = new HashMap();
         ArrayList var9 = new ArrayList();
         new ArrayList();

         for (int var10 = 0; var10 < var7.size(); var10++) {
            JsonObject var11 = (JsonObject)var7.get(var10);
            String var12 = class_9235.method_42595(var11, "baseId");
            if (var12 != null) {
               JsonObject var13 = (JsonObject)var8.get(var12);
               if (var13 == null) {
                  Config.method_14317("BaseID not found: " + var12);
                  continue;
               }

               for (Entry var15 : var13.entrySet()) {
                  if (!var11.has((String)var15.getKey())) {
                     var11.add((String)var15.getKey(), (JsonElement)var15.getValue());
                  }
               }
            }

            String var17 = class_9235.method_42595(var11, "id");
            if (var17 != null) {
               if (var8.containsKey(var17)) {
                  Config.method_14317("Duplicate model ID: " + var17);
               } else {
                  var8.put(var17, var11);
               }
            }

            class_3142 var18 = method_39602(var11, var5);
            if (var18 != null) {
               var9.add(var18);
            }
         }

         class_3142[] var16 = var9.<class_3142>toArray(new class_3142[var9.size()]);
         return new class_1347(var5, var6, var16);
      }
   }

   private static void method_39604(Object var0, String var1) {
      if (var0 == null) {
         throw new JsonParseException(var1);
      }
   }

   private static Identifier method_39603(String var0) {
      int var3 = var0.indexOf(58);
      if (var3 >= 0) {
         String var4 = var0.substring(0, var3);
         String var5 = var0.substring(var3 + 1);
         return new Identifier(var4, var5);
      } else {
         return new Identifier(var0);
      }
   }

   private static int method_39601(String var0) {
      if (var0 != null) {
         if (!var0.equals("body")) {
            if (!var0.equals("head")) {
               if (!var0.equals("leftArm")) {
                  if (!var0.equals("rightArm")) {
                     if (!var0.equals("leftLeg")) {
                        if (!var0.equals("rightLeg")) {
                           if (!var0.equals("cape")) {
                              Config.method_14317("Unknown attachModel: " + var0);
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

   public static class_3142 method_39602(JsonObject var0, Dimension var1) {
      String var4 = class_9235.method_42595(var0, "type");
      if (Config.equals(var4, "ModelBox")) {
         String var5 = class_9235.method_42595(var0, "attachTo");
         int var6 = method_39601(var5);
         class_4409 var7 = new class_4409(RenderLayer::method_16755);
         var7.field_49928 = var1.width;
         var7.field_49927 = var1.height;
         class_1549 var8 = method_39597(var0, var7, (int[])null, (String)null);
         return new class_3142(var6, var8);
      } else {
         Config.method_14317("Unknown model type: " + var4);
         return null;
      }
   }

   public static class_1549 method_39597(JsonObject var0, class_9873 var1, int[] var2, String var3) {
      class_1549 var6 = new class_1549(var1);
      String var7 = class_9235.method_42595(var0, "id");
      var6.method_7035(var7);
      float var8 = class_9235.method_42594(var0, "scale", 1.0F);
      var6.field_8201 = var8;
      var6.field_8182 = var8;
      var6.field_8193 = var8;
      String var9 = class_9235.method_42595(var0, "texture");
      if (var9 != null) {
         var6.method_7058(class_4296.method_19951(var3, var9, ".png"));
      }

      int[] var10 = class_9235.method_42601(var0.get("textureSize"), 2);
      if (var10 == null) {
         var10 = var2;
      }

      if (var10 != null) {
         var6.method_7033(var10[0], var10[1]);
      }

      String var11 = class_9235.method_42596(var0, "invertAxis", "").toLowerCase();
      boolean var12 = var11.contains("x");
      boolean var13 = var11.contains("y");
      boolean var14 = var11.contains("z");
      float[] var15 = class_9235.method_42598(var0.get("translate"), 3, new float[3]);
      if (var12) {
         var15[0] = -var15[0];
      }

      if (var13) {
         var15[1] = -var15[1];
      }

      if (var14) {
         var15[2] = -var15[2];
      }

      float[] var16 = class_9235.method_42598(var0.get("rotate"), 3, new float[3]);

      for (int var17 = 0; var17 < var16.length; var17++) {
         var16[var17] = var16[var17] / 180.0F * MathHelper.PI;
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

      var6.method_7046(var15[0], var15[1], var15[2]);
      var6.field_8191 = var16[0];
      var6.field_8190 = var16[1];
      var6.field_8185 = var16[2];
      String var28 = class_9235.method_42596(var0, "mirrorTexture", "").toLowerCase();
      boolean var18 = var28.contains("u");
      boolean var19 = var28.contains("v");
      if (var18) {
         var6.field_8197 = true;
      }

      if (var19) {
         var6.field_8204 = true;
      }

      JsonArray var20 = var0.getAsJsonArray("boxes");
      if (var20 != null) {
         for (int var21 = 0; var21 < var20.size(); var21++) {
            JsonObject var22 = var20.get(var21).getAsJsonObject();
            int[] var23 = class_9235.method_42601(var22.get("textureOffset"), 2);
            int[][] var24 = method_39600(var22);
            if (var23 == null && var24 == null) {
               throw new JsonParseException("Texture offset not specified");
            }

            float[] var25 = class_9235.method_42597(var22.get("coordinates"), 6);
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

            float var26 = class_9235.method_42594(var22, "sizeAdd", 0.0F);
            if (var24 == null) {
               var6.method_7037(var23[0], var23[1]);
               var6.method_7049(var25[0], var25[1], var25[2], (float)((int)var25[3]), (float)((int)var25[4]), (float)((int)var25[5]), var26);
            } else {
               var6.method_7055(var24, var25[0], var25[1], var25[2], var25[3], var25[4], var25[5], var26);
            }
         }
      }

      JsonArray var29 = var0.getAsJsonArray("sprites");
      if (var29 != null) {
         for (int var30 = 0; var30 < var29.size(); var30++) {
            JsonObject var32 = var29.get(var30).getAsJsonObject();
            int[] var35 = class_9235.method_42601(var32.get("textureOffset"), 2);
            if (var35 == null) {
               throw new JsonParseException("Texture offset not specified");
            }

            float[] var37 = class_9235.method_42597(var32.get("coordinates"), 6);
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

            float var39 = class_9235.method_42594(var32, "sizeAdd", 0.0F);
            var6.method_7037(var35[0], var35[1]);
            var6.method_7039(var37[0], var37[1], var37[2], (int)var37[3], (int)var37[4], (int)var37[5], var39);
         }
      }

      JsonObject var31 = (JsonObject)var0.get("submodel");
      if (var31 != null) {
         class_1549 var33 = method_39597(var31, var1, var10, var3);
         var6.method_7043(var33);
      }

      JsonArray var34 = (JsonArray)var0.get("submodels");
      if (var34 != null) {
         for (int var36 = 0; var36 < var34.size(); var36++) {
            JsonObject var38 = (JsonObject)var34.get(var36);
            class_1549 var40 = method_39597(var38, var1, var10, var3);
            if (var40.method_7036() != null) {
               class_1549 var27 = var6.method_7042(var40.method_7036());
               if (var27 != null) {
                  Config.method_14317("Duplicate model ID: " + var40.method_7036());
               }
            }

            var6.method_7043(var40);
         }
      }

      return var6;
   }

   private static int[][] method_39600(JsonObject var0) {
      int[][] var3 = new int[][]{
         class_9235.method_42601(var0.get("uvDown"), 4),
         class_9235.method_42601(var0.get("uvUp"), 4),
         class_9235.method_42601(var0.get("uvNorth"), 4),
         class_9235.method_42601(var0.get("uvSouth"), 4),
         class_9235.method_42601(var0.get("uvWest"), 4),
         class_9235.method_42601(var0.get("uvEast"), 4)
      };
      if (var3[2] == null) {
         var3[2] = class_9235.method_42601(var0.get("uvFront"), 4);
      }

      if (var3[3] == null) {
         var3[3] = class_9235.method_42601(var0.get("uvBack"), 4);
      }

      if (var3[4] == null) {
         var3[4] = class_9235.method_42601(var0.get("uvLeft"), 4);
      }

      if (var3[5] == null) {
         var3[5] = class_9235.method_42601(var0.get("uvRight"), 4);
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
