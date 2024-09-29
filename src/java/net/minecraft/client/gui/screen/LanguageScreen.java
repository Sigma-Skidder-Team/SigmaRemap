package net.minecraft.client.gui.screen;

import com.mojang.blaze3d.matrix.MatrixStack;
import mapped.*;
import net.minecraft.client.AbstractOption;
import net.minecraft.client.GameSettings;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.widget.button.OptionButton;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class LanguageScreen extends Class1135 {
   private static final ITextComponent field6194 = new StringTextComponent("(")
      .append(new TranslationTextComponent("options.languageWarning"))
      .appendString(")")
      .mergeStyle(TextFormatting.GRAY);
   private Class1284 field6195;
   private final LanguageManager field6196;
   private OptionButton field6197;
   private Button field6198;

   public LanguageScreen(Screen var1, GameSettings var2, LanguageManager var3) {
      super(var1, var2, new TranslationTextComponent("options.language"));
      this.field6196 = var3;
   }

   @Override
   public void init() {
      this.field6195 = new Class1284(this, this.mc);
      this.children.add(this.field6195);
      this.field6197 = this.<OptionButton>addButton(
         new OptionButton(
            this.width / 2 - 155, this.height - 38, 150, 20, AbstractOption.field25360, AbstractOption.field25360.func_238152_c_(this.field6193), var1 -> {
               AbstractOption.field25360.nextValue(this.field6193);
               this.field6193.saveOptions();
               var1.setMessage(AbstractOption.field25360.func_238152_c_(this.field6193));
               this.mc.updateWindowSize();
            }
         )
      );
      this.field6198 = this.<Button>addButton(new Button(this.width / 2 - 155 + 160, this.height - 38, 150, 20, DialogTexts.field30658, var1 -> {
         Class1164 var4 = this.field6195.getSelected();
         if (var4 != null && !Class1164.method5565(var4).getCode().equals(this.field6196.getCurrentLanguage().getCode())) {
            this.field6196.method964(Class1164.method5565(var4));
            this.field6193.language = Class1164.method5565(var4).getCode();
            this.mc.reloadResources();
            this.field6198.setMessage(DialogTexts.field30658);
            this.field6197.setMessage(AbstractOption.field25360.func_238152_c_(this.field6193));
            this.field6193.saveOptions();
         }

         this.mc.displayGuiScreen(this.field6192);
      }));
      super.init();
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.field6195.render(var1, var2, var3, var4);
      drawCenteredString(var1, this.font, this.title, this.width / 2, 16, 16777215);
      drawCenteredString(var1, this.font, field6194, this.width / 2, this.height - 56, 8421504);
      super.render(var1, var2, var3, var4);
   }

   // $VF: synthetic method
   public static LanguageManager method5461(LanguageScreen var0) {
      return var0.field6196;
   }
}
