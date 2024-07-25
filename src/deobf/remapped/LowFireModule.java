package remapped;

public class LowFireModule extends Module {
   public LowFireModule() {
      super(Category.RENDER, "LowFire", "Makes the fire transparent when you're burning");
   }

   @EventListen
   public void method_18317(class_9081 var1) {
      if (this.method_42015()) {
         var1.method_41811(0.14F);
      }
   }
}
