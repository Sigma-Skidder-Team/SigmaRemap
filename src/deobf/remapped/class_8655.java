package remapped;

import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class class_8655 implements class_5590<DoubleArgumentType> {
   public void method_39678(DoubleArgumentType var1, class_8248 var2) {
      boolean var5 = var1.getMinimum() != -Double.MAX_VALUE;
      boolean var6 = var1.getMaximum() != Double.MAX_VALUE;
      var2.writeByte(class_621.method_2898(var5, var6));
      if (var5) {
         var2.writeDouble(var1.getMinimum());
      }

      if (var6) {
         var2.writeDouble(var1.getMaximum());
      }
   }

   public DoubleArgumentType method_39676(class_8248 var1) {
      byte var4 = var1.readByte();
      double var5 = !class_621.method_2902(var4) ? -Double.MAX_VALUE : var1.readDouble();
      double var7 = !class_621.method_2900(var4) ? Double.MAX_VALUE : var1.readDouble();
      return DoubleArgumentType.doubleArg(var5, var7);
   }

   public void method_39677(DoubleArgumentType var1, JsonObject var2) {
      if (var1.getMinimum() != -Double.MAX_VALUE) {
         var2.addProperty("min", var1.getMinimum());
      }

      if (var1.getMaximum() != Double.MAX_VALUE) {
         var2.addProperty("max", var1.getMaximum());
      }
   }
}
