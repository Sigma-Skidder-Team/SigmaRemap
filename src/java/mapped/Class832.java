package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class832 extends Screen {
   private final ITextComponent field4616;
   private Class5991 field4617 = Class5991.field26162;
   private final Screen field4618;
   private int field4619;

   public Class832(Screen var1, ITextComponent var2, ITextComponent var3) {
      super(var2);
      this.field4618 = var1;
      this.field4616 = var3;
   }

   @Override
   public boolean method2454() {
      return false;
   }

   @Override
   public void method1921() {
      this.field4617 = Class5991.method18584(this.field4568, this.field4616, this.field4564 - 50);
      this.field4619 = this.field4617.method18592() * 9;
      this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 - 100,
            Math.min(this.field4565 / 2 + this.field4619 / 2 + 9, this.field4565 - 30),
            200,
            20,
            new TranslationTextComponent("gui.toMenu"),
            var1 -> this.field4562.displayGuiScreen(this.field4618)
         )
      );
   }

   @Override
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      this.method2469(var1);
      method5691(var1, this.field4568, this.field4560, this.field4564 / 2, this.field4565 / 2 - this.field4619 / 2 - 18, 11184810);
      this.field4617.method18588(var1, this.field4564 / 2, this.field4565 / 2 - this.field4619 / 2);
      super.method1923(var1, var2, var3, var4);
   }
}
