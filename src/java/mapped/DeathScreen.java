package mapped;

import net.minecraft.util.text.*;
import net.minecraft.util.text.event.ClickEvent$Action;

import javax.annotation.Nullable;

public class DeathScreen extends Screen {
   private int field4570;
   private final ITextComponent field4571;
   private final boolean field4572;
   private ITextComponent field4573;

   public DeathScreen(ITextComponent var1, boolean var2) {
      super(new TranslationTextComponent(!var2 ? "deathScreen.title" : "deathScreen.title.hardcore"));
      this.field4571 = var1;
      this.field4572 = var2;
   }

   @Override
   public void method1921() {
      this.field4570 = 0;
      this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 - 100,
            this.field4565 / 4 + 72,
            200,
            20,
            !this.field4572 ? new TranslationTextComponent("deathScreen.respawn") : new TranslationTextComponent("deathScreen.spectate"),
            var1 -> {
               this.mc.player.respawnPlayer();
               this.mc.displayGuiScreen((Screen)null);
            }
         )
      );
      Class1206 var3 = this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 - 100,
            this.field4565 / 4 + 96,
            200,
            20,
            new TranslationTextComponent("deathScreen.titleScreen"),
            var1 -> {
               if (!this.field4572) {
                  ConfirmScreen var4 = new ConfirmScreen(
                     this::method2488,
                     new TranslationTextComponent("deathScreen.quit.confirm"),
                     StringTextComponent.EMPTY,
                     new TranslationTextComponent("deathScreen.titleScreen"),
                     new TranslationTextComponent("deathScreen.respawn")
                  );
                  this.mc.displayGuiScreen(var4);
                  var4.method2536(20);
               } else {
                  this.method2489();
               }
            }
         )
      );
      if (!this.field4572 && this.mc.getSession() == null) {
         var3.field6482 = false;
      }

      for (Class1197 var5 : this.field4566) {
         var5.field6482 = false;
      }

      this.field4573 = new TranslationTextComponent("deathScreen.score")
         .appendString(": ")
         .append(new StringTextComponent(Integer.toString(this.mc.player.method2874())).mergeStyle(TextFormatting.YELLOW));
   }

   @Override
   public boolean method2454() {
      return false;
   }

   private void method2488(boolean var1) {
      if (!var1) {
         this.mc.player.respawnPlayer();
         this.mc.displayGuiScreen((Screen)null);
      } else {
         this.method2489();
      }
   }

   private void method2489() {
      if (this.mc.world != null) {
         this.mc.world.sendQuittingDisconnectingPacket();
      }

      this.mc.unloadWorld(new DirtMessageScreen(new TranslationTextComponent("menu.savingLevel")));
      this.mc.displayGuiScreen(new MainMenuScreen());
   }

   @Override
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      this.method5688(var1, 0, 0, this.field4564, this.field4565, 1615855616, -1602211792);
      RenderSystem.pushMatrix();
      RenderSystem.scalef(2.0F, 2.0F, 2.0F);
      method5691(var1, this.fontRenderer, this.field4560, this.field4564 / 2 / 2, 30, 16777215);
      RenderSystem.popMatrix();
      if (this.field4571 != null) {
         method5691(var1, this.fontRenderer, this.field4571, this.field4564 / 2, 85, 16777215);
      }

      method5691(var1, this.fontRenderer, this.field4573, this.field4564 / 2, 100, 16777215);
      if (this.field4571 != null && var3 > 85 && var3 < 94) {
         Style var7 = this.method2490(var2);
         this.method2462(var1, var7, var2, var3);
      }

      super.method1923(var1, var2, var3, var4);
   }

   @Nullable
   private Style method2490(int var1) {
      if (this.field4571 == null) {
         return null;
      } else {
         int var4 = this.mc.fontRenderer.method38821(this.field4571);
         int var5 = this.field4564 / 2 - var4 / 2;
         int var6 = this.field4564 / 2 + var4 / 2;
         return var1 >= var5 && var1 <= var6 ? this.mc.fontRenderer.method38830().func_238357_a_(this.field4571, var1 - var5) : null;
      }
   }

   @Override
   public boolean method1958(double var1, double var3, int var5) {
      if (this.field4571 != null && var3 > 85.0 && var3 < 94.0) {
         Style var8 = this.method2490((int)var1);
         if (var8 != null && var8.getClickEvent() != null && var8.getClickEvent().getAction() == ClickEvent$Action.OPEN_URL) {
            this.method2464(var8);
            return false;
         }
      }

      return super.method1958(var1, var3, var5);
   }

   @Override
   public boolean isPauseScreen() {
      return false;
   }

   @Override
   public void tick() {
      super.tick();
      this.field4570++;
      if (this.field4570 == 20) {
         for (Class1197 var4 : this.field4566) {
            var4.field6482 = true;
         }
      }
   }
}
