package mapped;

import net.minecraft.util.text.ITextComponent;

public class DirtMessageScreen extends Screen {
   private static String[] field6916;

   public DirtMessageScreen(ITextComponent var1) {
      super(var1);
   }

   @Override
   public boolean method2454() {
      return false;
   }

   @Override
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      this.method2471(0);
      method5691(var1, this.fontRenderer, this.field4560, this.field4564 / 2, 70, 16777215);
      super.method1923(var1, var2, var3, var4);
   }
}
