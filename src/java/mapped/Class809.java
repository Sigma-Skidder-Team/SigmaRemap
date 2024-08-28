package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class809 extends Class798 {
   private static final ITextComponent field4331 = new TranslationTextComponent("mco.client.outdated.title");
   private static final ITextComponent[] field4332 = new ITextComponent[]{
      new TranslationTextComponent("mco.client.outdated.msg.line1"), new TranslationTextComponent("mco.client.outdated.msg.line2")
   };
   private static final ITextComponent field4333 = new TranslationTextComponent("mco.client.incompatible.title");
   private static final ITextComponent[] field4334 = new ITextComponent[]{
      new TranslationTextComponent("mco.client.incompatible.msg.line1"),
      new TranslationTextComponent("mco.client.incompatible.msg.line2"),
      new TranslationTextComponent("mco.client.incompatible.msg.line3")
   };
   private final Screen field4335;
   private final boolean field4336;

   public Class809(Screen var1, boolean var2) {
      this.field4335 = var1;
      this.field4336 = var2;
   }

   @Override
   public void method1921() {
      this.<Class1206>method2455(
         new Class1206(this.field4564 / 2 - 100, method1929(12), 200, 20, Class7127.field30663, var1 -> this.field4562.displayGuiScreen(this.field4335))
      );
   }

   @Override
   public void method1923(Class9332 var1, int var2, int var3, float var4) {
      this.method2469(var1);
      ITextComponent var7;
      ITextComponent[] var8;
      if (!this.field4336) {
         var7 = field4331;
         var8 = field4332;
      } else {
         var7 = field4333;
         var8 = field4334;
      }

      method5691(var1, this.field4568, var7, this.field4564 / 2, method1929(3), 16711680);

      for (int var9 = 0; var9 < var8.length; var9++) {
         method5691(var1, this.field4568, var8[var9], this.field4564 / 2, method1929(5) + var9 * 12, 16777215);
      }

      super.method1923(var1, var2, var3, var4);
   }

   @Override
   public boolean method1920(int var1, int var2, int var3) {
      if (var1 != 257 && var1 != 335 && var1 != 256) {
         return super.method1920(var1, var2, var3);
      } else {
         this.field4562.displayGuiScreen(this.field4335);
         return true;
      }
   }
}
