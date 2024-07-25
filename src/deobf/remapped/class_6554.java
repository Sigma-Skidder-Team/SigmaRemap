package remapped;

import java.util.Random;
import javax.annotation.Nullable;

public class class_6554 extends class_6414 {
   private static String[] field_33400;
   private final class_6414 field_33401;

   public class_6554(class_6414 var1, class_3073 var2) {
      super(var2);
      this.field_33401 = var1;
   }

   @Override
   public void method_10797(class_2522 var1, class_6331 var2, BlockPos var3, Random var4) {
      if (!this.method_29880(var2, var3)) {
         var2.method_7513(var3, this.field_33401.method_29260(), 2);
      }
   }

   @Override
   public class_2522 method_10763(class_2522 var1, Direction var2, class_2522 var3, class_9379 var4, BlockPos var5, BlockPos var6) {
      if (!this.method_29880(var4, var5)) {
         var4.method_43367().method_14011(var5, this, 60 + var4.method_43360().nextInt(40));
      }

      return super.method_10763(var1, var2, var3, var4, var5, var6);
   }

   public boolean method_29880(class_6163 var1, BlockPos var2) {
      for (Direction var8 : Direction.values()) {
         class_4774 var9 = var1.method_28258(var2.method_6098(var8));
         if (var9.method_22007(class_6503.field_33094)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public class_2522 method_29302(class_353 var1) {
      if (!this.method_29880(var1.method_21862(), var1.method_21858())) {
         var1.method_21862().method_43367().method_14011(var1.method_21858(), this, 60 + var1.method_21862().method_43360().nextInt(40));
      }

      return this.method_29260();
   }
}
