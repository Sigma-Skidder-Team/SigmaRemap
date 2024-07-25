package remapped;

import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;

public class class_7927 extends class_1863 {
   private static String[] field_40549;

   public class_7927(class_5766 var1, class_9854 var2, int var3, int var4, int var5, int var6, ITextComponent var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.field_40548 = var1;
   }

   @Override
   public IFormattableTextComponent method_32701() {
      return super.method_32701().appendString(class_5766.method_26068(this.field_40548).method_4533());
   }
}
