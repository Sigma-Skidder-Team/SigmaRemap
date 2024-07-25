package remapped;

import net.minecraft.util.text.ITextComponent;

public class class_1734 extends class_1863 {
   private static String[] field_8934;

   public class_1734(class_5445 var1, TextRenderer var2, int var3, int var4, int var5, int var6, ITextComponent var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.field_8935 = var1;
   }

   @Override
   public boolean method_26938(char var1, int var2) {
      return this.field_8935.method_1188(this.method_8246(), var1, this.method_8283()) ? super.method_26938(var1, var2) : false;
   }
}
