package remapped;

import org.apache.commons.lang3.ArrayUtils;

public class class_4108 extends class_4024 {
   public class_4108(class_3765[] var1, class_7279[] var2) {
      super(var1, var2);
   }

   @Override
   public class_3515 method_17435() {
      return class_5570.field_28305;
   }

   @Override
   public class_978 method_18540(class_978[] var1) {
      switch (var1.length) {
         case 0:
            return field_5004;
         case 1:
            return var1[0];
         case 2:
            return var1[0].method_4278(var1[1]);
         default:
            return (var1x, var2) -> {
               for (class_978 var8 : var1) {
                  if (var8.method_4277(var1x, var2)) {
                     return true;
                  }
               }

               return false;
            };
      }
   }

   @Override
   public void method_17436(class_4737 var1) {
      super.method_17436(var1);

      for (int var4 = 0; var4 < this.field_19559.length - 1; var4++) {
         if (ArrayUtils.isEmpty(this.field_19559[var4].field_18417)) {
            var1.method_21892("Unreachable entry!");
         }
      }
   }

   public static class_6618 method_19035(class_3516<?>... var0) {
      return new class_6618(var0);
   }
}
