package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class821 extends Class798 {
   private final Screen field4476;
   private ITextComponent field4477;
   private ITextComponent field4478;

   public Class821(Class2435 var1, Screen var2) {
      this.field4476 = var2;
      this.method2357(var1);
   }

   public Class821(ITextComponent var1, Screen var2) {
      this.field4476 = var2;
      this.method2358(var1);
   }

   public Class821(ITextComponent var1, ITextComponent var2, Screen var3) {
      this.field4476 = var3;
      this.method2359(var1, var2);
   }

   private void method2357(Class2435 var1) {
      if (var1.field16474 != -1) {
         this.field4477 = new StringTextComponent("Realms (" + var1.field16474 + "):");
         String var4 = "mco.errorMessage." + var1.field16474;
         this.field4478 = (ITextComponent)(!Class9088.method33884(var4) ? ITextComponent.func_244388_a(var1.field16475) : new TranslationTextComponent(var4));
      } else {
         this.field4477 = new StringTextComponent("An error occurred (" + var1.field16472 + "):");
         this.field4478 = new StringTextComponent(var1.field16473);
      }
   }

   private void method2358(ITextComponent var1) {
      this.field4477 = new StringTextComponent("An error occurred: ");
      this.field4478 = var1;
   }

   private void method2359(ITextComponent var1, ITextComponent var2) {
      this.field4477 = var1;
      this.field4478 = var2;
   }

   @Override
   public void method1921() {
      Class9229.method34711(this.field4477.getString() + ": " + this.field4478.getString());
      this.<Class1206>method2455(
         new Class1206(this.field4564 / 2 - 100, this.field4565 - 52, 200, 20, new StringTextComponent("Ok"), var1 -> this.field4562.displayGuiScreen(this.field4476))
      );
   }

   @Override
   public void method1923(Class9332 var1, int var2, int var3, float var4) {
      this.method2469(var1);
      method5691(var1, this.field4568, this.field4477, this.field4564 / 2, 80, 16777215);
      method5691(var1, this.field4568, this.field4478, this.field4564 / 2, 100, 16711680);
      super.method1923(var1, var2, var3, var4);
   }
}
