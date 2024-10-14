package net.minecraft.client.gui;

import mapped.Class1140;
import mapped.Class830;
import net.minecraft.client.AbstractOption;
import net.minecraft.client.GameSettings;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.util.Util;
import net.minecraft.util.text.TranslationTextComponent;

public class AccessibilityScreen extends Class1140 {
   private static final AbstractOption[] field6208 = new AbstractOption[]{
      AbstractOption.field25346,
      AbstractOption.field25364,
      AbstractOption.field25336,
      AbstractOption.field25349,
      AbstractOption.field25318,
      AbstractOption.field25321,
      AbstractOption.field25322,
      AbstractOption.field25351,
      AbstractOption.field25366,
      AbstractOption.field25367,
      AbstractOption.field25327,
      AbstractOption.field25325
   };

   public AccessibilityScreen(Screen var1, GameSettings var2) {
      super(var1, var2, new TranslationTextComponent("options.accessibility.title"), field6208);
   }

   @Override
   public void method5472() {
      this.<Button>addButton(
         new Button(
            this.width / 2 - 155,
            this.height - 27,
            150,
            20,
            new TranslationTextComponent("options.accessibility.link"),
            var1 -> this.mc.displayGuiScreen(new Class830(var1x -> {
                  if (var1x) {
                     Util.getOSType().openLink("https://aka.ms/MinecraftJavaAccessibility");
                  }

                  this.mc.displayGuiScreen(this);
               }, "https://aka.ms/MinecraftJavaAccessibility", true))
         )
      );
      this.<Button>addButton(
         new Button(this.width / 2 + 5, this.height - 27, 150, 20, DialogTexts.field30658, var1 -> this.mc.displayGuiScreen(this.field6192))
      );
   }
}
