package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class1149 extends Screen {
   private static final ITextComponent field6280 = new TranslationTextComponent("selectWorld.allowCommands");
   private static final ITextComponent field6281 = new TranslationTextComponent("selectWorld.gameMode");
   private static final ITextComponent field6282 = new TranslationTextComponent("lanServer.otherPlayers");
   private final Screen field6283;
   private Class1206 field6284;
   private Class1206 field6285;
   private String field6286 = "survival";
   private boolean field6287;

   public Class1149(Screen var1) {
      super(new TranslationTextComponent("lanServer.title"));
      this.field6283 = var1;
   }

   @Override
   public void method1921() {
      this.<Class1206>method2455(
         new Class1206(this.field4564 / 2 - 155, this.field4565 - 28, 150, 20, new TranslationTextComponent("lanServer.start"), var1 -> {
            this.field4562.displayGuiScreen((Screen)null);
            int var4 = Class6639.method20257();
            TranslationTextComponent var5;
            if (!this.field4562.getIntegratedServer().method1374(Class1894.method8161(this.field6286), this.field6287, var4)) {
               var5 = new TranslationTextComponent("commands.publish.failed");
            } else {
               var5 = new TranslationTextComponent("commands.publish.started", var4);
            }

            this.field4562.ingameGUI.getChatGUI().method5930(var5);
            this.field4562.setDefaultMinecraftTitle();
         })
      );
      this.<Class1206>method2455(
         new Class1206(this.field4564 / 2 + 5, this.field4565 - 28, 150, 20, DialogTexts.GUI_CANCEL, var1 -> this.field4562.displayGuiScreen(this.field6283))
      );
      this.field6285 = this.<Class1206>method2455(new Class1206(this.field4564 / 2 - 155, 100, 150, 20, StringTextComponent.EMPTY, var1 -> {
         if (!"spectator".equals(this.field6286)) {
            if (!"creative".equals(this.field6286)) {
               if (!"adventure".equals(this.field6286)) {
                  this.field6286 = "spectator";
               } else {
                  this.field6286 = "survival";
               }
            } else {
               this.field6286 = "adventure";
            }
         } else {
            this.field6286 = "creative";
         }

         this.method5526();
      }));
      this.field6284 = this.<Class1206>method2455(new Class1206(this.field4564 / 2 + 5, 100, 150, 20, field6280, var1 -> {
         this.field6287 = !this.field6287;
         this.method5526();
      }));
      this.method5526();
   }

   private void method5526() {
      this.field6285
         .method5743(new TranslationTextComponent("options.generic_value", field6281, new TranslationTextComponent("selectWorld.gameMode." + this.field6286)));
      this.field6284.method5743(DialogTexts.method22238(field6280, this.field6287));
   }

   @Override
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      this.method2469(var1);
      method5691(var1, this.field4568, this.field4560, this.field4564 / 2, 50, 16777215);
      method5691(var1, this.field4568, field6282, this.field4564 / 2, 82, 16777215);
      super.method1923(var1, var2, var3, var4);
   }
}
