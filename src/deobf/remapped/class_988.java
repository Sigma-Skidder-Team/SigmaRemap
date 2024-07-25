package remapped;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_988 extends class_9521 implements IScreen {
   public class_988(class_7039 var1) {
      super(var1.field_941 / 2 + 47, 6, 22, 22, StringTextComponent.EMPTY, null);
      this.field_5033 = var1;
      this.field_48464 = var1x -> class_7039.method_32295(this.field_5033, var1x);
   }

   @Override
   public void method_5312() {
      this.method_32687(new TranslationTextComponent(class_7039.method_32279(this.field_5033) != 0 ? "mco.invites.pending" : "mco.invites.nopending"));
   }

   @Override
   public void method_32686(class_7966 var1, int var2, int var3, float var4) {
      class_7039.method_32309(this.field_5033, var1, var2, var3, this.field_36670, this.field_36674, this.method_32703(), this.field_36675);
   }
}
