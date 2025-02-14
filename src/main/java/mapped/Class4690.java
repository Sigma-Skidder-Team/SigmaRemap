package mapped;

import org.apache.commons.lang3.ArrayUtils;

public class Class4690 extends Class4689 {
   public Class4690(Class4688[] var1, ILootCondition[] var2) {
      super(var1, var2);
   }

   @Override
   public Class7131 method14694() {
      return Class8695.field39244;
   }

   @Override
   public Class4693 method14710(Class4693[] var1) {
      switch (var1.length) {
         case 0:
            return field22277;
         case 1:
            return var1[0];
         case 2:
            return var1[0].method14718(var1[1]);
         default:
            return (var1x, var2) -> {
               for (Class4693 var8 : var1) {
                  if (var8.method14697(var1x, var2)) {
                     return true;
                  }
               }

               return false;
            };
      }
   }

   @Override
   public void method14703(Class8478 var1) {
      super.method14703(var1);

      for (int var4 = 0; var4 < this.field22273.length - 1; var4++) {
         if (ArrayUtils.isEmpty(this.field22273[var4].field22271)) {
            var1.method29955("Unreachable entry!");
         }
      }
   }

   public static Class5874 method14712(Class5873<?>... var0) {
      return new Class5874(var0);
   }
}
