package remapped;

import java.math.BigInteger;

public class class_5264 implements class_4650 {
   public class_5264(class_8200 var1) {
      this.field_26917 = var1;
   }

   @Override
   public class_1621 method_21502(Object var1) {
      class_9592 var4;
      String var5;
      if (!(var1 instanceof Byte) && !(var1 instanceof Short) && !(var1 instanceof Integer) && !(var1 instanceof Long) && !(var1 instanceof BigInteger)) {
         Number var6 = (Number)var1;
         var4 = class_9592.field_48881;
         if (!var6.equals(Double.NaN)) {
            if (!var6.equals(Double.POSITIVE_INFINITY)) {
               if (!var6.equals(Double.NEGATIVE_INFINITY)) {
                  var5 = var6.toString();
               } else {
                  var5 = "-.inf";
               }
            } else {
               var5 = ".inf";
            }
         } else {
            var5 = ".NaN";
         }
      } else {
         var4 = class_9592.field_48877;
         var5 = var1.toString();
      }

      return this.field_26917.method_589(this.field_26917.method_37561(var1.getClass(), var4), var5);
   }
}
