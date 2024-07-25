package remapped;

import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_6359 extends class_9521 {
   public class_6359(class_6577 var1, int var2, int var3, int var4, int var5, ITextComponent var6, class_1500 var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.field_32520 = var1;
   }

   @Override
   public ITextComponent method_32685() {
      return class_1402.method_6480(super.method_32685(), class_6577.method_30059(this.field_32520) && !this.field_32520.field_33539);
   }

   @Override
   public IFormattableTextComponent method_32701() {
      return super.method_32701().appendString(". ").append(new TranslationTextComponent("selectWorld.allowCommands.info"));
   }
}
