package remapped;

import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;

public class class_1526 extends class_77 {
   private static String[] field_8113;

   public class_1526(
      class_5530 var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      class_4639 var9,
      int var10,
      int var11,
      class_1500 var12,
      class_3623 var13,
      ITextComponent var14
   ) {
      super(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
      this.field_8114 = var1;
   }

   @Override
   public IFormattableTextComponent method_32701() {
      return class_5530.method_25110(this.field_8114, super.method_32701());
   }
}
