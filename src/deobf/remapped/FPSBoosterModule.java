package remapped;

public class FPSBoosterModule extends Module {
   public static boolean field_3439 = false;

   public FPSBoosterModule() {
      super(Category.RENDER, "FPSBooster", "Disables Armor Stand and particle rendering");
   }

   @Override
   public void method_42012() {
      super.method_42012();
      field_3439 = this.isEnabled();
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
