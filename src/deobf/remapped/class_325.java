package remapped;

import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_325 extends class_9521 {
   public class_325(class_6036 var1, int var2, int var3, int var4, int var5, ITextComponent var6, class_1500 var7, class_4892 var8, ITextComponent var9) {
      super(var2, var3, var4, var5, var6, var7);
      this.field_1210 = var1;
      this.field_1209 = var8;
      this.field_1212 = var9;
   }

   @Override
   public IFormattableTextComponent method_32701() {
      return new TranslationTextComponent("narrator.controls.reset", this.field_1212);
   }
}
