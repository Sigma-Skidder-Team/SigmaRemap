package remapped;

public class class_597 extends Module {
   public static boolean field_3439 = false;

   public class_597() {
      super(Category.RENDER, "FPSBooster", "Disables Armor Stand and particle rendering");
   }

   @Override
   public void method_42012() {
      super.method_42012();
      field_3439 = this.method_42015();
   }

   @Override
   public void onDisable() {
      field_3439 = false;
   }

   @Override
   public void onEnable() {
      field_3439 = true;
   }
}
