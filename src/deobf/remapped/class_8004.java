package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_8004 extends class_9521 {
   public class_8004(class_7039 var1) {
      super(class_7039.method_32234(var1) + 4, class_7039.method_32329(var1) + 4, 12, 12, new TranslationTextComponent("mco.selectServer.close"), null);
      this.field_41018 = var1;
      this.field_48464 = var1x -> class_7039.method_32308(this.field_41018);
   }

   @Override
   public void method_32686(class_7966 var1, int var2, int var3, float var4) {
      class_7039.method_32288(this.field_41018).method_8577().method_35674(class_7039.method_32252());
      class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
      float var7 = !this.method_32703() ? 0.0F : 12.0F;
      method_9778(var1, this.field_36670, this.field_36674, 0.0F, var7, 12, 12, 12, 24);
      if (this.method_26937((double)var2, (double)var3)) {
         class_7039.method_32325(this.field_41018, new ITextComponent[]{this.method_32685()});
      }
   }
}
