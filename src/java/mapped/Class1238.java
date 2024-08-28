package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class1238 extends Class1236 {
   public final Class1321 field6588;

   public Class1238(Class1321 var1, int var2, int var3, int var4, int var5, ITextComponent var6, double var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.field6588 = var1;
      this.method5813();
   }

   @Override
   public void method5813() {
      this.method5743(new TranslationTextComponent("jigsaw_block.levels", Class1321.method6282(this.field6588)));
   }

   @Override
   public void method5812() {
      Class1321.method6283(this.field6588, MathHelper.method37769(MathHelper.method37779(0.0, 7.0, this.field6584)));
   }
}
