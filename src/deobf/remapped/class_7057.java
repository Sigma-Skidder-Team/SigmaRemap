package remapped;

public class class_7057 extends Module {
   public class_7057() {
      super(Category.MISC, "NickNameDetector", "Detect if a player has a custom name");
   }

   @EventListen
   private void method_32448(PlayerTickEvent var1) {
      if (this.isEnabled()) {
         for (Entity var5 : class_314.method_1435()) {
            if (!SigmaMainClass.getInstance().method_3331().method_20495(var5) && var5.field_41697 > 30 && var5.method_45507()) {
               class_314.method_1443(var5.method_45509().getUnformattedComponentText() + " might have a custom nametag");
            }
         }
      }
   }
}
