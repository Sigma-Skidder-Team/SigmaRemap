package remapped;

public class AutoToolsModule extends Module {
   public int field_33089 = -1;

   public AutoToolsModule() {
      super(Category.ITEM, "AutoTools", "Picks the best tool when breaking blocks");
      this.addSetting(new ModeSetting("Inv Mode", "The way it will move tools in your inventory", 0, "Basic", "OpenInv", "FakeInv"));
   }

   @EventListen
   public void method_29644(class_307 var1) {
      if (this.method_42015() && client.thePlayer != null && var1.method_1364() == 0) {
         if (this.field_33089 != -1) {
            client.thePlayer.inventory.field_36404 = this.field_33089;
            this.field_33089 = -1;
         }
      }
   }

   @EventListen
   private void method_29646(class_6435 var1) {
      if (this.method_42015() && client.thePlayer != null && var1.method_29384() == 0) {
         this.method_29647(var1.method_29386());
      }
   }

   @EventListen
   private void method_29645(class_5596 var1) {
      if (this.method_42015() && client.thePlayer != null && client.gameOptions.keyAttack.isKeyDown()) {
         this.method_29647(null);
      }
   }

   public void method_29647(BlockPos var1) {
      BlockPos var4 = var1 == null
         ? (client.field_9587.method_33990() != class_1430.field_7717 ? null : ((class_9529) client.field_9587).method_43955())
         : var1;
      if (var4 != null) {
         int var5 = class_2740.method_12348(client.theWorld.method_28262(var4));
         if (var5 != -1) {
            if (client.thePlayer.inventory.field_36404 != var5 % 9 && this.field_33089 == -1) {
               this.field_33089 = client.thePlayer.inventory.field_36404;
            }

            if (var5 >= 36 && var5 <= 44) {
               client.thePlayer.inventory.field_36404 = var5 % 9;
            } else if (SigmaMainClass.getInstance().method_3310().method_25303() > 1) {
               String var6 = this.getStringValueByName("Inv Mode");
               if (var6.equals("OpenInv") && !(client.field_9623 instanceof class_3431)) {
                  return;
               }

               if (var6.equals("FakeInv") && class_3347.method_15349() <= class_412.field_1752.method_2055()) {
                  client.method_8614().method_4813(new class_8559(class_2105.field_10551));
               }

               client.thePlayer.inventory.field_36404 = class_2740.method_12363(var5);
               if (var6.equals("FakeInv")) {
                  client.method_8614().method_4813(new class_1194(-1));
               }
            }
         }
      }
   }
}
