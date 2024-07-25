package remapped;

public class class_6549 extends class_6967 {
   private static String[] field_33385;
   private final class_3845 field_33386;

   private class_6549(class_3845 var1, double var2) {
      super(var1, !var1.method_26449() ? var2 : 2.0, 24);
      this.field_33386 = var1;
      this.field_35800 = -1;
   }

   @Override
   public boolean method_16799() {
      return !this.field_33386.method_37285() && this.field_35808 <= 1200 && this.method_31855(this.field_33386.world, this.field_35802);
   }

   @Override
   public boolean method_16795() {
      if (this.field_33386.method_26449() && !this.field_33386.method_37285()) {
         return super.method_16795();
      } else {
         return !class_3845.method_17858(this.field_33386) && !this.field_33386.method_37285() && !this.field_33386.method_17856()
            ? super.method_16795()
            : false;
      }
   }

   @Override
   public boolean method_31858() {
      return this.field_35808 % 160 == 0;
   }

   @Override
   public boolean method_31855(class_4924 var1, BlockPos var2) {
      return var1.method_28262(var2).method_8350(class_4783.field_23900);
   }
}
