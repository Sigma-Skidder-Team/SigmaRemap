package remapped;

public class VanillaHighJumpModule extends Module {
   public VanillaHighJumpModule() {
      super(Category.MOVEMENT, "Vanilla", "Highjump for minecraft vanilla");
      this.addSetting(new FloatSetting<Float>("Motion", "Highjump motion", 0.75F, Float.class, 0.42F, 5.0F, 0.05F));
   }

   @class_9148
   public void method_35348(class_2911 var1) {
      if (this.method_42015()) {
         var1.method_13313((double)this.method_42002("Motion"));
      }
   }
}
