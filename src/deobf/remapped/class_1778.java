package remapped;

import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_1778 extends class_1863 {
   public class_1778(class_6577 var1, class_9854 var2, int var3, int var4, int var5, int var6, ITextComponent var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.field_9103 = var1;
   }

   @Override
   public IFormattableTextComponent method_32701() {
      return super.method_32701()
         .appendString(". ")
         .append(new TranslationTextComponent("selectWorld.resultFolder"))
         .appendString(" ")
         .appendString(class_6577.method_30056(this.field_9103));
   }
}
