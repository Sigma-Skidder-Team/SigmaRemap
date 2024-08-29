package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class805 extends Class798 {
   private static final Logger field4216 = LogManager.getLogger();
   private static final ITextComponent field4217 = new TranslationTextComponent("mco.configure.world.invite.profile.name");
   private static final ITextComponent field4218 = new TranslationTextComponent("mco.configure.world.players.error");
   private Class1189 field4219;
   private final Class6128 field4220;
   private final Class815 field4221;
   private final Screen field4222;
   private ITextComponent field4223;

   public Class805(Class815 var1, Screen var2, Class6128 var3) {
      this.field4221 = var1;
      this.field4222 = var2;
      this.field4220 = var3;
   }

   @Override
   public void tick() {
      this.field4219.method5633();
   }

   @Override
   public void method1921() {
      this.field4562.keyboardListener.method36347(true);
      this.field4219 = new Class1189(
         this.field4562.fontRenderer,
         this.field4564 / 2 - 100,
         method1929(2),
         200,
         20,
         (Class1189)null,
         new TranslationTextComponent("mco.configure.world.invite.profile.name")
      );
      this.<Class1189>method2456(this.field4219);
      this.method5536(this.field4219);
      this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 - 100, method1929(10), 200, 20, new TranslationTextComponent("mco.configure.world.buttons.invite"), var1 -> this.method2007()
         )
      );
      this.<Class1206>method2455(
         new Class1206(this.field4564 / 2 - 100, method1929(12), 200, 20, DialogTexts.GUI_CANCEL, var1 -> this.field4562.displayGuiScreen(this.field4222))
      );
   }

   @Override
   public void onClose() {
      this.field4562.keyboardListener.method36347(false);
   }

   private void method2007() {
      Class4624 var3 = Class4624.method14543();
      if (this.field4219.method5636() != null && !this.field4219.method5636().isEmpty()) {
         try {
            Class6128 var4 = var3.method14557(this.field4220.field27443, this.field4219.method5636().trim());
            if (var4 != null) {
               this.field4220.field27450 = var4.field27450;
               this.field4562.displayGuiScreen(new Class824(this.field4221, this.field4220));
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
   public boolean method1920(int var1, int var2, int var3) {
      if (var1 != 256) {
         return super.method1920(var1, var2, var3);
      } else {
         this.field4562.displayGuiScreen(this.field4222);
         return true;
      }
   }

   @Override
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      this.method2469(var1);
      this.field4568.method38805(var1, field4217, (float)(this.field4564 / 2 - 100), (float)method1929(1), 10526880);
      if (this.field4223 != null) {
         method5691(var1, this.field4568, this.field4223, this.field4564 / 2, method1929(5), 16711680);
      }

      this.field4219.method1923(var1, var2, var3, var4);
      super.method1923(var1, var2, var3, var4);
   }
}
