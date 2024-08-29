package mapped;

import net.minecraft.util.text.ITextComponent;

public class Class1247 extends Class1206 {
   private static String[] field6609;
   public final Class1321 field6610;

   public Class1247(Class1321 var1, int var2, int var3, int var4, int var5, ITextComponent var6, Class7192 var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.field6610 = var1;
   }

   @Override
   public ITextComponent method5745() {
      return DialogTexts.method22238(super.method5745(), Class1321.method6284(this.field6610));
   }
}
