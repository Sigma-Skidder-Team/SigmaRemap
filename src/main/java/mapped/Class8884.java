package mapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.math.MathHelper;

public class Class8884 {
   public static final Class8884 field40200 = new Class8884(
      Class8841.field39940, Class8841.field39940, Class8841.field39940, Class8841.field39940, Class8841.field39940
   );
   private final Class8841 field40201;
   private final Class8841 field40202;
   private final Class8841 field40203;
   private final Class8841 field40204;
   private final Class8841 field40205;

   public Class8884(Class8841 var1, Class8841 var2, Class8841 var3, Class8841 var4, Class8841 var5) {
      this.field40201 = var1;
      this.field40202 = var2;
      this.field40203 = var3;
      this.field40204 = var4;
      this.field40205 = var5;
   }

   public static Class8884 method32326(Class8841 var0) {
      return new Class8884(Class8841.field39940, Class8841.field39940, Class8841.field39940, var0, Class8841.field39940);
   }

   public static Class8884 method32327(Class8841 var0) {
      return new Class8884(Class8841.field39940, var0, Class8841.field39940, Class8841.field39940, Class8841.field39940);
   }

   public boolean method32328(double var1, double var3, double var5, double var7, double var9, double var11) {
      float var15 = (float)(var1 - var7);
      float var16 = (float)(var3 - var9);
      float var17 = (float)(var5 - var11);
      if (!this.field40201.method32023(MathHelper.method37771(var15))
         || !this.field40202.method32023(MathHelper.method37771(var16))
         || !this.field40203.method32023(MathHelper.method37771(var17))) {
         return false;
      } else {
         return this.field40204.method32024((double)(var15 * var15 + var17 * var17))
            ? this.field40205.method32024((double)(var15 * var15 + var16 * var16 + var17 * var17))
            : false;
      }
   }

   public static Class8884 method32329(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var3 = JSONUtils.getJSONObject(var0, "distance");
         Class8841 var4 = Class8841.method32025(var3.get("x"));
         Class8841 var5 = Class8841.method32025(var3.get("y"));
         Class8841 var6 = Class8841.method32025(var3.get("z"));
         Class8841 var7 = Class8841.method32025(var3.get("horizontal"));
         Class8841 var8 = Class8841.method32025(var3.get("absolute"));
         return new Class8884(var4, var5, var6, var7, var8);
      } else {
         return field40200;
      }
   }

   public JsonElement method32330() {
      if (this != field40200) {
         JsonObject var3 = new JsonObject();
         var3.add("x", this.field40201.method32005());
         var3.add("y", this.field40202.method32005());
         var3.add("z", this.field40203.method32005());
         var3.add("horizontal", this.field40204.method32005());
         var3.add("absolute", this.field40205.method32005());
         return var3;
      } else {
         return JsonNull.INSTANCE;
      }
   }
}
