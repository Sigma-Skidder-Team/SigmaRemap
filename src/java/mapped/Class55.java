package mapped;

import it.unimi.dsi.fastutil.doubles.AbstractDoubleList;
import it.unimi.dsi.fastutil.doubles.DoubleList;

public class Class55 extends AbstractDoubleList implements Class56 {
   private static String[] field117;
   private final DoubleList field118;
   private final DoubleList field119;
   private final boolean field120;

   public Class55(DoubleList var1, DoubleList var2, boolean var3) {
      this.field118 = var1;
      this.field119 = var2;
      this.field120 = var3;
   }

   public int size() {
      return this.field118.size() + this.field119.size();
   }

   @Override
   public boolean method192(Class7775 var1) {
      return !this.field120 ? this.method193(var1) : this.method193((var1x, var2, var3) -> var1.method25758(var2, var1x, var3));
   }

   private boolean method193(Class7775 var1) {
      int var4 = this.field118.size() - 1;

      for (int var5 = 0; var5 < var4; var5++) {
         if (!var1.method25758(var5, -1, var5)) {
            return false;
         }
      }

      if (!var1.method25758(var4, -1, var4)) {
         return false;
      } else {
         for (int var6 = 0; var6 < this.field119.size(); var6++) {
            if (!var1.method25758(var4, var6, var4 + 1 + var6)) {
               return false;
            }
         }

         return true;
      }
   }

   public double getDouble(int var1) {
      return var1 >= this.field118.size() ? this.field119.getDouble(var1 - this.field118.size()) : this.field118.getDouble(var1);
   }

   @Override
   public DoubleList method194() {
      return this;
   }
}
