package remapped;

import java.util.Objects;
import java.util.Optional;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;

public class class_3115 extends class_9521 {
   public class_3115(class_668 var1, int var2, int var3, int var4, int var5, ITextComponent var6, class_1500 var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.field_15498 = var1;
   }

   @Override
   public ITextComponent method_32685() {
      return super.method_32685()
         .deepCopy()
         .appendString(" ")
         .append(class_668.method_3069(this.field_15498).<ITextComponent>map(class_7149::method_32809).orElse(class_668.method_3058()));
   }

   @Override
   public IFormattableTextComponent method_32701() {
      return !Objects.equals(class_668.method_3069(this.field_15498), Optional.<class_7149>of(class_7149.field_36818))
         ? super.method_32701()
         : super.method_32701().appendString(". ").append(class_668.method_3059());
   }
}
