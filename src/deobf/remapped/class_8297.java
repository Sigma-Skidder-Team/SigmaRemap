package remapped;

import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.IntegerArgumentType;

public class class_8297 implements class_5590<IntegerArgumentType> {
   public void method_38280(IntegerArgumentType var1, class_8248 var2) {
      boolean var5 = var1.getMinimum() != Integer.MIN_VALUE;
      boolean var6 = var1.getMaximum() != Integer.MAX_VALUE;
      var2.writeByte(class_621.method_2898(var5, var6));
      if (var5) {
         var2.writeInt(var1.getMinimum());
      }

      if (var6) {
         var2.writeInt(var1.getMaximum());
      }
   }

   public IntegerArgumentType method_38278(class_8248 var1) {
      byte var4 = var1.readByte();
      int var5 = !class_621.method_2902(var4) ? Integer.MIN_VALUE : var1.readInt();
      int var6 = !class_621.method_2900(var4) ? Integer.MAX_VALUE : var1.readInt();
      return IntegerArgumentType.integer(var5, var6);
   }

   public void method_38279(IntegerArgumentType var1, JsonObject var2) {
      if (var1.getMinimum() != Integer.MIN_VALUE) {
         var2.addProperty("min", var1.getMinimum());
      }

      if (var1.getMaximum() != Integer.MAX_VALUE) {
         var2.addProperty("max", var1.getMaximum());
      }
   }
}
