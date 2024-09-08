package mapped;

import com.mojang.realmsclient.RealmsMainScreen;
import com.mojang.realmsclient.dto.RealmsServer;
import com.mojang.realmsclient.gui.screens.RealmsLongRunningMcoTaskScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.util.Util;
import net.minecraft.realms.RealmsScreen;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.locks.ReentrantLock;

public class Class817 extends RealmsScreen {
   private static final Logger field4445 = LogManager.getLogger();
   private static final ITextComponent field4446 = new TranslationTextComponent("mco.terms.title");
   private static final ITextComponent field4447 = new TranslationTextComponent("mco.terms.sentence.1");
   private static final ITextComponent field4448 = new StringTextComponent(" ")
      .append(new TranslationTextComponent("mco.terms.sentence.2").mergeStyle(Style.EMPTY.func_244282_c(true)));
   private final Screen field4449;
   private final RealmsMainScreen field4450;
   private final RealmsServer field4451;
   private boolean field4452;
   private final String field4453 = "https://aka.ms/MinecraftRealmsTerms";

   public Class817(Screen var1, RealmsMainScreen var2, RealmsServer var3) {
      this.field4449 = var1;
      this.field4450 = var2;
      this.field4451 = var3;
   }

   @Override
   public void init() {
      this.mc.keyboardListener.enableRepeatEvents(true);
      int var3 = this.width / 4 - 2;
      this.<Button>addButton(
         new Button(this.width / 4, method1929(12), var3, 20, new TranslationTextComponent("mco.terms.buttons.agree"), var1 -> this.method2325())
      );
      this.<Button>addButton(
         new Button(
            this.width / 2 + 4,
            method1929(12),
            var3,
            20,
            new TranslationTextComponent("mco.terms.buttons.disagree"),
            var1 -> this.mc.displayGuiScreen(this.field4449)
         )
      );
   }

   @Override
   public void onClose() {
      this.mc.keyboardListener.enableRepeatEvents(false);
   }

   @Override
   public boolean keyPressed(int var1, int var2, int var3) {
      if (var1 != 256) {
         return super.keyPressed(var1, var2, var3);
      } else {
         this.mc.displayGuiScreen(this.field4449);
         return true;
      }
   }

   private void method2325() {
      Class4624 var3 = Class4624.method14543();

      try {
         var3.method14579();
         this.mc.displayGuiScreen(new RealmsLongRunningMcoTaskScreen(this.field4449, new Class791(this.field4450, this.field4449, this.field4451, new ReentrantLock())));
      } catch (Class2435 var5) {
         field4445.error("Couldn't agree to TOS");
      }
   }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
      if (!this.field4452) {
         return super.mouseClicked(var1, var3, var5);
      } else {
         this.mc.keyboardListener.method36350("https://aka.ms/MinecraftRealmsTerms");
         Util.getOSType().method8181("https://aka.ms/MinecraftRealmsTerms");
         return true;
      }
   }

   @Override
   public String getNarrationMessage() {
      return super.getNarrationMessage() + ". " + field4447.getString() + " " + field4448.getString();
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.renderBackground(var1);
      drawCenteredString(var1, this.fontRenderer, field4446, this.width / 2, 17, 16777215);
      this.fontRenderer.func_243248_b(var1, field4447, (float)(this.width / 2 - 120), (float)method1929(5), 16777215);
      int var7 = this.fontRenderer.method38821(field4447);
      int var8 = this.width / 2 - 121 + var7;
      int var9 = method1929(5);
      int var10 = var8 + this.fontRenderer.method38821(field4448) + 1;
      int var11 = var9 + 1 + 9;
      this.field4452 = var8 <= var2 && var2 <= var10 && var9 <= var3 && var3 <= var11;
      this.fontRenderer.func_243248_b(var1, field4448, (float)(this.width / 2 - 120 + var7), (float)method1929(5), !this.field4452 ? 3368635 : 7107012);
      super.render(var1, var2, var3, var4);
   }
}
