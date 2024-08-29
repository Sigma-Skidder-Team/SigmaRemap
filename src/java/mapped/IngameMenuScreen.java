package mapped;

import net.minecraft.client.util.Util;
import net.minecraft.util.text.TranslationTextComponent;

public class IngameMenuScreen extends Screen {
   private final boolean field4621;

   public IngameMenuScreen(boolean var1) {
      super(!var1 ? new TranslationTextComponent("menu.paused") : new TranslationTextComponent("menu.game"));
      this.field4621 = var1;
   }

   @Override
   public void method1921() {
      if (this.field4621) {
         this.method2548();
      }
   }

   private void method2548() {
      byte var3 = -16;
      byte var4 = 98;
      this.<Class1206>method2455(
         new Class1206(this.field4564 / 2 - 102, this.field4565 / 4 + 24 + -16, 204, 20, new TranslationTextComponent("menu.returnToGame"), var1 -> {
            this.field4562.displayGuiScreen((Screen)null);
            this.field4562.mouseHelper.grabMouse();
         })
      );
      this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 - 102,
            this.field4565 / 4 + 48 + -16,
            98,
            20,
            new TranslationTextComponent("gui.advancements"),
            var1 -> this.field4562.displayGuiScreen(new AdvancementsScreen(this.field4562.player.connection.getAdvancementManager()))
         )
      );
      this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 + 4,
            this.field4565 / 4 + 48 + -16,
            98,
            20,
            new TranslationTextComponent("gui.stats"),
            var1 -> this.field4562.displayGuiScreen(new Class1305(this, this.field4562.player.method5396()))
         )
      );
      String var5 = !SharedConstants.getVersion().isStable() ? "https://aka.ms/snapshotfeedback?ref=game" : "https://aka.ms/javafeedback?ref=game";
      this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 - 102,
            this.field4565 / 4 + 72 + -16,
            98,
            20,
            new TranslationTextComponent("menu.sendFeedback"),
            var2 -> this.field4562.displayGuiScreen(new Class830(var2x -> {
                  if (var2x) {
                     Util.getOSType().method8181(var5);
                  }

                  this.field4562.displayGuiScreen(this);
               }, var5, true))
         )
      );
      this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 + 4,
            this.field4565 / 4 + 72 + -16,
            98,
            20,
            new TranslationTextComponent("menu.reportBugs"),
            var1 -> this.field4562.displayGuiScreen(new Class830(var1x -> {
                  if (var1x) {
                     Util.getOSType().method8181("https://aka.ms/snapshotbugs?ref=game");
                  }

                  this.field4562.displayGuiScreen(this);
               }, "https://aka.ms/snapshotbugs?ref=game", true))
         )
      );
      this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 - 102,
            this.field4565 / 4 + 96 + -16,
            98,
            20,
            new TranslationTextComponent("menu.options"),
            var1 -> this.field4562.displayGuiScreen(new Class1129(this, this.field4562.gameSettings))
         )
      );
      Class1206 var6 = this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 + 4,
            this.field4565 / 4 + 96 + -16,
            98,
            20,
            new TranslationTextComponent("menu.shareToLan"),
            var1 -> this.field4562.displayGuiScreen(new Class1149(this))
         )
      );
      var6.field6482 = this.field4562.isSingleplayer() && !this.field4562.getIntegratedServer().getPublic();
      Class1206 var7 = this.<Class1206>method2455(
         new Class1206(this.field4564 / 2 - 102, this.field4565 / 4 + 120 + -16, 204, 20, new TranslationTextComponent("menu.returnToMenu"), var1 -> {
            boolean var4x = this.field4562.isIntegratedServerRunning();
            boolean var5x = this.field4562.isConnectedToRealms();
            var1.field6482 = false;
            this.field4562.world.sendQuittingDisconnectingPacket();
            if (!var4x) {
               this.field4562.unloadWorld();
            } else {
               this.field4562.unloadWorld(new DirtMessageScreen(new TranslationTextComponent("menu.savingLevel")));
            }

            if (!var4x) {
               if (!var5x) {
                  this.field4562.displayGuiScreen(new MultiplayerScreen(new MainMenuScreen()));
               } else {
                  Class810 var6x = new Class810();
                  var6x.method2209(new MainMenuScreen());
               }
            } else {
               this.field4562.displayGuiScreen(new MainMenuScreen());
            }
         })
      );
      if (!this.field4562.isIntegratedServerRunning()) {
         var7.method5743(new TranslationTextComponent("menu.disconnect"));
      }
   }

   @Override
   public void tick() {
      super.tick();
   }

   @Override
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      if (!this.field4621) {
         method5691(var1, this.field4568, this.field4560, this.field4564 / 2, 10, 16777215);
      } else {
         this.method2469(var1);
         method5691(var1, this.field4568, this.field4560, this.field4564 / 2, 40, 16777215);
      }

      super.method1923(var1, var2, var3, var4);
   }
}
