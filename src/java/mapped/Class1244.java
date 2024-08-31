package mapped;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;

public class Class1244 extends Class1243 {
   private static String[] field6602;
   public final Class1185 field6603;

   public Class1244(
      Class1185 var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      ResourceLocation var9,
      int var10,
      int var11,
      Class7192 var12,
      Class8103 var13,
      ITextComponent var14
   ) {
      super(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
      this.field6603 = var1;
   }

   @Override
   public IFormattableTextComponent method5634() {
      return Class1185.method5628(this.field6603, super.method5634());
   }
}
