package remapped;

public class class_8311 extends class_4382 {
   private static final String[] field_42567 = new String[]{"all", "undead", "arthropods"};
   private static final int[] field_42568 = new int[]{1, 5, 5};
   private static final int[] field_42570 = new int[]{11, 8, 8};
   private static final int[] field_42569 = new int[]{20, 20, 20};
   public final int field_42566;

   public class_8311(class_5855 var1, int var2, class_6943... var3) {
      super(var1, class_8718.field_44701, var3);
      this.field_42566 = var2;
   }

   @Override
   public int method_20433(int var1) {
      return field_42568[this.field_42566] + (var1 - 1) * field_42570[this.field_42566];
   }

   @Override
   public int method_20437(int var1) {
      return this.method_20433(var1) + field_42569[this.field_42566];
   }

   @Override
   public int method_20417() {
      return 5;
   }

   @Override
   public float method_20419(int var1, class_2780 var2) {
      if (this.field_42566 != 0) {
         if (this.field_42566 == 1 && var2 == class_2780.field_13579) {
            return (float)var1 * 2.5F;
         } else {
            return this.field_42566 == 2 && var2 == class_2780.field_13575 ? (float)var1 * 2.5F : 0.0F;
         }
      } else {
         return 1.0F + (float)Math.max(0, var1 - 1) * 0.5F;
      }
   }

   @Override
   public boolean method_20426(class_4382 var1) {
      return !(var1 instanceof class_8311);
   }

   @Override
   public boolean method_20430(class_6098 var1) {
      return !(var1.method_27960() instanceof class_7938) ? super.method_20430(var1) : true;
   }

   @Override
   public void method_20421(class_5834 var1, Entity var2, int var3) {
      if (var2 instanceof class_5834) {
         class_5834 var6 = (class_5834)var2;
         if (this.field_42566 == 2 && var6.method_26550() == class_2780.field_13575) {
            int var7 = 20 + var1.method_26594().nextInt(10 * var3);
            var6.method_26558(new class_2250(Effects.field_19743, var7, 3));
         }
      }
   }
}
