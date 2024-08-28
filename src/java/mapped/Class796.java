package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

public interface Class796 {
   void method1907(ITextComponent var1);

   default void method1918(String var1) {
      this.method1907(new StringTextComponent(var1));
   }
}
