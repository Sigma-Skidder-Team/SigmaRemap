package remapped;

public class GhostlyDisablerModule extends Module {
   public GhostlyDisablerModule() {
      super(Category.EXPLOIT, "Ghostly", "Disable ghostly's anticheat.");
   }

   @class_9148
   public void method_39308(class_5596 var1) {
      if (this.method_42015() && mcInstance.method_8530() != null) {
         mcInstance.method_8614().method_4813(new class_758(1.0F, 1.0F, false, false));
      }
   }
}
