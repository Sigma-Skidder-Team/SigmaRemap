package remapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;

public class class_6254 {
   public static final class_6254 field_31981 = new class_6254(
      class_6115.field_31261, class_6115.field_31261, class_6115.field_31261, class_6115.field_31261, class_6115.field_31261
   );
   private final class_6115 field_31980;
   private final class_6115 field_31977;
   private final class_6115 field_31982;
   private final class_6115 field_31979;
   private final class_6115 field_31983;

   public class_6254(class_6115 var1, class_6115 var2, class_6115 var3, class_6115 var4, class_6115 var5) {
      this.field_31980 = var1;
      this.field_31977 = var2;
      this.field_31982 = var3;
      this.field_31979 = var4;
      this.field_31983 = var5;
   }

   public static class_6254 method_28550(class_6115 var0) {
      return new class_6254(class_6115.field_31261, class_6115.field_31261, class_6115.field_31261, var0, class_6115.field_31261);
   }

   public static class_6254 method_28549(class_6115 var0) {
      return new class_6254(class_6115.field_31261, var0, class_6115.field_31261, class_6115.field_31261, class_6115.field_31261);
   }

   public boolean method_28548(double var1, double var3, double var5, double var7, double var9, double var11) {
      float var15 = (float)(var1 - var7);
      float var16 = (float)(var3 - var9);
      float var17 = (float)(var5 - var11);
      if (!this.field_31980.method_28088(MathHelper.abs(var15))
         || !this.field_31977.method_28088(MathHelper.abs(var16))
         || !this.field_31982.method_28088(MathHelper.abs(var17))) {
         return false;
      } else {
         return this.field_31979.method_28087((double)(var15 * var15 + var17 * var17))
            ? this.field_31983.method_28087((double)(var15 * var15 + var16 * var16 + var17 * var17))
            : false;
      }
   }

   public static class_6254 method_28552(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var3 = class_6539.method_29782(var0, "distance");
         class_6115 var4 = class_6115.method_28093(var3.get("x"));
         class_6115 var5 = class_6115.method_28093(var3.get("y"));
         class_6115 var6 = class_6115.method_28093(var3.get("z"));
         class_6115 var7 = class_6115.method_28093(var3.get("horizontal"));
         class_6115 var8 = class_6115.method_28093(var3.get("absolute"));
         return new class_6254(var4, var5, var6, var7, var8);
      } else {
         return field_31981;
      }
   }

   public JsonElement method_28551() {
      if (this != field_31981) {
         JsonObject var3 = new JsonObject();
         var3.add("x", this.field_31980.method_27853());
         var3.add("y", this.field_31977.method_27853());
         var3.add("z", this.field_31982.method_27853());
         var3.add("horizontal", this.field_31979.method_27853());
         var3.add("absolute", this.field_31983.method_27853());
         return var3;
      } else {
         return JsonNull.INSTANCE;
      }
   }
}
