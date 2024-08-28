package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class1223 extends Class1206 {
   public final Class1335 field6567;

   public Class1223(Class1335 var1, int var2, int var3, int var4, int var5, ITextComponent var6, Class7192 var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.field6567 = var1;
   }

   @Override
   public ITextComponent method5745() {
      return new TranslationTextComponent("options.difficulty").appendString(": ").append(Class1335.method6398(this.field6567).method8906());
   }
}
