package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_5717 extends class_7933 {
   public class_5717() {
      super(class_133.field_376, class_1510.field_7994);
   }

   @Override
   public ITextComponent method_38433() {
      return new TranslationTextComponent("container.smoker");
   }

   @Override
   public int method_35874(class_6098 var1) {
      return super.method_35874(var1) / 2;
   }

   @Override
   public class_4088 method_38431(int var1, class_7051 var2) {
      return new class_350(var1, var2, this, this.field_40580);
   }
}
