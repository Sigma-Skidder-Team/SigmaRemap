package remapped;

public class class_1277 extends class_9037 {
   private static String[] field_7023;
   private final class_2811 field_7024;
   private int field_7025;

   public class_1277(class_2811 var1, double var2, boolean var4) {
      super(var1, var2, var4);
      this.field_7024 = var1;
   }

   @Override
   public void method_16796() {
      super.method_16796();
      this.field_7025 = 0;
   }

   @Override
   public void method_16793() {
      super.method_16793();
      this.field_7024.method_26891(false);
   }

   @Override
   public void method_16794() {
      super.method_16794();
      this.field_7025++;
      if (this.field_7025 >= 5 && this.method_41494() < this.method_41490() / 2) {
         this.field_7024.method_26891(true);
      } else {
         this.field_7024.method_26891(false);
      }
   }
}
