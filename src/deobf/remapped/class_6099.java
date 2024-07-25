package remapped;

public class class_6099 extends class_7228 {
   private static String[] field_31217;
   private PlayerEntity field_31219;
   private final class_5583 field_31218;

   public class_6099(class_5583 var1, double var2, class_8137 var4, boolean var5) {
      super(var1, var2, var4, var5);
      this.field_31218 = var1;
   }

   @Override
   public void method_16794() {
      super.method_16794();
      if (this.field_31219 == null && this.field_37092.method_26594().nextInt(600) == 0) {
         this.field_31219 = this.field_37102;
      } else if (this.field_37092.method_26594().nextInt(500) == 0) {
         this.field_31219 = null;
      }
   }

   @Override
   public boolean method_33090() {
      return this.field_31219 != null && this.field_31219.equals(this.field_37102) ? false : super.method_33090();
   }

   @Override
   public boolean method_16795() {
      return super.method_16795() && !this.field_31218.method_41215();
   }
}
