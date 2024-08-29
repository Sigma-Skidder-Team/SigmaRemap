package mapped;

import net.minecraft.util.text.ITextComponent;

public class Class1208 extends Class1206 {
   private static String[] field6518;
   public final Class1335 field6519;
   public final Class1221 field6520;

   public Class1208(Class1221 var1, int var2, int var3, int var4, int var5, ITextComponent var6, Class7192 var7, Class1335 var8) {
      super(var2, var3, var4, var5, var6, var7);
      this.field6520 = var1;
      this.field6519 = var8;
   }

   @Override
   public ITextComponent method5745() {
      return DialogTexts.method22238(super.method5745(), Class1221.method5801(this.field6520).method26261() && !this.field6519.field7076);
   }
}
