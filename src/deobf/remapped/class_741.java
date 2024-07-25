package remapped;

import java.util.Map;
import javax.annotation.Nullable;

public class class_741 extends class_6201 {
   private static String[] field_4041;
   public final class_6414 field_4040;

   public class_741(class_6414 var1, class_6414 var2, class_317 var3) {
      super(var1, var3);
      this.field_4040 = var2;
   }

   @Nullable
   @Override
   public class_2522 method_28385(class_353 var1) {
      class_2522 var4 = this.field_4040.method_29302(var1);
      class_2522 var5 = null;
      World var6 = var1.method_21862();
      BlockPos var7 = var1.method_21858();

      for (Direction var11 : var1.method_1786()) {
         if (var11 != Direction.field_817) {
            class_2522 var12 = var11 != Direction.field_802 ? var4 : this.method_28392().method_29302(var1);
            if (var12 != null && var12.method_8309(var6, var7)) {
               var5 = var12;
               break;
            }
         }
      }

      return var5 != null && var6.method_6671(var5, var7, class_214.method_928()) ? var5 : null;
   }

   @Override
   public void method_28387(Map<class_6414, class_2451> var1, class_2451 var2) {
      super.method_28387(var1, var2);
      var1.put(this.field_4040, var2);
   }
}
