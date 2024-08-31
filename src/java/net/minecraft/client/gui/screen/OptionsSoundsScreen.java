package net.minecraft.client.gui.screen;

import mapped.Class1135;
import mapped.Class1235;
import mapped.Class2266;
import mapped.MatrixStack;
import net.minecraft.client.AbstractOption;
import net.minecraft.client.GameSettings;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.widget.button.OptionButton;
import net.minecraft.util.text.TranslationTextComponent;

public class OptionsSoundsScreen extends Class1135 {
   public OptionsSoundsScreen(Screen var1, GameSettings var2) {
      super(var1, var2, new TranslationTextComponent("options.sounds.title"));
   }

   @Override
   public void init() {
      int var3 = 0;
      this.<Class1235>addButton(
         new Class1235(this.mc, this.width / 2 - 155 + var3 % 2 * 160, this.height / 6 - 12 + 24 * (var3 >> 1), Class2266.field14728, 310)
      );
      var3 += 2;

      for (Class2266 var7 : Class2266.values()) {
         if (var7 != Class2266.field14728) {
            this.<Class1235>addButton(
               new Class1235(this.mc, this.width / 2 - 155 + var3 % 2 * 160, this.height / 6 - 12 + 24 * (var3 >> 1), var7, 150)
            );
            var3++;
         }
      }

      int var10 = this.width / 2 - 75;
      int var11 = this.height / 6 - 12;
      this.<OptionButton>addButton(
         new OptionButton(var10, var11 + 24 * (++var3 >> 1), 150, 20, AbstractOption.field25364, AbstractOption.field25364.func_238152_c_(this.field6193), var1 -> {
            AbstractOption.field25364.nextValue(this.mc.gameSettings);
            var1.setMessage(AbstractOption.field25364.func_238152_c_(this.mc.gameSettings));
            this.mc.gameSettings.saveOptions();
         })
      );
      this.<Button>addButton(
         new Button(this.width / 2 - 100, this.height / 6 + 168, 200, 20, DialogTexts.field30658, var1 -> this.mc.displayGuiScreen(this.field6192))
      );
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.renderBackground(var1);
      drawCenteredString(var1, this.fontRenderer, this.title, this.width / 2, 15, 16777215);
      super.render(var1, var2, var3, var4);
   }
}
