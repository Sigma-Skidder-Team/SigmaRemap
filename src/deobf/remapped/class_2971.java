package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_2971 extends class_9521 {
   public class_2971(class_6577 var1, int var2, int var3, int var4, int var5, ITextComponent var6, class_1500 var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.field_14610 = var1;
   }

   @Override
   public ITextComponent method_32685() {
      return new TranslationTextComponent("options.difficulty").appendString(": ").append(class_6577.method_30055(this.field_14610).method_2101());
   }
}
