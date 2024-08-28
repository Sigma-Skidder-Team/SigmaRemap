package mapped;

import net.minecraft.util.text.ITextComponent;

public class Class1134 extends Screen {
   private static String[] field6189;
   private final ITextComponent field6190;

   public Class1134(ITextComponent var1, ITextComponent var2) {
      super(var1);
      this.field6190 = var2;
   }

   @Override
   public void method1921() {
      super.method1921();
      this.<Class1206>method2455(new Class1206(this.field4564 / 2 - 100, 140, 200, 20, Class7127.field30659, var1 -> this.field4562.displayGuiScreen((Screen)null)));
   }

   @Override
   public void method1923(Class9332 var1, int var2, int var3, float var4) {
      this.method5688(var1, 0, 0, this.field4564, this.field4565, -12574688, -11530224);
      method5691(var1, this.field4568, this.field4560, this.field4564 / 2, 90, 16777215);
      method5691(var1, this.field4568, this.field6190, this.field4564 / 2, 110, 16777215);
      super.method1923(var1, var2, var3, var4);
   }

   @Override
   public boolean method2454() {
      return false;
   }
}
