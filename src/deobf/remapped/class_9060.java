package remapped;

import java.util.Random;
import javax.annotation.Nullable;

public abstract class class_9060 {
   @Nullable
   public abstract class_5927<class_1297, ?> method_41608(Random var1, boolean var2);

   public boolean method_41607(class_6331 var1, class_6541 var2, BlockPos var3, class_2522 var4, Random var5) {
      class_5927 var8 = this.method_41608(var5, this.method_41605(var1, var3));
      if (var8 != null) {
         var1.method_7513(var3, class_4783.field_23184.method_29260(), 4);
         ((class_1297)var8.field_30062).method_5885();
         if (!var8.method_27104(var1, var2, var5, var3)) {
            var1.method_7513(var3, var4, 4);
            return false;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private boolean method_41605(class_9379 var1, BlockPos var2) {
      for (BlockPos var6 : class_2921.method_6076(var2.method_6100().method_6095(2).method_6109(2), var2.method_6081().method_6074(2).method_6091(2))) {
         if (var1.method_28262(var6).method_8349(class_2351.field_11795)) {
            return true;
         }
      }

      return false;
   }
}
