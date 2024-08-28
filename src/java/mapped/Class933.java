package mapped;

import net.minecraft.util.text.ITextComponent;

import javax.annotation.Nullable;

public interface Class933 {
   ITextComponent method2941();

   default boolean method3381() {
      return this.method3380() != null;
   }

   default ITextComponent method2954() {
      return this.method2941();
   }

   @Nullable
   default ITextComponent method3380() {
      return null;
   }
}
