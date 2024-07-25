package remapped;

public class class_9228 extends class_3599 {
   private static String[] field_47175;
   private final class_6011 field_47176;

   public class_9228(class_6011 var1, class_6011 var2) {
      this.field_47174 = var1;
      this.field_47176 = var2;
   }

   @Override
   public boolean method_16795() {
      return true;
   }

   @Override
   public void method_16794() {
      int var3 = this.field_47176.method_26532();
      if (var3 <= 100) {
         if (this.field_47176.method_26594().nextInt(50) == 0 || !class_6011.method_27443(this.field_47176) || !this.field_47176.method_27442()) {
            float var4 = this.field_47176.method_26594().nextFloat() * (float) (Math.PI * 2);
            float var5 = class_9299.method_42840(var4) * 0.2F;
            float var6 = -0.1F + this.field_47176.method_26594().nextFloat() * 0.2F;
            float var7 = class_9299.method_42818(var4) * 0.2F;
            this.field_47176.method_27444(var5, var6, var7);
         }
      } else {
         this.field_47176.method_27444(0.0F, 0.0F, 0.0F);
      }
   }
}
