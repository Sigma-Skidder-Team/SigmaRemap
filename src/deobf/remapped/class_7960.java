package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_7960 extends class_7933 {
   public class_7960() {
      super(class_133.field_383, class_1510.field_7995);
   }

   @Override
   public ITextComponent method_38433() {
      return new TranslationTextComponent("container.furnace");
   }

   @Override
   public class_4088 method_38431(int var1, class_7051 var2) {
      return new class_1011(var1, var2, this, this.field_40580);
   }
}
