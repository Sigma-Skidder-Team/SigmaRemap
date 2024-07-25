package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Random;

public final class class_7488 implements class_3374 {
   public static final class_4639 field_38217 = new class_4639("ore_drops");

   private class_7488() {
   }

   @Override
   public int method_15564(Random var1, int var2, int var3) {
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
   public void method_15565(JsonObject var1, JsonSerializationContext var2) {
   }

   public static class_3374 method_34049(JsonObject var0, JsonDeserializationContext var1) {
      return new class_7488();
   }

   @Override
   public class_4639 method_15563() {
      return field_38217;
   }
}
