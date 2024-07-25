package remapped;

import java.util.Optional;
import net.minecraft.util.text.ITextComponent;

public final class class_9057 implements class_1720<Optional<ITextComponent>> {
   private static String[] field_46367;

   public void method_41597(class_8248 var1, Optional<ITextComponent> var2) {
      if (!var2.isPresent()) {
         var1.writeBoolean(false);
      } else {
         var1.writeBoolean(true);
         var1.method_37779((ITextComponent)var2.get());
      }
   }

   public Optional<ITextComponent> method_41600(class_8248 var1) {
      return !var1.readBoolean() ? Optional.<ITextComponent>empty() : Optional.<ITextComponent>of(var1.method_37776());
   }

   public Optional<ITextComponent> method_41599(Optional<ITextComponent> var1) {
      return var1;
   }
}
