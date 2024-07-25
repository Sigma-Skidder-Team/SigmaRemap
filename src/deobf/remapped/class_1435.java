package remapped;

import net.minecraft.util.text.TranslationTextComponent;

public class class_1435 extends class_9521 {
   public class_1435(class_7039 var1) {
      super(var1.field_941 - 37, 6, 20, 20, new TranslationTextComponent("mco.selectServer.info"), null);
      this.field_7746 = var1;
      this.field_48464 = var1x -> class_7039.method_32281(this.field_7746, !class_7039.method_32212(this.field_7746));
   }

   @Override
   public void method_32686(class_7966 var1, int var2, int var3, float var4) {
      class_7039.method_32336(this.field_7746, var1, var2, var3, this.field_36670, this.field_36674, this.method_32703());
   }
}
