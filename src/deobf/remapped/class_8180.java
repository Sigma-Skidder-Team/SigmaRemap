package remapped;

import java.util.EnumSet;

public class class_8180 extends class_3599 {
   private static String[] field_41873;
   public final class_6862 field_41876;
   public final double field_41872;
   public final double field_41875;

   public class_8180(class_6862 var1, class_6862 var2, double var3, double var5) {
      this.field_41874 = var1;
      this.field_41876 = var2;
      this.field_41872 = var3;
      this.field_41875 = var5;
      this.method_16800(EnumSet.<Flag>of(Flag.MOVE));
   }

   @Override
   public void method_16793() {
      this.field_41876.method_31484((BlockPos)null);
      class_6862.method_31482(this.field_41874).method_5620();
   }

   @Override
   public boolean method_16795() {
      BlockPos var3 = class_6862.method_31483(this.field_41876);
      return var3 != null && this.method_37498(var3, this.field_41872);
   }

   @Override
   public void method_16794() {
      BlockPos var3 = class_6862.method_31483(this.field_41876);
      if (var3 != null && class_6862.method_31480(this.field_41874).method_5591()) {
         if (!this.method_37498(var3, 10.0)) {
            class_6862.method_31486(this.field_41874)
               .method_5595((double)var3.method_12173(), (double)var3.method_12165(), (double)var3.method_12185(), this.field_41875);
         } else {
            class_1343 var4 = new class_1343(
                  (double)var3.method_12173() - this.field_41876.getPosX(),
                  (double)var3.method_12165() - this.field_41876.method_37309(),
                  (double)var3.method_12185() - this.field_41876.getPosZ()
               )
               .method_6213();
            class_1343 var5 = var4.method_6209(10.0)
               .method_6214(this.field_41876.getPosX(), this.field_41876.method_37309(), this.field_41876.getPosZ());
            class_6862.method_31478(this.field_41874).method_5595(var5.field_7336, var5.field_7333, var5.field_7334, this.field_41875);
         }
      }
   }

   private boolean method_37498(BlockPos var1, double var2) {
      return !var1.method_12170(this.field_41876.method_37245(), var2);
   }
}
