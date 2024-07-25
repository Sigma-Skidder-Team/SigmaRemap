package remapped;

public class class_957 extends class_6967 {
   private static String[] field_4924;
   private final class_4359 field_4923;

   public class_957(class_4359 var1, double var2) {
      super(var1, var2, 8, 2);
      this.field_4923 = var1;
   }

   @Override
   public boolean method_16795() {
      return super.method_16795()
         && !this.field_4923.world.method_29602()
         && this.field_4923.method_37285()
         && this.field_4923.method_37309() >= (double)(this.field_4923.world.method_22552() - 3);
   }

   @Override
   public boolean method_16799() {
      return super.method_16799();
   }

   @Override
   public boolean method_31855(class_4924 var1, BlockPos var2) {
      BlockPos var5 = var2.method_6081();
      return var1.method_22548(var5) && var1.method_22548(var5.method_6081()) ? var1.method_28262(var2).method_8337(var1, var2, this.field_4923) : false;
   }

   @Override
   public void method_16796() {
      this.field_4923.method_20220(false);
      class_4359.method_20224(this.field_4923, this.field_4923.field_21389);
      super.method_16796();
   }

   @Override
   public void method_16793() {
      super.method_16793();
   }
}
