package remapped;

public class class_5070 extends class_1425 {
   private static String[] field_26200;
   public final double field_26201;

   public class_5070(class_7822 var1, int var2, double var3) {
      super(var1, var2);
      this.field_26201 = var3;
   }

   @Override
   public double method_6547(int var1, class_9343 var2) {
      return this.field_26201 * (double)(var1 + 1);
   }
}
