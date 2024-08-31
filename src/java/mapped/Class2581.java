package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import net.minecraft.util.ResourceLocation;

import java.util.Random;

public final class Class2581 implements Class2582 {
   public static final ResourceLocation field16803 = new ResourceLocation("uniform_bonus_count");
   private final int field16804;

   public Class2581(int var1) {
      this.field16804 = var1;
   }

   @Override
   public int method10785(Random var1, int var2, int var3) {
      return var2 + var1.nextInt(this.field16804 * var3 + 1);
   }

   @Override
   public void method10786(JsonObject var1, JsonSerializationContext var2) {
      var1.addProperty("bonusMultiplier", this.field16804);
   }

   public static Class2582 method10787(JsonObject var0, JsonDeserializationContext var1) {
      int var4 = JSONUtils.method32777(var0, "bonusMultiplier");
      return new Class2581(var4);
   }

   @Override
   public ResourceLocation method10788() {
      return field16803;
   }
}
