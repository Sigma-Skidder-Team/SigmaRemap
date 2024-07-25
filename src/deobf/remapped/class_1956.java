package remapped;

import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.LongArgumentType;

public class class_1956 implements class_5590<LongArgumentType> {
   public void method_9051(LongArgumentType var1, class_8248 var2) {
      boolean var5 = var1.getMinimum() != Long.MIN_VALUE;
      boolean var6 = var1.getMaximum() != Long.MAX_VALUE;
      var2.writeByte(class_621.method_2898(var5, var6));
      if (var5) {
         var2.writeLong(var1.getMinimum());
      }

      if (var6) {
         var2.writeLong(var1.getMaximum());
      }
   }

   public LongArgumentType method_9049(class_8248 var1) {
      byte var4 = var1.readByte();
      long var5 = !class_621.method_2902(var4) ? Long.MIN_VALUE : var1.readLong();
      long var7 = !class_621.method_2900(var4) ? Long.MAX_VALUE : var1.readLong();
      return LongArgumentType.longArg(var5, var7);
   }

   public void method_9050(LongArgumentType var1, JsonObject var2) {
      if (var1.getMinimum() != Long.MIN_VALUE) {
         var2.addProperty("min", var1.getMinimum());
      }

      if (var1.getMaximum() != Long.MAX_VALUE) {
         var2.addProperty("max", var1.getMaximum());
      }
   }
}
