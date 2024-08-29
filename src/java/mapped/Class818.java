package mapped;

import net.minecraft.client.gui.DialogTexts;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class818 extends Class798 {
   private static final ITextComponent field4454 = new TranslationTextComponent("mco.configure.world.name");
   private static final ITextComponent field4455 = new TranslationTextComponent("mco.configure.world.description");
   private final Class815 field4456;
   private final Class6128 field4457;
   private Class1206 field4458;
   private Class1189 field4459;
   private Class1189 field4460;
   private Class1153 field4461;

   public Class818(Class815 var1, Class6128 var2) {
      this.field4456 = var1;
      this.field4457 = var2;
   }

   @Override
   public void tick() {
      this.field4460.method5633();
      this.field4459.method5633();
      this.field4458.field6482 = !this.field4460.method5636().trim().isEmpty();
   }

   @Override
   public void method1921() {
      this.field4562.keyboardListener.method36347(true);
      int var3 = this.field4564 / 2 - 106;
      this.field4458 = this.<Class1206>method2455(
         new Class1206(var3 - 2, method1929(12), 106, 20, new TranslationTextComponent("mco.configure.world.buttons.done"), var1 -> this.method2329())
      );
      this.<Class1206>method2455(
         new Class1206(this.field4564 / 2 + 2, method1929(12), 106, 20, DialogTexts.GUI_CANCEL, var1 -> this.field4562.displayGuiScreen(this.field4456))
      );
      String var4 = this.field4457.field27447 != Class2261.field14707 ? "mco.configure.world.buttons.open" : "mco.configure.world.buttons.close";
      Class1206 var5 = new Class1206(this.field4564 / 2 - 53, method1929(0), 106, 20, new TranslationTextComponent(var4), var1 -> {
         if (this.field4457.field27447 != Class2261.field14707) {
            this.field4456.method2295(false, this);
         } else {
            TranslationTextComponent var4x = new TranslationTextComponent("mco.configure.world.close.question.line1");
            TranslationTextComponent var5x = new TranslationTextComponent("mco.configure.world.close.question.line2");
            this.field4562.displayGuiScreen(new Class808(var1x -> {
               if (!var1x) {
                  this.field4562.displayGuiScreen(this);
               } else {
                  this.field4456.method2296(this);
               }
            }, Class2134.field13980, var4x, var5x, true));
         }
      });
      this.<Class1206>method2455(var5);
      this.field4460 = new Class1189(
         this.field4562.fontRenderer, var3, method1929(4), 212, 20, (Class1189)null, new TranslationTextComponent("mco.configure.world.name")
      );
      this.field4460.method5657(32);
      this.field4460.method5635(this.field4457.method18907());
      this.<Class1189>method2456(this.field4460);
      this.method5537(this.field4460);
      this.field4459 = new Class1189(
         this.field4562.fontRenderer, var3, method1929(8), 212, 20, (Class1189)null, new TranslationTextComponent("mco.configure.world.description")
      );
      this.field4459.method5657(32);
      this.field4459.method5635(this.field4457.method18906());
      this.<Class1189>method2456(this.field4459);
      this.field4461 = this.<Class1153>method2456(
         new Class1153(new TranslationTextComponent("mco.configure.world.settings.title"), this.field4564 / 2, 17, 16777215)
      );
      this.method1930();
   }

   @Override
   public void onClose() {
      this.field4562.keyboardListener.method36347(false);
   }

   @Override
   public boolean method1920(int var1, int var2, int var3) {
      if (var1 != 256) {
         return super.method1920(var1, var2, var3);
      } else {
         this.field4562.displayGuiScreen(this.field4456);
         return true;
      }
   }

   @Override
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      this.method2469(var1);
      this.field4461.method5542(this, var1);
      this.field4568.method38805(var1, field4454, (float)(this.field4564 / 2 - 106), (float)method1929(3), 10526880);
      this.field4568.method38805(var1, field4455, (float)(this.field4564 / 2 - 106), (float)method1929(7), 10526880);
      this.field4460.method1923(var1, var2, var3, var4);
      this.field4459.method1923(var1, var2, var3, var4);
      super.method1923(var1, var2, var3, var4);
   }

   public void method2329() {
      this.field4456.method2294(this.field4460.method5636(), this.field4459.method5636());
   }
}
