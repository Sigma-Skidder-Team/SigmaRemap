package remapped;

public class class_597 extends class_9128 {
   public static boolean field_3439 = false;

   public class_597() {
      super(class_5664.field_28709, "FPSBooster", "Disables Armor Stand and particle rendering");
   }

   @Override
   public void method_42012() {
      super.method_42012();
      field_3439 = this.method_42015();
   }

   @Override
   public void method_42020() {
      field_3439 = false;
   }

   @Override
   public void method_42006() {
      field_3439 = true;
   }
}
