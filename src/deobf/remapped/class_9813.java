package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Random;

public final class class_9813 implements class_3374 {
   public static final Identifier field_49739 = new Identifier("binomial_with_bonus_count");
   private final int field_49736;
   private final float field_49738;

   public class_9813(int var1, float var2) {
      this.field_49736 = var1;
      this.field_49738 = var2;
   }

   @Override
   public int method_15564(Random var1, int var2, int var3) {
      for (int var6 = 0; var6 < var3 + this.field_49736; var6++) {
         if (var1.nextFloat() < this.field_49738) {
            var2++;
         }
      }

      return var2;
   }

   @Override
   public void method_15565(JsonObject var1, JsonSerializationContext var2) {
      var1.addProperty("extra", this.field_49736);
      var1.addProperty("probability", this.field_49738);
   }

   public static class_3374 method_45237(JsonObject var0, JsonDeserializationContext var1) {
      int var4 = class_6539.method_29767(var0, "extra");
      float var5 = class_6539.method_29774(var0, "probability");
      return new class_9813(var4, var5);
   }

   @Override
   public Identifier method_15563() {
      return field_49739;
   }
}
