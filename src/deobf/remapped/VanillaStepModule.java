package remapped;

public class VanillaStepModule extends Module {
   public VanillaStepModule() {
      super(Category.MOVEMENT, "Vanilla", "Step for Vanilla");
      this.addSetting(new FloatSetting<Float>("Maximum heigh", "Maximum heigh", 2.0F, Float.class, 1.0F, 10.0F, 0.5F));
   }

   @class_9148
   private void method_30574(class_7982 var1) {
      if (this.method_42015() && mcInstance.field_9632 != null) {
         if (!var1.method_36184()) {
            mcInstance.field_9632.field_41733 = this.method_42002("Maximum heigh");
         } else {
            mcInstance.field_9632.field_41733 = 0.5F;
         }
      }
   }
}
