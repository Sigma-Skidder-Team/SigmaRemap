package remapped;

public class class_3478 implements class_3354 {
   private static String[] field_17056;
   private final int field_17052;
   private final int field_17051;
   private final int field_17054;
   private final int field_17053;
   private final class_5797 field_17055;

   private class_3478(int var1, int var2, int var3, int var4, class_5797 var5) {
      this.field_17052 = var3;
      this.field_17051 = var4;
      this.field_17054 = var1;
      this.field_17053 = var2;
      this.field_17055 = var5;
   }

   @Override
   public float method_15365() {
      return 2.0F;
   }

   @Override
   public int method_15371() {
      return this.field_17052;
   }

   @Override
   public int method_15366() {
      return this.field_17051;
   }

   @Override
   public float method_25220() {
      return (float)(this.field_17052 / 2 + 1);
   }

   @Override
   public void method_15364(int var1, int var2) {
      this.field_17055.method_26258(0, var1, var2, this.field_17054, this.field_17053, this.field_17052, this.field_17051, false, false);
   }

   @Override
   public boolean method_15370() {
      return this.field_17055.method_26262().method_26306() > 1;
   }

   @Override
   public float method_25217() {
      return 0.5F;
   }

   @Override
   public float method_25218() {
      return 0.5F;
   }
}
