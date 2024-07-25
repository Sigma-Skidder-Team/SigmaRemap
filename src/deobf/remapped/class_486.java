package remapped;

public class class_486 extends class_4138<class_704> {
   private static String[] field_3012;

   public class_486(class_8829 var1) {
      super(var1, class_704.class, 10, true, false, var1::method_28534);
   }

   @Override
   public boolean method_16795() {
      return this.method_2294() && super.method_16795();
   }

   @Override
   public boolean method_16799() {
      boolean var3 = this.method_2294();
      if (var3 && this.field_4915.method_17809() != null) {
         return super.method_16799();
      } else {
         this.field_4918 = null;
         return false;
      }
   }

   private boolean method_2294() {
      class_8829 var3 = (class_8829)this.field_4915;
      return var3.method_28537() && !var3.method_40610();
   }
}
