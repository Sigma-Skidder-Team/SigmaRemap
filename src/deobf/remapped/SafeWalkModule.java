package remapped;

public class SafeWalkModule extends Module {
   public SafeWalkModule() {
      super(Category.MOVEMENT, "SafeWalk", "Doesn't let you run off edges");
   }

   @EventListen
   public void method_6465(class_7982 var1) {
      if (this.method_42015() && client.thePlayer.onGround) {
         Module var4 = SigmaMainClass.getInstance().getModuleManager().getModuleByClass(BlockFlyModule.class);
         if (!var4.method_42015()) {
            var1.method_36186(true);
         }
      }
   }
}
