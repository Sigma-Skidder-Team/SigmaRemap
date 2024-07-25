package remapped;

import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;

public interface class_9875 {
   ITextComponent method_45509();

   default boolean method_45507() {
      return this.method_45508() != null;
   }

   default ITextComponent method_19839() {
      return this.method_45509();
   }

   @Nullable
   default ITextComponent method_45508() {
      return null;
   }
}
