package remapped;

public class class_4073 extends class_6967 {
   private static String[] field_19835;
   private final class_5583 field_19834;

   public class_4073(class_5583 var1, double var2) {
      super(var1, var2, 8);
      this.field_19834 = var1;
   }

   @Override
   public boolean method_16795() {
      return this.field_19834.method_41215() && !this.field_19834.method_41216() && super.method_16795();
   }

   @Override
   public void method_16796() {
      super.method_16796();
      this.field_19834.method_41214(false);
   }

   @Override
   public void method_16793() {
      super.method_16793();
      this.field_19834.method_41214(false);
   }

   @Override
   public void method_16794() {
      super.method_16794();
      this.field_19834.method_41214(this.method_31860());
   }

   @Override
   public boolean method_31855(class_4924 var1, BlockPos var2) {
      if (var1.method_22548(var2.method_6081())) {
         class_2522 var5 = var1.method_28262(var2);
         if (var5.method_8350(class_4783.field_23471)) {
            return class_7099.method_32635(var1, var2) < 1;
         } else {
            return var5.method_8350(class_4783.field_23883) && var5.<Boolean>method_10313(class_3744.field_18522)
               ? true
               : var5.method_8329(
                  class_2351.field_11784,
                  var0 -> var0.<class_7095>method_10309(class_3633.field_17729).<Boolean>map(var0x -> var0x != class_7095.field_36603).orElse(true)
               );
         }
      } else {
         return false;
      }
   }
}
