package mapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;

public class Class7080 {
   public final ViaVersion7 field30483;

   public Class7080(ViaVersion7 var1) {
      this.field30483 = var1;
   }

   public Class7080() {
      this.field30483 = null;
   }

   public void method22001(Class1913 var1) {
      this.field30483.method19360(var1, new Class3941(this));
   }

   public void method22002(Class1913 var1) {
      this.field30483.method19360(var1, new Class3800(this));
   }

   public void method22003(Class1913 var1) {
      this.field30483.method19360(var1, new Class3888(this));
   }

   public void method22004(Class1913 var1) {
      this.field30483.method19360(var1, new Class3861(this));
   }

   public JsonElement method22005(String var1) {
      try {
         JsonElement var4 = Class9610.method37359().parse(var1);
         this.method21999(var4);
         return var4;
      } catch (JsonSyntaxException var5) {
         if (ViaVersion3.getInstance().method34425()) {
            ViaVersion3.method27613().getLogger().severe("Error when trying to parse json: " + var1);
            throw var5;
         } else {
            return new JsonPrimitive(var1);
         }
      }
   }

   public void method21999(JsonElement var1) {
      if (var1 != null && !var1.isJsonNull()) {
         if (var1.isJsonArray()) {
            this.method22008(var1);
         } else if (!var1.isJsonPrimitive()) {
            JsonObject var4 = var1.getAsJsonObject();
            JsonPrimitive var5 = var4.getAsJsonPrimitive("text");
            if (var5 != null) {
               this.method22006(var5);
            }

            JsonElement var6 = var4.get("translate");
            if (var6 != null) {
               this.method22000(var4, var6.getAsString());
               JsonElement var7 = var4.get("with");
               if (var7 != null) {
                  this.method22008(var7);
               }
            }

            JsonElement var9 = var4.get("extra");
            if (var9 != null) {
               this.method22008(var9);
            }

            JsonObject var8 = var4.getAsJsonObject("hoverEvent");
            if (var8 != null) {
               this.method22007(var8);
            }
         } else {
            this.method22006(var1.getAsJsonPrimitive());
         }
      }
   }

   public void method22006(JsonPrimitive var1) {
   }

   public void method22000(JsonObject var1, String var2) {
   }

   public void method22007(JsonObject var1) {
      String var4 = var1.getAsJsonPrimitive("action").getAsString();
      if (!var4.equals("show_text")) {
         if (var4.equals("show_entity")) {
            JsonObject var5 = var1.getAsJsonObject("contents");
            if (var5 != null) {
               this.method21999(var5.get("name"));
            }
         }
      } else {
         JsonElement var6 = var1.get("value");
         this.method21999(var6 == null ? var1.get("contents") : var6);
      }
   }

   private void method22008(JsonElement var1) {
      for (JsonElement var5 : var1.getAsJsonArray()) {
         this.method21999(var5);
      }
   }

   public <T extends ViaVersion7> T method22009() {
      return (T)this.field30483;
   }
}
