package mapped;

import com.mojang.realmsclient.dto.RealmsServer;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.realms.RealmsScreen;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class805 extends RealmsScreen {
   private static final Logger field4216 = LogManager.getLogger();
   private static final ITextComponent field4217 = new TranslationTextComponent("mco.configure.world.invite.profile.name");
   private static final ITextComponent field4218 = new TranslationTextComponent("mco.configure.world.players.error");
   private TextFieldWidget field4219;
   private final RealmsServer field4220;
   private final Class815 field4221;
   private final Screen field4222;
   private ITextComponent field4223;

   public Class805(Class815 var1, Screen var2, RealmsServer var3) {
      this.field4221 = var1;
      this.field4222 = var2;
      this.field4220 = var3;
   }

   @Override
   public void tick() {
      this.field4219.method5633();
   }

   @Override
   public void init() {
      this.mc.keyboardListener.enableRepeatEvents(true);
      this.field4219 = new TextFieldWidget(
         this.mc.fontRenderer,
         this.width / 2 - 100,
         method1929(2),
         200,
         20,
         (TextFieldWidget)null,
         new TranslationTextComponent("mco.configure.world.invite.profile.name")
      );
      this.<TextFieldWidget>addListener(this.field4219);
      this.method5536(this.field4219);
      this.<Button>addButton(
         new Button(
            this.width / 2 - 100, method1929(10), 200, 20, new TranslationTextComponent("mco.configure.world.buttons.invite"), var1 -> this.method2007()
         )
      );
      this.<Button>addButton(
         new Button(this.width / 2 - 100, method1929(12), 200, 20, DialogTexts.GUI_CANCEL, var1 -> this.mc.displayGuiScreen(this.field4222))
      );
   }

   @Override
   public void onClose() {
      this.mc.keyboardListener.enableRepeatEvents(false);
   }

   private void method2007() {
      Class4624 var3 = Class4624.method14543();
      if (this.field4219.getText() != null && !this.field4219.getText().isEmpty()) {
         try {
            RealmsServer var4 = var3.method14557(this.field4220.field27443, this.field4219.getText().trim());
            if (var4 != null) {
               this.field4220.field27450 = var4.field27450;
               this.mc.displayGuiScreen(new Class824(this.field4221, this.field4220));
            } else {
               this.method2008(field4218);
            }
         } catch (Exception var5) {
            field4216.error("Couldn't invite user");
            this.method2008(field4218);
         }
      } else {
         this.method2008(field4218);
      }
   }

   private void method2008(ITextComponent var1) {
      this.field4223 = var1;
      Class9229.method34711(var1.getString());
   }

   @Override
   public boolean keyPressed(int var1, int var2, int var3) {
      if (var1 != 256) {
         return super.keyPressed(var1, var2, var3);
      } else {
         this.mc.displayGuiScreen(this.field4222);
         return true;
      }
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.renderBackground(var1);
      this.fontRenderer.func_243248_b(var1, field4217, (float)(this.width / 2 - 100), (float)method1929(1), 10526880);
      if (this.field4223 != null) {
         drawCenteredString(var1, this.fontRenderer, this.field4223, this.width / 2, method1929(5), 16711680);
      }

      this.field4219.render(var1, var2, var3, var4);
      super.render(var1, var2, var3, var4);
   }
}
