package remapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;

public class class_9078 {
   public final class_4106 field_46504;

   public class_9078(class_4106 var1) {
      this.field_46504 = var1;
   }

   public class_9078() {
      this.field_46504 = null;
   }

   public void method_41804(class_1372 var1) {
      this.field_46504.method_19015(var1, new class_2290(this));
   }

   public void method_41800(class_1372 var1) {
      this.field_46504.method_19015(var1, new class_7514(this));
   }

   public void method_41805(class_1372 var1) {
      this.field_46504.method_19015(var1, new class_3531(this));
   }

   public void method_41797(class_1372 var1) {
      this.field_46504.method_19015(var1, new class_2389(this));
   }

   public JsonElement method_41803(String var1) {
      try {
         JsonElement var4 = class_9012.method_41352().parse(var1);
         this.method_41802(var4);
         return var4;
      } catch (JsonSyntaxException var5) {
         if (class_3446.method_15883().method_33731()) {
            class_3446.method_15886().method_34617().severe("Error when trying to parse json: " + var1);
            throw var5;
         } else {
            return new JsonPrimitive(var1);
         }
      }
   }

   public void method_41802(JsonElement var1) {
      if (var1 != null && !var1.isJsonNull()) {
         if (var1.isJsonArray()) {
            this.method_41801(var1);
         } else if (!var1.isJsonPrimitive()) {
            JsonObject var4 = var1.getAsJsonObject();
            JsonPrimitive var5 = var4.getAsJsonPrimitive("text");
            if (var5 != null) {
               this.method_41807(var5);
            }

            JsonElement var6 = var4.get("translate");
            if (var6 != null) {
               this.method_41798(var4, var6.getAsString());
               JsonElement var7 = var4.get("with");
               if (var7 != null) {
                  this.method_41801(var7);
               }
            }

            JsonElement var9 = var4.get("extra");
            if (var9 != null) {
               this.method_41801(var9);
            }

            JsonObject var8 = var4.getAsJsonObject("hoverEvent");
            if (var8 != null) {
               this.method_41808(var8);
            }
         } else {
            this.method_41807(var1.getAsJsonPrimitive());
         }
      }
   }

   public void method_41807(JsonPrimitive var1) {
   }

   public void method_41798(JsonObject var1, String var2) {
   }

   public void method_41808(JsonObject var1) {
      String var4 = var1.getAsJsonPrimitive("action").getAsString();
      if (!var4.equals("show_text")) {
         if (var4.equals("show_entity")) {
            JsonObject var5 = var1.getAsJsonObject("contents");
            if (var5 != null) {
               this.method_41802(var5.get("name"));
            }
         }
      } else {
         JsonElement var6 = var1.get("value");
         this.method_41802(var6 == null ? var1.get("contents") : var6);
      }
   }

   private void method_41801(JsonElement var1) {
      for (JsonElement var5 : var1.getAsJsonArray()) {
         this.method_41802(var5);
      }
   }

   public <T extends class_4106> T method_41806() {
      return (T)this.field_46504;
   }
}
