package mapped;

import net.minecraft.client.gui.DialogTexts;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class ConfirmBackupScreen extends Screen {
   private final Screen field6941;
   public final Class7977 field6942;
   private final ITextComponent field6943;
   private final boolean field6944;
   private Class5991 field6945 = Class5991.field26162;
   private Class1248 field6946;

   public ConfirmBackupScreen(Screen var1, Class7977 var2, ITextComponent var3, ITextComponent var4, boolean var5) {
      super(var3);
      this.field6941 = var1;
      this.field6942 = var2;
      this.field6943 = var4;
      this.field6944 = var5;
   }

   @Override
   public void method1921() {
      super.method1921();
      this.field6945 = Class5991.method18584(this.field4568, this.field6943, this.field4564 - 50);
      int var3 = (this.field6945.method18592() + 1) * 9;
      this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 - 155,
            100 + var3,
            150,
            20,
            new TranslationTextComponent("selectWorld.backupJoinConfirmButton"),
            var1 -> this.field6942.method27112(true, this.field6946.method5820())
         )
      );
      this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 - 155 + 160,
            100 + var3,
            150,
            20,
            new TranslationTextComponent("selectWorld.backupJoinSkipButton"),
            var1 -> this.field6942.method27112(false, this.field6946.method5820())
         )
      );
      this.<Class1206>method2455(
         new Class1206(this.field4564 / 2 - 155 + 80, 124 + var3, 150, 20, DialogTexts.GUI_CANCEL, var1 -> this.field4562.displayGuiScreen(this.field6941))
      );
      this.field6946 = new Class1248(this.field4564 / 2 - 155 + 80, 76 + var3, 150, 20, new TranslationTextComponent("selectWorld.backupEraseCache"), false);
      if (this.field6944) {
         this.<Class1248>method2455(this.field6946);
      }
   }

   @Override
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      this.method2469(var1);
      method5691(var1, this.field4568, this.field4560, this.field4564 / 2, 50, 16777215);
      this.field6945.method18588(var1, this.field4564 / 2, 70);
      super.method1923(var1, var2, var3, var4);
   }

   @Override
   public boolean method2454() {
      return false;
   }

   @Override
   public boolean method1920(int var1, int var2, int var3) {
      if (var1 != 256) {
         return super.method1920(var1, var2, var3);
      } else {
         this.field4562.displayGuiScreen(this.field6941);
         return true;
      }
   }
}
