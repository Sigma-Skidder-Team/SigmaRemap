package remapped;

public class ShaderESP extends Module {
   public ShaderESP() {
      super(Category.RENDER, "Vanilla", "Draws a line arround players");
   }

   @EventListen
   public void method_2176(PlayerTickEvent var1) {
      if (this.isEnabled()) {
         for (Entity var5 : client.theWorld.method_736()) {
            if (!SigmaMainClass.getInstance().method_3331().method_20495(var5)) {
               boolean var6 = class_314.method_1426(var5) == class_9374.field_47922 && this.getModule().method_42007("Show Players");
               boolean var7 = class_314.method_1426(var5) == class_9374.field_47924 && this.getModule().method_42007("Show Mobs");
               boolean var8 = class_314.method_1426(var5) == class_9374.field_47923 && this.getModule().method_42007("Show Passives");
               boolean var9 = !var5.method_37109() || this.getModule().method_42007("Show Invisibles");
               if ((var7 || var6 || var8) && var9 && var5 != client.thePlayer) {
                  var5.method_37200(true);
               } else {
                  var5.method_37200(false);
               }
            }
         }
      }
   }

   @Override
   public void onDisable() {
      for (Entity var4 : client.theWorld.method_736()) {
         var4.method_37200(false);
      }
   }
}
