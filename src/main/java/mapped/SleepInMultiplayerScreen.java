package mapped;

import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.network.play.ClientPlayNetHandler;
import net.minecraft.network.play.client.CEntityActionPacket;
import net.minecraft.util.text.TranslationTextComponent;

public class SleepInMultiplayerScreen extends ChatScreen {
   public SleepInMultiplayerScreen() {
      super("");
   }

   @Override
   public void init() {
      super.init();
      this.<Button>addButton(
         new Button(
            this.width / 2 - 100, this.height - 40, 200, 20, new TranslationTextComponent("multiplayer.stopSleeping"), var1 -> this.method6348()
         )
      );
   }

   @Override
   public void method1945() {
      this.method6348();
   }

   @Override
   public boolean keyPressed(int var1, int var2, int var3) {
      if (var1 != 256) {
         if (var1 == 257 || var1 == 335) {
            String var6 = this.field7048.getText().trim();
            if (!var6.isEmpty()) {
               this.method2465(var6);
            }

            this.field7048.method5635("");
            this.mc.ingameGUI.getChatGUI().method5936();
            return true;
         }
      } else {
         this.method6348();
      }

      return super.keyPressed(var1, var2, var3);
   }

   private void method6348() {
      ClientPlayNetHandler var3 = this.mc.player.connection;
      var3.sendPacket(new CEntityActionPacket(this.mc.player, CEntityActionPacket.Action.STOP_SLEEPING));
   }
}
