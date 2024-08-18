package remapped;

public class VanillaHighJumpModule extends Module {
   public VanillaHighJumpModule() {
      super(Category.MOVEMENT, "Vanilla", "Highjump for minecraft vanilla");
      this.addSetting(new FloatSetting<Float>("Motion", "Highjump motion", 0.75F, Float.class, 0.42F, 5.0F, 0.05F));
   }

   @EventListen
   public void method_35348(class_2911 var1) {
      if (this.isEnabled()) {
         var1.method_13313((double)this.getFloatValueByName("Motion"));
      }
   }
}
