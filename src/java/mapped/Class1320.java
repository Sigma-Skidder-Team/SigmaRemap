package mapped;

import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class1320 extends Screen {
   private static final ITextComponent field6972 = new TranslationTextComponent("addServer.enterIp");
   private Button field6973;
   private final ServerData field6974;
   private TextFieldWidget field6975;
   private final BooleanConsumer field6976;
   private final Screen field6977;

   public Class1320(Screen var1, BooleanConsumer var2, ServerData var3) {
      super(new TranslationTextComponent("selectServer.direct"));
      this.field6977 = var1;
      this.field6974 = var3;
      this.field6976 = var2;
   }

   @Override
   public void tick() {
      this.field6975.method5633();
   }

   @Override
   public boolean keyPressed(int var1, int var2, int var3) {
      if (this.getListener() == this.field6975 && (var1 == 257 || var1 == 335)) {
         this.method6263();
         return true;
      } else {
         return super.keyPressed(var1, var2, var3);
      }
   }

   @Override
   public void init() {
      this.mc.keyboardListener.enableRepeatEvents(true);
      this.field6973 = this.<Button>addButton(
         new Button(
            this.width / 2 - 100, this.height / 4 + 96 + 12, 200, 20, new TranslationTextComponent("selectServer.select"), var1 -> this.method6263()
         )
      );
      this.<Button>addButton(
         new Button(this.width / 2 - 100, this.height / 4 + 120 + 12, 200, 20, DialogTexts.GUI_CANCEL, var1 -> this.field6976.accept(false))
      );
      this.field6975 = new TextFieldWidget(this.fontRenderer, this.width / 2 - 100, 116, 200, 20, new TranslationTextComponent("addServer.enterIp"));
      this.field6975.method5657(128);
      this.field6975.method5654(true);
      this.field6975.method5635(this.mc.gameSettings.field44667);
      this.field6975.method5631(var1 -> this.method6264());
      this.field4561.add(this.field6975);
      this.setFocusedDefault(this.field6975);
      this.method6264();
   }

   @Override
   public void resize(Minecraft var1, int var2, int var3) {
      String var6 = this.field6975.getText();
      this.init(var1, var2, var3);
      this.field6975.method5635(var6);
   }

   private void method6263() {
      this.field6974.field33189 = this.field6975.getText();
      this.field6976.accept(true);
   }

   @Override
   public void method1945() {
      this.mc.displayGuiScreen(this.field6977);
   }

   @Override
   public void onClose() {
      this.mc.keyboardListener.enableRepeatEvents(false);
      this.mc.gameSettings.field44667 = this.field6975.getText();
      this.mc.gameSettings.saveOptions();
   }

   private void method6264() {
      String var3 = this.field6975.getText();
      this.field6973.active = !var3.isEmpty() && var3.split(":").length > 0 && var3.indexOf(32) == -1;
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.renderBackground(var1);
      drawCenteredString(var1, this.fontRenderer, this.title, this.width / 2, 20, 16777215);
      method5693(var1, this.fontRenderer, field6972, this.width / 2 - 100, 100, 10526880);
      this.field6975.render(var1, var2, var3, var4);
      super.render(var1, var2, var3, var4);
   }
}
