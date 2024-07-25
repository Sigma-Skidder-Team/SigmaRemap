package remapped;

import com.google.common.math.IntMath;
import it.unimi.dsi.fastutil.doubles.DoubleList;

public final class class_1705 implements class_1205 {
   private static String[] field_8838;
   private final class_4347 field_8835;
   private final int field_8834;
   private final int field_8836;
   private final int field_8837;

   public class_1705(int var1, int var2) {
      this.field_8835 = new class_4347((int)class_3370.method_15538(var1, var2));
      this.field_8834 = var1;
      this.field_8836 = var2;
      this.field_8837 = IntMath.gcd(var1, var2);
   }

   @Override
   public boolean method_5337(class_2718 var1) {
      int var4 = this.field_8834 / this.field_8837;
      int var5 = this.field_8836 / this.field_8837;

      for (int var6 = 0; var6 <= this.field_8835.size(); var6++) {
         if (!var1.method_12240(var6 / var5, var6 / var4, var6)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public DoubleList method_5336() {
      return this.field_8835;
   }
}
