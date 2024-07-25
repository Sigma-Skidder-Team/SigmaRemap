package remapped;

import it.unimi.dsi.fastutil.doubles.AbstractDoubleList;
import it.unimi.dsi.fastutil.doubles.DoubleList;

public class class_7536 extends AbstractDoubleList implements class_1205 {
   private static String[] field_38464;
   private final DoubleList field_38463;
   private final DoubleList field_38465;
   private final boolean field_38462;

   public class_7536(DoubleList var1, DoubleList var2, boolean var3) {
      this.field_38463 = var1;
      this.field_38465 = var2;
      this.field_38462 = var3;
   }

   public int size() {
      return this.field_38463.size() + this.field_38465.size();
   }

   @Override
   public boolean method_5337(class_2718 var1) {
      return !this.field_38462 ? this.method_34327(var1) : this.method_34327((var1x, var2, var3) -> var1.method_12240(var2, var1x, var3));
   }

   private boolean method_34327(class_2718 var1) {
      int var4 = this.field_38463.size() - 1;

      for (int var5 = 0; var5 < var4; var5++) {
         if (!var1.method_12240(var5, -1, var5)) {
            return false;
         }
      }

      if (!var1.method_12240(var4, -1, var4)) {
         return false;
      } else {
         for (int var6 = 0; var6 < this.field_38465.size(); var6++) {
            if (!var1.method_12240(var4, var6, var4 + 1 + var6)) {
               return false;
            }
         }

         return true;
      }
   }

   public double getDouble(int var1) {
      return var1 >= this.field_38463.size() ? this.field_38465.getDouble(var1 - this.field_38463.size()) : this.field_38463.getDouble(var1);
   }

   @Override
   public DoubleList method_5336() {
      return this;
   }
}
