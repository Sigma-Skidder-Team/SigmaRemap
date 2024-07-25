package remapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class class_1056 {
   private String field_5799 = null;
   public static final String field_5796 = "items";
   public static final String field_5798 = "type";
   public static final String field_5800 = "active";

   public class_1056(String var1) {
      this.field_5799 = var1;
   }

   public class_2697 method_4639(JsonElement var1) {
      if (var1 == null) {
         throw new JsonParseException("JSON object is null, player: " + this.field_5799);
      } else {
         JsonObject var4 = (JsonObject)var1;
         class_2697 var5 = new class_2697();
         JsonArray var6 = (JsonArray)var4.get("items");
         if (var6 != null) {
            for (int var7 = 0; var7 < var6.size(); var7++) {
               JsonObject var8 = (JsonObject)var6.get(var7);
               boolean var9 = class_9235.method_42600(var8, "active", true);
               if (var9) {
                  String var10 = class_9235.method_42595(var8, "type");
                  if (var10 != null) {
                     String var11 = class_9235.method_42595(var8, "model");
                     if (var11 == null) {
                        var11 = "items/" + var10 + "/model.cfg";
                     }

                     class_1347 var12 = this.method_4636(var11);
                     if (var12 != null) {
                        if (!var12.method_6233()) {
                           String var13 = class_9235.method_42595(var8, "texture");
                           if (var13 == null) {
                              var13 = "items/" + var10 + "/users/" + this.field_5799 + ".png";
                           }

                           class_5797 var14 = this.method_4637(var13);
                           if (var14 == null) {
                              continue;
                           }

                           var12.method_6228(var14);
                           class_4639 var15 = new class_4639("optifine.net", var13);
                           var12.method_6234(var15);
                        }

                        var5.method_12154(var12);
                     }
                  } else {
                     class_3111.method_14317("Item type is null, player: " + this.field_5799);
                  }
               }
            }
         }

         return var5;
      }
   }

   private class_5797 method_4637(String var1) {
      String var4 = class_6014.method_27454() + "/" + var1;

      try {
         byte[] var5 = class_2316.method_10645(var4, MinecraftClient.getInstance().method_8607());
         return class_5797.method_26230(new ByteArrayInputStream(var5));
      } catch (IOException var6) {
         class_3111.method_14317("Error loading item texture " + var1 + ": " + var6.getClass().getName() + ": " + var6.getMessage());
         return null;
      }
   }

   private class_1347 method_4636(String var1) {
      String var4 = class_6014.method_27454() + "/" + var1;

      try {
         byte[] var5 = class_2316.method_10645(var4, MinecraftClient.getInstance().method_8607());
         String var6 = new String(var5, "ASCII");
         JsonParser var7 = new JsonParser();
         JsonObject var8 = (JsonObject)var7.parse(var6);
         return class_8616.method_39598(var8);
      } catch (Exception var9) {
         class_3111.method_14317("Error loading item model " + var1 + ": " + var9.getClass().getName() + ": " + var9.getMessage());
         return null;
      }
   }
}
