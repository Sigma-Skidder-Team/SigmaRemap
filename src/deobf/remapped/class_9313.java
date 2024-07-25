package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_9313 extends class_129 {
   public class_9313(class_3391 var1, int var2, int var3, int var4, int var5, ITextComponent var6, double var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.field_47555 = var1;
      this.method_396();
   }

   @Override
   public void method_396() {
      this.method_32687(new TranslationTextComponent("jigsaw_block.levels", class_3391.method_15680(this.field_47555)));
   }

   @Override
   public void method_399() {
      class_3391.method_15673(this.field_47555, MathHelper.floor(MathHelper.clampedLerp(0.0, 7.0, this.field_319)));
   }
}
