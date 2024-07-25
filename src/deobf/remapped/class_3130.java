package remapped;

import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_3130 extends class_9521 {
   public class_3130(
      class_6036 var1, int var2, int var3, int var4, int var5, ITextComponent var6, class_1500 var7, class_4892 var8, class_5916 var9, ITextComponent var10
   ) {
      super(var2, var3, var4, var5, var6, var7);
      this.field_15543 = var1;
      this.field_15544 = var8;
      this.field_15546 = var9;
      this.field_15547 = var10;
   }

   @Override
   public IFormattableTextComponent method_32701() {
      return !this.field_15546.method_27073()
         ? new TranslationTextComponent("narrator.controls.bound", this.field_15547, super.method_32701())
         : new TranslationTextComponent("narrator.controls.unbound", this.field_15547);
   }
}
