package remapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.io.IOException;

public class class_9702 extends class_9078 {
   public class_9702(class_4106 var1) {
      super(var1);
   }

   public class_9702() {
   }

   @Override
   public void method_41808(JsonObject var1) {
      super.method_41808(var1);
      String var4 = var1.getAsJsonPrimitive("action").getAsString();
      if (var4.equals("show_item")) {
         JsonElement var5 = var1.get("value");
         if (var5 != null) {
            String var6 = this.method_44830(var5);
            if (var6 != null) {
               class_5531 var7;
               try {
                  var7 = class_4483.method_20826(var6);
               } catch (Exception var17) {
                  class_3446.method_15886().method_34617().warning("Error reading NBT in show_item:" + var6);
                  throw new RuntimeException(var17);
               }

               class_5531 var8 = var7.<class_5531>method_25123("tag");
               class_6733 var9 = var7.<class_6733>method_25123("Damage");
               short var10 = var9 != null ? var9.method_30876() : 0;
               class_9530 var11 = new class_9530();
               var11.method_43966(var10);
               var11.method_43960(var8);
               this.method_44831(var11);
               if (var10 != var11.method_43962()) {
                  var7.<class_6733>method_25122(new class_6733("Damage", var11.method_43962()));
               }

               if (var8 != null) {
                  var7.<class_5531>method_25122(var8);
               }

               JsonArray var12 = new JsonArray();
               JsonObject var13 = new JsonObject();
               var12.add(var13);

               try {
                  String var14 = class_4483.method_20815(var7);
                  var13.addProperty("text", var14);
                  var1.add("value", var12);
               } catch (IOException var16) {
                  class_3446.method_15886().method_34617().warning("Error writing NBT in show_item:" + var6);
                  var16.printStackTrace();
               }
            }
         }
      }
   }

   public void method_44831(class_9530 var1) {
      class_9330.method_43074(var1);
   }

   public String method_44830(JsonElement var1) {
      if (!var1.isJsonArray()) {
         if (!var1.isJsonObject()) {
            if (var1.isJsonPrimitive()) {
               return var1.getAsJsonPrimitive().getAsString();
            }
         } else {
            JsonPrimitive var4 = var1.getAsJsonObject().getAsJsonPrimitive("text");
            if (var4 != null) {
               return var4.getAsString();
            }
         }
      } else {
         for (JsonElement var5 : var1.getAsJsonArray()) {
            String var6 = this.method_44830(var5);
            if (var6 != null) {
               return var6;
            }
         }
      }

      return null;
   }

   @Override
   public void method_41798(JsonObject var1, String var2) {
      super.method_41798(var1, var2);
      String var5 = class_8633.field_44277.method_43092().get(var2);
      if (var5 == null) {
         var5 = class_8633.field_44277.method_43097().get(var2);
      }

      if (var5 != null) {
         var1.addProperty("translate", var5);
      }
   }
}
