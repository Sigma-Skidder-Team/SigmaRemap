package remapped;

import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.FloatArgumentType;

public class class_1362 implements class_5590<FloatArgumentType> {
   public void method_6273(FloatArgumentType var1, class_8248 var2) {
      boolean var5 = var1.getMinimum() != -Float.MAX_VALUE;
      boolean var6 = var1.getMaximum() != Float.MAX_VALUE;
      var2.writeByte(class_621.method_2898(var5, var6));
      if (var5) {
         var2.writeFloat(var1.getMinimum());
      }

      if (var6) {
         var2.writeFloat(var1.getMaximum());
      }
   }

   public FloatArgumentType method_6271(class_8248 var1) {
      byte var4 = var1.readByte();
      float var5 = !class_621.method_2902(var4) ? -Float.MAX_VALUE : var1.readFloat();
      float var6 = !class_621.method_2900(var4) ? Float.MAX_VALUE : var1.readFloat();
      return FloatArgumentType.floatArg(var5, var6);
   }

   public void method_6272(FloatArgumentType var1, JsonObject var2) {
      if (var1.getMinimum() != -Float.MAX_VALUE) {
         var2.addProperty("min", var1.getMinimum());
      }

      if (var1.getMaximum() != Float.MAX_VALUE) {
         var2.addProperty("max", var1.getMaximum());
      }
   }
}
