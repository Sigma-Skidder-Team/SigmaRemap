package remapped;

public class AntiCactusModule extends Module {
   public AntiCactusModule() {
      super(Category.WORLD, "AntiCactus", "Prevent you from taking damage from cactus");
      this.addSetting(new BooleanSetting("Above", "Avoid damage above cactus also", true));
   }

   @EventListen
   private void method_29163(class_5243 var1) {
      if (this.method_42015()) {
         if (client.theWorld.method_28262(var1.method_23989()).method_8360() instanceof class_4309) {
            var1.method_23986(class_3370.method_15522(0.0, 0.0, 0.0, 1.0, !this.method_42007("Above") ? 0.9375 : 0.999, 1.0));
         }

         if (client.theWorld.method_28262(var1.method_23989()).method_8360() instanceof class_1878) {
            var1.method_23986(class_3370.method_15522(-0.01, 0.0, -0.01, 1.02, 1.9375, 1.02));
         }
      }
   }
}
