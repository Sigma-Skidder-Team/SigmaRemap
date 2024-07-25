package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Random;

public final class class_56 implements class_3374 {
   public static final Identifier field_41 = new Identifier("uniform_bonus_count");
   private final int field_42;

   public class_56(int var1) {
      this.field_42 = var1;
   }

   @Override
   public int method_15564(Random var1, int var2, int var3) {
      return var2 + var1.nextInt(this.field_42 * var3 + 1);
   }

   @Override
   public void method_15565(JsonObject var1, JsonSerializationContext var2) {
      var1.addProperty("bonusMultiplier", this.field_42);
   }

   public static class_3374 method_12(JsonObject var0, JsonDeserializationContext var1) {
      int var4 = class_6539.method_29767(var0, "bonusMultiplier");
      return new class_56(var4);
   }

   @Override
   public Identifier method_15563() {
      return field_41;
   }
}
