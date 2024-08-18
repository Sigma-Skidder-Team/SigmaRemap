package remapped;

import org.lwjgl.glfw.GLFW;

public class InvMoveModule extends Module {
   private boolean field_29226;

   public InvMoveModule() {
      super(Category.PLAYER, "InvMove", "Move freely in the inventory");
      this.addSetting(new BooleanSetting("AACP", "Bypass for AACP", true));
      this.field_29226 = false;
   }

   @EventListen
   private void method_26179(class_6435 var1) {
      if (this.isEnabled()) {
         if (var1.method_29384() == client.gameOptions.keyInventory.field_30027.field_17800 && client.thePlayer.method_37321()) {
            client.method_8614().sendPacket(new class_2317(client.thePlayer, Action.START_SPRINTING));
         }
      }
   }

   @EventListen
   private void method_26177(class_2157 var1) {
      if (this.isEnabled()) {
         if (this.field_29226 && var1.method_10047() instanceof class_2317 && this.getBooleanValueByName("AACP")) {
            class_2317 var4 = (class_2317)var1.method_10047();
            if (var4.method_10650() == Action.STOP_SPRINTING) {
               var1.method_29715(true);
            }
         }
      }
   }

   @EventListen
   private void method_26178(PlayerTickEvent var1) {
      if (this.isEnabled()) {
         if (this.getBooleanValueByName("AACP")) {
            boolean var4 = !(client.screen instanceof class_3431) || !(client.screen instanceof class_2141);
            if (this.field_29226 && !var4) {
               this.field_29226 = !this.field_29226;
               if (client.thePlayer.method_37321()) {
                  client.method_8614().sendPacket(new class_2317(client.thePlayer, Action.STOP_SPRINTING));
               }
            } else if (!this.field_29226 && var4) {
               this.field_29226 = !this.field_29226;
               if (client.thePlayer.method_37321()) {
                  client.method_8614().sendPacket(new class_2317(client.thePlayer, Action.START_SPRINTING));
               }
            }
         }

         if (client.screen instanceof class_2208 || SigmaMainClass.getInstance().method_3310().method_25291() <= 1) {
            if (client.screen instanceof class_5766) {
               return;
            }

            if (client.screen instanceof class_2713) {
               return;
            }

            if (client.screen instanceof KeybindManagerScreen) {
               return;
            }

            if (client.screen instanceof class_2546) {
               class_2546 var9 = (class_2546) client.screen;
               if (var9.method_11595() == 5) {
                  return;
               }
            }

            if (SigmaMainClass.getInstance().getGUIManager().method_31001() != null && SigmaMainClass.getInstance().getGUIManager().method_31001().method_32121()) {
               for (class_5916 var14 : MinecraftClient.getInstance().gameOptions.field_45395) {
                  var14.pressed = false;
               }

               return;
            }

            for (class_5916 var7 : client.gameOptions.field_45395) {
               if (var7.field_30027.field_17800 > 0
                  && client.gameOptions.keySneak.field_30027.field_17800 != var7.field_30027.field_17800
                  && var7.field_30027.field_17800 > 4) {
                  int var8 = GLFW.glfwGetKey(client.window.getHandle(), var7.field_30027.field_17800);
                  var7.pressed = var8 == 1;
               }
            }
         }
      }
   }
}
