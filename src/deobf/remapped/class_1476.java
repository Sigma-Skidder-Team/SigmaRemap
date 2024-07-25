package remapped;

public class class_1476 extends class_6967 {
   private static String[] field_7914;
   private final class_1775 field_7915;

   private class_1476(class_1775 var1, double var2) {
      super(var1, var2, 8, 2);
      this.field_7915 = var1;
   }

   @Override
   public class_1331 method_31861() {
      return this.field_35802;
   }

   @Override
   public boolean method_16799() {
      return !this.field_7915.method_37370() && this.method_31855(this.field_7915.field_41768, this.field_35802);
   }

   @Override
   public boolean method_16795() {
      return !this.field_7915.method_37370() && super.method_16795();
   }

   @Override
   public boolean method_31858() {
      return this.field_35808 % 20 == 0;
   }

   @Override
   public boolean method_31855(class_4924 var1, class_1331 var2) {
      return var1.method_28262(var2).method_8350(class_4783.field_23811)
         && var1.method_28262(var2.method_6081()).method_8319(var1, var2, class_2929.field_14271);
   }
}
