package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

import java.util.Random;

public final class Class2583 implements Class2582 {
   public static final ResourceLocation field16805 = new ResourceLocation("binomial_with_bonus_count");
   private final int field16806;
   private final float field16807;

   public Class2583(int var1, float var2) {
      this.field16806 = var1;
      this.field16807 = var2;
   }

   @Override
   public int method10785(Random var1, int var2, int var3) {
      for (int var6 = 0; var6 < var3 + this.field16806; var6++) {
         if (var1.nextFloat() < this.field16807) {
            var2++;
         }
      }

      return var2;
   }

   @Override
   public void method10786(JsonObject var1, JsonSerializationContext var2) {
      var1.addProperty("extra", this.field16806);
      var1.addProperty("probability", this.field16807);
   }

   public static Class2582 method10789(JsonObject var0, JsonDeserializationContext var1) {
      int var4 = JSONUtils.method32777(var0, "extra");
      float var5 = JSONUtils.method32771(var0, "probability");
      return new Class2583(var4, var5);
   }

   @Override
   public ResourceLocation method10788() {
      return field16805;
   }
}
