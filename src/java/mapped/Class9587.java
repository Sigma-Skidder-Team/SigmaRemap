package mapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import java.util.function.Predicate;

public class Class9587 {
   public static final Class9587 field44822 = new Class9587(new ILootCondition[0]);
   private final ILootCondition[] field44823;
   private final Predicate<LootContext> field44824;

   private Class9587(ILootCondition[] var1) {
      this.field44823 = var1;
      this.field44824 = Class8582.<LootContext>method30665(var1);
   }

   public static Class9587 method37222(ILootCondition... var0) {
      return new Class9587(var0);
   }

   public static Class9587 method37223(JsonObject var0, String var1, Class9366 var2) {
      JsonElement var5 = var0.get(var1);
      return method37225(var1, var2, var5);
   }

   public static Class9587[] method37224(JsonObject var0, String var1, Class9366 var2) {
      JsonElement var5 = var0.get(var1);
      if (var5 != null && !var5.isJsonNull()) {
         JsonArray var6 = JSONUtils.method32784(var5, var1);
         Class9587[] var7 = new Class9587[var6.size()];

         for (int var8 = 0; var8 < var6.size(); var8++) {
            var7[var8] = method37225(var1 + "[" + var8 + "]", var2, var6.get(var8));
         }

         return var7;
      } else {
         return new Class9587[0];
      }
   }

   private static Class9587 method37225(String var0, Class9366 var1, JsonElement var2) {
      if (var2 != null && var2.isJsonArray()) {
         ILootCondition[] var6 = var1.method35497(var2.getAsJsonArray(), var1.method35498().toString() + "/" + var0, Class8524.field38290);
         return new Class9587(var6);
      } else {
         Class6671 var5 = Class6671.method20330(var2);
         return method37226(var5);
      }
   }

   public static Class9587 method37226(Class6671 var0) {
      if (var0 != Class6671.field29242) {
         ILootCondition var3 = Class123.method358(Class2063.field13447, var0).method24517();
         return new Class9587(new ILootCondition[]{var3});
      } else {
         return field44822;
      }
   }

   public boolean method37227(LootContext var1) {
      return this.field44824.test(var1);
   }

   public JsonElement method37228(Class8107 var1) {
      return (JsonElement)(this.field44823.length != 0 ? var1.method28095(this.field44823) : JsonNull.INSTANCE);
   }

   public static JsonElement method37229(Class9587[] var0, Class8107 var1) {
      if (var0.length == 0) {
         return JsonNull.INSTANCE;
      } else {
         JsonArray var4 = new JsonArray();

         for (Class9587 var8 : var0) {
            var4.add(var8.method37228(var1));
         }

         return var4;
      }
   }
}
