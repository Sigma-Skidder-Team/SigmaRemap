package remapped;

import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntListIterator;

public class class_5245<C extends class_6867> extends class_8662<C> {
   private static String[] field_26871;
   private boolean field_26870;

   public class_5245(class_3954<C> var1) {
      super(var1);
   }

   @Override
   public void method_39712(class_8932<C> var1, boolean var2) {
      this.field_26870 = this.field_44343.method_18267(var1);
      int var5 = this.field_44341.method_2611(var1, (IntList)null);
      if (this.field_26870) {
         ItemStack var6 = this.field_44343.method_18878(0).method_35898();
         if (var6.method_28022() || var5 <= var6.method_27997()) {
            return;
         }
      }

      int var8 = this.method_39709(var2, var5, this.field_26870);
      IntArrayList var7 = new IntArrayList();
      if (this.field_44341.method_2614(var1, var7, var8)) {
         if (!this.field_26870) {
            this.method_39710(this.field_44343.method_18262());
            this.method_39710(0);
         }

         this.method_23992(var8, var7);
      }
   }

   @Override
   public void method_39715() {
      this.method_39710(this.field_44343.method_18262());
      super.method_39715();
   }

   public void method_23992(int var1, IntList var2) {
      IntListIterator var5 = var2.iterator();
      class_7934 var6 = this.field_44343.method_18878(0);
      ItemStack var7 = class_534.method_2604((Integer)var5.next());
      if (!var7.method_28022()) {
         int var8 = Math.min(var7.method_28016(), var1);
         if (this.field_26870) {
            var8 -= var6.method_35898().method_27997();
         }

         for (int var9 = 0; var9 < var8; var9++) {
            this.method_39711(var6, var7);
         }
      }
   }
}
