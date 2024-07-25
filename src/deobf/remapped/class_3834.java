package remapped;

import java.util.ArrayDeque;

public class class_3834 implements class_3315 {
   private final class_7181 field_18722;

   public class_3834(class_2581 var1) {
      this.field_18722 = new class_7181(var1);
   }

   public void 骰揩ኞᔎ陬댠(class_1626 var1, class_9155 var2, ArrayDeque<class_1446> var3, int var4) {
      this.field_18722.method_32900(var1).ifPresent(var4x -> {
         class_3315[] var7 = var4x.method_11748();
         int var8 = var4 - var3.size();
         int var9 = Math.min(var7.length, var8);

         for (int var10 = var9 - 1; var10 >= 0; var10--) {
            var3.addFirst(new class_1446(var1, var2, var7[var10]));
         }
      });
   }

   @Override
   public String toString() {
      return "function " + this.field_18722.method_32899();
   }
}
