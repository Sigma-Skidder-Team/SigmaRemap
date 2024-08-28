package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

import java.util.Random;

public final class Class2584 implements Class2582 {
   public static final ResourceLocation field16808 = new ResourceLocation("ore_drops");

   public Class2584() {
   }

   @Override
   public int method10785(Random var1, int var2, int var3) {
      if (var3 <= 0) {
         return var2;
      } else {
         int var6 = var1.nextInt(var3 + 2) - 1;
         if (var6 < 0) {
            var6 = 0;
         }

         return var2 * (var6 + 1);
      }
   }

   @Override
   public void method10786(JsonObject var1, JsonSerializationContext var2) {
   }

   public static Class2582 method10790(JsonObject var0, JsonDeserializationContext var1) {
      return new Class2584();
   }

   @Override
   public ResourceLocation method10788() {
      return field16808;
   }
}
