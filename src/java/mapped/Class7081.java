package mapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.io.IOException;

public class Class7081 extends Class7080 {
   public Class7081(ViaVersion7 var1) {
      super(var1);
   }

   public Class7081() {
   }

   @Override
   public void method22007(JsonObject var1) {
      super.method22007(var1);
      String var4 = var1.getAsJsonPrimitive("action").getAsString();
      if (var4.equals("show_item")) {
         JsonElement var5 = var1.get("value");
         if (var5 != null) {
            String var6 = this.method22011(var5);
            if (var6 != null) {
               Class72 var7;
               try {
                  var7 = Class8401.method29508(var6);
               } catch (Exception var17) {
                  ViaVersion3.method27613().method27366().warning("Error reading NBT in show_item:" + var6);
                  throw new RuntimeException(var17);
               }

               Class72 var8 = var7.<Class72>method235("tag");
               Class73 var9 = var7.<Class73>method235("Damage");
               short var10 = var9 != null ? var9.method205() : 0;
               Class9738 var11 = new Class9738();
               var11.method38166(var10);
               var11.method38168(var8);
               this.method22010(var11);
               if (var10 != var11.method38165()) {
                  var7.<Class73>method236(new Class73("Damage", var11.method38165()));
               }

               if (var8 != null) {
                  var7.<Class72>method236(var8);
               }

               JsonArray var12 = new JsonArray();
               JsonObject var13 = new JsonObject();
               var12.add(var13);

               try {
                  String var14 = Class8401.method29509(var7);
                  var13.addProperty("text", var14);
                  var1.add("value", var12);
               } catch (IOException var16) {
                  ViaVersion3.method27613().method27366().warning("Error writing NBT in show_item:" + var6);
                  var16.printStackTrace();
               }
            }
         }
      }
   }

   public void method22010(Class9738 var1) {
      Class9687.method37923(var1);
   }

   public String method22011(JsonElement var1) {
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
            String var6 = this.method22011(var5);
            if (var6 != null) {
               return var6;
            }
         }
      }

      return null;
   }

   @Override
   public void method22000(JsonObject var1, String var2) {
      super.method22000(var1, var2);
      String var5 = Class6380.field27947.method18551().get(var2);
      if (var5 == null) {
         var5 = Class6380.field27947.method18552().get(var2);
      }

      if (var5 != null) {
         var1.addProperty("translate", var5);
      }
   }
}
