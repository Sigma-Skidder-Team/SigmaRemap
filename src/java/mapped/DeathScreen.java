package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.screen.ConfirmScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.client.gui.widget.button.Button;
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
   public void init() {
      this.field4570 = 0;
      this.<Button>addButton(
         new Button(
            this.width / 2 - 100,
            this.height / 4 + 72,
            200,
            20,
            !this.field4572 ? new TranslationTextComponent("deathScreen.respawn") : new TranslationTextComponent("deathScreen.spectate"),
            var1 -> {
               this.mc.player.respawnPlayer();
               this.mc.displayGuiScreen((Screen)null);
            }
         )
      );
      Button var3 = this.<Button>addButton(
         new Button(
            this.width / 2 - 100,
            this.height / 4 + 96,
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
         var3.active = false;
      }

      for (Widget var5 : this.buttons) {
         var5.active = false;
      }

      this.field4573 = new TranslationTextComponent("deathScreen.score")
         .appendString(": ")
         .append(new StringTextComponent(Integer.toString(this.mc.player.method2874())).mergeStyle(TextFormatting.YELLOW));
   }

   @Override
   public boolean shouldCloseOnEsc() {
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
      this.mc.displayGuiScreen(new VanillaMainMenuScreen());
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.method5688(var1, 0, 0, this.width, this.height, 1615855616, -1602211792);
      RenderSystem.pushMatrix();
      RenderSystem.scalef(2.0F, 2.0F, 2.0F);
      drawCenteredString(var1, this.font, this.title, this.width / 2 / 2, 30, 16777215);
      RenderSystem.popMatrix();
      if (this.field4571 != null) {
         drawCenteredString(var1, this.font, this.field4571, this.width / 2, 85, 16777215);
      }

      drawCenteredString(var1, this.font, this.field4573, this.width / 2, 100, 16777215);
      if (this.field4571 != null && var3 > 85 && var3 < 94) {
         Style var7 = this.method2490(var2);
         this.method2462(var1, var7, var2, var3);
      }

      super.render(var1, var2, var3, var4);
   }

   @Nullable
   private Style method2490(int var1) {
      if (this.field4571 == null) {
         return null;
      } else {
         int var4 = this.mc.fontRenderer.method38821(this.field4571);
         int var5 = this.width / 2 - var4 / 2;
         int var6 = this.width / 2 + var4 / 2;
         return var1 >= var5 && var1 <= var6 ? this.mc.fontRenderer.method38830().func_238357_a_(this.field4571, var1 - var5) : null;
      }
   }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
      if (this.field4571 != null && var3 > 85.0 && var3 < 94.0) {
         Style var8 = this.method2490((int)var1);
         if (var8 != null && var8.getClickEvent() != null && var8.getClickEvent().getAction() == ClickEvent$Action.OPEN_URL) {
            this.method2464(var8);
            return false;
         }
      }

      return super.mouseClicked(var1, var3, var5);
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
         for (Widget var4 : this.buttons) {
            var4.active = true;
         }
      }
   }
}
