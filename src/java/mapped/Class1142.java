package mapped;

import net.minecraft.util.text.TranslationTextComponent;

public class Class1142 extends Class1140 {
   private static final Class5805[] field6208 = new Class5805[]{
      Class5805.field25346,
      Class5805.field25364,
      Class5805.field25336,
      Class5805.field25349,
      Class5805.field25318,
      Class5805.field25321,
      Class5805.field25322,
      Class5805.field25351,
      Class5805.field25366,
      Class5805.field25367,
      Class5805.field25327,
      Class5805.field25325
   };

   public Class1142(Screen var1, Class9574 var2) {
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
            var1 -> this.field4562.displayGuiScreen(new Class830(var1x -> {
                  if (var1x) {
                     Util.getOSType().method8181("https://aka.ms/MinecraftJavaAccessibility");
                  }

                  this.field4562.displayGuiScreen(this);
               }, "https://aka.ms/MinecraftJavaAccessibility", true))
         )
      );
      this.<Class1206>method2455(
         new Class1206(this.field4564 / 2 + 5, this.field4565 - 27, 150, 20, Class7127.field30658, var1 -> this.field4562.displayGuiScreen(this.field6192))
      );
   }
}
