package mapped;

import net.minecraft.util.text.TranslationTextComponent;

public class DatapackFailureScreen extends Screen {
   private Class5991 field6213 = Class5991.field26162;
   private final Runnable field6214;

   public DatapackFailureScreen(Runnable var1) {
      super(new TranslationTextComponent("datapackFailure.title"));
      this.field6214 = var1;
   }

   @Override
   public void method1921() {
      super.method1921();
      this.field6213 = Class5991.method18584(this.field4568, this.method2453(), this.field4564 - 50);
      this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 - 155, this.field4565 / 6 + 96, 150, 20, new TranslationTextComponent("datapackFailure.safeMode"), var1 -> this.field6214.run()
         )
      );
      this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 - 155 + 160,
            this.field4565 / 6 + 96,
            150,
            20,
            new TranslationTextComponent("gui.toTitle"),
            var1 -> this.field4562.displayGuiScreen((Screen)null)
         )
      );
   }

   @Override
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      this.method2469(var1);
      this.field6213.method18588(var1, this.field4564 / 2, 70);
      super.method1923(var1, var2, var3, var4);
   }

   @Override
   public boolean method2454() {
      return false;
   }
}
