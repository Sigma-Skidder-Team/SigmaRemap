package remapped;

import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;

public class class_6173 extends class_1863 {
   public class_6173(class_1840 var1, TextRenderer var2, int var3, int var4, int var5, int var6, ITextComponent var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.field_31578 = var1;
   }

   @Override
   public IFormattableTextComponent method_32701() {
      return !class_1840.method_8130(this.field_31578).method_8246().isEmpty() && class_1840.method_8137(this.field_31578).method_13678()
         ? super.method_32701().appendString(", ").append(class_1840.method_8139())
         : super.method_32701();
   }
}
