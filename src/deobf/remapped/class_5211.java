package remapped;

public class class_5211 extends class_6165 {
   private static String[] field_26770;
   private final class_5989 field_26772;
   private int field_26771;

   public class_5211(class_5989 var1) {
      super(class_463.field_1967, class_562.field_3325);
      this.field_26772 = var1;
      this.field_5768 = true;
      this.field_5764 = 0;
      this.field_5766 = 1.0F;
      this.field_5767 = true;
      this.field_5769 = true;
   }

   @Override
   public void method_29511() {
      if (!this.field_26772.field_41751 && this.field_26771 >= 0) {
         if (!this.field_26772.method_37179()) {
            this.field_26771 -= 2;
         } else {
            this.field_26771++;
         }

         this.field_26771 = Math.min(this.field_26771, 40);
         this.field_5766 = Math.max(0.0F, Math.min((float)this.field_26771 / 40.0F, 1.0F));
      } else {
         this.method_28267();
      }
   }
}