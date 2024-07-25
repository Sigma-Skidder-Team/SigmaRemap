package remapped;

import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;

public class class_7191 extends class_1863 {
   private static String[] field_36977;

   public class_7191(class_4591 var1, class_9854 var2, int var3, int var4, int var5, int var6, ITextComponent var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.field_36976 = var1;
   }

   @Override
   public IFormattableTextComponent method_32701() {
      return super.method_32701().appendString(class_4591.method_21256(this.field_36976).method_4533());
   }
}
