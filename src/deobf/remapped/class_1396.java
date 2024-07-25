package remapped;

public class class_1396 extends Module {
   public class_1396() {
      super(Category.MOVEMENT, "SafeWalk", "Doesn't let you run off edges");
   }

   @EventListen
   public void method_6465(class_7982 var1) {
      if (this.method_42015() && mcInstance.field_9632.field_41726) {
         Module var4 = SigmaMainClass.method_3328().getModuleManager().method_847(BlockFlyModule.class);
         if (!var4.method_42015()) {
            var1.method_36186(true);
         }
      }
   }
}
