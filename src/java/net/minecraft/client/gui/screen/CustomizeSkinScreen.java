package net.minecraft.client.gui.screen;

import mapped.*;
import net.minecraft.client.AbstractOption;
import net.minecraft.client.GameSettings;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.widget.button.OptionButton;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class CustomizeSkinScreen extends Class1135 {
   public CustomizeSkinScreen(Screen var1, GameSettings var2) {
      super(var1, var2, new TranslationTextComponent("options.skinCustomisation.title"));
   }

   @Override
   public void init() {
      int var3 = 0;

      for (Class2318 var7 : Class2318.values()) {
         this.<Button>addButton(
            new Button(this.width / 2 - 155 + var3 % 2 * 160, this.height / 6 + 24 * (var3 >> 1), 150, 20, this.method5467(var7), var2 -> {
               this.field6193.method37152(var7);
               var2.setMessage(this.method5467(var7));
            })
         );
         var3++;
      }

      this.<OptionButton>addButton(
         new OptionButton(
            this.width / 2 - 155 + var3 % 2 * 160,
            this.height / 6 + 24 * (var3 >> 1),
            150,
            20,
            AbstractOption.field25345,
            AbstractOption.field25345.method17947(this.field6193),
            var1 -> {
               AbstractOption.field25345.method17945(this.field6193, 1);
               this.field6193.saveOptions();
               var1.setMessage(AbstractOption.field25345.method17947(this.field6193));
               this.field6193.method37149();
            }
         )
      );
      if (++var3 % 2 == 1) {
         var3++;
      }

      this.<Button>addButton(
         new Button(
            this.width / 2 - 100,
            this.height / 6 + 24 * (var3 >> 1),
            200,
            20,
            Class8043.method27620("of.options.skinCustomisation.ofCape"),
            var1 -> this.mc.displayGuiScreen(new Class845(this))
         )
      );
      var3 += 2;
      this.<Button>addButton(
         new Button(
            this.width / 2 - 100, this.height / 6 + 24 * (var3 >> 1), 200, 20, DialogTexts.field30658, var1 -> this.mc.displayGuiScreen(this.field6192)
         )
      );
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.renderBackground(var1);
      drawCenteredString(var1, this.fontRenderer, this.title, this.width / 2, 20, 16777215);
      super.render(var1, var2, var3, var4);
   }

   private ITextComponent method5467(Class2318 var1) {
      return DialogTexts.method22238(var1.method9092(), this.field6193.method37150().contains(var1));
   }
}
