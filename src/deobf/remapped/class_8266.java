package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

public interface class_8266 {
   void method_38113(ITextComponent var1);

   default void method_38114(String var1) {
      this.method_38113(new StringTextComponent(var1));
   }
}
