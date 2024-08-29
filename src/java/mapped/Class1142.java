package mapped;

import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.util.Util;
import net.minecraft.util.text.TranslationTextComponent;

public class Class1142 extends Class1140 {
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

   public Class1142(Screen var1, GameSettings var2) {
      super(var1, var2, new TranslationTextComponent("options.accessibility.title"), field6208);
   }

   @Override
   public void method5472() {
      this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 - 155,
            this.field4565 - 27,
            150,
            20,
            new TranslationTextComponent("options.accessibility.link"),
            var1 -> this.mc.displayGuiScreen(new Class830(var1x -> {
                  if (var1x) {
                     Util.getOSType().method8181("https://aka.ms/MinecraftJavaAccessibility");
                  }

                  this.mc.displayGuiScreen(this);
               }, "https://aka.ms/MinecraftJavaAccessibility", true))
         )
      );
      this.<Class1206>method2455(
         new Class1206(this.field4564 / 2 + 5, this.field4565 - 27, 150, 20, DialogTexts.field30658, var1 -> this.mc.displayGuiScreen(this.field6192))
      );
   }
}
