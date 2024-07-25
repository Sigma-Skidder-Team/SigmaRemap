package remapped;

import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_3770 extends class_9521 {
   public class_3770(class_6577 var1, int var2, int var3, int var4, int var5, ITextComponent var6, class_1500 var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.field_18425 = var1;
   }

   @Override
   public ITextComponent method_32685() {
      return new TranslationTextComponent(
         "options.generic_value",
         class_6577.method_30073(),
         new TranslationTextComponent("selectWorld.gameMode." + class_8026.method_36459(class_6577.method_30060(this.field_18425)))
      );
   }

   @Override
   public IFormattableTextComponent method_32701() {
      return super.method_32701()
         .appendString(". ")
         .append(class_6577.method_30070(this.field_18425))
         .appendString(" ")
         .append(class_6577.method_30067(this.field_18425));
   }
}
